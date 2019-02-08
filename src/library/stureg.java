
package library;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import static library.passfinal.sendMessage;
public class stureg extends javax.swing.JFrame {
    String a1;
    Date d1;
   
    public stureg() {
        initComponents();
    }
   public stureg(String a,Date d)
   {
       initComponents();
       a1=a;
       d1=d;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        c1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        t9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(700, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("LIBRARY MANAGEMENT");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 6, -1, -1));

        jLabel3.setText("FIRST NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 116, -1));

        jLabel4.setText("SCHOLAR NUMBER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel5.setText("BRANCH");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel6.setText("ENROLLMENT NUMBER");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 152, 36));

        jLabel8.setText("LAST NAME");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 173, 36));
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 152, 35));
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 216, 35));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "CSE", "ME", "ECE", "EI", "CE", "CH", "EX" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        jLabel9.setText("Year Of Admission");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2050 ", "2049 ", "2048 ", "2047 ", "2046 ", "2045", "2044 ", "2043", "2042", "2041", "2040", "2039", "2038", "2037", "2036", "2035", "2034", "2033", "2032", "2031", "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990 " }));
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText("CONTACT DETAILS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 3190, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 2980, -1));

        jLabel11.setText("PHONE NUMBER");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("PARENT");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 141, -1));

        jLabel13.setText("Email ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, -1, -1));
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 346, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 255));
        jLabel14.setText("STUDENT");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, -1, -1));

        jLabel15.setText("PHONE NUMBER");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, -1, -1));
        jPanel1.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 130, -1));

        jLabel16.setText("+91");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jLabel17.setText("+91");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, -1, -1));

        jLabel18.setText("Email ID");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 700, -1, -1));
        jPanel1.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 347, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 740, 3630, 10));

        jLabel19.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("BARCODE REGISTRATION");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 760, 296, -1));

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 890, -1, -1));

        jLabel20.setText("Gender");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 60, 20));

        group1.add(r1);
        r1.setText("M");
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        group1.add(r2);
        r2.setText("F");
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));

        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        jPanel1.add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 810, 212, 32));

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 890, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
        new mainui(a1,d1).setVisible(true);
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
           String d;
           if(r1.isSelected())
               d="M";
           else
               d="F";
           String e=t4.getText();
           String f=(String)c1.getSelectedItem();
           String g=(String)c2.getSelectedItem();
           String h=t5.getText();
           String i=t6.getText();
           String j=t7.getText();
           String k=t8.getText();
           String l=t9.getText();
           String insert="INSERT INTO student VALUES('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+h+"','"+i+"','"+j+"','"+k+"','"+g+"','"+l+"');";
           stmt.executeUpdate(insert);
           String insert1="insert into issue1(Scholar_No,Name,barcode) select scholar,fname,barcode from student where barcode='"+l+"';";
           stmt.executeUpdate(insert1);
           String insert2="update issue1 set Book1='0',Book2='0' where barcode='"+l+"';";
           stmt.executeUpdate(insert2);
           String ii="insert into fine(barcode,scno) select barcode,scholar from student where barcode='"+l+"';";
           stmt.executeUpdate(ii);
            try
    	{
	        String testPhoneNo ="91"+j;          
	        String testMessage=a+" "+b+" Welcome to Library Enjoy our Services";
	        sendMessage(testPhoneNo,testMessage);
    	}
    	catch(Exception e1)
    	{
    	}
           JOptionPane.showMessageDialog(null, "Successfully UPDATED");
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
       }
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
            java.util.logging.Logger.getLogger(stureg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stureg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stureg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stureg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stureg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.ButtonGroup group1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
