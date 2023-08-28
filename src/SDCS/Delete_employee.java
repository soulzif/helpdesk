package SDCS;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Zifan
 */
public class Delete_employee extends javax.swing.JFrame {

    /**
     * Creates new form Add_New_Client
     */
    public Delete_employee() {
        initComponents();
                
    }
    
    private void clear(){
       // Aname.requestFocus();
        Aname.setText("");
        Aphone.setText("");
        Amale.setSelected(false);
        Afemale.setSelected(false);
        Aage.setText("");
        ANic.setText("");
        Aemptype.setSelectedIndex(0);
        Asalary.setText("");
        Ajdate.setCalendar(null);
        Ausername.setText("");
        Apassword.setText("");
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        empid = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Aname = new javax.swing.JTextField();
        Asalary = new javax.swing.JTextField();
        Aphone = new javax.swing.JTextField();
        Aage = new javax.swing.JTextField();
        Ajdate = new com.toedter.calendar.JDateChooser();
        Aemptype = new javax.swing.JComboBox<>();
        ANic = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Ausername = new javax.swing.JTextField();
        Apassword = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Amale = new javax.swing.JRadioButton();
        Afemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contact NO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("NIC");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Delete Employee");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -3, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Joined Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Username");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Salary");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 110, 29));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reset_20px.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 95, 29));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit application.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 93, 29));
        getContentPane().add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 760, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 760, 20));
        getContentPane().add(Aname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 200, 30));

        Asalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsalaryActionPerformed(evt);
            }
        });
        getContentPane().add(Asalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 200, -1));
        getContentPane().add(Aphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 200, -1));

        Aage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AageActionPerformed(evt);
            }
        });
        getContentPane().add(Aage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 200, -1));
        getContentPane().add(Ajdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 197, -1));

        Aemptype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Aemptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "Admin", "Project manager", "Receptionist" }));
        Aemptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AemptypeActionPerformed(evt);
            }
        });
        getContentPane().add(Aemptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 200, -1));

        ANic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANicActionPerformed(evt);
            }
        });
        getContentPane().add(ANic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 200, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 760, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Employee Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        Ausername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AusernameActionPerformed(evt);
            }
        });
        getContentPane().add(Ausername, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 200, -1));

        Apassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Apassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 200, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText(" Employee ID : ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 110, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 70, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search1.png"))); // NOI18N
        jButton4.setText(" Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, -1, -1));

        Amale.setText("Male");
        Amale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmaleActionPerformed(evt);
            }
        });
        getContentPane().add(Amale, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        Afemale.setText("Female");
        Afemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfemaleActionPerformed(evt);
            }
        });
        getContentPane().add(Afemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Gender");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add new emp.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //delete button function
        int id = Integer.parseInt(jTextField9.getText());
        String name = Aname.getText();
        int contact = Integer.parseInt(Aphone.getText());
        String gender = null;
        if(Amale.isSelected()){
            gender = "Male";
        }
        else if(Afemale.isSelected()){
            gender = "Female";
        }
        int age = Integer.parseInt(Aage.getText());
        String nic = ANic.getText ();
        String etype = (String) Aemptype.getSelectedItem();
        double salary = Double.parseDouble(Asalary.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(Ajdate.getDate());
        String user = Ausername.getText ();
        String pass = Apassword.getText ();
        
          //database connection
        DConnection c = new DConnection();
                                         
 
        
        try {
            String str = "DELETE FROM employee WHERE  EmpID= '"+id+"'";
            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Successfully Deleted Employee Details");
            clear();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Can't Delete! Please Check All Details");
        }
          
        
      
        
       

        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "You Really want to Exit ", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsalaryActionPerformed

    private void AageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AageActionPerformed

    private void AemptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AemptypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AemptypeActionPerformed

    private void ANicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANicActionPerformed

    private void AusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AusernameActionPerformed

    private void ApasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApasswordActionPerformed

    private void AmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmaleActionPerformed

    private void AfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AfemaleActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        //search button get info by searching emp id
        int id = Integer.parseInt(jTextField9.getText());
        //database connection
        DConnection c = new DConnection();

        try {
            String str = "select * from employee where EmpID = '" + id + "'";
            ResultSet rs = c.s.executeQuery(str);

            while (rs.next()) {

                //name,Tel,gender,age, NIC,Emp_Type,salary,Joined_Date, username, password
                Aname.setText(rs.getString("Name"));
                Aphone.setText(rs.getString("Tel"));
                
          //      A.setText(rs.getString("gender"));
              
                Aage.setText(rs.getString("age"));
                ANic.setText(rs.getString("NIC"));
                
                Aemptype.setSelectedItem(rs.getString("Emp_Type"));
                
                Asalary.setText(rs.getString("salary"));
                Ajdate.setDate(rs.getDate("Joined_Date"));
                Ausername.setText(rs.getString("username"));
                Apassword.setText(rs.getString("password"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ANic;
    private javax.swing.JTextField Aage;
    private javax.swing.JComboBox<String> Aemptype;
    private javax.swing.JRadioButton Afemale;
    private com.toedter.calendar.JDateChooser Ajdate;
    private javax.swing.JRadioButton Amale;
    private javax.swing.JTextField Aname;
    private javax.swing.JTextField Apassword;
    private javax.swing.JTextField Aphone;
    private javax.swing.JTextField Asalary;
    private javax.swing.JTextField Ausername;
    private javax.swing.JSeparator empid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
