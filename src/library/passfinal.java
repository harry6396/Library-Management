/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author prabhattyagi
 */
public class passfinal extends javax.swing.JFrame {
int count=0;
String bar; 
Random rn=new Random();
          int msg; 
          
/**
     * Creates new form passfinal
     */
    public passfinal() {
        initComponents();
       
    }
public passfinal(String a) {
        initComponents();
        msg=rn.nextInt((1000000)); 
       bar=a;
    }
static final String _url = "https://www.smsgatewayhub.com/api/mt/SendSMS?APIKey=SUhZavV4NEaz07ZEuZNk5Q&senderid=DIGLIB&channel=2&DCS=0&flashsms=0&";
    
    static final String charset = "UTF-8";

    //to build the query string that will send a message
    private static String buildRequestString(String targetPhoneNo, String message)
    {
    	String query = null;
    	try
    	{
        String [] params = new String [3];
        //params[0] = _userName;
        //params[1] = _password;
        params[0] = targetPhoneNo;
        params[1] = message;
        params[2] = "default";
        query = String.format("number=%s&text=%s&route=%s",
        URLEncoder.encode(params[0],charset),
        URLEncoder.encode(params[1],charset),
        URLEncoder.encode(params[2],charset)
        );
    	}
    	catch(Exception e){
    		System.out.println(e);
    		
    	}
    return query;
    }
    public static void sendMessage(String reciever, String message)
    {
    	try
    	{
        URLConnection connection = new URL(_url + buildRequestString(reciever,message)).openConnection();
        InputStream response = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(response));
    	}
    	catch(Exception e)
    	{
    	}
    	
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
        p1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        p = new javax.swing.JProgressBar();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Enter new password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        p1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p1KeyPressed(evt);
            }
        });
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 240, 30));

        jLabel2.setText("Confirm new password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        p2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p2KeyPressed(evt);
            }
        });
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 240, 30));

        p.setMaximum(15);
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 170, 10));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 290, 20));
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 256, 190, 20));

        jButton1.setText("Send OTP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        jLabel3.setText("Enter OTP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 190, 30));

        jButton2.setText("Resend OTP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1KeyPressed
      int a=evt.getKeyCode();
        if(a==8){
              if(count>1){
              count--;
              
               p.setValue(count);
              }
              else if(count<=1){
              count=0;
            p.setValue(count);
            
            l1.setText(" ");
              }
                 }
        else{
            if(a!=27&&a!=0)
                             if(a!=14&&a!=15&&a!=16&&a!=17&&a!=18)
                             if(a!=37&&a!=40&&a!=38&&a!=39)
                             if(a!=20&&a!=157&&a!=32) { 
                                 count++;
             p.setValue(count);
                             }
                             else
                             {
                 JOptionPane.showMessageDialog(null, "Only characters are allow");
                 l1.setText(null);
                 p.setValue(0);
                 count=0;
                             }
        }
        if(count>=1&&count<=8){
            l1.setForeground(Color.RED);
           l1.setText("Weak Password");
        }
        else if(count>=9&&count<15)
        {
            
             l1.setForeground(Color.yellow);
            
            l1.setText("Strong Password");
        }
        else if(count>=15)
        {
           
             l1.setForeground(Color.green);
            
            l1.setText("Very Strong Password");
        }
        else
            l1.setText(" ");
        
    }//GEN-LAST:event_p1KeyPressed

    private void p2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2KeyPressed

    }//GEN-LAST:event_p2KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String a,b,c,d = null,f=null,g=null,h,i,j,k;
       a=new String (p1.getPassword());
       b=new String(p2.getPassword());
       if(a.equals(b))
       {
         try
         {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://lib-lnct.c47pjqtqhh6h.us-west-1.rds.amazonaws.com/library", "harry", "prabhat1");
          Statement stmt=con.createStatement();
          c="select fname,lname,pn from faculty where barcode='"+bar+"';";
          ResultSet rst=stmt.executeQuery(c);
          while(rst.next()){
          d=rst.getString(1);
          f=rst.getString(2);
          g=rst.getString(3);
          }
          String a1="Hello"+" "+d+" "+f+" Your OTP is "+msg+". Do not share your OTP with anyone";
          try
    	{
	        String testPhoneNo ="91"+g;          
	        String testMessage=a1;
	        sendMessage(testPhoneNo,testMessage);
    	}
    	catch(Exception e)
    	{
    	}
          }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
         } catch (ClassNotFoundException ex) { 
               Logger.getLogger(passfinal.class.getName()).log(Level.SEVERE, null, ex);
           } 
       }
       else
           JOptionPane.showMessageDialog(null, "New Password and confirm password is not matching");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new loginform().setVisible(true);
       this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String b=null;
       b=new String(p2.getPassword());
        int msg1=Integer.parseInt(t3.getText());
          if(msg==msg1)
          {
              try
          {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://lib-lnct.c47pjqtqhh6h.us-west-1.rds.amazonaws.com/library", "harry", "prabhat1");
              Statement stmt=con.createStatement();
              String query="update faculty set password='"+b+"' where barcode='"+bar+"';";
              stmt.executeUpdate(query);
              query="update login set password='"+b+"' where barcode='"+bar+"';";
              stmt.executeUpdate(query);
              stmt.close();
              con.close();
              JOptionPane.showMessageDialog(null, "Your Password has been updated");
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
          }
          }
          else
          {
              JOptionPane.showMessageDialog(null, "Invalid OTP! Try again later");
          }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try
         {
             String c,d = null,f = null,g = null;
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://lib-lnct.c47pjqtqhh6h.us-west-1.rds.amazonaws.com/library", "harry", "prabhat1");
          Statement stmt=con.createStatement();
          c="select fname,lname,pn from faculty where barcode='"+bar+"';";
          ResultSet rst=stmt.executeQuery(c);
          while(rst.next()){
          d=rst.getString(1);
          f=rst.getString(2);
          g=rst.getString(3);
          }
          String a1="Hello"+" "+d+f+"Your OTP is"+msg;
          try
    	{
	        String testPhoneNo =g;          
	        String testMessage=a1;
	        sendMessage(testPhoneNo,testMessage);
    	}
    	catch(Exception e)
    	{
    	}
          }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
         } catch (ClassNotFoundException ex) { 
               Logger.getLogger(passfinal.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(passfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passfinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JProgressBar p;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
