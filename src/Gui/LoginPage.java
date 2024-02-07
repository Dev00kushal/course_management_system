/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import Exception.NullException;
import Users.Admin;
import Users.Instructor;
import Users.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author devku
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        selectRolesLogin = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        signupBtnOnLoginJframe = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(123, 95, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poppins ExtraBold", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/key.png"))); // NOI18N
        jLabel3.setText("Login");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIconTextGap(10);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 350, 70));

        email.setBackground(new java.awt.Color(123, 95, 241));
        email.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 370, 50));

        password.setBackground(new java.awt.Color(123, 95, 241));
        password.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 370, 50));

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

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Choose Role :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 50));

        LoginBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(123, 95, 241));
        LoginBtn.setText("Login");
        LoginBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 50, true));
        LoginBtn.setBorderPainted(false);
        LoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBtn.setDefaultCapable(false);
        LoginBtn.setFocusPainted(false);
        LoginBtn.setFocusable(false);
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });
        jPanel2.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 370, 50));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dont have a account?");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        signupBtnOnLoginJframe.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        signupBtnOnLoginJframe.setForeground(new java.awt.Color(255, 255, 255));
        signupBtnOnLoginJframe.setText("Signup");
        signupBtnOnLoginJframe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBtnOnLoginJframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupBtnOnLoginJframeMouseClicked(evt);
            }
        });
        jPanel2.add(signupBtnOnLoginJframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 50, -1));

        username.setBackground(new java.awt.Color(123, 95, 241));
        username.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 370, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 550));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(123, 95, 241));
        jLabel1.setForeground(new java.awt.Color(123, 95, 241));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/signup.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(385, 385, 385))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 520, 550));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectRolesLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRolesLoginActionPerformed

    }//GEN-LAST:event_selectRolesLoginActionPerformed

    private void signupBtnOnLoginJframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnOnLoginJframeMouseClicked
        Signup s1 = new Signup();
        s1.setVisible(true);
        dispose();
    }//GEN-LAST:event_signupBtnOnLoginJframeMouseClicked

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
                                String emailField = email.getText();
				String passField = new String(password.getPassword());
                               String uname = username.getText();
				Student s = new Student();
				Instructor i = new Instructor();
				Admin a = new Admin();
				try {
					if (selectRolesLogin.getSelectedItem().equals("Student")) {
						if (s.login(emailField, passField,uname)) {
							 new Dashboard(selectRolesLogin.getSelectedItem().toString(),emailField,uname,"Student").setVisible(true);
                                                        dispose();
                                                       
                                                        
						}
					} else if (selectRolesLogin.getSelectedItem().equals("Instructor")) {
						if (i.login(emailField, passField)) {
                                                        new Dashboard(selectRolesLogin.getSelectedItem().toString(),emailField,uname,"Instructor").setVisible(true);                                              
                                                        dispose();

						}
					} else if (selectRolesLogin.getSelectedItem().equals("Admin")) {
						if (a.login(emailField, passField)) {
                                                        new Dashboard(selectRolesLogin.getSelectedItem().toString(),emailField,uname,"Administrator").setVisible(true);                                                        
                                                        dispose();

						}
					} else {
						JOptionPane.showMessageDialog(null, "Invalid Email or Password!!", "Invalid Information!!",
								JOptionPane.ERROR_MESSAGE);

					}
				} catch (NullException e1) {
                                    e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Please fill up the empty boxes!!", "Error!!",
							JOptionPane.ERROR_MESSAGE);
					
				}
                                 email.setText("");
                                 password.setText("");
                                 username.setText("");
                                 
    }//GEN-LAST:event_LoginBtnMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> selectRolesLogin;
    private javax.swing.JLabel signupBtnOnLoginJframe;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
