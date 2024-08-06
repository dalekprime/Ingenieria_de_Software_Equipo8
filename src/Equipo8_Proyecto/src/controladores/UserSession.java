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
public class UserSession{
    /*public void saveSession(int actualID){
        String currentDir =  System.getProperty("user.dir");
        String fileName = "actualSession.txt";
        File archivo = new File(currentDir, fileName);
        if(archivo.exists()) {
            try (FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(actualID);
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        } 
        else {
            try (FileWriter escritor = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(escritor)) {
                bw.write(actualID);
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    };*/
}
