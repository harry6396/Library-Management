/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author prabhattyagi
 */
public class mainui extends javax.swing.JFrame {

    String a1;
    Date b1;
    public mainui() {
        initComponents();
    }
    public mainui(String a,Date b)
    {
        initComponents();
        l1.setText(a);
        l2.setText(b.toString());
        a1=a;
        b1=b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        r9 = new javax.swing.JRadioButton();
        j10 = new javax.swing.JRadioButton();
        j11 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("LIBRARY MANAGEMENT");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, 53));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        group1.add(r1);
        r1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        r1.setText("BOOK FINDER");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        group1.add(r2);
        r2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        r2.setText("BOOK REGISTRATION");
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        group1.add(r3);
        r3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        r3.setText("STUDENT REGISTRATION");
        jPanel1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        group1.add(r4);
        r4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        r4.setText("FACULTY REGISTRATION");
        jPanel1.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        group1.add(r5);
        r5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        r5.setText("UPDATE");
        jPanel1.add(r5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        group1.add(r6);
        r6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        r6.setText("ISSUE");
        jPanel1.add(r6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, -1));

        group1.add(r7);
        r7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        r7.setText("DEPOSIT");
        jPanel1.add(r7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        group1.add(r8);
        r8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        r8.setText("FINE");
        jPanel1.add(r8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        group1.add(r9);
        r9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        r9.setText("STUDENT LOGIN");
        jPanel1.add(r9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        group1.add(j10);
        j10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        j10.setText("FACULTY LOGIN");
        jPanel1.add(j10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        group1.add(j11);
        j11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        j11.setText("LIBRARY DESK");
        jPanel1.add(j11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 290, 480));

        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, 1320, 10));

        jLabel1.setText("Welcome ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        l1.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 210, 20));

        jLabel3.setText("Last Login Detail");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        l2.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 210, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, 1380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(r1.isSelected())
        {
         new bookfinder(a1, (java.sql.Date) b1).setVisible(true);
       this.setVisible(false);   
        }
        else if(r2.isSelected())
    {
       new bookreg(a1,b1).setVisible(true);
       this.setVisible(false);
    }
    else if(r3.isSelected())
    {
        new stureg(a1,b1).setVisible(true);
        this.setVisible(false);
    }
    else if(r4.isSelected())
    {
        new facreg(a1,b1).setVisible(true);
        this.setVisible(false);
    }
    else if(r5.isSelected())
    {
        new update(a1,b1).setVisible(true);
        this.setVisible(false);
    }
    else if(r6.isSelected())
    {
        new choiceissue(a1,b1).setVisible(true);
        this.setVisible(false);
    }
    else if(r7.isSelected())
    {
        new choicedeposit(a1,b1).setVisible(true);
        this.setVisible(false);
    }
    else if(r8.isSelected())
    {
        new fine(a1, (java.sql.Date) b1).setVisible(true);
        this.setVisible(false);
    }
    else if(r9.isSelected())
    {
            new full(null,a1,b1).setVisible(true);
            this.setVisible(false);
    }
    else if(j10.isSelected())
    {
            new full1(null,a1,b1).setVisible(true);
            this.setVisible(false);
    }
    else if(j11.isSelected())
    {
        new libraryhelp(a1,b1).setVisible(true);
        this.setVisible(false);
    }
        else
        JOptionPane.showMessageDialog(null, "No option selected Please choose one");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new loginform().setVisible(true);
         this.setVisible(false);
         
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
            java.util.logging.Logger.getLogger(mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup group1;
    private javax.swing.JRadioButton j10;
    private javax.swing.JRadioButton j11;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r9;
    // End of variables declaration//GEN-END:variables
}