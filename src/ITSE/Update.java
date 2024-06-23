/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ITSE;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ammararshad
 */
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    String name1,id1;
    public void nam(String name, String id)
    {
        
        
        name1 = name;
        id1 = id;
        
        
    }
    
    public Update() {
        initComponents();
    }
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    String name,dep,des,pswd,cpswd,empId,email,dob;


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formP = new javax.swing.JPanel();
        nameL = new javax.swing.JLabel();
        dobL = new javax.swing.JLabel();
        emailL = new javax.swing.JLabel();
        empIdL = new javax.swing.JLabel();
        depL = new javax.swing.JLabel();
        desL = new javax.swing.JLabel();
        pswdL = new javax.swing.JLabel();
        cpswdL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        empIdTF = new javax.swing.JTextField();
        depTF = new javax.swing.JTextField();
        desTF = new javax.swing.JTextField();
        dobDC = new com.toedter.calendar.JDateChooser();
        emailCB = new javax.swing.JComboBox<>();
        regB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        pswdPF = new javax.swing.JPasswordField();
        cpswdPF = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        logoP = new javax.swing.JPanel();
        logoTextL = new javax.swing.JLabel();
        formL = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(950, 700));

        formP.setBackground(new java.awt.Color(255, 255, 255));

        nameL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameL.setText("Name:");

        dobL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dobL.setText("DOB:");

        emailL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emailL.setText("E-mail:");

        empIdL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        empIdL.setText("Employee ID:");

        depL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        depL.setText("Department:");

        desL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        desL.setText("Designation:");

        pswdL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pswdL.setText("Password:");

        cpswdL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cpswdL.setText("Confirm Password:");

        nameTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTFKeyPressed(evt);
            }
        });

        emailTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        empIdTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        empIdTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empIdTFKeyPressed(evt);
            }
        });

        depTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        depTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                depTFKeyPressed(evt);
            }
        });

        desTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        desTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                desTFKeyPressed(evt);
            }
        });

        dobDC.setBackground(new java.awt.Color(255, 255, 255));

        emailCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@yahoo.com", "@outlook.com" }));

        regB.setBackground(new java.awt.Color(255, 255, 255));
        regB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        regB.setText("Update");
        regB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        regB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBActionPerformed(evt);
            }
        });

        cancelB.setBackground(new java.awt.Color(255, 255, 255));
        cancelB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelB.setText("Cancel");
        cancelB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });

        pswdPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cpswdPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show");
        jCheckBox1.setBorder(null);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Show");
        jCheckBox2.setBorder(null);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPLayout = new javax.swing.GroupLayout(formP);
        formP.setLayout(formPLayout);
        formPLayout.setHorizontalGroup(
            formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobL)
                    .addComponent(nameL)
                    .addComponent(depL)
                    .addComponent(desL)
                    .addComponent(pswdL)
                    .addComponent(cpswdL)
                    .addComponent(emailL)
                    .addComponent(empIdL))
                .addGap(36, 36, 36)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formPLayout.createSequentialGroup()
                        .addComponent(regB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPLayout.createSequentialGroup()
                        .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(depTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(empIdTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dobDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pswdPF)
                    .addComponent(cpswdPF, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(396, Short.MAX_VALUE))
        );
        formPLayout.setVerticalGroup(
            formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(nameL)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPLayout.createSequentialGroup()
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dobDC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobL))
                .addGap(15, 15, 15)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailL)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailCB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empIdL)
                    .addComponent(empIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depL)
                    .addComponent(depTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desL))
                .addGap(18, 18, 18)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswdL)
                    .addComponent(pswdPF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpswdPF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpswdL)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(formPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        logoP.setBackground(new java.awt.Color(102, 0, 102));

        logoTextL.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        logoTextL.setForeground(new java.awt.Color(255, 255, 255));
        logoTextL.setText("HUMAN RESOURCE MANAGEMENT SYSTEM");

        formL.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        formL.setForeground(new java.awt.Color(255, 255, 255));
        formL.setText("UPDATE FORM");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/output-onlinepngtools.png"))); // NOI18N

        javax.swing.GroupLayout logoPLayout = new javax.swing.GroupLayout(logoP);
        logoP.setLayout(logoPLayout);
        logoPLayout.setHorizontalGroup(
            logoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(logoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoTextL, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formL))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        logoPLayout.setVerticalGroup(
            logoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPLayout.createSequentialGroup()
                .addGroup(logoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logoPLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(logoTextL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formL))
                    .addGroup(logoPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(formP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(formP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void nameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyPressed
        //Validation check for name. Contains only alphabets.
        char c=evt.getKeyChar();
        String shift;
        if((c>=65&&c<=90)||(c>=97&&c<=122)||Character.isISOControl(c)||(c==14&&c==15)||(evt.getKeyCode()==KeyEvent.VK_SHIFT||evt.getKeyCode()==KeyEvent.VK_LEFT||evt.getKeyCode()==KeyEvent.VK_RIGHT||evt.getKeyCode()==KeyEvent.VK_SPACE)){}
        else{
            JOptionPane.showMessageDialog(null,"Enter alphabets only.");}
    }//GEN-LAST:event_nameTFKeyPressed

    private void empIdTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empIdTFKeyPressed
        //Validation check for Employee ID. Contains only alphabets, digits and dash(-).
        char c=evt.getKeyChar();
        if((c>=65&&c<=90)||(c>=97&&c<=122)||(c>=48&&c<=57)||c==45||Character.isISOControl(c)||KeyEvent.VK_SHIFT==evt.getKeyCode()||KeyEvent.VK_LEFT==evt.getKeyCode()||KeyEvent.VK_RIGHT==evt.getKeyCode()||evt.getKeyCode()==KeyEvent.VK_SPACE){}
        else{
            JOptionPane.showMessageDialog(null,"Enter alphabets, digits and dash(-) only.");}
    }//GEN-LAST:event_empIdTFKeyPressed

    private void depTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depTFKeyPressed
        //Validation check for department name. Contains only alphabets.
        char c=evt.getKeyChar();
        if((c>=65&&c<=90)||(c>=97&&c<=122)||Character.isISOControl(c)||(c==14&&c==15)||KeyEvent.VK_SHIFT==evt.getKeyCode()||KeyEvent.VK_LEFT==evt.getKeyCode()||KeyEvent.VK_RIGHT==evt.getKeyCode()||evt.getKeyCode()==KeyEvent.VK_SPACE){}
        else{
            JOptionPane.showMessageDialog(null,"Enter alphabets only.");}
    }//GEN-LAST:event_depTFKeyPressed

    private void desTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_desTFKeyPressed
        //Validation check for designation. Contains only alphabets, digits and dash(-).
        char c=evt.getKeyChar();
        if((c>=65&&c<=90)||(c>=97&&c<=122)||(c>=48&&c<=57)||c==45||Character.isISOControl(c)||KeyEvent.VK_SHIFT==evt.getKeyCode()||KeyEvent.VK_LEFT==evt.getKeyCode()||KeyEvent.VK_RIGHT==evt.getKeyCode()||evt.getKeyCode()==KeyEvent.VK_SPACE){}
        else{
            JOptionPane.showMessageDialog(null,"Enter alphabets, digits and dash(-) only.");}
        // TODO add your handling code here:
    }//GEN-LAST:event_desTFKeyPressed

    private void regBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBActionPerformed
        // Register Button. It registers the user and return to the Login Form.
        name=nameTF.getText();
        dep=depTF.getText();
        des=desTF.getText();
        email=emailTF.getText();
        empId=empIdTF.getText();
        pswd=pswdPF.getText();
        cpswd=cpswdPF.getText();
        SimpleDateFormat sdf = new SimpleDateFormat();
        dob=sdf.format(dobDC.getDate());
        String disc =String.valueOf(dobDC.getDate());
        //dob=String.valueOf(dobDC.getDate());
        if(empId.equals(id1))
        {
            if(name.equals("")||dep.equals("")||des.equals("")||email.equals("")||empId.equals("")||disc.equals("")||pswd.equals("")||cpswd.equals("")){
                JOptionPane.showMessageDialog(this,"Fields should not be empty.");}
            else{
                    if(!((pswd.equals(cpswd))&&(pswd.length()>=6))){
                    JOptionPane.showMessageDialog(null,"Password does not match or contains less than 6 characters.");
                    }
                    else{
                    try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ITSE?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
                    ps=con.prepareStatement("UPDATE `registration` SET `Name`=?, `DOB`=?,`Email`=?,`Employee ID`=?,`Department`=?,`Designation`=?,`Password`=? WHERE `Employee ID`=?");
                    ps.setString(1, name);
                    ps.setString(2, dob);
                    ps.setString(3, email+emailCB.getSelectedItem());
                    ps.setString(4, empId);
                    ps.setString(5, dep);
                    ps.setString(6, des);
                    ps.setString(7, cpswd);
                    ps.setString(8, empId);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Updated Successfully.");
                    Login login=new Login();// Object of Login Form (Aggregation)
                    login.show();// Return to Login Form
                    dispose();}// Close the Registration Form
                catch(ClassNotFoundException ex){
                    java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);}
                catch (SQLException ex){
                    java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}}
                }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please Enter your id!!!");
        }
        
        
    }//GEN-LAST:event_regBActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        //Cancel Button. It clear all the text fields.
        nameTF.setText("");
        emailTF.setText("");
        empIdTF.setText("");
        depTF.setText("");
        desTF.setText("");
        pswdPF.setText("");
        cpswdPF.setText("");
        Profile pf=new Profile();// Object of Login Form (Aggregation)
        pf.nam(name1, id1);
        pf.show();// Return to Login Form
        dispose();// Close the Registration Form
    }//GEN-LAST:event_cancelBActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {
            pswdPF.setEchoChar((char)0);
            jCheckBox1.setText("Hide");
        }
        else
        {
            pswdPF.setEchoChar('*');
            jCheckBox1.setText("Show");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox2.isSelected())
        {
            cpswdPF.setEchoChar((char)0);
            jCheckBox2.setText("Hide");
        }
        else
        {
            cpswdPF.setEchoChar('*');
            jCheckBox2.setText("Show");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelB;
    private javax.swing.JLabel cpswdL;
    private javax.swing.JPasswordField cpswdPF;
    private javax.swing.JLabel depL;
    private javax.swing.JTextField depTF;
    private javax.swing.JLabel desL;
    private javax.swing.JTextField desTF;
    private com.toedter.calendar.JDateChooser dobDC;
    private javax.swing.JLabel dobL;
    private javax.swing.JComboBox<String> emailCB;
    private javax.swing.JLabel emailL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel empIdL;
    private javax.swing.JTextField empIdTF;
    private javax.swing.JLabel formL;
    private javax.swing.JPanel formP;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel logoP;
    private javax.swing.JLabel logoTextL;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel pswdL;
    private javax.swing.JPasswordField pswdPF;
    private javax.swing.JButton regB;
    // End of variables declaration//GEN-END:variables
}
