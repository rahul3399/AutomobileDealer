/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobiledelar;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Dell
 */
public class MessageSender extends javax.swing.JInternalFrame {

    /**
     * Creates new form MessageSender
     */
    public MessageSender() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmsg = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtapi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(153, 255, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 204));
        jLabel10.setText("Message Sender");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 40, 280, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Add_User_Male_35px_1.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 30, 50, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled_4.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 0, 1070, 119);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtmsg.setColumns(20);
        txtmsg.setRows(5);
        jScrollPane1.setViewportView(txtmsg);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 230, 130));

        jLabel4.setText("Message:-");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, -1));

        txtnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumActionPerformed(evt);
            }
        });
        jPanel2.add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, 30));

        jLabel3.setText("   Mobile no:-");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 30));

        txtapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapiActionPerformed(evt);
            }
        });
        jPanel2.add(txtapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 230, 30));

        jLabel1.setText("  Api key :-");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 20, 60, 30));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
        });

        Login.setBackground(new java.awt.Color(0, 153, 0));
        Login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(204, 255, 255));
        Login.setText("                                 Submit");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 380, 330));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/jk_1.png"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 0, 1070, 60);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1100, 58));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setColor(JPanel p)
{
   p.setBackground(new Color(255,153,0));
    
}
void resetColor(JPanel p1){
   p1.setBackground(new Color(255,102,0));
    
}
    private void txtapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapiActionPerformed

    private void txtnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumActionPerformed

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        setColor(jPanel5);        // TODO add your handling code here:
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        resetColor(jPanel5);      // TODO add your handling code here:
    }//GEN-LAST:event_LoginMouseExited

    private void LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMousePressed
          try {
            // Construct data
            String apiKey = "apikey=" + txtapi.getText();
            String message = "&message=" + txtmsg.getText();
            String sender = "&sender=" + "";
            String numbers = "&numbers=" + txtnum.getText();

            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey +sender+ numbers + message ;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            try (BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                final StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = rd.readLine()) != null) {
                    //stringBuffer.append(line);
                    JOptionPane.showMessageDialog(null, "message"+line);
                }
                //return stringBuffer.toString();
            }
        } catch (Exception e) {
            //System.out.println("Error SMS "+e);
            JOptionPane.showMessageDialog(null, e);
            //return "Error "+e;
        }
    }//GEN-LAST:event_LoginMousePressed

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtapi;
    private javax.swing.JTextArea txtmsg;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}
