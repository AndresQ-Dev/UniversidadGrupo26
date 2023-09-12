package universidadgrupo26;

import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import entidades.Alumno;
import java.sql.Connection;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
      
        //Alumno alumno=new Alumno(40,25789456, "Sheeran", "Ed", LocalDate.of(1985,4,23),true);
        AlumnoData alumnoData=new AlumnoData();
        //alumnoData.guardarAlumno(alumno);
        Alumno encontrado=alumnoData.buscarAlumno(40);
        System.out.println("dni: "+encontrado.getDni());
        System.out.println("apellido: "+encontrado.getApellido());
        System.out.println("nombre: "+encontrado.getNombre());
    }

}
