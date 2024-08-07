package modelos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Curso {
    int userID;
    String nombre;
    String descripcion;
    String modalidad;
    String tipo;
    boolean aprobado;
    public ArrayList <Cohorte> cohortes;
    FormulacionDeCurso formulacion;
    public Curso(int ID, String nombre, String descripcion, String modalidad, String tipo){
        this.userID = ID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.modalidad = modalidad;
        this.tipo = tipo;
        this.aprobado = false;
    };
    public void formular(int userID){
        String currentDir =  System.getProperty("user.dir");
        String fileName = "cursos.txt";
        File archivo = new File(currentDir, fileName);
        if(archivo.exists()) {
            try (FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(userID + "#" + this.nombre + "#" + this.descripcion + "#" + this.modalidad + "#" + this.tipo + "#" + this.aprobado+ "\n");
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        } 
        else {
            try (FileWriter escritor = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(escritor)) {
                bw.write(userID + "#" + this.nombre + "#" + this.descripcion + "#" + this.modalidad + "#" + this.tipo + "#" + this.aprobado+ "\n");
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    };
    public void setValid(String valid){
        if(valid.contains("true")){
            this.aprobado = true;
        }else if(valid.contains("false")){
            this.aprobado = false;
        };
    };
    public String getNombre(){
        return nombre;
    };
    public String getDescripcion(){
        return descripcion;
    };
    public String getModalidad(){
        return modalidad;
    };
    public String getTipo(){
        return tipo;
    };
    public boolean getValid(){
        return aprobado;
    };
    public int getID(){
        return userID;
    };
};
