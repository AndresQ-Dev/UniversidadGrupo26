
package AccesoService;

import java.awt.event.KeyEvent;
import jdk.jfr.Event;

public class Service {
    
    public static void esLetra(KeyEvent evt){
       /*método para verificar si cada caracter es una letra con el método
        isLetter(). Y además verifica que si es un espacio lo deja escribir
        Si no lo es se consume el caracter y no lo escribe .*/
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();
        } 
    }
    
    public static void esNumero(KeyEvent evt){
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }
    
}
