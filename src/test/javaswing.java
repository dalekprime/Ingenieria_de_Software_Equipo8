import java.io.*;
import javax.swing.*;
import java.awt.*;

class GFG {

    public static void main(String[] args)
    {
        class pantallas extends JFrame{
           
        };
        JFrame frame = new JFrame();
        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints Cositas = new GridBagConstraints();
        JTextField Usuario = new JTextField("");
        JTextField Contrasena = new JTextField("");
        JLabel EtiquetaDeUsuario = new JLabel("Usuario");
        Cositas.insets = new Insets(5,5,5,5);
        mainPanel.add(EtiquetaDeUsuario,Cositas);
        mainPanel.add(Usuario,Cositas);
        mainPanel.add(Contrasena,Cositas);
        Usuario.setBounds(250, 100, 250, 100);
        Contrasena.setBounds(250, 100, 250, 100);
        frame.setVisible(true);

        frame.setSize(1800, 720);

    }
}
