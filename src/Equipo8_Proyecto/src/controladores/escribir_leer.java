package controladores;
import java.io.*;

//Se asume que las entradas son correctas, es decir, no se pasan espacios en blanco o valores incorrectos

public class escribir_leer {
    
    public void escribir(String correo, String nombre, String cedula, String RIF, String clave){
        String currentDir =  System.getProperty("user.dir");
        //System.out.print(currentDir);
        String fileName = "datos.txt";

        File archivo = new File(currentDir, fileName);

        if(archivo.exists()) {
            try (FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
                // Escribir el contenido nuevo en el archivo
                bw.write(correo + "#" + nombre + "#" + cedula + "#" + RIF + "#" + clave + "\n");
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        } 
        else {
            try (FileWriter escritor = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(escritor)) {
                bw.write(correo + "#" + nombre + "#" + cedula + "#" + RIF + "#" + clave + "\n");
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Termina escritura correctamente");
    }

    public void leer1(){        //Imprime por consola
        String currentDir =  System.getProperty("user.dir");
        String fileName = "datos.txt";
        File archivo = new File(currentDir, fileName);
        if(archivo.exists()) {
            try (FileReader reader = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(reader)) {
                String linea;

                while ((linea = lector.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
            
        } 
        else {
            System.out.println("No existe el archivo");
        }
        System.out.println("Termina lectura correctamente");
    }

    public void leer2(){        //Imprime por consola
        String currentDir =  System.getProperty("user.dir");
        String fileName = "datos.txt";
        File archivo = new File(currentDir, fileName);
        if(archivo.exists()) {
            try (FileReader reader = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(reader)) {
                String linea;

                while ((linea = lector.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
            
        } 
        else {
            System.out.println("No existe el archivo");
        }
        System.out.println("Termina lectura correctamente");
    }

    /*public String[] devolverNombre(){
        /*String nombre = null;
        

        String currentDir = System.getProperty("user.dir");
        String fileName = "datos.txt";
        File archivo = new File(currentDir, fileName);
        if(archivo.exists()) {
            try {
                FileReader reader = new FileReader(archivo);
                int caracter;
                
                while ((caracter = reader.read()) != -1) {
                  System.out.print((char) caracter);
                }
              
                reader.close();
              } catch (IOException e) {
                e.printStackTrace();
              }
        } 
        else {
            System.out.println("No existe el archivo");
        }

        
        String nombre, apellido;
        nombre = "adrian";
        apellido = "fernandez";
        
        String[] nombreCompleto = {nombre, apellido};
        return nombreCompleto;
    }*/
    
    public boolean Buscar(String correo, String contrasena){
        String currentDir =  System.getProperty("user.dir");
        String fileName = "datos.txt";
        File archivo = new File(currentDir, fileName);
        if(archivo.exists()) {
            try (FileReader reader = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(reader)) {
                String linea;

                while ((linea = lector.readLine()) != null) {
                    String[] datosUsuario = linea.split("#");

                    String correoUsuarioArchivo = datosUsuario[0];
                    String contrasenaArchivo = datosUsuario[4];
                    System.out.println(correoUsuarioArchivo);
                    System.out.println(contrasenaArchivo);

                    if (correo.equals(correoUsuarioArchivo) && contrasena.equals(contrasenaArchivo)) {
                        return true;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        } 
        else {
            System.out.println("No existe el archivo");
        }
        return false;
    }


        
}
