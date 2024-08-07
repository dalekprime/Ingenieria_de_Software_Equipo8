package modelos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Usuario extends Persona{
    int ID;
    String rol;
    String correo;
    String clave;
    String registro;
    public ArrayList <Curso> myCourses;
        public Usuario(){
            this.ID = -1;
            this.nombre = "";
            this.correo = "";
            this.cedula = "";
            this.clave = "";
            myCourses = new ArrayList<Curso>();
        };
        public Usuario(int ID, String name, String correo, String cedula, String clave){
            this.ID = ID;
            this.setNombre(name);
            this.correo = correo;
            this.cedula = cedula;
            this.clave = clave;
        };
        public Usuario(Usuario toClone){
            this.setNombre(toClone.getNombre());
            this.correo = toClone.getCorreo();
            this.cedula = toClone.getCedula();
            this.clave = toClone.getClave();
        };
        public int getID(){
            return ID;
        };
        public String getCorreo(){
            return correo;
        };
        public String getClave(){
            return clave;
        };
        public static void registrarCurso(){}
        public static void modificarInformacion(){}
        public static void registrarse(){
        
        }
        public void ingresar(){
            myCourses = new ArrayList<Curso>();
            File file = new File(System.getProperty("user.dir"), "cursos.txt");
            try(FileReader reader = new FileReader(file); BufferedReader lector = new BufferedReader(reader)){
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String[] datosCurso= linea.split("#");
                    int actualUserID  = Integer.parseInt(String.valueOf(datosCurso[0]));
                    String actualCourseName = String.valueOf(datosCurso[1]);
                    String actualCourseDesc  = String.valueOf(datosCurso[2]);
                    String actualCourseMode  = String.valueOf(datosCurso[3]);
                    String actualCourseType = String.valueOf(datosCurso[4]);
                    String actualCourseValid = String.valueOf(datosCurso[5]);
                    if(actualUserID == this.ID){
                       Curso newCourse = new Curso(actualUserID, actualCourseName, actualCourseDesc, actualCourseMode, actualCourseType);
                       newCourse.setValid(actualCourseValid);
                       myCourses.add(newCourse);
                       //System.out.println(newCourse.nombre);
                    };
                };
            }catch (IOException e){
                System.out.println("Error al leer el archivo: " + e.getMessage());
            };
        };

}
