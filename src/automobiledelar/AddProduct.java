/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobiledelar;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class AddProduct extends javax.swing.JInternalFrame {
String mode="";
    /**
     * Creates new form Addcustomer
     */
    public AddProduct() {
        initComponents();
         mode="addnew";
    }

    String pid;
     public AddProduct(String type) {
        try {
            initComponents();
            pid=type;
            mode="update";
            ResultSet rs=MyDb.getCon().createStatement().executeQuery("select * from product where pid="+pid);
            if(rs.next())
            {   vehname1.setText(""+rs.getString("pname"));
                txtvno.setText(""+rs.getString("vehicleno"));
                mod.setText(""+rs.getString("modelno"));  
                cfv.setText(""+rs.getString("acost"));
                //yc.setYear(rs.getDate("Yearofpurchase"));
                Datesell.setDate(rs.getDate("datesell"));
                owname.setText(""+rs.getString("oname"));
                
               owno.setText(""+rs.getString("ophoneno"));
                add.setText(""+rs.getString("oadd"));
                email.setText(""+rs.getString("oemail"));
                feature.setText(""+rs.getString("feature"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtvno = new javax.swing.JTextField();
        mod = new javax.swing.JTextField();
        cfv = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        owname = new javax.swing.JTextField();
        owno = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Company = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        feature = new javax.swing.JTextArea();
        Datesell = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        vehname1 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBorder(null);
        setTitle("Add-Vehicle");
        setVisible(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(153, 255, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 204));
        jLabel10.setText("Add-Product");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 40, 190, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Car_40px_1.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 30, 40, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Plus_26px_2.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 30, 30, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled_4.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 0, 1090, 110);

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 110));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(null);

        Save.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Save_20px.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel2.add(Save);
        Save.setBounds(20, 10, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Clear_Symbol_20px.png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(140, 10, 100, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Cancel_20px.png"))); // NOI18N
        jButton5.setText("Cancle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(260, 10, 110, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/jk_1.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 0, 1080, 60);

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1110, 58));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Vehicle Name:-");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 34));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Vehicle no:-");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 82, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Original cost of Vehicle:-");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Date of Selling:-");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Features:-");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 120, 28));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Model no.:-");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 30));
        jPanel4.add(txtvno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 160, 30));

        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        jPanel4.add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 160, 30));

        cfv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfvActionPerformed(evt);
            }
        });
        jPanel4.add(cfv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 160, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Owner Name:-");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 13, -1, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("Owner Contact no.:-");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("Address:-");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, 27));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("Email-ID:-");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, 31));

        owname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownameActionPerformed(evt);
            }
        });
        jPanel4.add(owname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 180, 30));
        jPanel4.add(owno, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 180, 30));

        add.setColumns(20);
        add.setRows(5);
        add.setBorder(null);
        jScrollPane4.setViewportView(add);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 180, 70));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Image:-");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 13, 75, 38));

        Company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maruti", "Skoda" }));
        jPanel4.add(Company, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 30));

        feature.setColumns(20);
        feature.setRows(5);
        jScrollPane1.setViewportView(feature);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 180, 70));

        Datesell.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(Datesell, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 160, 30));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Company:-");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 82, 30));
        jPanel4.add(vehname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 160, 30));

        jDesktopPane1.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Image_File_20px.png"))); // NOI18N
        jButton3.setText("Add image");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, -1, 30));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 1020, 352));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ownameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownameActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        
        
        String id,name,mod1,cost,company,year,date,oname1,oid1,op,oadd1,oemail1,feature1,vno;
        name=vehname1.getText();
        mod1=mod.getText();
        oadd1=add.getText();
        cost=cfv.getText();
        op=owno.getText();
        company=Company.getSelectedItem().toString();
       oname1=owname.getText();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sd=new SimpleDateFormat("yyyy");
        date=sdf.format(Datesell.getDate());
        
        oemail1=email.getText();
        feature1= feature.getText();
        vno=txtvno.getText();
        
       // oid1=owid.getText();
      if(name.isEmpty() || mod1.isEmpty() || oemail1.isEmpty() ||oadd1.isEmpty() ||cost.isEmpty() || op.isEmpty() || company.isEmpty() ||oname1.isEmpty() ||date.isEmpty()|| feature1.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Empty field not allow");
        }
      else if( name.matches("[a-zA-z]")){
            JOptionPane.showMessageDialog(this, "Invalid Name of Vehicle");
        }
      else if( !oemail1.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
             JOptionPane.showMessageDialog(this, "Invalid email-id of Owner ");
        }
      else if(op.length()!= 10 || !op.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Invalid phone number of Owner");
        }
      else if( oname1.matches("[a-zA-z]")){
            JOptionPane.showMessageDialog(this, "Invalid Name of Owner");
        }
     
      
        else{
        try{
            
            String q="";
            if(mode.equals("addnew"))
            {
                q="insert into product(pname,modelno,acost,Company,datesell,oname,ophoneno,oadd,oemail,feature,vehicleno) values('"+name+"','"+mod1+"','"+cost+"','"+company+"','"+date+"','"+oname1+"','"+op+"','"+oadd1+"','"+oemail1+"','"+feature1+"','"+vno+"')";
            }
            else
            q="update product set pname='"+name+"',modelno='"+mod1+"',acost='"+cost+"',Company='"+company+"',datesell='"+date+"',oname='"+oname1+"',ophoneno='"+op+"',oadd='"+oadd1+"',oemail='"+oemail1+"',feature='"+feature1+"',vehicleno='"+vno+"'where pid="+pid;

            System.out.println(""+q);
            Connection con=MyDb.getCon();
            int x=con.createStatement().executeUpdate(q);
            {
                JOptionPane.showMessageDialog(this, "Record Saved");
                vehname1.setText("");
                txtvno.setText("");
                mod.setText("");  
                cfv.setText("");
                //yc.setYear("");
                Datesell.setDateFormatString("");
                owname.setText("");
                
               owno.setText("");
                add.setText("");
                email.setText("");
                feature.setText("");
                jButton2ActionPerformed(evt);

            }
        }   catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
              }
    }//GEN-LAST:event_SaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         vehname1.setText("");
        txtvno.setText("");
                mod.setText("");  
                cfv.setText("");
                //yc.setYear(rs.getDate("Yearofpurchase"));
                Datesell.setDateFormatString("");
                owname.setText("");
                
               owno.setText("");
                add.setText("");
                email.setText("");
                feature.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
        Product e=new Product();
        MainScreen.desktopPane.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cfvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cfvActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imgicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
        img.setIcon(imgicon);
        try{

            File image = new File(filename);
            FileInputStream fix = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int n; (n = fix.read(buf))!=-1;){
                bos.write(buf,0,n);

            }
            person_image = bos.toByteArray();

        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
private final ImageIcon format =null;
      String filename =null;
      byte[] person_image = null;
public static void main(String args[])
{
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Company;
    private com.toedter.calendar.JDateChooser Datesell;
    private javax.swing.JButton Save;
    private javax.swing.JTextArea add;
    private javax.swing.JTextField cfv;
    private javax.swing.JTextField email;
    private javax.swing.JTextArea feature;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mod;
    private javax.swing.JTextField owname;
    private javax.swing.JTextField owno;
    private javax.swing.JTextField txtvno;
    private javax.swing.JTextField vehname1;
    // End of variables declaration//GEN-END:variables

    
    
 

}
