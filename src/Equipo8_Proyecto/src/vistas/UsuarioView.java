package vistas;
import java.awt.Color;
import javax.swing.BorderFactory;

public class UsuarioView extends javax.swing.JFrame {
    int xMouse, yMouse;
    public UsuarioView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        mainPanelLeft = new javax.swing.JPanel();
        mainPanelLeft2 = new javax.swing.JPanel();
        mainPanelLeft3 = new javax.swing.JPanel();
        mainPanelRight = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        mainPanelLeft1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        mainPanelLeft4 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        mainPanelLeft5 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mainBar = new javax.swing.JPanel();
        buttonCerrar = new javax.swing.JPanel();
        buttonCerrarText = new javax.swing.JLabel();
        buttonHome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        buttonCursos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonSalir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        buttonPerfil = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CC_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanelLeft.setBackground(new java.awt.Color(119, 69, 168));

        mainPanelLeft2.setBackground(new java.awt.Color(119, 69, 168));

        mainPanelLeft3.setBackground(new java.awt.Color(119, 69, 168));

        javax.swing.GroupLayout mainPanelLeft3Layout = new javax.swing.GroupLayout(mainPanelLeft3);
        mainPanelLeft3.setLayout(mainPanelLeft3Layout);
        mainPanelLeft3Layout.setHorizontalGroup(
            mainPanelLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );
        mainPanelLeft3Layout.setVerticalGroup(
            mainPanelLeft3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLeft2Layout = new javax.swing.GroupLayout(mainPanelLeft2);
        mainPanelLeft2.setLayout(mainPanelLeft2Layout);
        mainPanelLeft2Layout.setHorizontalGroup(
            mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
            .addGroup(mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLeft2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanelLeft3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        mainPanelLeft2Layout.setVerticalGroup(
            mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLeft2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanelLeft3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout mainPanelLeftLayout = new javax.swing.GroupLayout(mainPanelLeft);
        mainPanelLeft.setLayout(mainPanelLeftLayout);
        mainPanelLeftLayout.setHorizontalGroup(
            mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
            .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLeftLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanelLeft2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        mainPanelLeftLayout.setVerticalGroup(
            mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLeftLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanelLeft2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        backgroundPanel.add(mainPanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 520));

        mainPanelRight.setBackground(new java.awt.Color(216, 197, 234));
        mainPanelRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(216, 197, 234));
        jTextField1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(119, 69, 168));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Estado");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        mainPanelRight.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 38, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        mainPanelRight.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 350, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        mainPanelRight.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        mainPanelRight.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 0, -1, -1));

        jTextField2.setBackground(new java.awt.Color(216, 197, 234));
        jTextField2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(119, 69, 168));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Cursos");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        mainPanelRight.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, 171, 50));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        mainPanelRight.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 75, -1, -1));

        mainPanelLeft1.setBackground(new java.awt.Color(119, 69, 168));

        jTextField3.setBackground(new java.awt.Color(119, 69, 168));
        jTextField3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Curso 1");
        jTextField3.setAutoscrolls(false);
        jTextField3.setBorder(null);
        jTextField3.setOpaque(true);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLeft1Layout = new javax.swing.GroupLayout(mainPanelLeft1);
        mainPanelLeft1.setLayout(mainPanelLeft1Layout);
        mainPanelLeft1Layout.setHorizontalGroup(
            mainPanelLeft1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLeft1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        mainPanelLeft1Layout.setVerticalGroup(
            mainPanelLeft1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLeft1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        mainPanelRight.add(mainPanelLeft1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 148, -1, -1));

        mainPanelLeft4.setBackground(new java.awt.Color(119, 69, 168));

        jTextField4.setBackground(new java.awt.Color(119, 69, 168));
        jTextField4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Curso 2");
        jTextField4.setAutoscrolls(false);
        jTextField4.setBorder(null);
        jTextField4.setOpaque(true);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLeft4Layout = new javax.swing.GroupLayout(mainPanelLeft4);
        mainPanelLeft4.setLayout(mainPanelLeft4Layout);
        mainPanelLeft4Layout.setHorizontalGroup(
            mainPanelLeft4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLeft4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLeft4Layout.setVerticalGroup(
            mainPanelLeft4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLeft4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        mainPanelRight.add(mainPanelLeft4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 257, 261, -1));

        mainPanelLeft5.setBackground(new java.awt.Color(119, 69, 168));

        jTextField5.setBackground(new java.awt.Color(119, 69, 168));
        jTextField5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("Curso 3");
        jTextField5.setAutoscrolls(false);
        jTextField5.setBorder(null);
        jTextField5.setOpaque(true);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLeft5Layout = new javax.swing.GroupLayout(mainPanelLeft5);
        mainPanelLeft5.setLayout(mainPanelLeft5Layout);
        mainPanelLeft5Layout.setHorizontalGroup(
            mainPanelLeft5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLeft5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLeft5Layout.setVerticalGroup(
            mainPanelLeft5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLeft5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        mainPanelRight.add(mainPanelLeft5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 372, 261, -1));

        jLabel10.setBackground(new java.awt.Color(119, 69, 168));
        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Aceptado");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        mainPanelRight.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 275, 65, 41));

        jLabel9.setBackground(new java.awt.Color(119, 69, 168));
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Revision");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        mainPanelRight.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 176, 65, 41));

        jLabel11.setBackground(new java.awt.Color(119, 69, 168));
        jLabel11.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Revision");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        mainPanelRight.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 389, 65, 41));

        backgroundPanel.add(mainPanelRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 450, 520));

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

        buttonCursos.setBackground(new java.awt.Color(93, 54, 132));
        buttonCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCursosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCursosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCursosMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cursos");

        javax.swing.GroupLayout buttonCursosLayout = new javax.swing.GroupLayout(buttonCursos);
        buttonCursos.setLayout(buttonCursosLayout);
        buttonCursosLayout.setHorizontalGroup(
            buttonCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        buttonCursosLayout.setVerticalGroup(
            buttonCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mainBar.add(buttonCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 40));

        buttonSalir.setBackground(new java.awt.Color(93, 54, 132));
        buttonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSalirMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Salir");

        javax.swing.GroupLayout buttonSalirLayout = new javax.swing.GroupLayout(buttonSalir);
        buttonSalir.setLayout(buttonSalirLayout);
        buttonSalirLayout.setHorizontalGroup(
            buttonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        buttonSalirLayout.setVerticalGroup(
            buttonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mainBar.add(buttonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 50, 40));

        buttonPerfil.setBackground(new java.awt.Color(93, 54, 132));
        buttonPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPerfilMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Perfil");

        javax.swing.GroupLayout buttonPerfilLayout = new javax.swing.GroupLayout(buttonPerfil);
        buttonPerfil.setLayout(buttonPerfilLayout);
        buttonPerfilLayout.setHorizontalGroup(
            buttonPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        buttonPerfilLayout.setVerticalGroup(
            buttonPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        mainBar.add(buttonPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 50, 40));

        CC_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/src/CCUCV_LOGOTiny.png"))); // NOI18N
        CC_Icon.setText("jLabel8");
        mainBar.add(CC_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 40, 40));

        backgroundPanel.add(mainBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    private void buttonCerrarTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCerrarTextMouseClicked
        System.exit(0);
    }//GEN-LAST:event_buttonCerrarTextMouseClicked

    private void buttonCerrarTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCerrarTextMouseEntered
        buttonCerrarText.setForeground(Color.red);
    }//GEN-LAST:event_buttonCerrarTextMouseEntered

    private void buttonCerrarTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCerrarTextMouseExited
        buttonCerrarText.setForeground(Color.white);
    }//GEN-LAST:event_buttonCerrarTextMouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        buttonHome.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        buttonHome.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_jLabel6MouseExited

    private void buttonCursosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCursosMouseEntered
        buttonCursos.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_buttonCursosMouseEntered

    private void buttonCursosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCursosMouseExited
        buttonCursos.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_buttonCursosMouseExited

    private void buttonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalirMouseEntered
        buttonSalir.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_buttonSalirMouseEntered

    private void buttonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalirMouseExited
        buttonSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_buttonSalirMouseExited

    private void buttonPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPerfilMouseEntered
        buttonPerfil.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_buttonPerfilMouseEntered

    private void buttonPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPerfilMouseExited
        buttonPerfil.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_buttonPerfilMouseExited

    private void mainBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainBarMouseDragged
        this.setLocation((evt.getXOnScreen() - xMouse), (evt.getYOnScreen() -  yMouse));
    }//GEN-LAST:event_mainBarMouseDragged

    private void mainBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_mainBarMousePressed

    private void buttonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalirMouseClicked
        LoginIU login = new LoginIU();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonSalirMouseClicked

    private void buttonCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCursosMouseClicked
        FormulacionDeCursoIU formu = new FormulacionDeCursoIU();
        formu.setLocationRelativeTo(null);
        formu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonCursosMouseClicked

    private void buttonPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPerfilMouseClicked
        Usuario userD = new Usuario();
        userD.setLocationRelativeTo(null);
        userD.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonPerfilMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        FormularioDeCursoIU formoC = new FormularioDeCursoIU();
        formoC.setLocationRelativeTo(null);
        formoC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        FormularioDeCursoIU formoC = new FormularioDeCursoIU();
        formoC.setLocationRelativeTo(null);
        formoC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       FormularioDeCursoIU formoC = new FormularioDeCursoIU();
       formoC.setLocationRelativeTo(null);
       formoC.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CC_Icon;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel buttonCerrar;
    private javax.swing.JLabel buttonCerrarText;
    private javax.swing.JPanel buttonCursos;
    private javax.swing.JPanel buttonHome;
    private javax.swing.JPanel buttonPerfil;
    private javax.swing.JPanel buttonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel mainBar;
    private javax.swing.JPanel mainPanelLeft;
    private javax.swing.JPanel mainPanelLeft1;
    private javax.swing.JPanel mainPanelLeft2;
    private javax.swing.JPanel mainPanelLeft3;
    private javax.swing.JPanel mainPanelLeft4;
    private javax.swing.JPanel mainPanelLeft5;
    private javax.swing.JPanel mainPanelRight;
    // End of variables declaration//GEN-END:variables
}
