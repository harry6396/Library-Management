/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.Date;
/**
 *
 * @author prabhattyagi
 */
public class fullstu extends javax.swing.JFrame {
        String a1;
        Date d1;
        String aa[];
    /**
     * Creates new form fullstu
     */
    public fullstu() {
        initComponents();
    }
    public fullstu(String a[],String a12,Date d) {
        initComponents();
        aa=a;
        a1=a12;
        d1=d;
        l1.setText(a[0]);
        l2.setText(a[1]);
        l4.setText(a[10]);
        l3.setText(a[2]);
        l15.setText(a[4]);
        l5.setText(a[5]);
        l6.setText(a[3]);
        l7.setText(a[6]);
        l8.setText(a[7]);
        l9.setText(a[8]);
        l10.setText(a[9]);
        l11.setText(a[11]);
        l12.setText(a[12]);
        l13.setText(a[13]);
        l14.setText(a[14]);
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("STUDENT DETAIL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 2030, -1));

        jLabel2.setText("FULL NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel3.setText("SCHOLAR NUMBER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel4.setText("ENROLLMENT NUMBER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("STUDENT DETAIL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 1840, -1));

        jLabel6.setText("BRANCH");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 60, 20));

        jLabel7.setText("GENDER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 2900, -1));

        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("CONTACT DETAIL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel9.setText("PARENT NUMBER");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel10.setText("PARENT EMAIL");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jLabel11.setText("STUDENT NUMBER");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel12.setText("STUDENT EMAIL");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel13.setText("YEAR OF ADMISSION");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 180, 20));
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 180, 20));
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 90, 20));
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 140, 160, 20));
        getContentPane().add(l15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 190, 20));
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 130, 20));
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 100, 20));
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 150, 20));

        jLabel22.setText("+91");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 370, 20));

        jLabel24.setText("+91");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));
        getContentPane().add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 150, 20));
        getContentPane().add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 370, 20));

        jLabel27.setForeground(new java.awt.Color(51, 51, 255));
        jLabel27.setText("ISSUE DETAIL");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel28.setText("BOOK1");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        jLabel29.setText("BOOK2");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));
        getContentPane().add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 420, 20));
        getContentPane().add(l12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 440, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 2290, -1));

        jLabel32.setForeground(new java.awt.Color(51, 51, 255));
        jLabel32.setText("FINE DETAIL");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jLabel33.setText("FINE 1");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, -1, -1));

        jLabel34.setText("FINE 2");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, -1, -1));
        getContentPane().add(l13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 60, 20));
        getContentPane().add(l14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 60, 20));

        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new full(null,a1,d1).setVisible(true);
       this.setVisible(false);
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
            java.util.logging.Logger.getLogger(fullstu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fullstu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fullstu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fullstu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fullstu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
}
