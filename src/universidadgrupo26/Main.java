package universidadgrupo26;

import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.sql.Connection;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Método guardarAlumno
        //Alumno alumno=new Alumno(40,25780235, "Sheeran", "Ed", LocalDate.of(1988,9,28),true);
        AlumnoData alumnoData = new AlumnoData();
        /*alumnoData.guardarAlumno(alumno);*/

        //Método buscarAlumno por id
        /*Alumno encontrado=alumnoData.buscarAlumno(40);
        System.out.println("dni: "+encontrado.getDni());
        System.out.println("apellido: "+encontrado.getApellido());
        System.out.println("nombre: "+encontrado.getNombre());*/
        //Método buscarAlumnoPorDni
        /*Alumno encontradodni=alumnoData.buscarAlumnoPorDni(25789456);
        System.out.println("apellido: "+encontradodni.getApellido());
        System.out.println("nombre: "+encontradodni.getNombre());*/
        //Método listarAlumno
        /*Alumno lista=alumnoData.listarAlumnos(); 
        for (Alumno alumno:alumnoData.listarAlumnos()){
             System.out.println(alumno.getIdAlumno());
             System.out.println(alumno.getApellido());
             System.out.println(alumno.getNombre());
        }*/
        //Metodo modificarAlumno
        /*alumnoData.modificarAlumno(alumno);
        //Método eliminarAlumno*/
        //alumnoData.eliminarAlumno(190);
        //Metodo guardarMateria
//        Materia materia = new Materia("Fisica II", 3, true);
        MateriaData materiaData = new MateriaData();
//        materiaData.guardarMateria(materia);

        //Método buscar Materia        
        //Materia materiaEncontrada = materiaData.buscarMateria();
        /*if (materiaEncontrada != null) {
            System.out.println("Id: " + materiaEncontrada.getIdMateria());
            System.out.println("Nombre: " + materiaEncontrada.getNombre());
            System.out.println("Año: " + materiaEncontrada.getAnioMateria());

        } else {
            System.out.println("Materia no encontrada.");
        }

        //Método para Actualizar Materia     
        
        Materia materiaNew=new Materia(100,"Sistemas Operativos IV", 2, true);
        materiaData.modificarMateria(materiaNew);*/
        
        
    }

}
