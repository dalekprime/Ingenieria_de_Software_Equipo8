/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;
import controladores.escribir_leer;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class LoginIU extends javax.swing.JFrame {
    int xMouse, yMouse;
    boolean admin = false;
    public LoginIU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        mainBar = new javax.swing.JPanel();
        buttonCerrar = new javax.swing.JPanel();
        buttonCerrarText = new javax.swing.JLabel();
        buttonHome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CC_Icon = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputCorreo = new javax.swing.JTextField();
        inputClave = new javax.swing.JPasswordField();
        buttonIngresar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textRegister = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName("Cat-Course UCV"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainBar.setBackground(new java.awt.Color(42, 40, 44));
        mainBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainBarMouseDragged(evt);
            }
        });
        mainBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainBarMousePressed(evt);
            }
        });
        mainBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonCerrar.setBackground(new java.awt.Color(42, 40, 44));

        buttonCerrarText.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        buttonCerrarText.setForeground(new java.awt.Color(255, 255, 255));
        buttonCerrarText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonCerrarText.setLabelFor(buttonCerrar);
        buttonCerrarText.setText("X");
        buttonCerrarText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCerrarText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCerrarTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCerrarTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCerrarTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonCerrarLayout = new javax.swing.GroupLayout(buttonCerrar);
        buttonCerrar.setLayout(buttonCerrarLayout);
        buttonCerrarLayout.setHorizontalGroup(
            buttonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonCerrarText, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        buttonCerrarLayout.setVerticalGroup(
            buttonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonCerrarText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mainBar.add(buttonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 80, 40));

        buttonHome.setBackground(new java.awt.Color(93, 54, 132));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Home");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonHomeLayout = new javax.swing.GroupLayout(buttonHome);
        buttonHome.setLayout(buttonHomeLayout);
        buttonHomeLayout.setHorizontalGroup(
            buttonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        buttonHomeLayout.setVerticalGroup(
            buttonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mainBar.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 40));

        CC_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/src/CCUCV_LOGOTiny.png"))); // NOI18N
        CC_Icon.setText("jLabel8");
        mainBar.add(CC_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        backgroundPanel.add(mainBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        body.setBackground(new java.awt.Color(119, 69, 168));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setLabelFor(inputCorreo);
        jLabel3.setText("Correo Electronico");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setLabelFor(inputClave);
        jLabel5.setText("Clave");

        inputCorreo.setBackground(new java.awt.Color(216, 197, 234));
        inputCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        inputCorreo.setForeground(new java.awt.Color(102, 102, 102));
        inputCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputCorreo.setText("Ingrese su correo electronico");
        inputCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputCorreoMouseClicked(evt);
            }
        });
        inputCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCorreoActionPerformed(evt);
            }
        });

        inputClave.setBackground(new java.awt.Color(216, 197, 234));
        inputClave.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        inputClave.setForeground(new java.awt.Color(102, 102, 102));
        inputClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputClave.setText("clave1");
        inputClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputClaveMouseClicked(evt);
            }
        });
        inputClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClaveActionPerformed(evt);
            }
        });

        buttonIngresar.setBackground(new java.awt.Color(93, 54, 132));
        buttonIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        buttonIngresar.setPreferredSize(new java.awt.Dimension(100, 50));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonIngresarLayout = new javax.swing.GroupLayout(buttonIngresar);
        buttonIngresar.setLayout(buttonIngresarLayout);
        buttonIngresarLayout.setHorizontalGroup(
            buttonIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );
        buttonIngresarLayout.setVerticalGroup(
            buttonIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        buttonCancelar.setBackground(new java.awt.Color(93, 54, 132));
        buttonCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        buttonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setPreferredSize(new java.awt.Dimension(100, 50));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cancelar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonCancelarLayout = new javax.swing.GroupLayout(buttonCancelar);
        buttonCancelar.setLayout(buttonCancelarLayout);
        buttonCancelarLayout.setHorizontalGroup(
            buttonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );
        buttonCancelarLayout.setVerticalGroup(
            buttonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        textRegister.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        textRegister.setForeground(new java.awt.Color(255, 255, 255));
        textRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textRegister.setText("Registrarse");
        textRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textRegisterMouseExited(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(119, 69, 168));
        jRadioButton1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Administrador");
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(buttonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(inputCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(textRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addComponent(inputClave, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(inputCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputClave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(textRegister)
                .addGap(77, 77, 77))
        );

        backgroundPanel.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 590, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCorreoActionPerformed

    private void inputClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClaveActionPerformed

    private void inputCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputCorreoMouseClicked
        if(inputCorreo.getText().equals("Ingrese su correo electronico")){
            inputCorreo.setText("");
            inputCorreo.setForeground(new java.awt.Color(42, 40, 44));
        }
        if(String.valueOf(inputClave.getPassword()).equals("")){
            inputClave.setText("clave1");
            inputClave.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_inputCorreoMouseClicked

    private void mainBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_mainBarMousePressed

    private void mainBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainBarMouseDragged
        this.setLocation((evt.getXOnScreen() - xMouse), (evt.getYOnScreen() -  yMouse));
    }//GEN-LAST:event_mainBarMouseDragged

    private void buttonCerrarTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCerrarTextMouseExited
        buttonCerrarText.setForeground(Color.white);
    }//GEN-LAST:event_buttonCerrarTextMouseExited

    private void buttonCerrarTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCerrarTextMouseEntered
        buttonCerrarText.setForeground(Color.red);
    }//GEN-LAST:event_buttonCerrarTextMouseEntered

    private void buttonCerrarTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCerrarTextMouseClicked
        System.exit(0);
    }//GEN-LAST:event_buttonCerrarTextMouseClicked

    private void inputClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputClaveMouseClicked
        if(!String.valueOf(inputClave.getPassword()).isEmpty()){
            inputClave.setText("");
            inputClave.setForeground(new java.awt.Color(42, 40, 44));
        }
        if(inputCorreo.getText().equals("Ingrese su correo electronico") || inputCorreo.getText().equals("")){
            inputCorreo.setText("Ingrese su correo electronico");
            inputCorreo.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_inputClaveMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String correo = inputCorreo.getText();
        String clave = inputClave.getText();
       
        escribir_leer data1= new escribir_leer();
        boolean ingreso = data1.Buscar(correo, clave);
        if(ingreso){
            if(admin){
                AdminIU adminView = new AdminIU();
                adminView.setLocationRelativeTo(null);
                adminView.setVisible(true);
                this.setVisible(false);
            }else{
                UsuarioView userView = new UsuarioView();
                userView.setLocationRelativeTo(null);
                userView.setVisible(true);
                this.setVisible(false);
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Datos Incorrectos");
        }
        
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        buttonHome.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        buttonHome.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        buttonIngresar.setBackground(new java.awt.Color(216, 197, 234));
        jLabel1.setForeground(new java.awt.Color(42, 40, 44));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        buttonIngresar.setBackground(new java.awt.Color(93, 54, 132));
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
       buttonCancelar.setBackground(new java.awt.Color(216, 197, 234));
       jLabel2.setForeground(new java.awt.Color(42, 40, 44));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        buttonCancelar.setBackground(new java.awt.Color(93, 54, 132));
        jLabel2.setForeground(Color.white);
    }//GEN-LAST:event_jLabel2MouseExited

    private void textRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegisterMouseClicked
        RegisterIU registro = new RegisterIU();
        registro.setLocationRelativeTo(null);
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_textRegisterMouseClicked

    private void textRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegisterMouseEntered
        textRegister.setForeground(new java.awt.Color(216, 197, 234));
    }//GEN-LAST:event_textRegisterMouseEntered

    private void textRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegisterMouseExited
        textRegister.setForeground(Color.white);
    }//GEN-LAST:event_textRegisterMouseExited

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(!admin){
            admin = true;
        }else{
            admin = false;
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1StateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CC_Icon;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel body;
    private javax.swing.JPanel buttonCancelar;
    private javax.swing.JPanel buttonCerrar;
    private javax.swing.JLabel buttonCerrarText;
    private javax.swing.JPanel buttonHome;
    private javax.swing.JPanel buttonIngresar;
    private javax.swing.JPasswordField inputClave;
    private javax.swing.JTextField inputCorreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPanel mainBar;
    private javax.swing.JLabel textRegister;
    // End of variables declaration//GEN-END:variables
}
