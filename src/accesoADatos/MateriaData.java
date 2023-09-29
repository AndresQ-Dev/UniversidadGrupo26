package accesoADatos;

import entidades.Materia;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.obtenerConexion();

    }

    public void guardarMateria(Materia materia) {
        try {
            String sql = "INSERT INTO materia(nombre, año, estado) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                int idMateria=rs.getInt(1);
                JOptionPane.showMessageDialog(null, "Materia ingresada correctamente con Id: "+idMateria);
            }
        } catch (SQLIntegrityConstraintViolationException dupEx) {
            JOptionPane.showMessageDialog(null, "Error: La materia con el mismo nombre ya existe en la base de datos.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }
    }

    public Materia buscarMateria(int id) {
        String sql = "SELECT * FROM materia WHERE idMateria=? AND estado=1";
        Materia materia = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //Materia materia=null;
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));

            } else {
                //    JOptionPane.showMessageDialog(null, "Materia no encontrada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Materia: " + ex.getMessage());
        }
        return materia;
    }

    public Materia buscarMateriaPorNombre(String nombreMateria) {
        Materia materiaBuscada = null;
        try {
            String sql = "SELECT * FROM materia WHERE nombre=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreMateria);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materiaBuscada=new Materia();
                materiaBuscada.setIdMateria(rs.getInt("idMateria"));
                materiaBuscada.setNombre(rs.getString("nombre"));
                materiaBuscada.setAnioMateria(rs.getInt("año"));
                materiaBuscada.setActivo(rs.getBoolean("estado"));
            } else {
                //    JOptionPane.showMessageDialog(null, "Materia no encontrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Materia: " + ex.getMessage());
        }

        return materiaBuscada;

    }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre=?, año=?, estado=? WHERE idMateria=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Actualizada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró idMateria");
            }

        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis: " + sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a Materia: " + ex.getMessage());
        }
    }

    public void eliminarMateria(int idMateria) {
        String sql = "UPDATE materia SET estado=0 WHERE idmateria=?";
        try {
            if (existeMateria(idMateria)) {
                if (verificarEstado(idMateria)) {
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setInt(1, idMateria);
                    int exito = ps.executeUpdate();
                    if (exito > 0) {
                        JOptionPane.showMessageDialog(null, "La materia fue eliminada");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La materia ya fue eliminada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis: " + sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la materia" + ex.getMessage());
        }
    }

    private boolean existeMateria(int id) throws SQLException {
        String sql = "SELECT idMateria FROM materia WHERE idMateria=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    private boolean verificarEstado(int id) throws SQLException {
        String sql = "SELECT estado FROM materia WHERE idMateria=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getBoolean("estado");

        } else {
            return false;
        }

    }

    public List<Materia> listarMaterias() {
        List<Materia> materias = new ArrayList<>();

        try {
            String sql = "SELECT * FROM materia WHERE estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLSyntaxErrorException sx) {
            JOptionPane.showMessageDialog(null, "Error de Sintaxis: " + sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la materia" + ex.getMessage());
        }
        return materias;
    }
}
