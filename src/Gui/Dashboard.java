/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import java.awt.Font;

/**
 *
 * @author devku
 */

public class Dashboard extends javax.swing.JFrame {
    private String  user;
    private String username;  
    private String emailInfo;
    /**
     * Creates new form Dashboard
     */

    public Dashboard(String user, String emailInfo,String username ){
        initComponents();
        this.setLocationRelativeTo(null);
        this.user = user;
        this.emailInfo = emailInfo;
        this.username= username;
        name.setText(username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        coursesTab = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dashboardTab = new javax.swing.JLabel();
        tutorsTab = new javax.swing.JLabel();
        studentsTab = new javax.swing.JLabel();
        settingsTab = new javax.swing.JLabel();
        logoutTab = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        courses = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tutors = new javax.swing.JPanel();
        students = new javax.swing.JPanel();
        settings = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setPreferredSize(new java.awt.Dimension(1000, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(123, 95, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/company.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 59, 47));

        jLabel10.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Of");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 30, -1));

        jLabel11.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Toronto");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 130, -1));

        jLabel12.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("University");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 20));

        coursesTab.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        coursesTab.setForeground(new java.awt.Color(255, 255, 255));
        coursesTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coursesTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/course.png"))); // NOI18N
        coursesTab.setText("Courses");
        coursesTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coursesTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesTabMouseClicked(evt);
            }
        });
        jPanel1.add(coursesTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/help.png"))); // NOI18N
        jLabel17.setText("Help");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 80, -1));

        dashboardTab.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        dashboardTab.setForeground(new java.awt.Color(255, 255, 255));
        dashboardTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/dashboard.png"))); // NOI18N
        dashboardTab.setText("Dashboard");
        dashboardTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardTabMouseClicked(evt);
            }
        });
        jPanel1.add(dashboardTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 40));

        tutorsTab.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        tutorsTab.setForeground(new java.awt.Color(255, 255, 255));
        tutorsTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tutorsTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/tutor.png"))); // NOI18N
        tutorsTab.setText("Tutors");
        tutorsTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tutorsTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutorsTabMouseClicked(evt);
            }
        });
        jPanel1.add(tutorsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        studentsTab.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        studentsTab.setForeground(new java.awt.Color(255, 255, 255));
        studentsTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentsTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/student.png"))); // NOI18N
        studentsTab.setText("Students");
        studentsTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentsTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsTabMouseClicked(evt);
            }
        });
        jPanel1.add(studentsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        settingsTab.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        settingsTab.setForeground(new java.awt.Color(255, 255, 255));
        settingsTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/setting.png"))); // NOI18N
        settingsTab.setText("Settings");
        settingsTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsTabMouseClicked(evt);
            }
        });
        jPanel1.add(settingsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        logoutTab.setFont(new java.awt.Font("Poppins Medium", 1, 16)); // NOI18N
        logoutTab.setForeground(new java.awt.Color(255, 255, 255));
        logoutTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/logout.png"))); // NOI18N
        logoutTab.setText("Logout");
        logoutTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutTabMouseClicked(evt);
            }
        });
        jPanel1.add(logoutTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 590));

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");
        dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 752, 206, 47));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/avatar.png"))); // NOI18N
        dashboard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        name.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        name.setText("Biraj Boka");
        dashboard.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel3.setText("Administration");
        dashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins ExtraBold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Dashboard");
        dashboard.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 150, -1));

        jPanel2.setBackground(new java.awt.Color(74, 106, 241));
        jPanel2.setForeground(new java.awt.Color(255, 102, 255));

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Courses");

        jLabel13.setFont(new java.awt.Font("Poppins ExtraBold", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        dashboard.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 230, 110));

        jPanel3.setBackground(new java.awt.Color(30, 30, 22));

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Students");

        jLabel14.setFont(new java.awt.Font("Poppins ExtraBold", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("400");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboard.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 250, 110));

        jPanel4.setBackground(new java.awt.Color(231, 229, 30));

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teachers");

        jLabel15.setFont(new java.awt.Font("Poppins ExtraBold", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("50");
        jLabel15.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(16, 16, 16))
        );

        dashboard.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 220, 110));
        dashboard.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 810, -1));

        tabs.addTab("tab1", dashboard);

        courses.setBackground(new java.awt.Color(255, 255, 255));
        courses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Poppins ExtraBold", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(123, 95, 241));
        jLabel16.setText("Courses");
        courses.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 36, 117, -1));
        courses.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 73, 806, 10));

        jPanel5.setBackground(new java.awt.Color(123, 95, 241));

        jLabel18.setBackground(new java.awt.Color(123, 95, 241));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/search.png"))); // NOI18N

        jTextField2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        courses.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        courses.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jPanel7.setBackground(new java.awt.Color(123, 95, 241));

        jLabel19.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/add.png"))); // NOI18N
        jLabel19.setText("Add");
        jLabel19.setIconTextGap(10);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        courses.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 100, 40));

        jLabel20.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/add.png"))); // NOI18N
        jLabel20.setText("Add");
        jLabel20.setIconTextGap(10);
        courses.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel8.setBackground(new java.awt.Color(123, 95, 241));

        jLabel21.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/add.png"))); // NOI18N
        jLabel21.setText("Add");
        jLabel21.setIconTextGap(10);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        courses.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 100, 40));

        jPanel9.setBackground(new java.awt.Color(123, 95, 241));

        jLabel22.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/new_Edit.png"))); // NOI18N
        jLabel22.setText("Edit");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        courses.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 100, 40));

        jPanel10.setBackground(new java.awt.Color(123, 95, 241));

        jLabel23.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/delete.png"))); // NOI18N
        jLabel23.setText("Delete");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        courses.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 110, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Course_Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        courses.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 760, 380));

        tabs.addTab("tab2", courses);

        tutors.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout tutorsLayout = new javax.swing.GroupLayout(tutors);
        tutors.setLayout(tutorsLayout);
        tutorsLayout.setHorizontalGroup(
            tutorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        tutorsLayout.setVerticalGroup(
            tutorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        tabs.addTab("tab3", tutors);

        students.setBackground(new java.awt.Color(153, 255, 102));

        javax.swing.GroupLayout studentsLayout = new javax.swing.GroupLayout(students);
        students.setLayout(studentsLayout);
        studentsLayout.setHorizontalGroup(
            studentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        studentsLayout.setVerticalGroup(
            studentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        tabs.addTab("tab4", students);

        settings.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        tabs.addTab("tab5", settings);

        getContentPane().add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -40, 850, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTabMouseClicked
         tabs.setSelectedIndex(0);
        dashboardTab.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 18));
        coursesTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        tutorsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        studentsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        settingsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
    }//GEN-LAST:event_dashboardTabMouseClicked

    private void logoutTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutTabMouseClicked
          LoginPage l1 = new LoginPage();
          l1.setVisible(true);
          dispose();
    }//GEN-LAST:event_logoutTabMouseClicked

    private void coursesTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesTabMouseClicked
       tabs.setSelectedIndex(1);
        coursesTab.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 18));
        dashboardTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        tutorsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        studentsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        settingsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));

    }//GEN-LAST:event_coursesTabMouseClicked

    private void tutorsTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutorsTabMouseClicked
               tabs.setSelectedIndex(2);
        tutorsTab.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 18));
        dashboardTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        coursesTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        studentsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        settingsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
       
    }//GEN-LAST:event_tutorsTabMouseClicked

    private void studentsTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsTabMouseClicked
       tabs.setSelectedIndex(3);
        studentsTab.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 18));
        dashboardTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        coursesTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        tutorsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        settingsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
     
    }//GEN-LAST:event_studentsTabMouseClicked

    private void settingsTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsTabMouseClicked
               tabs.setSelectedIndex(4);
        settingsTab.setFont(new Font("Poppins ExtraBold", Font.PLAIN, 18));
        dashboardTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        coursesTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        tutorsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
        studentsTab.setFont(new Font("Poppins Medium", Font.PLAIN, 16));
    }//GEN-LAST:event_settingsTabMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard("","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel courses;
    private javax.swing.JLabel coursesTab;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel dashboardTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel logoutTab;
    private javax.swing.JLabel name;
    private javax.swing.JPanel settings;
    private javax.swing.JLabel settingsTab;
    private javax.swing.JPanel students;
    private javax.swing.JLabel studentsTab;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JPanel tutors;
    private javax.swing.JLabel tutorsTab;
    // End of variables declaration//GEN-END:variables
}
