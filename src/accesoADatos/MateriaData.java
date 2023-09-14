


package accesoADatos;

import entidades.Materia;
import java.sql.*;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        con = Conexion.obtenerConexion();
    
}
   public void guardarMateria(Materia materia){
        try {
            String sql="INSERT INTO materia(nombre, año, estado) VALUES (?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2,materia.getAnioMateria());
            ps.setBoolean(3,materia.isActivo());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
           
            if (rs.next()) {
                materia.setIdMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Materia ingresada correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }
    }

}
       
          

