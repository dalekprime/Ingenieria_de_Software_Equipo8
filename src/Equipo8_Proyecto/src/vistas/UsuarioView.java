package vistas;
import java.awt.Color;
import javax.swing.BorderFactory;
import modelos.Usuario;

public class UsuarioView extends javax.swing.JFrame {
    int xMouse, yMouse;
    Usuario actualUser;
    void start(){
        int numCurso = actualUser.myCourses.size();
        curso1Panel.setVisible(false);
        curso2Panel.setVisible(false);
        curso3Panel.setVisible(false);
        curso1Valid.setVisible(false);
        curso2Valid.setVisible(false);
        curso3Valid.setVisible(false);
        if(numCurso >= 1){
            curso1Name.setText(actualUser.myCourses.get(0).getNombre());
            cursoDesc1.setText(actualUser.myCourses.get(0).getDescripcion());
            boolean actualValid1 = actualUser.myCourses.get(0).getValid();
            String validName1 = actualValid1?"Aprobado":"Revision";
            curso1Valid.setText(validName1);
            curso1Panel.setVisible(true);
            curso1Valid.setVisible(true);
        }if(numCurso >= 2){
            cursoName2.setText(actualUser.myCourses.get(1).getNombre());
            cursoDesc2.setText(actualUser.myCourses.get(1).getDescripcion());
            boolean actualValid2 = actualUser.myCourses.get(1).getValid();
            String validName2 = actualValid2?"Aprobado":"Revision";
            curso2Valid.setText(validName2);
            curso2Panel.setVisible(true);
            curso2Valid.setVisible(true);
        }if(numCurso >= 3){
            cursoName3.setText(actualUser.myCourses.get(2).getNombre());
            cursoDesc3.setText(actualUser.myCourses.get(2).getDescripcion());
            boolean actualValid3 = actualUser.myCourses.get(2).getValid();
            String validName3 = actualValid3?"Aprobado":"Revision";
            curso3Valid.setText(validName3);
            curso3Panel.setVisible(true);
            curso3Valid.setVisible(true);
        };
    };
    public UsuarioView(Usuario actualUser) {
        initComponents();
        this.actualUser = actualUser;
        //System.out.println(actulUser.getNombre());
        UserName.setText(actualUser.getNombre());
        UserCorreo.setText(actualUser.getCorreo());
        start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        mainPanelLeft = new javax.swing.JPanel();
        mainPanelLeft2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        UserCorreo = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        mainPanelRight = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        curso2Valid = new javax.swing.JLabel();
        curso1Valid = new javax.swing.JLabel();
        curso3Valid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        curso1Panel = new javax.swing.JPanel();
        curso1Name = new javax.swing.JLabel();
        cursoDesc1 = new javax.swing.JLabel();
        curso2Panel = new javax.swing.JPanel();
        cursoName2 = new javax.swing.JLabel();
        cursoDesc2 = new javax.swing.JLabel();
        curso3Panel = new javax.swing.JPanel();
        cursoName3 = new javax.swing.JLabel();
        cursoDesc3 = new javax.swing.JLabel();
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

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Bienvenido:");

        UserCorreo.setBackground(new java.awt.Color(255, 255, 255));
        UserCorreo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        UserCorreo.setForeground(new java.awt.Color(255, 255, 255));
        UserCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserCorreo.setText("Coreo@coreo.coreo");

        UserName.setBackground(new java.awt.Color(255, 255, 255));
        UserName.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserName.setText("Pedro Perez");

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Correo:");

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Usuario:");

        javax.swing.GroupLayout mainPanelLeft2Layout = new javax.swing.GroupLayout(mainPanelLeft2);
        mainPanelLeft2.setLayout(mainPanelLeft2Layout);
        mainPanelLeft2Layout.setHorizontalGroup(
            mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLeft2Layout.createSequentialGroup()
                .addGroup(mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLeft2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(mainPanelLeft2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        mainPanelLeft2Layout.setVerticalGroup(
            mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLeft2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLeft2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(UserCorreo))
                .addContainerGap(459, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLeftLayout = new javax.swing.GroupLayout(mainPanelLeft);
        mainPanelLeft.setLayout(mainPanelLeftLayout);
        mainPanelLeftLayout.setHorizontalGroup(
            mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
            .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLeftLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanelLeft2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        mainPanelLeftLayout.setVerticalGroup(
            mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
            .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLeftLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanelLeft2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        backgroundPanel.add(mainPanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 520));

        mainPanelRight.setBackground(new java.awt.Color(216, 197, 234));
        mainPanelRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        curso2Valid.setBackground(new java.awt.Color(119, 69, 168));
        curso2Valid.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        curso2Valid.setForeground(new java.awt.Color(255, 255, 255));
        curso2Valid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        curso2Valid.setText("Aceptado");
        curso2Valid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        curso2Valid.setOpaque(true);
        curso2Valid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curso2ValidMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                curso2ValidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                curso2ValidMouseExited(evt);
            }
        });
        mainPanelRight.add(curso2Valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 65, 41));

        curso1Valid.setBackground(new java.awt.Color(119, 69, 168));
        curso1Valid.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        curso1Valid.setForeground(new java.awt.Color(255, 255, 255));
        curso1Valid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        curso1Valid.setText("Aprobado");
        curso1Valid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        curso1Valid.setOpaque(true);
        curso1Valid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curso1ValidMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                curso1ValidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                curso1ValidMouseExited(evt);
            }
        });
        mainPanelRight.add(curso1Valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 65, 41));

        curso3Valid.setBackground(new java.awt.Color(119, 69, 168));
        curso3Valid.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        curso3Valid.setForeground(new java.awt.Color(255, 255, 255));
        curso3Valid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        curso3Valid.setText("Revision");
        curso3Valid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        curso3Valid.setOpaque(true);
        curso3Valid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                curso3ValidMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                curso3ValidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                curso3ValidMouseExited(evt);
            }
        });
        mainPanelRight.add(curso3Valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 65, 41));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(119, 69, 168));
        jLabel2.setText("Cursos");
        mainPanelRight.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(119, 69, 168));
        jLabel12.setText("Estado");
        mainPanelRight.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jPanel5.setBackground(new java.awt.Color(216, 197, 234));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        curso1Panel.setBackground(new java.awt.Color(119, 69, 168));

        curso1Name.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        curso1Name.setForeground(new java.awt.Color(255, 255, 255));
        curso1Name.setText("Curso 1");

        cursoDesc1.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        cursoDesc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoDesc1.setText("Descripcion");

        javax.swing.GroupLayout curso1PanelLayout = new javax.swing.GroupLayout(curso1Panel);
        curso1Panel.setLayout(curso1PanelLayout);
        curso1PanelLayout.setHorizontalGroup(
            curso1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curso1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(curso1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
            .addComponent(cursoDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        curso1PanelLayout.setVerticalGroup(
            curso1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curso1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(curso1Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cursoDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel5.add(curso1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 260, -1));

        curso2Panel.setBackground(new java.awt.Color(119, 69, 168));

        cursoName2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoName2.setForeground(new java.awt.Color(255, 255, 255));
        cursoName2.setText("Curso 2");

        cursoDesc2.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        cursoDesc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoDesc2.setText("Descripcion");

        javax.swing.GroupLayout curso2PanelLayout = new javax.swing.GroupLayout(curso2Panel);
        curso2Panel.setLayout(curso2PanelLayout);
        curso2PanelLayout.setHorizontalGroup(
            curso2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curso2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoName2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
            .addComponent(cursoDesc2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        curso2PanelLayout.setVerticalGroup(
            curso2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curso2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoDesc2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        jPanel5.add(curso2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 260, -1));

        curso3Panel.setBackground(new java.awt.Color(119, 69, 168));

        cursoName3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoName3.setForeground(new java.awt.Color(255, 255, 255));
        cursoName3.setText("Curso 3");

        cursoDesc3.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        cursoDesc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoDesc3.setText("Descripcion");

        javax.swing.GroupLayout curso3PanelLayout = new javax.swing.GroupLayout(curso3Panel);
        curso3Panel.setLayout(curso3PanelLayout);
        curso3PanelLayout.setHorizontalGroup(
            curso3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curso3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoName3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
            .addComponent(cursoDesc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        curso3PanelLayout.setVerticalGroup(
            curso3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curso3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoDesc3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        jPanel5.add(curso3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 261, -1));

        mainPanelRight.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 90, 260, 420));

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

    private void curso2ValidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso2ValidMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_curso2ValidMouseEntered

    private void curso2ValidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso2ValidMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_curso2ValidMouseExited

    private void curso1ValidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso1ValidMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_curso1ValidMouseEntered

    private void curso1ValidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso1ValidMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_curso1ValidMouseExited

    private void curso3ValidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso3ValidMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_curso3ValidMouseEntered

    private void curso3ValidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso3ValidMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_curso3ValidMouseExited

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
        FormulacionDeCursoIU formu = new FormulacionDeCursoIU(actualUser);
        formu.setLocationRelativeTo(null);
        formu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonCursosMouseClicked

    private void buttonPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPerfilMouseClicked
        UserIU userD = new UserIU(actualUser);
        userD.setLocationRelativeTo(null);
        userD.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonPerfilMouseClicked

    private void curso1ValidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso1ValidMouseClicked
        if(!(actualUser.myCourses.get(0).getValid())){
            FormularioDeCursoIU formoC = new FormularioDeCursoIU(actualUser);
            formoC.setLocationRelativeTo(null);
            formoC.setVisible(true);
            this.setVisible(false);
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Este curso ya fue aprobado");
        };
    }//GEN-LAST:event_curso1ValidMouseClicked

    private void curso2ValidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso2ValidMouseClicked
        if(!(actualUser.myCourses.get(1).getValid())){
            FormularioDeCursoIU formoC = new FormularioDeCursoIU(actualUser);
            formoC.setLocationRelativeTo(null);
            formoC.setVisible(true);
            this.setVisible(false);
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Este curso ya fue aprobado");
        };
    }//GEN-LAST:event_curso2ValidMouseClicked

    private void curso3ValidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curso3ValidMouseClicked
       if(!(actualUser.myCourses.get(2).getValid())){
            FormularioDeCursoIU formoC = new FormularioDeCursoIU(actualUser);
            formoC.setLocationRelativeTo(null);
            formoC.setVisible(true);
            this.setVisible(false);
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Este curso ya fue aprobado");
        };
    }//GEN-LAST:event_curso3ValidMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CC_Icon;
    private javax.swing.JLabel UserCorreo;
    private javax.swing.JLabel UserName;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel buttonCerrar;
    private javax.swing.JLabel buttonCerrarText;
    private javax.swing.JPanel buttonCursos;
    private javax.swing.JPanel buttonHome;
    private javax.swing.JPanel buttonPerfil;
    private javax.swing.JPanel buttonSalir;
    private javax.swing.JLabel curso1Name;
    private javax.swing.JPanel curso1Panel;
    private javax.swing.JLabel curso1Valid;
    private javax.swing.JPanel curso2Panel;
    private javax.swing.JLabel curso2Valid;
    private javax.swing.JPanel curso3Panel;
    private javax.swing.JLabel curso3Valid;
    private javax.swing.JLabel cursoDesc1;
    private javax.swing.JLabel cursoDesc2;
    private javax.swing.JLabel cursoDesc3;
    private javax.swing.JLabel cursoName2;
    private javax.swing.JLabel cursoName3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel mainBar;
    private javax.swing.JPanel mainPanelLeft;
    private javax.swing.JPanel mainPanelLeft2;
    private javax.swing.JPanel mainPanelRight;
    // End of variables declaration//GEN-END:variables
}
