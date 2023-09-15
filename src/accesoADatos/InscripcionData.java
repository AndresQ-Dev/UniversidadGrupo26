
package accesoADatos;
import entidades.Inscripcion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLSyntaxErrorException;



public class InscripcionData {
    
    private Connection con = null;

    public InscripcionData() {
        con = Conexion.obtenerConexion();
    }
    
    //TODO agregar método verificarEstado
    public void guardarInscripcion(Inscripcion inscripcion){
        
        String sql="INSERT INTO inscripcion (idAlumno, idMateria, nota)VALUES (?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setDouble(3, inscripcion.getNota());
            int inscrip=ps.executeUpdate();
            if(inscrip>0){
                JOptionPane.showMessageDialog(null, "Inscripción realizada");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo realizar la inscripción");
            }
                
        } catch (SQLSyntaxErrorException sx){
            JOptionPane.showMessageDialog(null, "Error de Sintaxis: "+sx.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la Inscripción"+ex.getMessage());
    }
    
}
    private boolean verificarEstado(int id) throws SQLException{
            String sql="SELECT estado FROM materia WHERE idMateria=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                return rs.getBoolean("estado");
                
            }else {
            return false;   
        } 
}
}
