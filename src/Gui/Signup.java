
package Gui;

import Auth.Validation;
import Exception.InvalidFormat;
import Exception.NullException;
import Users.Instructor;
import Users.Student;
import courses.Courses;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Signup extends javax.swing.JFrame {

    
    public Signup() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        selectRoles = new javax.swing.JComboBox<>();
        selectCourse = new javax.swing.JComboBox<>();
        signupBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create an account");
        setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        setForeground(new java.awt.Color(123, 95, 241));
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jPanel3.setBackground(new java.awt.Color(123, 95, 241));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/edit.png"))); // NOI18N
        jLabel1.setText("Create an account");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Let's get started!");

        name.setBackground(new java.awt.Color(123, 95, 241));
        name.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Biraj Boka");
        name.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        email.setBackground(new java.awt.Color(123, 95, 241));
        email.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Biraj Boka");
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        password.setBackground(new java.awt.Color(123, 95, 241));
        password.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setText("jPasswordField1");
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        selectRoles.setBackground(new java.awt.Color(123, 95, 241));
        selectRoles.setEditable(true);
        selectRoles.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        selectRoles.setForeground(new java.awt.Color(255, 255, 255));
        selectRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Instructor", "Admin" }));
        selectRoles.setToolTipText("");
        selectRoles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRolesActionPerformed(evt);
            }
        });

        selectCourse.setBackground(new java.awt.Color(123, 95, 241));
        selectCourse.setEditable(true);
        selectCourse.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        selectCourse.setForeground(new java.awt.Color(255, 255, 255));
        selectCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BIT", "BCA", "BBA" }));
        selectCourse.setToolTipText("");
        selectCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        signupBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(123, 95, 241));
        signupBtn.setText("Sign Up");
        signupBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 50, true));
        signupBtn.setBorderPainted(false);
        signupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBtn.setDefaultCapable(false);
        signupBtn.setFocusPainted(false);
        signupBtn.setFocusable(false);
        signupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupBtnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Already have an account?");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Log in");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Role :");

        courseLabel.setBackground(new java.awt.Color(255, 255, 255));
        courseLabel.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        courseLabel.setForeground(new java.awt.Color(255, 255, 255));
        courseLabel.setText("Select Course :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(password)
                        .addComponent(email)
                        .addComponent(name)
                        .addComponent(signupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(courseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(selectRoles, 0, 301, Short.MAX_VALUE)
                                .addComponent(selectCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        selectCourse.getAccessibleContext().setAccessibleName("Select Course");

        getContentPane().add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Icons/Analytics.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 560));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
//        // Login on signup jframe
//        login l;
//        l = new login();
//        l.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void selectRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRolesActionPerformed
        if(selectRoles.getSelectedItem().toString().equals("Student")){
            selectCourse.setVisible(true);
            courseLabel.setVisible(true);
        }
        else{
            courseLabel.setVisible(false);
            selectCourse.setVisible(false);
        }
    }//GEN-LAST:event_selectRolesActionPerformed


    
    private void signupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseClicked
   Instructor i = new Instructor();
   Student s = new Student();
        String uname = name.getText();
        String p = new String(password.getPassword());
        String em = email.getText();
        Validation v = new Validation();

        try {
            if (v.emailCheck(em) && v.passCheck(p)) {
                if (selectCourse.getSelectedItem() != null) {
                    int courseId = c.getCourseId(selectCourse.getSelectedItem().toString());

                    if (selectRoles.getSelectedItem().equals("Student")) {
                        s.studentRegister(uname, courseId, em, p, 1);
                    } if(selectRoles.getSelectedItem().equals("Instructor")) {
                        i.addInstructor(uname, em,p);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a course");
                }
            }
        } catch (NullException ex) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
        } catch (InvalidFormat ex1) {
            JOptionPane.showMessageDialog(null, "Invalid Email or Phone Number or Password Format");
        }
    }//GEN-LAST:event_signupBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel courseLabel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> selectCourse;
    private javax.swing.JComboBox<String> selectRoles;
    private javax.swing.JButton signupBtn;
    // End of variables declaration//GEN-END:variables
}
