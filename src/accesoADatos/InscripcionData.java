package accesoADatos;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

public class InscripcionData {

    private Connection con = null;

    public InscripcionData() {
        con = Conexion.obtenerConexion();
    }

    //TODO agregar método verificarEstado
    public void guardarInscripcion(Inscripcion inscripcion) {
        try {
            if (!verificarInscripcionDuplicada(inscripcion)) {
                String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota)VALUES (?,?,?)";
                try {
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
                    ps.setInt(2, inscripcion.getMateria().getIdMateria());
                    ps.setDouble(3, inscripcion.getNota());
                    int inscrip = ps.executeUpdate();
                    if (inscrip > 0) {
                        JOptionPane.showMessageDialog(null, "Inscripción realizada");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo realizar la inscripción");
                    }

                } catch (SQLSyntaxErrorException sx) {
                    JOptionPane.showMessageDialog(null, "Error de Sintaxis: " + sx.getMessage());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede acceder a la Inscripción" + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Inscripción Duplicada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al comparar alumnos en inscripción");
        }
    }

    private boolean verificarInscripcionDuplicada(Inscripcion inscripcion) throws SQLException {
        String sql = "SELECT idAlumno, idMateria FROM Inscripcion";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int idAlumnoDB = rs.getInt("idAlumno");
            int idMateriaDB = rs.getInt("idMateria");
            if (idAlumnoDB == inscripcion.getAlumno().getIdAlumno() && idMateriaDB == inscripcion.getMateria().getIdMateria()) {
                return true;
            }
        }
        return false;
    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();

        try {
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            AlumnoData alumnoData = new AlumnoData();
            MateriaData materiaData = new MateriaData();
            while (rs.next()) {
                int idInscripcion = rs.getInt("idInscripto");
                int idAlumno = rs.getInt("idAlumno");
                int idMateria = rs.getInt("idMateria");
                double nota = rs.getDouble("nota");
                Alumno alumno = alumnoData.buscarAlumno(idAlumno);
                Materia materia = materiaData.buscarMateria(idMateria);
                Inscripcion inscripcion = new Inscripcion(idInscripcion, alumno, materia, nota);
                inscripciones.add(inscripcion);
            }
        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis: " + sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripción: " + ex.getMessage());
        }
        return inscripciones;
    }
}