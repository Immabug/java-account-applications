/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tryLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JTextField;

/**
 *
 * @author Im a bug
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        usernameReg = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        confirmPasswordReg = new javax.swing.JPasswordField();
        passwordReg = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration ");
        setMaximumSize(new java.awt.Dimension(580, 0));
        setSize(new java.awt.Dimension(700, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("register");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Firstname: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lastname: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 20));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, -1));

        firstname.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 190, 30));

        lastname.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 190, 30));

        usernameReg.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        usernameReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameRegActionPerformed(evt);
            }
        });
        getContentPane().add(usernameReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 190, 30));

        btnExit.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, 30));

        btnSubmit.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        btnSubmit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSubmitKeyPressed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 80, 30));

        gender.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Others", "Male", "Female" }));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 190, 30));

        confirmPasswordReg.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        getContentPane().add(confirmPasswordReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 190, 30));

        passwordReg.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        getContentPane().add(passwordReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 190, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rjpas\\Pictures\\xsrregister.jpg")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setIconTextGap(0);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, -1, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
      Connection con;
      PreparedStatement ps;
        private void verify(){
            String txtfirstname = firstname.getText();
            String txtlastname = lastname.getText();
            String txtgender = gender.getSelectedItem().toString();
            String txtusername = usernameReg.getText();
            String txtpassword = passwordReg.getText();
            String txtconfirmPasswordReg = confirmPasswordReg.getText();
            String clientUsername = txtusername;
            String clientPassword = txtpassword;
            
         
                
         try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/verification?autoReconnect=true&useSSL=false","root","Game_0ver");
            ps = con.prepareStatement("select firstname,lastname,gender,username,password from Clients;");
            ResultSet rs = ps.executeQuery();
                   ps = con.prepareStatement("insert into Clients (firstname,lastname,gender,username,password)values(?,?,?,?,?);");
                   
                   ps.setString(1, txtfirstname);
                    ps.setString(2, txtlastname);
                    ps.setString(3, txtgender);
                    ps.setString(4, txtusername);
                    ps.setString(5, txtpassword);
                    
                    ps.executeUpdate();
                    ps = con.prepareStatement("insert into Accounts (clientUsername,clientPassword)values(?,?);");
                    ps.setString(1, clientUsername);
                    ps.setString(2, clientPassword);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Hi "+txtfirstname+" Your account successfuly registered!");
                    this.dispose();
                    firstUI login = new firstUI();
                login.setVisible(true);
            while(rs.next())
            {
     
            }
                
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(firstUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          catch (SQLException ex) {
            Logger.getLogger(firstUI.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        }
    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void usernameRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameRegActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        firstUI login = new firstUI();
        login.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
            String txtfirstname = firstname.getText();
            String txtlastname = lastname.getText();
            String txtgender = gender.getSelectedItem().toString();
            String txtusername = usernameReg.getText();
            String txtpassword = passwordReg.getText();
            String txtconfirmPasswordReg = confirmPasswordReg.getText();
            String clientUsername = txtusername;
            String clientPassword = txtpassword;
            
            if(txtfirstname.equals("")){
                firstname.setText("This field is required!");
                firstname.setForeground(new java.awt.Color(204,0,0));
                firstname.setFont(new java.awt.Font("Courier New", 1, 12));
            }
            else if(txtlastname.equals("")){
                lastname.setText("This field is required!");
                lastname.setForeground(new java.awt.Color(204,0,0));
                lastname.setFont(new java.awt.Font("Courier New", 1, 12));
            }
            else if(txtusername.equals("")){
                JOptionPane.showMessageDialog(this, "firstname field is required!");
                usernameReg.setText("This field is required!");
                usernameReg.setForeground(new java.awt.Color(204,0,0));
                usernameReg.setFont(new java.awt.Font("Courier New", 1, 12));
            }
            else if(txtpassword.equals("")){
                JOptionPane.showMessageDialog(this, "password field is required!");
                passwordReg.setForeground(new java.awt.Color(204,0,0));
                passwordReg.setFont(new java.awt.Font("Courier New", 1, 12));
            }
            else if(txtconfirmPasswordReg.equals("")){
                JOptionPane.showMessageDialog(this, "confirm password field is required!");
                confirmPasswordReg.setForeground(new java.awt.Color(204,0,0));
                confirmPasswordReg.setFont(new java.awt.Font("Courier New", 1, 12));
            }
            else{
                
            }
            
            if( (txtpassword.equals(txtconfirmPasswordReg)) && (txtconfirmPasswordReg.equals(txtpassword)) && (txtpassword.length() >= 8) && (txtpassword.length() < 13)){
                verify();
            }
                else{
                JOptionPane.showMessageDialog(this, "Password doesn't match!\nPassword must be more than 8 and less than 13 characters");
                
            }
            
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnSubmitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSubmitKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnSubmitKeyPressed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPasswordField confirmPasswordReg;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField passwordReg;
    private javax.swing.JTextField usernameReg;
    // End of variables declaration//GEN-END:variables
}
