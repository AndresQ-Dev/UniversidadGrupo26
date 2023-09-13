
package accesoADatos;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
 
    private static Connection conexion=null;
    private static final String URL="jdbc:mariadb://localhost/ULPUniversity";
    private static final String USER="root";
    private static final String PASS="";

    private Conexion() {
    }
    
    public static Connection obtenerConexion(){
        if (conexion==null) {
            try {
                conexion=DriverManager.getConnection(URL, USER, PASS);
                //System.out.println("Conectado!!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de Conexión:\nVerifique Servicios de Acceso a Base de Datos. \n"+ex.getMessage());
            }
        }
        return conexion;
    }
    
    
}
