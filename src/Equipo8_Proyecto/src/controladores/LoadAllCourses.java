package controladores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import modelos.Curso;
import modelos.Usuario;

/**
 *
 * @author bryan
 */
public class LoadAllCourses {
    ArrayList <Curso> actualCourses = new ArrayList<Curso>();
    public ArrayList<Curso> loadCourse(){
        File file = new File(System.getProperty("user.dir"), "cursos.txt");
        if(file.exists()){
            try(FileReader reader = new FileReader(file); BufferedReader lector = new BufferedReader(reader)){
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String[] datosCurso= linea.split("#");
                    int actualCouserID  = Integer.parseInt(String.valueOf(datosCurso[0]));
                    String actualCourseName = String.valueOf(datosCurso[1]);
                    String actualCourseDesc  = String.valueOf(datosCurso[2]);
                    String actualCourseMode  = String.valueOf(datosCurso[3]);
                    String actualCourseType = String.valueOf(datosCurso[4]);
                    String actualCourseValid = String.valueOf(datosCurso[5]);
                    Curso newCourse = new Curso(actualCourseName, actualCourseDesc, actualCourseMode, actualCourseType);
                    newCourse.setValid(actualCourseValid);
                    actualCourses.add(newCourse);
                };
                return actualCourses;
            }catch (IOException e){
                System.out.println("Error al leer el archivo: " + e.getMessage());
            };
        }else{
            System.out.println("No existe el archivo");
        };
        return actualCourses;
    };
};
