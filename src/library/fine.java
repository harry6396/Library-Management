/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
/**
 *
 * @author prabhattyagi
 */
public class fine extends javax.swing.JFrame {
String a1;
Date d1;
    /**
     * Creates new form fine
     */
    public fine() {
        initComponents();
    }
    public fine(String a,Date d)
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("FINE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jLabel2.setText("Scan ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel3.setText("OR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jLabel4.setText("Scholar Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 160, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 160, -1));

        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Scholar Number", "Fine 1", "Fine 2"
            }
        ));
        jScrollPane1.setViewportView(t);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 690, 90));

        jButton1.setText("CHECK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        jLabel5.setText("Choose fine to clear");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fine1", "Fine2" }));
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, 20));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        jButton3.setText("Print");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, -1, -1));

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 2070, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model=(DefaultTableModel)t.getModel();
        try
      {
          String q1;
          String a=t1.getText();
          String b=t2.getText();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://lib-lnct.c47pjqtqhh6h.us-west-1.rds.amazonaws.com/library", "harry", "prabhat1");
          Statement stmt=con.createStatement();
          if(a.isEmpty())
          {
          q1="select scno,fine,fine1 from fine where scno='"+b+"';";
          ResultSet rs=stmt.executeQuery(q1);
          while(rs.next())
          {
              model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
          }
          }
          else if(b.isEmpty())
          {
            q1="select scno,fine,fine1 from fine where barcode='"+a+"';";  
            ResultSet rs=stmt.executeQuery(q1);
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }
          }
          else
              JOptionPane.showMessageDialog(null, "Enter scholar or scan ID");
      }
      catch(Exception e)
      {
       JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model=(DefaultTableModel)t.getModel();
        model.setRowCount(0);
        try
      {
          String q1,w1,w2,q11,op = null;
          String a=(String)c1.getSelectedItem();
          String b=t1.getText();
          String c=t2.getText();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://lib-lnct.c47pjqtqhh6h.us-west-1.rds.amazonaws.com/library", "harry", "prabhat1");
          Statement stmt=con.createStatement();
          ResultSet rst = null;
          if(b.isEmpty()){
          if(a.equals("Fine1"))
          {
          q1="update issue1 set date1=curdate() where Scholar_No='"+c+"';";
          stmt.executeUpdate(q1);
          q1="update fine set fine=0 where scno='"+c+"';";
          stmt.executeUpdate(q1);
          JOptionPane.showMessageDialog(null, "Fine successfully submitted");
          }
          else if(a.equals("Fine2"))
          {
              q1="update issue1 set date2=curdate() where Scholar_No='"+c+"';";
          stmt.executeUpdate(q1);
           q1="update fine set fine1=0 where scno='"+c+"';";
          stmt.executeUpdate(q1);
          JOptionPane.showMessageDialog(null, "Fine successfully submitted");
          }
          }
          else if(c.isEmpty())
          {
            if(a.equals("Fine1"))
          {
              q1="update issue1 set date1=curdate() where barcode='"+b+"';";
          stmt.executeUpdate(q1);
          q1="update fine set fine =0 where barcode='"+b+"';";
          stmt.executeUpdate(q1);
          JOptionPane.showMessageDialog(null, "Fine successfully submitted");
          }
          else if(a.equals("Fine2"))
          {
              q1="update issue1 set date2=curdate() where barcode='"+b+"';";
          stmt.executeUpdate(q1);
           q1="update fine set fine1 =0 where barcode='"+b+"';";
          stmt.executeUpdate(q1);
          JOptionPane.showMessageDialog(null, "Fine successfully submitted");
          }
          }
          else
          JOptionPane.showMessageDialog(null, "Enter scholar or scan ID"); 
      }
      catch(Exception e)
      {
       JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new mainui(a1,d1).setVisible(true);
        this.hide();
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
            java.util.logging.Logger.getLogger(fine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable t;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
