package controladores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import modelos.Usuario;

/**
 *
 * @author bryan
 */
public class Login {
    public Usuario Buscar(String correo, String contrasena){
        String currentDir =  System.getProperty("user.dir");
        String fileName = "datos.txt";
        File archivo = new File(currentDir, fileName);
        if(archivo.exists()) {
            try(FileReader reader = new FileReader(archivo); BufferedReader lector = new BufferedReader(reader)){
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String[] datosUsuario = linea.split("#");
                    String correoUsuarioArchivo = datosUsuario[0];
                    String NombreUsuarioArchivo = datosUsuario[1];
                    String contrasenaArchivo = datosUsuario[4];
                    String userCedula = datosUsuario[2];
                    int userID  = Integer.parseInt(String.valueOf(datosUsuario[5]));
                    
                    
                    if(correo.equals(correoUsuarioArchivo) && contrasena.equals(contrasenaArchivo)){
                        //System.out.print("Llega");
                        //System.out.println(correoUsuarioArchivo);
                        //System.out.println(NombreUsuarioArchivo);
                        //System.out.println(contrasenaArchivo);
                        Usuario actualUser = new Usuario(userID, NombreUsuarioArchivo, correoUsuarioArchivo, userCedula, contrasenaArchivo);
                        actualUser.ingresar();
                        //System.out.print(actualUser.getNombre());
                        return actualUser;
                    };
                };
            }catch (IOException e){
                System.out.println("Error al leer el archivo: " + e.getMessage());
            };
        }else{
            System.out.println("No existe el archivo");
        };
            Usuario noUser = new Usuario();
            return noUser;
    };
};
