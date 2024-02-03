/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

/**
 *
 * @author devku
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        selectRolesLogin = new javax.swing.JComboBox<>();
        signupBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signupBtnOnLoginJframe = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(950, 558));
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setBackground(new java.awt.Color(123, 95, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(123, 95, 241));
        jTextField2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Biraj Boka");
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 370, 50));

        jPasswordField1.setBackground(new java.awt.Color(123, 95, 241));
        jPasswordField1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 370, 50));

        selectRolesLogin.setBackground(new java.awt.Color(123, 95, 241));
        selectRolesLogin.setEditable(true);
        selectRolesLogin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        selectRolesLogin.setForeground(new java.awt.Color(255, 255, 255));
        selectRolesLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Instructor", "Admin" }));
        selectRolesLogin.setToolTipText("");
        selectRolesLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectRolesLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRolesLoginActionPerformed(evt);
            }
        });
        jPanel2.add(selectRolesLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 270, 30));

        signupBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(123, 95, 241));
        signupBtn.setText("Login");
        signupBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 50, true));
        signupBtn.setBorderPainted(false);
        signupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBtn.setDefaultCapable(false);
        signupBtn.setFocusPainted(false);
        signupBtn.setFocusable(false);
        jPanel2.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 370, 50));

        jLabel2.setFont(new java.awt.Font("Poppins ExtraBold", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/key.png"))); // NOI18N
        jLabel2.setText("Login");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIconTextGap(10);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 350, 70));

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dont have a account?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        signupBtnOnLoginJframe.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        signupBtnOnLoginJframe.setForeground(new java.awt.Color(255, 255, 255));
        signupBtnOnLoginJframe.setText("Signup");
        signupBtnOnLoginJframe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBtnOnLoginJframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupBtnOnLoginJframeMouseClicked(evt);
            }
        });
        jPanel2.add(signupBtnOnLoginJframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Choose Role :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 50));

        getContentPane().add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(123, 95, 241));
        jLabel1.setForeground(new java.awt.Color(123, 95, 241));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/signup.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 539));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectRolesLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRolesLoginActionPerformed
       
        
    }//GEN-LAST:event_selectRolesLoginActionPerformed

    private void signupBtnOnLoginJframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnOnLoginJframeMouseClicked
        Signup s = new Signup();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_signupBtnOnLoginJframeMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> selectRolesLogin;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel signupBtnOnLoginJframe;
    // End of variables declaration//GEN-END:variables
}
