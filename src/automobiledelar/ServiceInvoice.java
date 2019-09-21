/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobiledelar;

import static automobiledelar.MyDb.con;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ServiceInvoice extends javax.swing.JInternalFrame {
String mode="";
    /**
     * Creates new form ServiceInvoice
     * @throws java.sql.SQLException
     */
public void Invoice() throws SQLException
     {
        con=MyDb.getCon();
        Statement st=con.createStatement();
        String id,mob1,add,vname,vno,date1;
        id=txtc.getText();
        mob1=txtm.getText();
        add=txtadd.getText();
        vname=txtvn.getText();
        vno=txtvno.getText();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        date1=sdf.format(txtd.getDate());
       
    
         
     }
    public ServiceInvoice() {
        initComponents();
        fillCombo();
        fetch("");
    }
    public void fetch(String wh){
    String col[]={"BillID","CustId","Mobile-No.","Date","Vehicle No","Payment Type","Sub-Amount","Discount","Total"};
        int r=0;
        try {
        String q="select * from servicebill"+wh;
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
            data[i][0]=rs.getString("Billid");
            data[i][1]=rs.getString("Customerid");
            data[i][2]=rs.getString("Mobileno");
            data[i][3]=rs.getString("Date");
            data[i][4]=rs.getString("Vehicleno");
            data[i][5]=rs.getString("PaymentType");
            data[i][6]=rs.getString("SubAmount");
            data[i][7]=rs.getString("discount");
            data[i][8]=rs.getString("Total");
           
        }
        
        jTable1.setModel(new DefaultTableModel(data, col));
        
        invalidate();
        
        
            
            
    } catch (SQLException ex) {
        Logger.getLogger(AddDealers.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
 public void fillCombo() {
        try {
            ResultSet rs = MyDb.getCon().createStatement().executeQuery("select cid,cname from customer");
            while (rs.next()) {
                combo1.addItem(rs.getString("cid") + "-" + rs.getString("cname"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        New1 = new javax.swing.JButton();
        Export1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtm = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        txtc = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtq = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtup = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        txtt = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        combo1 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtvno = new javax.swing.JTextField();
        txtvn = new javax.swing.JTextField();
        New = new javax.swing.JButton();
        txtd = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        txts = new javax.swing.JTextField();
        txtds = new javax.swing.JTextField();
        txtoc = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        txtpy = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(153, 255, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 204));
        jLabel10.setText("Service Invoice");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 190, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Untitled_4.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1120, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Save_20px.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 100, 30));

        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_View_20px.png"))); // NOI18N
        View.setText("View All");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel1.add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Calculator_20px.png"))); // NOI18N
        Update.setText("Calculate");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 100, 30));

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Trash_20px.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 100, 30));

        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Clear_Symbol_20px.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 100, 30));

        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Cancel_20px.png"))); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 100, 30));

        New1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Enter_20px.png"))); // NOI18N
        New1.setText("Submit");
        New1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New1ActionPerformed(evt);
            }
        });
        jPanel1.add(New1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 100, 30));

        Export1.setBackground(new java.awt.Color(255, 255, 255));
        Export1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Microsoft_Excel_20px.png"))); // NOI18N
        Export1.setText("Export");
        Export1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export1ActionPerformed(evt);
            }
        });
        jPanel1.add(Export1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/jk_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1120, 60));

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr.No", "Customer Name", "Mobile No.", "Date", "Vehical no.", "Vehical Name", "Payement Type", "Total Tax", "Total Value"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Service Table", jPanel9);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setText("Customer Name:-");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 85, 27));

        jLabel40.setText("Date:-");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 85, 30));

        jLabel41.setText("Mobile no.:-");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 85, 30));
        jPanel5.add(txtm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 30));

        txtadd.setColumns(20);
        txtadd.setRows(5);
        jScrollPane3.setViewportView(txtadd);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, 60));

        jLabel43.setText("Address:-");
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 85, 23));

        txtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcActionPerformed(evt);
            }
        });
        jPanel5.add(txtc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 160, 30));

        jLabel59.setText("Vehicle No:-");
        jPanel5.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 84, 30));

        jLabel47.setText("Name :-");
        jPanel5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 70, 23));
        jPanel5.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 160, 30));
        jPanel5.add(txtq, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 160, 30));

        jLabel48.setText("Quantity:-");
        jPanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 70, 30));

        jLabel49.setText("Unit Price:-");
        jPanel5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 80, 30));

        txtup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupActionPerformed(evt);
            }
        });
        jPanel5.add(txtup, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 160, 30));

        jPanel18.setBackground(new java.awt.Color(204, 255, 204));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanel18.setForeground(new java.awt.Color(204, 255, 204));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 153, 0));
        jLabel61.setText("Total :-");

        txtt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtt.setForeground(new java.awt.Color(255, 153, 0));
        txtt.setText("0.00");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel5.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 60));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Unit Price", "Total"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 370, 260));

        combo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo1ItemStateChanged(evt);
            }
        });
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jPanel5.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 30));

        jLabel42.setText("Customer Id :-");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 85, 27));

        jLabel54.setText("Vehicle Name:-");
        jPanel5.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 84, 30));

        txtvno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvnoActionPerformed(evt);
            }
        });
        jPanel5.add(txtvno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 160, 30));

        txtvn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvnActionPerformed(evt);
            }
        });
        jPanel5.add(txtvn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 160, 30));

        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon3/icons8_Plus_20px.png"))); // NOI18N
        New.setText("Add Service");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jPanel5.add(New, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 130, 30));
        jPanel5.add(txtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 980, 330));

        jTabbedPane1.addTab("Service Invoice", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setText("Sub amount :-");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 85, 27));
        jPanel7.add(txts, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 170, 30));
        jPanel7.add(txtds, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 30));
        jPanel7.add(txtoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 170, 30));

        jLabel46.setText("Other Charges :-");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 85, 27));

        jLabel51.setText("Discount");
        jPanel7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 85, 27));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 340, 150));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setText("Payment Type :-");
        jPanel8.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 27));

        txtpy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card Payment", "Payment" }));
        jPanel8.add(txtpy, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 30));

        jPanel10.setBackground(new java.awt.Color(204, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 102, 0));
        jLabel35.setText("Gross Total :-");
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 98, 25));

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 102, 0));
        txttotal.setText("0.0");
        jPanel10.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 111, 25));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 250, 70));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 340, 150));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Payment Type", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcActionPerformed

    private void txtupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

       
          
    }//GEN-LAST:event_SaveActionPerformed
int s=0 ;
    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
      DefaultTableModel mode= (DefaultTableModel) jTable2.getModel();
        int i1=Integer.parseInt(txtq.getText());
        int i2=Integer.parseInt(txtup.getText());
        int i3=i1*i2;
        txtt.setText(Integer.toString(i3));
        int i=Integer.parseInt(txtt.getText());
        
        mode.addRow(new Object[]{txtname.getText(),txtq.getText(),txtup.getText(),txtt.getText()});
       s+=i;
       txts.setText(Integer.toString(s));
     
       String name,q1,up,t;
       name=txtname.getText();
       q1=txtq.getText();
       up=txtup.getText();
       t=txtt.getText();
       int s=5;
       
       try{
           
            String q="insert into service(Servic_n,quantity,price,total) values('"+name+"','"+q1+"','"+up+"','"+t+"')";
             Connection con=MyDb.getCon();
            int x=con.createStatement().executeUpdate(q);
            {
                
                 txtname.setText("");
       txtq.setText("");
       txtup.setText(""); 
            }
                    
        } catch (SQLException ex) {
        Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_NewActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
fetch("");        // TODO add your handling code here:
    }//GEN-LAST:event_ViewActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
try {
        int x=Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        String q="delete from servicebill where Billid="+x;
        int a=MyDb.getCon().createStatement().executeUpdate(q);
        if(a>0)
            JOptionPane.showMessageDialog(this, "Record Deleteed Successfully");
        
        fetch("");
    } catch (SQLException ex) {
        Logger.getLogger(AddDealers.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch(IndexOutOfBoundsException e)
    {
          JOptionPane.showMessageDialog(this, "select Record");
    }        
    }//GEN-LAST:event_DeleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

    }//GEN-LAST:event_ClearActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void combo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo1ItemStateChanged
 try {
        String q="select * from customer where cid="+(combo1.getSelectedItem().toString()).substring(0,combo1.getSelectedItem().toString().indexOf("-"));
            Connection con=MyDb.getCon();
        ResultSet rs=con.createStatement().executeQuery(q);
        if(rs.next())
        {
        String add1=rs.getString("cid");
        txtc.setText(add1);
        String add2=rs.getString("contactno");
        txtm.setText(add2);
        String add4=rs.getString("address");
        txtadd.setText(add4);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Allowance.class.getName()).log(Level.SEVERE, null, ex);
    }        //         // TODO add your handling code here:
    }//GEN-LAST:event_combo1ItemStateChanged

    private void txtvnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvnoActionPerformed

    private void txtvnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvnActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void New1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New1ActionPerformed
        /*name=txtc.getText();
        mob=txtph.getText();
        email=txtemail.getText();
        add=txtadd.getText();
        if(name.isEmpty() || name.matches("[a-zA-z]")){
            JOptionPane.showMessageDialog(this, "Invalid Name of customer");
        }
        else if(mob.length()!= 10 || !mob.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Invalid phone number of customer");
        }
        else if( !email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
             JOptionPane.showMessageDialog(this, "Invalid email-id ");
        }
        else{
        try{
           
            String q="insert into customer(cname,contactno,address,email) values('"+name+"','"+mob+"','"+add+"','"+email+"')";
             Connection con=MyDb.getCon();
            int x=con.createStatement().executeUpdate(q);
            {
                JOptionPane.showMessageDialog(this, "Record added");
                
            }
                    
        } catch (SQLException ex) {
        Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
    }
        }*/
      
       String cid,mob,date,vehicleno,pyt,subt,t,dis;
       cid=txtc.getText();
       mob=txtm.getText();
      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        date=sdf.format(txtd.getDate());
        vehicleno=txtvno.getText();
        dis=txtds.getText();
      String vn=txtvn.getText();
      pyt=txtpy.getSelectedItem().toString();
      subt=txtt.getText();
      t=txttotal.getText();
       try{
           
            String q="insert into servicebill(customerid,Mobileno,Date,discount,vehicleno,PaymentType,SubAmount,Total) values("+cid+",'"+mob+"','"+date+"','"+dis+"','"+vehicleno+"','"+pyt+"','"+subt+"','"+t+"')";
            System.out.println(q); 
            Connection con=MyDb.getCon();
            int x=con.createStatement().executeUpdate(q);
            {
                JOptionPane.showMessageDialog(this, "Record added1");
            }
                    
        } catch (SQLException ex) {
        Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_New1ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
     int f=Integer.parseInt(txts.getText());
     int f1=Integer.parseInt(txtds.getText());
     int f2=Integer.parseInt(txtoc.getText());
     int f3=f+f2-f1;
        System.out.println(f3);
     txttotal.setText(Integer.toString(f3));
                
    }//GEN-LAST:event_UpdateActionPerformed

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
            System.err.println("H:\\Export\\ServiceInvoice "+strDate+".xls");
            e.toExcel(jTable1, new File("H:\\Export\\ServiceInvoice "+strDate+".xls"));

        } catch (IOException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Export1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Export1;
    private javax.swing.JButton New;
    private javax.swing.JButton New1;
    private javax.swing.JButton Save;
    private javax.swing.JButton Update;
    private javax.swing.JButton View;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txtc;
    private com.toedter.calendar.JDateChooser txtd;
    private javax.swing.JTextField txtds;
    private javax.swing.JTextField txtm;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtoc;
    private javax.swing.JComboBox<String> txtpy;
    private javax.swing.JTextField txtq;
    private javax.swing.JTextField txts;
    private javax.swing.JLabel txtt;
    private javax.swing.JLabel txttotal;
    private javax.swing.JTextField txtup;
    private javax.swing.JTextField txtvn;
    private javax.swing.JTextField txtvno;
    // End of variables declaration//GEN-END:variables
}