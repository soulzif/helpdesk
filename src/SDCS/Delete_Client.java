package SDCS;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Zifan
 */
public class Delete_Client extends javax.swing.JFrame {

    /**
     * Creates new form Add_New_Client
     */
    public Delete_Client() {
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
        Aemail.setText("");
        Aaddress.setText("");
        jDateChooser1.setCalendar(null);
        Aptype.setSelectedIndex(0);
     
    
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
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        empid = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Aname = new javax.swing.JTextField();
        Aphone = new javax.swing.JTextField();
        Aage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        ANic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dcid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Aaddress = new javax.swing.JTextArea();
        Aemail = new javax.swing.JTextField();
        Amale = new javax.swing.JRadioButton();
        Afemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Aptype = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contact NO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("NIC");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 512, 110, 29));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reset_20px.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 512, 100, 29));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit application.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 512, 100, 29));
        getContentPane().add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 700, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 495, 700, 10));
        getContentPane().add(Aname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 200, -1));
        getContentPane().add(Aphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 200, -1));

        Aage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AageActionPerformed(evt);
            }
        });
        getContentPane().add(Aage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 200, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Delete Client");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Admission date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 197, -1));

        ANic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANicActionPerformed(evt);
            }
        });
        getContentPane().add(ANic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 200, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));
        getContentPane().add(dcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 70, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search1.png"))); // NOI18N
        jButton4.setText(" Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, 30));

        Aaddress.setColumns(20);
        Aaddress.setRows(5);
        jScrollPane1.setViewportView(Aaddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 200, 79));

        Aemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AemailActionPerformed(evt);
            }
        });
        getContentPane().add(Aemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 200, -1));

        Amale.setText("Male");
        Amale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmaleActionPerformed(evt);
            }
        });
        getContentPane().add(Amale, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        Afemale.setText("Female");
        Afemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfemaleActionPerformed(evt);
            }
        });
        getContentPane().add(Afemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Gender");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 700, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Project type");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        Aptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Brandnew", "Repair" }));
        getContentPane().add(Aptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Client ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delet client.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           int id = Integer.parseInt(dcid.getText());
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
        String nic = ANic.getText();
        String email=Aemail.getText();
        String Address = Aaddress.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(jDateChooser1.getDate());
        String ptype =(String) Aptype.getSelectedItem();
                  
          DConnection c = new DConnection();
                                         
 
        
        try {
            String str = "DELETE FROM client WHERE  ClientID= '"+id+"'";
            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Successfully Deleted Client Details");
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

    private void AageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AageActionPerformed

    private void ANicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANicActionPerformed

    private void AemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AemailActionPerformed

    private void AmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmaleActionPerformed

    private void AfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AfemaleActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = dcid.getText();
        //database connection
        DConnection c = new DConnection();

        try {
            String str = "select * from client where ClientID = '" + id + "'";
            ResultSet rs = c.s.executeQuery(str);

            while (rs.next()) {

                //name,Tel,gender,age, NIC,Emp_Type,salary,Joined_Date, username, password
                Aname.setText(rs.getString("Name"));
                Aphone.setText(rs.getString("Telno"));
                
               
          
                String add2 = rs.getString("Gender");
              if("Male".equals(add2)){
                  Amale.setSelected(true);
              }
              else if("Female".equals(add2)){
                  Afemale.setSelected(true);
              }
              
                Aage.setText(rs.getString("Age"));
                ANic.setText(rs.getString("NIC"));
                   Aemail.setText(rs.getString("Email"));
                    Aaddress.setText(rs.getString("Address"));     
                jDateChooser1.setDate(rs.getDate("Admission_Date"));
                    Aptype.setSelectedItem(rs.getString("Project_Type"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ANic;
    private javax.swing.JTextArea Aaddress;
    private javax.swing.JTextField Aage;
    private javax.swing.JTextField Aemail;
    private javax.swing.JRadioButton Afemale;
    private javax.swing.JRadioButton Amale;
    private javax.swing.JTextField Aname;
    private javax.swing.JTextField Aphone;
    private javax.swing.JComboBox<String> Aptype;
    private javax.swing.JTextField dcid;
    private javax.swing.JSeparator empid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
