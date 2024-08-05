package modelos;
/**
 *
 * @author bryan
 */
public class UsuarioAdministrativo extends Usuario{
    String cargo;
    String enteAlQuePertence;
        public static boolean evaluarInformacion(){
            return false;
        };
        public static boolean verificarFormularioDeCurso(){
            return false;
        };
        public static boolean VerificarCredenciales(){
            return false;
        };
}
