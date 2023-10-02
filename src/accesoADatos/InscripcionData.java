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
import java.util.logging.Level;
import java.util.logging.Logger;

public class InscripcionData {

    private Connection con = null;
    //private MateriaData materiaData;
    //private AlumnoData alumnoData;

    public InscripcionData() {
        con = Conexion.obtenerConexion();
    }

    //TODO agregar método verificarEstado
    public void guardarInscripcion(Inscripcion inscripcion) {
        //if (!verificarInscripcionDuplicada(inscripcion)) {
        //try {
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
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Conexion.cerrarConexion();
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

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion WHERE idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
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

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> listaCursadas = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria,nombre,año FROM inscripcion "
                    + "JOIN materia ON(inscripcion.idMateria=materia.idMateria)"
                    + "WHERE inscripcion.idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                listaCursadas.add(materia);
            }
        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis: " + sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripción: " + ex.getMessage());
        }
        return listaCursadas;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {
        List<Materia> listaNoCursadas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE estado=1 && idMateria NOT IN "
                    + "(SELECT idMateria FROM inscripcion WHERE idAlumno=?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                listaNoCursadas.add(materia);
            }
        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis: " + sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripción: " + ex.getMessage());
        }
        return listaNoCursadas;

    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        try {
            String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int exito = ps.executeUpdate();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion Borrada");
            }

        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis: " + sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripción: " + ex.getMessage());
        }

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        try {
            String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int exito = ps.executeUpdate();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis: " + sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripción: " + ex.getMessage());

        }
    }

    public List<Alumno> obtenerAlumnoPorMateria(int idMateria) {
        List<Alumno> alumnoPorMateria = new ArrayList<>();
        try {
            String sql = "SELECT alumno.* FROM alumno JOIN inscripcion ON inscripcion.idAlumno=alumno.idAlumno WHERE inscripcion.idMateria=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnoPorMateria.add(alumno);
            }
            ps.close();
        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis: " + sx.getMessage());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el Alumno por Materia" + ex.getMessage());

        }
        return alumnoPorMateria;

    }

    public boolean alumnoEstaInscrito(int idAlumno) {
        // Obtener inscripciones de alumno
        List<Inscripcion> inscripcionesAlumno = obtenerInscripcionesPorAlumno(idAlumno);
        // Verifica si el alumno tiene al menos una inscripción
        return !inscripcionesAlumno.isEmpty();//si hay al menos una inscripción devuelve TRUE.
    }
}
