/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;
import modelos.Curso;
import modelos.Usuario;

public class FormulacionDeCursoIU extends javax.swing.JFrame {
    int xMouse, yMouse;
    String modalidadValue = "";
    String tipoValue = "";
    Usuario actualUser;
    public FormulacionDeCursoIU(Usuario actualUser) {
        initComponents();
        this.actualUser = actualUser;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modalidad = new javax.swing.ButtonGroup();
        Caracter = new javax.swing.ButtonGroup();
        Requisitos = new javax.swing.ButtonGroup();
        Tipo = new javax.swing.ButtonGroup();
        backgroundPanel = new javax.swing.JPanel();
        mainPanelLeft = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        buttonPresencial = new javax.swing.JRadioButton();
        buttonDinamico = new javax.swing.JRadioButton();
        buttonDistancia = new javax.swing.JRadioButton();
        buttonMixto = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        mainPanelRight = new javax.swing.JPanel();
        jRadioCharla = new javax.swing.JRadioButton();
        buttonCurso = new javax.swing.JRadioButton();
        buttonTaller = new javax.swing.JRadioButton();
        buttonDiplomado = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        inputCourseName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        inputCourseDesc = new javax.swing.JTextField();
        mainBar = new javax.swing.JPanel();
        buttonCerrar = new javax.swing.JPanel();
        buttonCerrarText = new javax.swing.JLabel();
        buttonHome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        buttonSalir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CC_Icon = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanelLeft.setBackground(new java.awt.Color(119, 69, 168));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Requisito Minimo para el Curso");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Modalidad");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("De Carácter");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Requisito Adicional");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        buttonPresencial.setBackground(new java.awt.Color(119, 69, 168));
        Modalidad.add(buttonPresencial);
        buttonPresencial.setForeground(new java.awt.Color(255, 255, 255));
        buttonPresencial.setText("Presencial");
        buttonPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPresencialActionPerformed(evt);
            }
        });

        buttonDinamico.setBackground(new java.awt.Color(119, 69, 168));
        Modalidad.add(buttonDinamico);
        buttonDinamico.setForeground(new java.awt.Color(255, 255, 255));
        buttonDinamico.setText("Dinámico");
        buttonDinamico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDinamicoActionPerformed(evt);
            }
        });

        buttonDistancia.setBackground(new java.awt.Color(119, 69, 168));
        Modalidad.add(buttonDistancia);
        buttonDistancia.setForeground(new java.awt.Color(255, 255, 255));
        buttonDistancia.setText("A Distancia");
        buttonDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDistanciaActionPerformed(evt);
            }
        });

        buttonMixto.setBackground(new java.awt.Color(119, 69, 168));
        Modalidad.add(buttonMixto);
        buttonMixto.setForeground(new java.awt.Color(255, 255, 255));
        buttonMixto.setText("Mixto");
        buttonMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMixtoActionPerformed(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(119, 69, 168));
        Caracter.add(jRadioButton5);
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Multidisciplinario");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(119, 69, 168));
        Caracter.add(jRadioButton6);
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Interdisciplinario");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(119, 69, 168));
        Caracter.add(jRadioButton7);
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Transdisciplinario");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(119, 69, 168));
        Caracter.add(jRadioButton8);
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("Disciplinario");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jRadioButton9.setBackground(new java.awt.Color(119, 69, 168));
        Requisitos.add(jRadioButton9);
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("Educación Básica");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.setBackground(new java.awt.Color(119, 69, 168));
        Requisitos.add(jRadioButton10);
        jRadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("Educación Media General");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jRadioButton11.setBackground(new java.awt.Color(119, 69, 168));
        Requisitos.add(jRadioButton11);
        jRadioButton11.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setText("Educación Universitaria");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(216, 197, 234));
        jTextField1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(119, 69, 168));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLeftLayout = new javax.swing.GroupLayout(mainPanelLeft);
        mainPanelLeft.setLayout(mainPanelLeftLayout);
        mainPanelLeftLayout.setHorizontalGroup(
            mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton8))
                .addGap(30, 30, 30)
                .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton7))
                .addGap(31, 31, 31))
            .addGroup(mainPanelLeftLayout.createSequentialGroup()
                .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLeftLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton9)))
                    .addGroup(mainPanelLeftLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLeftLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonDinamico)
                            .addComponent(buttonDistancia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonPresencial)
                            .addComponent(buttonMixto))
                        .addGap(37, 37, 37))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLeftLayout.setVerticalGroup(
            mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLeftLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDinamico)
                    .addComponent(buttonPresencial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDistancia)
                    .addComponent(buttonMixto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        backgroundPanel.add(mainPanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 520));

        mainPanelRight.setBackground(new java.awt.Color(216, 197, 234));

        jRadioCharla.setBackground(new java.awt.Color(216, 197, 234));
        Tipo.add(jRadioCharla);
        jRadioCharla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jRadioCharla.setForeground(new java.awt.Color(119, 69, 168));
        jRadioCharla.setText("Charla/Conferencia");
        jRadioCharla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCharlaActionPerformed(evt);
            }
        });

        buttonCurso.setBackground(new java.awt.Color(216, 197, 234));
        Tipo.add(buttonCurso);
        buttonCurso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonCurso.setForeground(new java.awt.Color(119, 69, 168));
        buttonCurso.setText("Curso/Taller");
        buttonCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCursoActionPerformed(evt);
            }
        });

        buttonTaller.setBackground(new java.awt.Color(216, 197, 234));
        Tipo.add(buttonTaller);
        buttonTaller.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonTaller.setForeground(new java.awt.Color(119, 69, 168));
        buttonTaller.setText("Conjunto de Cursos/Taller");
        buttonTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTallerActionPerformed(evt);
            }
        });

        buttonDiplomado.setBackground(new java.awt.Color(216, 197, 234));
        Tipo.add(buttonDiplomado);
        buttonDiplomado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonDiplomado.setForeground(new java.awt.Color(119, 69, 168));
        buttonDiplomado.setText("Diplomado");
        buttonDiplomado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDiplomadoActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(119, 69, 168));
        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(119, 69, 168));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Enviar Curso");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        inputCourseName.setBackground(new java.awt.Color(119, 69, 168));
        inputCourseName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputCourseName.setForeground(new java.awt.Color(255, 255, 255));
        inputCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCourseNameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(119, 69, 168));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Nombre Del Curso");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(119, 69, 168));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Descripción de Curso");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });

        inputCourseDesc.setBackground(new java.awt.Color(119, 69, 168));
        inputCourseDesc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputCourseDesc.setForeground(new java.awt.Color(255, 255, 255));
        inputCourseDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCourseDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelRightLayout = new javax.swing.GroupLayout(mainPanelRight);
        mainPanelRight.setLayout(mainPanelRightLayout);
        mainPanelRightLayout.setHorizontalGroup(
            mainPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelRightLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelRightLayout.createSequentialGroup()
                .addGroup(mainPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelRightLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(mainPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonDiplomado)
                                .addComponent(jRadioCharla)
                                .addComponent(buttonCurso)
                                .addComponent(inputCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonTaller)))
                        .addGroup(mainPanelRightLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(inputCourseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        mainPanelRightLayout.setVerticalGroup(
            mainPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelRightLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCurso)
                .addGap(18, 18, 18)
                .addComponent(jRadioCharla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTaller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDiplomado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCourseDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

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

        CC_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/src/CCUCV_LOGOTiny.png"))); // NOI18N
        CC_Icon.setText("jLabel8");
        mainBar.add(CC_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 40, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Formulacion de Curso");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        mainBar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 20));

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
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseExited

    private void buttonPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPresencialActionPerformed
        modalidadValue = "Presencial";
    }//GEN-LAST:event_buttonPresencialActionPerformed

    private void buttonDinamicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDinamicoActionPerformed
        modalidadValue = "Dinamico";
    }//GEN-LAST:event_buttonDinamicoActionPerformed

    private void buttonDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDistanciaActionPerformed
        modalidadValue = "Distancia";
    }//GEN-LAST:event_buttonDistanciaActionPerformed

    private void buttonMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMixtoActionPerformed
        modalidadValue = "Mixto";
    }//GEN-LAST:event_buttonMixtoActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioCharlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCharlaActionPerformed
         tipoValue = "Charla";
    }//GEN-LAST:event_jRadioCharlaActionPerformed

    private void buttonCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCursoActionPerformed
         tipoValue = "Curso";
    }//GEN-LAST:event_buttonCursoActionPerformed

    private void buttonTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTallerActionPerformed
        tipoValue = "Taller";
    }//GEN-LAST:event_buttonTallerActionPerformed

    private void buttonDiplomadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDiplomadoActionPerformed
        tipoValue = "Diplomado";
    }//GEN-LAST:event_buttonDiplomadoActionPerformed

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jLabel13.setForeground(Color.white);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jLabel13.setForeground(new java.awt.Color(42, 40, 44));
    }//GEN-LAST:event_jLabel13MouseExited

    private void inputCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCourseNameActionPerformed

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseExited

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

    private void mainBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainBarMouseDragged
        this.setLocation((evt.getXOnScreen() - xMouse), (evt.getYOnScreen() -  yMouse));
    }//GEN-LAST:event_mainBarMouseDragged

    private void mainBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_mainBarMousePressed

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseExited

    private void inputCourseDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCourseDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCourseDescActionPerformed

    private void buttonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalirMouseClicked
       UsuarioView userView = new UsuarioView(actualUser);
       userView.setLocationRelativeTo(null);
       userView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_buttonSalirMouseClicked

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       javax.swing.JOptionPane.showMessageDialog(this, "Proyecto Registrado. \n Espere a que sea revisado y evaluado.");
       Curso cursoActual = new Curso(actualUser.getID(), inputCourseName.getText(), inputCourseDesc.getText(), modalidadValue, tipoValue);
       cursoActual.formular(actualUser.getID());
       actualUser.ingresar();
       UsuarioView userView = new UsuarioView(actualUser);
       userView.setLocationRelativeTo(null);
       userView.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CC_Icon;
    private javax.swing.ButtonGroup Caracter;
    private javax.swing.ButtonGroup Modalidad;
    private javax.swing.ButtonGroup Requisitos;
    private javax.swing.ButtonGroup Tipo;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel buttonCerrar;
    private javax.swing.JLabel buttonCerrarText;
    private javax.swing.JRadioButton buttonCurso;
    private javax.swing.JRadioButton buttonDinamico;
    private javax.swing.JRadioButton buttonDiplomado;
    private javax.swing.JRadioButton buttonDistancia;
    private javax.swing.JPanel buttonHome;
    private javax.swing.JRadioButton buttonMixto;
    private javax.swing.JRadioButton buttonPresencial;
    private javax.swing.JPanel buttonSalir;
    private javax.swing.JRadioButton buttonTaller;
    private javax.swing.JTextField inputCourseDesc;
    private javax.swing.JTextField inputCourseName;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioCharla;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainBar;
    private javax.swing.JPanel mainPanelLeft;
    private javax.swing.JPanel mainPanelRight;
    // End of variables declaration//GEN-END:variables
}
