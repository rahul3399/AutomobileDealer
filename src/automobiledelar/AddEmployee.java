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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class AddEmployee extends javax.swing.JInternalFrame {
String mode="";
    /**
     * Creates new form 
     */
    public AddEmployee() {
        initComponents();
        mode="addnew";
         
    }
    String eid;
     public AddEmployee(String type) {
        try {
            initComponents();
            eid=type;
            mode="update";
            ResultSet rs=MyDb.getCon().createStatement().executeQuery("select * from employee where eid="+eid);
            if(rs.next())
            {
                txtfn.setText(""+rs.getString("ename"));
                txtcontactno.setText(""+rs.getString("phno"));
                txtdob.setDate(rs.getDate("dob"));  
                txtadd.setText(""+rs.getString("address"));
                txtstatus.setText(""+rs.getString("status"));
                txtdh.setDate(rs.getDate("doj"));
                txtjobt.setText(""+rs.getString("jobt"));
                txtdep.setText(""+rs.getString("dept"));
                txtemail.setText(""+rs.getString("email"));
                txtbsal.setText(""+rs.getString("bsal"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtdep = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        txtemail = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtcontactno = new javax.swing.JTextField();
        txtbsal = new javax.swing.JTextField();
        txtjobt = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setTitle("Add-Employee");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(null);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Add_User_Male_35px_1.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 50, 40, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 255, 204));
        jLabel17.setText("Add-Employee");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(70, 50, 190, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled_4.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 0, 1090, 120);

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 120));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(null);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/jk_1.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 0, 1090, 60);

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1120, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Department :-");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 87, 30));

        txtdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepActionPerformed(evt);
            }
        });
        jPanel3.add(txtdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Full Name :-");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 68, 30));

        txtfn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnActionPerformed(evt);
            }
        });
        jPanel3.add(txtfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Gender :-");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Date Of Birth :-");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Email :-");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 60, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Contact no. :-");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Address :-");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 60, 20));

        txtadd.setColumns(20);
        txtadd.setRows(5);
        jScrollPane1.setViewportView(txtadd);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 190, 110));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel3.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 190, 30));

        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });
        jPanel3.add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 190, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Date of Joining :-");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Basic Salary :-");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 80, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Job Title :-");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 60, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Status :-");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 50, 30));

        txtcontactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactnoActionPerformed(evt);
            }
        });
        jPanel3.add(txtcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 190, 30));

        txtbsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbsalActionPerformed(evt);
            }
        });
        jPanel3.add(txtbsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 190, 30));

        txtjobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjobtActionPerformed(evt);
            }
        });
        jPanel3.add(txtjobt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 190, 30));

        jDesktopPane1.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jPanel3.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Add image");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 110, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        rbmale.setBackground(new java.awt.Color(255, 255, 255));
        rbmale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbmale.setText("Male");
        rbmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmaleActionPerformed(evt);
            }
        });

        rbfemale.setBackground(new java.awt.Color(255, 255, 255));
        rbfemale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbfemale.setText("Female");
        rbfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbfemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rbmale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(rbfemale)
                .addGap(28, 28, 28))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbfemale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbmale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 190, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 1040, 347));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnActionPerformed

    private void txtbsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbsalActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtbsalActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
    String id,name,dob,cn,gen,add,status,dateh,jobt,dep1,email,basicsal,image;
    name=txtfn.getText();
     //image=filename.getBytes();
    add=txtadd.getText();
    if(rbmale.isSelected())
    {
        gen="Male";
    }
    else
    {
        gen="Female";
    }
    cn=txtcontactno.getText();
    
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        dob=sdf.format(txtdob.getDate());
    status=txtstatus.getText();
   
       dateh=sdf.format(txtdh.getDate());
    jobt=txtjobt.getText();
    dep1=txtdep.getText();
    email=txtemail.getText();
    basicsal=txtbsal.getText();
        System.err.println(filename);
        if(name.isEmpty() || cn.isEmpty() || email.isEmpty() ||add.isEmpty() ||status.isEmpty() ||jobt.isEmpty() || dep1.isEmpty() || basicsal.isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "Empty field not allow");
        }
        else if( name.matches("[a-zA-z]")){
            JOptionPane.showMessageDialog(this, "Invalid Name of Employee");
        }
        else if(cn.length()!= 10 || !cn.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Invalid phone number of Employee");
        }
        
        else if( !email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
             JOptionPane.showMessageDialog(this, "Invalid email-id of Employee ");
        }
        else if( status.matches("[a-zA-z]")){
            JOptionPane.showMessageDialog(this, "Invalid status of Employee");
        }
        else if( jobt.matches("[a-zA-z]")){
            JOptionPane.showMessageDialog(this, "Invalid Jobtitle of Employee");
        }
        else if( dep1.matches("[a-zA-z]")){
            JOptionPane.showMessageDialog(this, "Invalid department of Employee");
        }
        else if( name.matches("[a-zA-z]")){
            JOptionPane.showMessageDialog(this, "Invalid Name of Employee");
        }
        else{
        try{
        String q="";
        if(mode.equals("addnew"))
        {
            q="insert into employee(ename,status,jobt,dept,address,gen,email,dob,doj,bsal,phno,image) values('"+name+"','"+status+"','"+jobt+"','"+dep1+"','"+add+"','"+gen+"','"+email+"','"+dob+"','"+dateh+"',"+basicsal+",'"+cn+"','"+filename+"')";
        }
        else
            q="update employee set ename='"+name+"',status='"+status+"',jobt='"+jobt+"',dept='"+dep1+"',address='"+add+"',gen='"+gen+"',email='"+email+"',dob='"+dob+"',doj='"+dateh+"',bsal='"+basicsal+"',phno='"+cn+"' where eid="+eid;
       
        System.out.println(""+q);
        Connection con=MyDb.getCon();
            int x=con.createStatement().executeUpdate(q);
            {
                JOptionPane.showMessageDialog(this, "Record Saved");
                txtfn.setText("");
        txtemail.setText("");
        txtdh.setDateFormatString("");
        txtstatus.setText("");
        txtdep.setText("");
        txtcontactno.setText("");
        txtadd.setText("");
        txtbsal.setText("");
        txtjobt.setText("");
        txtdob.setDateFormatString("");
                jButton2ActionPerformed(evt);
                
                
            }
    }   catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
    }//GEN-LAST:event_SaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        txtfn.setText("");
        txtemail.setText("");
        txtdh.setDateFormatString("");
        txtstatus.setText("");
        txtdep.setText("");
        txtadd.setText("");
        txtcontactno.setText("");
        txtbsal.setText("");
        txtjobt.setText("");
        txtdob.setDateFormatString("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       JFileChooser chooser = new JFileChooser();
       chooser.setVisible(true);
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

    private void rbmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmaleActionPerformed
         rbmale.setSelected(true);
        rbfemale.setSelected(false);
        
    }//GEN-LAST:event_rbmaleActionPerformed

    private void rbfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbfemaleActionPerformed
        rbmale.setSelected(false);
        rbfemale.setSelected(true);
        
    }//GEN-LAST:event_rbfemaleActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        
    }//GEN-LAST:event_formInternalFrameClosed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       setVisible(false); 
Employee e=new Employee();
MainScreen.desktopPane.add(e);
e.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtjobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjobtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjobtActionPerformed

    private void txtcontactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactnoActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txtbsal;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtdep;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfn;
    private javax.swing.JTextField txtjobt;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables

     private final ImageIcon format =null;
      String filename =null;
      byte[] person_image = null;


    private com.toedter.calendar.JDateChooser txtdob;
     private com.toedter.calendar.JDateChooser txtdh;
    

}


