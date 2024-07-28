package controladores;

import vistas.LoginIU;
import vistas.RegisterIU;
import vistas.StandarTemplate;

/**
 *
 * @author bryan, arturo, luis, daniel y adrian
 */
public class Main{
    public static void main(String[] args) {
        LoginIU login = new LoginIU();
        //login.setVisible(true);
        StandarTemplate template = new StandarTemplate();
        //template.setVisible(true);
        RegisterIU register = new RegisterIU();
        register.setVisible(true);
    };
};
