package vistas;
import controladores.LoadAllCourses;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import modelos.Curso;

public class AdminIU extends javax.swing.JFrame {
    int xMouse, yMouse;
    LoadAllCourses loader;
    int coursesNum;
    ArrayList <Curso> allCourses;
    private void load(){
        loader = new LoadAllCourses();
        allCourses = loader.loadCourse();
        coursesNum = allCourses.size();
        cursoPanel1.setVisible(false);
        cursoPanel2.setVisible(false);
        cursoPanel3.setVisible(false);
        cursoPanel4.setVisible(false);
        cursoPanel5.setVisible(false);
        cursoPanel6.setVisible(false);
        if(coursesNum >= 1 && allCourses.get(0).getValid() == false){
            cursoName1.setText(allCourses.get(0).getNombre());
            cursoDesc1.setText(allCourses.get(0).getDescripcion());
            cursoPanel1.setVisible(true);
        };
        if(coursesNum >= 2 && allCourses.get(1).getValid() == false){
            cursoName2.setText(allCourses.get(1).getNombre());
            cursoDesc2.setText(allCourses.get(1).getDescripcion());
            cursoPanel2.setVisible(true);
        };
        if(coursesNum >= 3 && allCourses.get(2).getValid() == false){
            cursoName3.setText(allCourses.get(2).getNombre());
            cursoDesc3.setText(allCourses.get(2).getDescripcion());
            cursoPanel3.setVisible(true);
        };
        if(coursesNum >= 4 && allCourses.get(3).getValid() == false){
            cursoName4.setText(allCourses.get(3).getNombre());
            cursoDesc4.setText(allCourses.get(3).getDescripcion());
            cursoPanel4.setVisible(true);
        };
        if(coursesNum >= 5 && allCourses.get(4).getValid() == false){
            cursoName5.setText(allCourses.get(4).getNombre());
            cursoDesc5.setText(allCourses.get(4).getDescripcion());
            cursoPanel5.setVisible(true);
        };
        if(coursesNum >= 6 && allCourses.get(5).getValid() == false){
            cursoName6.setText(allCourses.get(5).getNombre());
            cursoDesc6.setText(allCourses.get(5).getDescripcion());
            cursoPanel6.setVisible(true);
        };
    };
    public AdminIU() {
        initComponents();
        load();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        mainPanelLeft = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mainPanelRight = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cursoPanel1 = new javax.swing.JPanel();
        cursoName1 = new javax.swing.JLabel();
        cursoDesc1 = new javax.swing.JLabel();
        cursoButton1 = new javax.swing.JPanel();
        cursoButtonText1 = new javax.swing.JLabel();
        cursoPanel2 = new javax.swing.JPanel();
        cursoName2 = new javax.swing.JLabel();
        cursoDesc2 = new javax.swing.JLabel();
        cursoButton2 = new javax.swing.JPanel();
        cursoButtonText2 = new javax.swing.JLabel();
        cursoPanel3 = new javax.swing.JPanel();
        cursoName3 = new javax.swing.JLabel();
        cursoDesc3 = new javax.swing.JLabel();
        cursoButton3 = new javax.swing.JPanel();
        cursoButtonText3 = new javax.swing.JLabel();
        cursoPanel4 = new javax.swing.JPanel();
        cursoName4 = new javax.swing.JLabel();
        cursoDesc4 = new javax.swing.JLabel();
        cursoButton4 = new javax.swing.JPanel();
        cursoButtonText4 = new javax.swing.JLabel();
        cursoPanel5 = new javax.swing.JPanel();
        cursoName5 = new javax.swing.JLabel();
        cursoDesc5 = new javax.swing.JLabel();
        cursoButton5 = new javax.swing.JPanel();
        cursoButtonText5 = new javax.swing.JLabel();
        cursoPanel6 = new javax.swing.JPanel();
        cursoName6 = new javax.swing.JLabel();
        cursoDesc6 = new javax.swing.JLabel();
        cursoButton6 = new javax.swing.JPanel();
        cursoButtonText6 = new javax.swing.JLabel();
        mainBar = new javax.swing.JPanel();
        buttonCerrar = new javax.swing.JPanel();
        buttonCerrarText = new javax.swing.JLabel();
        buttonHome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bienvenido:");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Pedro Perez");

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("DEU");

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Miembro de:");

        javax.swing.GroupLayout mainPanelLeftLayout = new javax.swing.GroupLayout(mainPanelLeft);
        mainPanelLeft.setLayout(mainPanelLeftLayout);
        mainPanelLeftLayout.setHorizontalGroup(
            mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(mainPanelLeftLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLeftLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addComponent(jLabel8))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        mainPanelLeftLayout.setVerticalGroup(
            mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLeftLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(335, Short.MAX_VALUE))
        );

        backgroundPanel.add(mainPanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 440));

        mainPanelRight.setBackground(new java.awt.Color(216, 197, 234));
        mainPanelRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainPanelRight.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 5, 370));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        mainPanelRight.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, 505, 5));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        mainPanelRight.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 26, 5, 400));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(93, 54, 132));
        jLabel9.setText("Cursos por Evaluar");
        mainPanelRight.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        cursoPanel1.setBackground(new java.awt.Color(119, 69, 168));

        cursoName1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoName1.setForeground(new java.awt.Color(255, 255, 255));
        cursoName1.setText("Curso 1");

        cursoDesc1.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        cursoDesc1.setForeground(new java.awt.Color(255, 255, 255));
        cursoDesc1.setText("Descripcion de Curso");

        cursoButton1.setBackground(new java.awt.Color(93, 54, 132));

        cursoButtonText1.setBackground(new java.awt.Color(93, 54, 132));
        cursoButtonText1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoButtonText1.setForeground(new java.awt.Color(255, 255, 255));
        cursoButtonText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoButtonText1.setText("Validar");
        cursoButtonText1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cursoButton1Layout = new javax.swing.GroupLayout(cursoButton1);
        cursoButton1.setLayout(cursoButton1Layout);
        cursoButton1Layout.setHorizontalGroup(
            cursoButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        cursoButton1Layout.setVerticalGroup(
            cursoButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cursoPanel1Layout = new javax.swing.GroupLayout(cursoPanel1);
        cursoPanel1.setLayout(cursoPanel1Layout);
        cursoPanel1Layout.setHorizontalGroup(
            cursoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel1Layout.createSequentialGroup()
                .addGroup(cursoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursoPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cursoButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cursoPanel1Layout.createSequentialGroup()
                        .addGroup(cursoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cursoPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cursoName1))
                            .addGroup(cursoPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cursoDesc1)))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cursoPanel1Layout.setVerticalGroup(
            cursoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoDesc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        mainPanelRight.add(cursoPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 90));

        cursoPanel2.setBackground(new java.awt.Color(119, 69, 168));

        cursoName2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoName2.setForeground(new java.awt.Color(255, 255, 255));
        cursoName2.setText("Curso 1");

        cursoDesc2.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        cursoDesc2.setForeground(new java.awt.Color(255, 255, 255));
        cursoDesc2.setText("Descripcion de Curso");

        cursoButton2.setBackground(new java.awt.Color(93, 54, 132));

        cursoButtonText2.setBackground(new java.awt.Color(93, 54, 132));
        cursoButtonText2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoButtonText2.setForeground(new java.awt.Color(255, 255, 255));
        cursoButtonText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoButtonText2.setText("Validar");
        cursoButtonText2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cursoButton2Layout = new javax.swing.GroupLayout(cursoButton2);
        cursoButton2.setLayout(cursoButton2Layout);
        cursoButton2Layout.setHorizontalGroup(
            cursoButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        cursoButton2Layout.setVerticalGroup(
            cursoButton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cursoPanel2Layout = new javax.swing.GroupLayout(cursoPanel2);
        cursoPanel2.setLayout(cursoPanel2Layout);
        cursoPanel2Layout.setHorizontalGroup(
            cursoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel2Layout.createSequentialGroup()
                .addGroup(cursoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursoPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cursoButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cursoPanel2Layout.createSequentialGroup()
                        .addGroup(cursoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cursoPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cursoName2))
                            .addGroup(cursoPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cursoDesc2)))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cursoPanel2Layout.setVerticalGroup(
            cursoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoDesc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        mainPanelRight.add(cursoPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        cursoPanel3.setBackground(new java.awt.Color(119, 69, 168));

        cursoName3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoName3.setForeground(new java.awt.Color(255, 255, 255));
        cursoName3.setText("Curso 1");

        cursoDesc3.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        cursoDesc3.setForeground(new java.awt.Color(255, 255, 255));
        cursoDesc3.setText("Descripcion de Curso");

        cursoButton3.setBackground(new java.awt.Color(93, 54, 132));

        cursoButtonText3.setBackground(new java.awt.Color(93, 54, 132));
        cursoButtonText3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoButtonText3.setForeground(new java.awt.Color(255, 255, 255));
        cursoButtonText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoButtonText3.setText("Validar");
        cursoButtonText3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cursoButton3Layout = new javax.swing.GroupLayout(cursoButton3);
        cursoButton3.setLayout(cursoButton3Layout);
        cursoButton3Layout.setHorizontalGroup(
            cursoButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        cursoButton3Layout.setVerticalGroup(
            cursoButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cursoPanel3Layout = new javax.swing.GroupLayout(cursoPanel3);
        cursoPanel3.setLayout(cursoPanel3Layout);
        cursoPanel3Layout.setHorizontalGroup(
            cursoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel3Layout.createSequentialGroup()
                .addGroup(cursoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursoPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cursoButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cursoPanel3Layout.createSequentialGroup()
                        .addGroup(cursoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cursoPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cursoName3))
                            .addGroup(cursoPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cursoDesc3)))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cursoPanel3Layout.setVerticalGroup(
            cursoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoDesc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        mainPanelRight.add(cursoPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        cursoPanel4.setBackground(new java.awt.Color(119, 69, 168));

        cursoName4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoName4.setForeground(new java.awt.Color(255, 255, 255));
        cursoName4.setText("Curso 1");

        cursoDesc4.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        cursoDesc4.setForeground(new java.awt.Color(255, 255, 255));
        cursoDesc4.setText("Descripcion de Curso");

        cursoButton4.setBackground(new java.awt.Color(93, 54, 132));

        cursoButtonText4.setBackground(new java.awt.Color(93, 54, 132));
        cursoButtonText4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoButtonText4.setForeground(new java.awt.Color(255, 255, 255));
        cursoButtonText4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoButtonText4.setText("Validar");
        cursoButtonText4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cursoButton4Layout = new javax.swing.GroupLayout(cursoButton4);
        cursoButton4.setLayout(cursoButton4Layout);
        cursoButton4Layout.setHorizontalGroup(
            cursoButton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        cursoButton4Layout.setVerticalGroup(
            cursoButton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cursoPanel4Layout = new javax.swing.GroupLayout(cursoPanel4);
        cursoPanel4.setLayout(cursoPanel4Layout);
        cursoPanel4Layout.setHorizontalGroup(
            cursoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel4Layout.createSequentialGroup()
                .addGroup(cursoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursoPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cursoButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cursoPanel4Layout.createSequentialGroup()
                        .addGroup(cursoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cursoPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cursoName4))
                            .addGroup(cursoPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cursoDesc4)))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cursoPanel4Layout.setVerticalGroup(
            cursoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoName4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoDesc4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        mainPanelRight.add(cursoPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        cursoPanel5.setBackground(new java.awt.Color(119, 69, 168));

        cursoName5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoName5.setForeground(new java.awt.Color(255, 255, 255));
        cursoName5.setText("Curso 1");

        cursoDesc5.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        cursoDesc5.setForeground(new java.awt.Color(255, 255, 255));
        cursoDesc5.setText("Descripcion de Curso");

        cursoButton5.setBackground(new java.awt.Color(93, 54, 132));

        cursoButtonText5.setBackground(new java.awt.Color(93, 54, 132));
        cursoButtonText5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoButtonText5.setForeground(new java.awt.Color(255, 255, 255));
        cursoButtonText5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoButtonText5.setText("Validar");
        cursoButtonText5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cursoButton5Layout = new javax.swing.GroupLayout(cursoButton5);
        cursoButton5.setLayout(cursoButton5Layout);
        cursoButton5Layout.setHorizontalGroup(
            cursoButton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        cursoButton5Layout.setVerticalGroup(
            cursoButton5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cursoPanel5Layout = new javax.swing.GroupLayout(cursoPanel5);
        cursoPanel5.setLayout(cursoPanel5Layout);
        cursoPanel5Layout.setHorizontalGroup(
            cursoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel5Layout.createSequentialGroup()
                .addGroup(cursoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursoPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cursoButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cursoPanel5Layout.createSequentialGroup()
                        .addGroup(cursoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cursoPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cursoName5))
                            .addGroup(cursoPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cursoDesc5)))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cursoPanel5Layout.setVerticalGroup(
            cursoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoName5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoDesc5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        mainPanelRight.add(cursoPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        cursoPanel6.setBackground(new java.awt.Color(119, 69, 168));

        cursoName6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoName6.setForeground(new java.awt.Color(255, 255, 255));
        cursoName6.setText("Curso 1");

        cursoDesc6.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        cursoDesc6.setForeground(new java.awt.Color(255, 255, 255));
        cursoDesc6.setText("Descripcion de Curso");

        cursoButton6.setBackground(new java.awt.Color(93, 54, 132));

        cursoButtonText6.setBackground(new java.awt.Color(93, 54, 132));
        cursoButtonText6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cursoButtonText6.setForeground(new java.awt.Color(255, 255, 255));
        cursoButtonText6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cursoButtonText6.setText("Validar");
        cursoButtonText6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cursoButton6Layout = new javax.swing.GroupLayout(cursoButton6);
        cursoButton6.setLayout(cursoButton6Layout);
        cursoButton6Layout.setHorizontalGroup(
            cursoButton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        cursoButton6Layout.setVerticalGroup(
            cursoButton6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cursoButtonText6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cursoPanel6Layout = new javax.swing.GroupLayout(cursoPanel6);
        cursoPanel6.setLayout(cursoPanel6Layout);
        cursoPanel6Layout.setHorizontalGroup(
            cursoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel6Layout.createSequentialGroup()
                .addGroup(cursoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cursoPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cursoButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cursoPanel6Layout.createSequentialGroup()
                        .addGroup(cursoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cursoPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cursoName6))
                            .addGroup(cursoPanel6Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cursoDesc6)))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cursoPanel6Layout.setVerticalGroup(
            cursoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cursoPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoName6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoDesc6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        mainPanelRight.add(cursoPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        backgroundPanel.add(mainPanelRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 560, 440));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CC_Icon;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel buttonCerrar;
    private javax.swing.JLabel buttonCerrarText;
    private javax.swing.JPanel buttonHome;
    private javax.swing.JPanel buttonPerfil;
    private javax.swing.JPanel buttonSalir;
    private javax.swing.JPanel cursoButton1;
    private javax.swing.JPanel cursoButton2;
    private javax.swing.JPanel cursoButton3;
    private javax.swing.JPanel cursoButton4;
    private javax.swing.JPanel cursoButton5;
    private javax.swing.JPanel cursoButton6;
    private javax.swing.JLabel cursoButtonText1;
    private javax.swing.JLabel cursoButtonText2;
    private javax.swing.JLabel cursoButtonText3;
    private javax.swing.JLabel cursoButtonText4;
    private javax.swing.JLabel cursoButtonText5;
    private javax.swing.JLabel cursoButtonText6;
    private javax.swing.JLabel cursoDesc1;
    private javax.swing.JLabel cursoDesc2;
    private javax.swing.JLabel cursoDesc3;
    private javax.swing.JLabel cursoDesc4;
    private javax.swing.JLabel cursoDesc5;
    private javax.swing.JLabel cursoDesc6;
    private javax.swing.JLabel cursoName1;
    private javax.swing.JLabel cursoName2;
    private javax.swing.JLabel cursoName3;
    private javax.swing.JLabel cursoName4;
    private javax.swing.JLabel cursoName5;
    private javax.swing.JLabel cursoName6;
    private javax.swing.JPanel cursoPanel1;
    private javax.swing.JPanel cursoPanel2;
    private javax.swing.JPanel cursoPanel3;
    private javax.swing.JPanel cursoPanel4;
    private javax.swing.JPanel cursoPanel5;
    private javax.swing.JPanel cursoPanel6;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mainBar;
    private javax.swing.JPanel mainPanelLeft;
    private javax.swing.JPanel mainPanelRight;
    // End of variables declaration//GEN-END:variables
}
