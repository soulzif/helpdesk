/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SDCS;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Zifan
 */
public class bill extends javax.swing.JFrame {

    /**
     * Creates new form bill
     */
    
    
    
    public bill() {
        initComponents();
    }
    private void client()
    {
             String bid= ccid.getText() ;
        String cc=cname.getText();
        String mob = null;
        String ad=null;
        DConnection c = new DConnection();
        try {
            String str = "SELECT  Telno, Address FROM `client` WHERE ClientID='" + ccid.getText() + "'";
            ResultSet rs = c.s.executeQuery(str);
        }   
        catch(Exception e)
        {
            
        }
    }
    private double finalbill() {
        DConnection c = new DConnection();
        double dis = 0;
        double is2 = 0;
        double amnt = 0;
          double amnt1 = 0;
        double finalamnt = 0;
        if ("Brandnew".equals(ptype.getText())) {
            dis = 0.06;
        } else if ("Repair".equals(ptype.getText())) {
            dis = 0.12;
        } else {
            dis = 0;
        }
          amnt=Double.parseDouble(pini.getText()) - (Double.parseDouble(pini.getText())*dis);
          
        if (Integer.parseInt(noofdays.getText()) >= 30 && Integer.parseInt(noofdays.getText()) <= 180) {
            is2 = 10000;
        } else {
            is2 = 15000;
        }
        //  amnt=Double.parseDouble(pini.getText())+dis2;
        finalamnt = amnt+is2; 
        return finalamnt;


    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        empid = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        ccid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cpname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pud = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        noofdays = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ptype = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ptid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pmid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fam = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pini = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Invoice");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 0, -1, -1));
        getContentPane().add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 640, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Client ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 73, -1, -1));
        getContentPane().add(ccid, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 73, 70, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search1.png"))); // NOI18N
        jButton4.setText(" Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 73, -1, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 640, 4));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Client Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        getContentPane().add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 138, 240, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Client Project Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        cpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpnameActionPerformed(evt);
            }
        });
        getContentPane().add(cpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 173, 240, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Project Accept Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 285, -1, -1));

        pad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                padActionPerformed(evt);
            }
        });
        getContentPane().add(pad, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 287, 240, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Project Update Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        pud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pudActionPerformed(evt);
            }
        });
        getContentPane().add(pud, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 329, 240, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Total Project No of Days");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        noofdays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noofdaysActionPerformed(evt);
            }
        });
        getContentPane().add(noofdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 366, 240, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Project Type");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        ptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptypeActionPerformed(evt);
            }
        });
        getContentPane().add(ptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 401, 240, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Project Team ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        ptid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptidActionPerformed(evt);
            }
        });
        getContentPane().add(ptid, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 250, 240, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Project Manager ID ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        pmid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmidActionPerformed(evt);
            }
        });
        getContentPane().add(pmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 213, 240, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Final Amount");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        fam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                famActionPerformed(evt);
            }
        });
        getContentPane().add(fam, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 240, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_print_30px.png"))); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, 29));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit application.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 100, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Project Initital Amount");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, -1, -1));

        pini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piniActionPerformed(evt);
            }
        });
        getContentPane().add(pini, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 438, 240, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/123.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String cid = ccid.getText();
          double dis=0;
           double finalamnt=0;
        //database connection
        DConnection c = new DConnection();
        
        try {
            String str = "select * from client where ClientID = '" + cid + "'";
            ResultSet rs = c.s.executeQuery(str);
            
            while (rs.next()) {
                cname.setText(rs.getString("Name"));
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            String str = "select title,Amount from project where ClientID = '" + cid + "'";
            ResultSet rs1 = c.s.executeQuery(str);
            while (rs1.next()) {
                cpname.setText(rs1.getString("title"));
                pini.setText(rs1.getString("Amount"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            
            String str1 = "select Emp_ID,Project_Type from client where ClientID = '" + cid + "'";
            ResultSet rs2 = c.s.executeQuery(str1);
            while (rs2.next()) {
                pmid.setText(rs2.getString("Emp_ID"));
                ptype.setText(rs2.getString("Project_Type"));
                
                if(rs2.getString("Project_Type")=="Brandnew")
                {   
                    
                    dis=0.06;
                    
                    
                } 
                else if(rs2.getString("Project_Type")=="Repair")
                {
                    dis=0.12;
                }
                else{
                    dis=0;
                }
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            String str1 = "select TeamID from project where ClientID = '" + cid + "'";
            ResultSet rs2 = c.s.executeQuery(str1);
            while (rs2.next()) {
                ptid.setText(rs2.getString("TeamID"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            String str1 = "select AcceptDate,Update_Date from project where ClientID = '" + cid + "'";
            ResultSet rs2 = c.s.executeQuery(str1);            
            while (rs2.next()) {
                pad.setText(rs2.getString("AcceptDate"));
                pud.setText(rs2.getString("Update_Date"));
                Date Daybefore = rs2.getDate("AcceptDate");
                Date DayAfter = rs2.getDate("Update_Date");
                long difference = DayAfter.getTime() - Daybefore.getTime();
                
                int Days = (int) (difference / (1000 * 60 * 60 * 24));
                
                noofdays.setText(String.valueOf(Days));
                if(Days >=30 && Days<=180){
                    dis=20000;
                }
                else{
                    dis=25000;
                }
             double sss=finalbill();
             fam.setText(String.valueOf(sss));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }//GEN-LAST:event_jButton4ActionPerformed

    private void cpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpnameActionPerformed

    private void padActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_padActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_padActionPerformed

    private void pudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pudActionPerformed

    private void noofdaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noofdaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noofdaysActionPerformed

    private void ptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptypeActionPerformed

    private void ptidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptidActionPerformed

    private void pmidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmidActionPerformed

    private void famActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_famActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_famActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "You Really want to Exit ", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void piniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_piniActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String id=ccid.getText();
          String id1 =fam.getText();
        //database connection
        DConnection c = new DConnection();
        try{
            String str= "UPDATE project SET FinalBill='"+id1+"' WHERE ClientID='"+id+"'";
             c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Successfully Updated Details");

        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Can't Update! Please Check All Details");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //bill printing
        String bid= ccid.getText() ;
        String cc=cname.getText();
        String mob = null;
        String ad=null;
        String da=null;
        String ua=null;
        String na=null;
        String tn=null;
        String path = "C:\\Users\\Zifan\\Desktop\\Bill\\";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        //database connection
        DConnection c = new DConnection();
        
        try {
            String str = "SELECT  Telno, Address FROM `client` WHERE ClientID='" + ccid.getText() + "'";
            ResultSet rs = c.s.executeQuery(str);
           
            while(rs.next())
            {
                mob = rs.getString("Telno");
                ad = rs.getString("Address");
            }
                        
            String str2 = "SELECT AcceptDate, Update_Date, PMID, TeamID FROM `project` WHERE ClientID='" + ccid.getText() + "'";
            ResultSet rs2 = c.s.executeQuery(str2);
           
            while(rs2.next())
            {
                 da= rs2.getString("AcceptDate");
                
                ua = rs2.getString("Update_Date");
            }
            
            String str3 = "SELECT * FROM employee WHERE EmpID='" + pmid.getText() + "'";
            ResultSet rs3 = c.s.executeQuery(str3);
            
             while(rs3.next())
            {
                na = rs3.getString("Name");
                
            }
            
            String str4 = "SELECT * FROM `projectteam` WHERE TeamID='" + ptid.getText() + "'";
            ResultSet rs4 = c.s.executeQuery(str4);
            
            while(rs4.next())
            {
                tn= rs4.getString("Team_Name");
            
            }
            
            
            PdfWriter.getInstance(doc, new FileOutputStream(path + cname.getText() + ".pdf"));
            doc.open();
            Paragraph para = new Paragraph("                                                            Software Helpdesk Support System\n");
            doc.add(para);
            Paragraph para1 = new Paragraph("**************************************************************************************************************\n");
            doc.add(para1);
            
            Paragraph para2 = new Paragraph("\tBill ID: "  + bid + "\n\nCustomer Details\n\nName: " + cc + "\nMobile Number: " + mob +  "\nAddress: " + ad + "\n\n");

            doc.add(para2);
            
            Paragraph para4 = new Paragraph("\tProject Details \n\nProject Title: " + cpname.getText() + "\nProject type: " + ptype.getText() + "\n\n");
            doc.add(para4);
          
            Paragraph para5 = new Paragraph("**************************************************************************************************************\n");
            doc.add(para5);

            PdfPTable table = new PdfPTable(6);
            table.addCell("Project Check In Date\n");
            table.addCell("Project Check Out Date ");
            table.addCell("Total Project Number Of Days");
            table.addCell("Project Manager Name ");
            table.addCell("Project Team Name ");
            table.addCell("Total Amount ");

            table.addCell(da);
            table.addCell(ua);
            table.addCell(noofdays.getText());
            table.addCell(na);
            table.addCell(tn);
            table.addCell(fam.getText());
            doc.add(table);
            doc.add(para1);
            Paragraph para6 = new Paragraph("                                                            Thank You !! visit again...\n");
            doc.add(para6);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        doc.close();
        int a = JOptionPane.showConfirmDialog(null,"Do You Want Print Bill","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            if((new File(path+cname.getText()+".pdf")).exists()){
                try{
                   Process p = Runtime
                        .getRuntime() 
                        .exec("rundll32 url.dll,FileProtocoHandler"+path+cname.getText()+".pdf");
                    System.out.println("Bill Printed Successfully");
                                JOptionPane.showMessageDialog(null, "Bill Printed Successfully");

                }
                catch(Exception e){
                    System.out.println(e);
                }
}}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ccid;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cpname;
    private javax.swing.JSeparator empid;
    private javax.swing.JTextField fam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField noofdays;
    private javax.swing.JTextField pad;
    private javax.swing.JTextField pini;
    private javax.swing.JTextField pmid;
    private javax.swing.JTextField ptid;
    private javax.swing.JTextField ptype;
    private javax.swing.JTextField pud;
    // End of variables declaration//GEN-END:variables
}
