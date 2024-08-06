package modelos;
/**
 *
 * @author bryan
 */
public class Persona {
  String nombre;
  String apellido;
  String cedula;
  String rif;
  String tituloUniversitario;
  String proveniencia;
  int aliado;
    public void setNombre(String nombre){
        this.nombre = nombre;
    };
    public void setCedula(String cedula){
        this.cedula = cedula;
    };
    public String getNombre(){
        //System.out.println(nombre);
        return nombre;
    };
    public String getCedula(){
        return cedula;
    };
}
