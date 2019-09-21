/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobiledelar;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class Allowance extends javax.swing.JInternalFrame   {

String mode="";

    /**
     * Creates new form Allowance
     */
    public Allowance() {
        initComponents();
        fillCombo();
        fetch(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        View = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Export1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtn = new javax.swing.JTextField();
        txtbs = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_ot = new javax.swing.JTextField();
        txt_b = new javax.swing.JTextField();
        txt_o = new javax.swing.JTextField();
        txtrp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtd = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        txtt = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();

        setBorder(null);
        setTitle("Allowance");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 204));
        jLabel4.setText("Allowance");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 40, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled_4.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 1090, 119);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 120));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(null);

        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_View_20px.png"))); // NOI18N
        View.setText("View All");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel2.add(View);
        View.setBounds(20, 10, 100, 30);

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Save_20px.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel2.add(Save);
        Save.setBounds(140, 10, 100, 30);

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Trash_20px.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete);
        Delete.setBounds(260, 10, 100, 30);

        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Clear_Symbol_20px.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear);
        Clear.setBounds(380, 10, 100, 30);

        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Cancel_20px.png"))); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel2.add(Cancel);
        Cancel.setBounds(630, 10, 100, 30);

        Export1.setBackground(new java.awt.Color(255, 255, 255));
        Export1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Microsoft_Excel_20px.png"))); // NOI18N
        Export1.setText("Export");
        Export1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export1ActionPerformed(evt);
            }
        });
        jPanel2.add(Export1);
        Export1.setBounds(500, 10, 110, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/jk_1.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(36, 0, 1090, 60);

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1120, 60));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Search:-");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Employee Id :-");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Full Name :-");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 81, 24));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Date of Birth :-");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 24));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Basic Salary :-");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 30));

        txtid.setEnabled(false);
        jPanel4.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 150, 30));

        txtn.setEnabled(false);
        txtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnActionPerformed(evt);
            }
        });
        jPanel4.add(txtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 30));

        txtbs.setEnabled(false);
        txtbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbsActionPerformed(evt);
            }
        });
        jPanel4.add(txtbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Overtime :-");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 81, 24));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Bonus :-");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 81, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Other :-");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 81, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Rate per Hour :-");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 90, 30));

        txt_ot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_otActionPerformed(evt);
            }
        });
        jPanel4.add(txt_ot, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 150, 30));
        jPanel4.add(txt_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 150, 30));
        jPanel4.add(txt_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 150, 30));
        jPanel4.add(txtrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 150, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "First Name", "Overtime", "Bonus", "Other", "Rate  Perhours", "Basic Salary", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 830, 90));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Calculator_20px.png"))); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 110, 30));

        txtd.setEnabled(false);
        jPanel4.add(txtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, 30));

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        txtt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtt.setText("0.0");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Total Salary :-");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 260, 70));

        combo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo1ItemStateChanged(evt);
            }
        });
        combo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo1MouseClicked(evt);
            }
        });
        jPanel4.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 150, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 970, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void fetch(String wh){
    String col[]={"Allowance ID","Employee ID","First-Name","Overtime","Bonus","Other","Rate per hours","Basic salary","Total"};
        int r=0;
        try {
        String q="select * from allowance"+wh;
        Connection con=MyDb.getCon();
            ResultSet rs=con.createStatement().executeQuery(q);
        if(rs.last())
        {
            r=rs.getRow();
         
        }
           rs.beforeFirst();
        String data[][]=new String[r][9];
        for(int i=0;rs.next();i++)
        {
            data[i][0]=rs.getString("aid");
            data[i][1]=rs.getString("eid");
            data[i][2]=rs.getString("bonus");
            data[i][3]=rs.getString("overtime");
            data[i][4]=rs.getString("other");
            data[i][5]=rs.getString("name");
            data[i][6]=rs.getString("rateperhr");
            data[i][7]=rs.getString("bsal");
            data[i][8]=rs.getString("total");
           
        }
        
        jTable1.setModel(new DefaultTableModel(data, col));
        
        invalidate();
        
        
            
            
    } catch (SQLException ex) {
        Logger.getLogger(Allowance.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    public void fillCombo() {
        try {
            ResultSet rs = MyDb.getCon().createStatement().executeQuery("select eid,ename from employee");
            while (rs.next()) {
                combo1.addItem(rs.getString("eid") + "-" + rs.getString("ename"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        fetch(" ");
      
    }//GEN-LAST:event_ViewActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
String id,bonus,ot,other,name,rph,bs,t;
id=txtid.getText();
bonus=txt_b.getText();
ot=txt_ot.getText();
other=txt_o.getText();
name=txtn.getText();
rph=txtrp.getText();
bs=txtbs.getText();
t=txtt.getText();
if(bonus.isEmpty() || ot.isEmpty() || other.isEmpty() ||rph.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Empty field not allow");
        }

else{
        try{
            String q="";
             q="insert into allowance(eid,bonus,overtime,other,name,rateperhr,bsal,total) values("+id+","+bonus+","+ot+","+other+",'"+name+"',"+rph+","+bs+","+t+")";
            if(q==null)
            {
                 JOptionPane.showMessageDialog(this, "Record Does not added");
            }
            else{
                q="update employee set bsal="+t+"where eid="+id;
            }
             Connection con=MyDb.getCon();
             
            int x=con.createStatement().executeUpdate(q);
            {
                JOptionPane.showMessageDialog(this, "Record added");
                
            }
        } catch (SQLException ex) {
        Logger.getLogger(Allowance.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
        
    }//GEN-LAST:event_SaveActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
 try {
        int x=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        String q="delete from allowance where aid="+x;
        int a=MyDb.getCon().createStatement().executeUpdate(q);
        if(a>0)
            JOptionPane.showMessageDialog(this, "Record deleted successfully");
        
        fetch("");
    } catch (SQLException ex) {
        Logger.getLogger(Allowance.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch(IndexOutOfBoundsException e)
    {
          JOptionPane.showMessageDialog(this, "Select record from table");
    }
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
     txt_b.setText("");
     txt_ot.setText("");
     txt_o.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void combo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo1MouseClicked

    }//GEN-LAST:event_combo1MouseClicked

    private void combo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo1ItemStateChanged
        try {
            String q="select * from employee where eid="+(combo1.getSelectedItem().toString()).substring(0,combo1.getSelectedItem().toString().indexOf("-"));
            Connection con=MyDb.getCon();
            ResultSet rs=con.createStatement().executeQuery(q);
            if(rs.next())
            {
                String add1=rs.getString("eid");
                txtid.setText(add1);
                String add2=rs.getString("ename");
                txtn.setText(add2);
                Date add3=rs.getDate("dob");
                txtd.setDate(add3);
                String add4=rs.getString("bsal");
                txtbs.setText(add4);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Allowance.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_combo1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int salary = Integer.parseInt(txtbs.getText());
        int overtime = Integer.parseInt(txt_ot.getText());

        double eight = 8;
        double days = 25;
        double dbop = 0;
        // double overtimeRate = 20;

        //calculate the total hours of overtime
        double Total_Overtime = 50;
        String x = String.valueOf(Total_Overtime);
        txtrp.setText(x);

        //calculate overall overtime
        //dbop = salary /days/eight;
        //String s = String.valueOf(dbop);
        //txtrp.setText(s);

        int bonus = Integer.parseInt(txt_b.getText());
        int other = Integer.parseInt(txt_o.getText());
        int f = bonus+other+salary;
        double calc = Total_Overtime * overtime +f;
        String c = String.valueOf(calc);
        txtt.setText(c);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_otActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_otActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_otActionPerformed

    private void txtbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbsActionPerformed

    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnActionPerformed

    private void Export1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export1ActionPerformed

        Date now = new Date();

        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //Date date = new Date();
        Date date = Calendar.getInstance().getTime();
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String strDate = dateFormat.format(date);
        System.out.println("Converted String: " + strDate);
        //System.out.println(dateFormat.format(date));

        Excelexport e=new Excelexport();
        try {
            System.err.println("H:\\Export\\Allowance "+strDate+".xls");
            e.toExcel(jTable1, new File("H:\\Export\\Allowance "+strDate+".xls"));

        } catch (IOException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Export1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Export1;
    private javax.swing.JButton Save;
    private javax.swing.JButton View;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_b;
    private javax.swing.JTextField txt_o;
    private javax.swing.JTextField txt_ot;
    private javax.swing.JTextField txtbs;
    private com.toedter.calendar.JDateChooser txtd;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextField txtrp;
    private javax.swing.JLabel txtt;
    // End of variables declaration//GEN-END:variables
}
