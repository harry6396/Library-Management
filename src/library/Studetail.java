/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.sql.*;
import javax.swing.*;
import java.util.Date;
/**
 *
 * @author prabhattyagi
 */
public class Studetail extends javax.swing.JFrame {
String a1;
Date d1;
    /**
     * Creates new form Studetail
     */
    public Studetail() {
        initComponents();
    }
    public Studetail(String a,Date d)
    {
        initComponents();
        a1=a;
        d1=d;
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
        c1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("STUDENT DETAIL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Name", "Last Name", "Scholar Number", "Enrollment Number", "Section", "Branch", "Gender", "Parent's Mobile", "Parent's Email", "Student's Mobile", "Student's Email", "Barcode" }));
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 220, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Select a field that you want to update");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jLabel3.setText("Scholar Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 210, -1));

        jLabel4.setText("OR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jLabel5.setText("Barcode");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 210, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, -1, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 270, 30));

        jLabel6.setText("Enter new detail");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, -1, -1));

        t.setColumns(20);
        t.setRows(5);
        jScrollPane1.setViewportView(t);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 290, 190));

        jButton3.setText("Check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1740, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        new update(a1,d1).setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://lib-lnct.c47pjqtqhh6h.us-west-1.rds.amazonaws.com/library", "harry", "prabhat1");
         Statement stmt=(Statement)con.createStatement();
         String a=t1.getText();
         String b=t2.getText();
         String c=t3.getText();
         String d=(String)c1.getSelectedItem();
         if("First Name".equals(d))
             d="fname";
         else if("Last Name".equals(d))
             d="lname";
         else if("Scholar Number".equals(d))
             d="scholar";
         else if("Enrollment Number".equals(d))
             d="en";
         else if("Section".equals(d))
             d="sec";
         else if("Branch".equals(d))
             d="branch";
         else if("Gender".equals(d))
             d="sex";
         else if("Parent's Mobile".equals(d)) 
             d="pp";
         else if("Parent's Email".equals(d))
             d="pe";
         else if("Student's Mobile".equals(d))
             d="sp";
         else if("Student's Email".equals(d))
             d="se";
         else if("Barcode".equals(d))
             d="barcode";
         if(a.isEmpty())
         {
             String query="update student set "+d+" = '"+c+"' where barcode = '"+b+"' ; ";
             stmt.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Successfully Updated with Barcode");
         }
         else 
         {
           String query="update student set "+d+" = "+c+" where scholar = "+a+" ; ";
             stmt.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Successfully Updated with Scholar");  
         }
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error",1);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://lib-lnct.c47pjqtqhh6h.us-west-1.rds.amazonaws.com/library", "harry", "prabhat1");
            Statement stmt=(Statement)con.createStatement();
            String a=t1.getText();
            String b=t2.getText();
            String query;
            if(b.isEmpty()){
            query="select fname,lname,scholar,yoa,en,pp,pe,sp,se from student where scholar='"+a+"';";
            }
            else
            {
            query="select fname,lname,scholar,yoa,en,pp,pe,sp,se from student where barcode='"+b+"';";  
            }
            ResultSet rs=stmt.executeQuery(query);
           t.setText(null);
            while(rs.next())
                    t.append("Name : "+rs.getString(1)+" "+rs.getString(2)+"\n"+"Scholar Number: "+rs.getString(3)+"\n"+"Year of Admission: "+rs.getString(4)+"\n"+"Enrollment Number: "+rs.getString(5)+"\n"+"Parent's Mobile: " +rs.getString(6)+"\n"+"Parent's Email: " +rs.getString(7)+"\n"+"Student's Mobile: "+rs.getString(8)+"\n"+"Student's Email :"+rs.getString(9)+"\n");
        rs.close();
        stmt.close();
        con.close();
    
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",1);
        }         
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Studetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea t;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
