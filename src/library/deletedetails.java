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
public class deletedetails extends javax.swing.JFrame {
    String a1;
    Date d1;
    /**
     * Creates new form deletedetails
     */
    public deletedetails() {
        initComponents();
    }
    public deletedetails(String a,Date d)
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("FACULTY ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 180, 60));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Enter your ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 110, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 200, -1));

        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, -1));

        t.setColumns(20);
        t.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        t.setRows(5);
        jScrollPane1.setViewportView(t);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 420, 210));

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1770, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            String a=t1.getText();
            String b=t1.getText();
            String c,d = null,e=null;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://lib-lnct.c47pjqtqhh6h.us-west-1.rds.amazonaws.com/library", "harry", "prabhat1");
            Statement stmt=con.createStatement();
            c="select Book1,Book2 from issue2";
            ResultSet rs=stmt.executeQuery(c);
            while(rs.next())
            {
              d=rs.getString(1);
              e=rs.getString(2);
            }
            if(d.equals("0")&&e.equals("0"))
            {
            String query="delete from faculty where barcode='"+a+"';";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Successfully Deleted");
            }
            else
                JOptionPane.showMessageDialog(null, "Sorry first deposit books");
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        new choicedel(a1,d1).setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://lib-lnct.c47pjqtqhh6h.us-west-1.rds.amazonaws.com/library", "harry", "prabhat1");
            Statement stmt=con.createStatement();
            String b=t1.getText();
            String query1="select fname,lname,department from faculty where barcode='"+b+"';";
            ResultSet rs=stmt.executeQuery(query1);
            t.setText(null);
        while(rs.next())
        {
            t.append("Name "+rs.getString(1)+" "+rs.getString(2)+"\n"+"Department "+rs.getString(3)+"\n");
        }
        rs.close();
        stmt.close();
        con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(deletedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletedetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea t;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
