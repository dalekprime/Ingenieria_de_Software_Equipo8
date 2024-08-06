package controladores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author bryan
 */
public class Register {
    int ID;
    int lastID;
    public void escribir(String correo, String nombre, String cedula, String RIF, String clave){
        String currentDir =  System.getProperty("user.dir");
        //System.out.print(currentDir);
        String fileName = "datos.txt";
        File archivo = new File(currentDir, fileName);
        if(archivo.exists()) {
            try(FileReader reader = new FileReader(archivo); BufferedReader lector = new BufferedReader(reader)){
                String linea;
                while((linea = lector.readLine()) != null){
                    String[] datosUsuario = linea.split("#");
                    lastID  = Integer.parseInt(String.valueOf(datosUsuario[5]));
                };
                ID = lastID + 1;
                System.out.println(ID);
            }catch(IOException e){
                System.out.println("Error al leer el archivo: " + e.getMessage());
            };
            try (FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
                // Escribir el contenido nuevo en el archivo
                bw.write(correo + "#" + nombre + "#" + cedula + "#" + RIF + "#" + clave + "#" + ID + "\n");
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        } 
        else {
            try (FileWriter escritor = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(escritor)) {
                bw.write(correo + "#" + nombre + "#" + cedula + "#" + RIF + "#" + clave + "#" + 1 + "\n");
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        //System.out.println("Termina escritura correctamente");
    }
}
