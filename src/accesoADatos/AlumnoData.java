package accesoADatos;

import entidades.Alumno;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.SQLSyntaxErrorException;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.obtenerConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno añadido con éxito con ID: " + alumno.getIdAlumno());
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }
    }

    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE idAlumno=? AND estado=1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos" + ex.getMessage());
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE dni=? AND estado=1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                //JOptionPane.showMessageDialog(null, "No existe el alumno");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos" + ex.getMessage());
        }
        return alumno;
    }

    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno" + ex.getMessage());

        }
        return alumnos;

    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni=?, apellido=?,Nombre=?, fechaNacimiento=?"
                + "WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setNString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado. ");
            }
        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error en Sintaxis de Query: \n" + sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a BD " + ex.getMessage());
        }
    }
//TODO Agregar if para que no vuelva a eliminar al mismo alumno (Agregado)

    public void eliminarAlumno(int id) {
        //Realizo dos query 
        String sqlSelect = "SELECT estado FROM alumno WHERE idAlumno=?";
        String sqlUpdate = "UPDATE alumno SET estado=0 WHERE idAlumno=?";

        try {
            // Verificar el estado actual del alumno
            PreparedStatement selectPs = con.prepareStatement(sqlSelect);
            selectPs.setInt(1, id);
            ResultSet resultSet = selectPs.executeQuery();

            if (resultSet.next()) {
                boolean estadoActual = resultSet.getBoolean("estado");

                if (estadoActual) {
                    // El alumno no está eliminado, se puede seguir...
                    PreparedStatement updatePs = con.prepareStatement(sqlUpdate);
                    updatePs.setInt(1, id);
                    int exito = updatePs.executeUpdate();

                    if (exito == 1) {
                        JOptionPane.showMessageDialog(null, "Alumno eliminado");
                    }
                } else {
                    // El alumno ya está eliminado (false o "0")
                    JOptionPane.showMessageDialog(null, "El alumno ya se encuentra eliminado.");
                }
            } else {
                // No se encontró al alumno con el ID proporcionado, puedes manejar esto de acuerdo a tus necesidades
                JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
            }

        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error en Sintaxis de Query: \n" + sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a BD " + ex.getMessage());
        }
    }

    public boolean existeAlumno(int id) throws SQLException {
        String sqlSelect = "SELECT 1 FROM alumno WHERE idAlumno=?";
        PreparedStatement selectPs = con.prepareStatement(sqlSelect);
        selectPs.setInt(1, id);
        ResultSet resultSet = selectPs.executeQuery();

        return resultSet.next();
    }

}
