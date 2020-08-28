/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jayanthaservicecenter;

import DBconnection.DB;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
//import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static jayanthaservicecenter.Sales.imgSrc;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ravindu
 */
public class Finance extends javax.swing.JFrame {
    
       // public static final String imgSrc = "src/Images/Untitled-2.png";
    /**
     * Creates new form Finance
     */
    public Finance() {
        initComponents();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        dateChooserCombo1.setDateFormat(sdf);
        dateChooserCombo2.setDateFormat(sdf);
        dateChooserCombo3.setDateFormat(sdf);
        dateChooserCombo4.setDateFormat(sdf);
        dateChooserCombo5.setDateFormat(sdf);
        dateChooserCombo6.setDateFormat(sdf);
        dateChooserCombo7.setDateFormat(sdf);
        
      
        
        jButton1.setBackground(new Color(0,0,0,64));
        jButton3.setBackground(new Color(0,0,0,64));
        jButton2.setBackground(new Color(0,0,0,64));
        jButton4.setBackground(new Color(0,0,0,64));
        jButton5.setBackground(new Color(0,0,0,64));
        jButton6.setBackground(new Color(0,0,0,64));
        jButton7.setBackground(new Color(0,0,0,64));
        jButton8.setBackground(new Color(0,0,0,64));
        jButton9.setBackground(new Color(0,0,0,64));
        jButton10.setBackground(new Color(0,0,0,64));
        jButton11.setBackground(new Color(0,0,0,64));
        jButton12.setBackground(new Color(0,0,0,64));
        jButton13.setBackground(new Color(0,0,0,64));
        jButton14.setBackground(new Color(0,0,0,64));
        jButton15.setBackground(new Color(0,0,0,64));
        jButton16.setBackground(new Color(0,0,0,64));
        jButton17.setBackground(new Color(0,0,0,64));
        
        jPanel7.setBackground(new Color(0, 0, 0,170));
        jPanel9.setBackground(new Color(0, 0, 0,170));
        jPanel11.setBackground(new Color(0, 0, 0,170));
        jPanel13.setBackground(new Color(0, 0, 0,170));
        jPanel14.setBackground(new Color(0, 0, 0,170));
        jPanel17.setBackground(new Color(0, 0, 0,170));
        jPanel15.setBackground(new Color(0, 0, 0,170));
        jPanel16.setBackground(new Color(0, 0, 0,170));
        
        jTextField1.setBackground(new Color(0,0,0,200));
        jTextField2.setBackground(new Color(0,0,0,200));
        jTextField3.setBackground(new Color(0,0,0,200));
        jTextField4.setBackground(new Color(0,0,0,200));
        jTextField5.setBackground(new Color(0,0,0,200));
        jTextField6.setBackground(new Color(0,0,0,200));
       // jTextField7.setBackground(new Color(0,0,0,200));
       // jTextField8.setBackground(new Color(0,0,0,200));
        jTextField9.setBackground(new Color(0,0,0,200));
        jTextField10.setBackground(new Color(0,0,0,200));
        jTextField11.setBackground(new Color(0,0,0,200));
        try{
            
            String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            double sqty = 0.00, lqty = 0.00;
        ResultSet rs = s.executeQuery("Select ReOrderLevel  from reorderlevel where Type = '"+"SpareParts"+"'");
        while(rs.next()){
            String amnt = rs.getString("ReOrderLevel");
            sqty = Double.parseDouble(amnt);
        }
        ResultSet rs1 = s.executeQuery("Select ReOrderLevel  from reorderlevel where Type = '"+"Lubricants"+"'");
        while(rs1.next()){
            String amnt = rs1.getString("ReOrderLevel");
            lqty = Double.parseDouble(amnt);
        }
        ResultSet rs2 = s.executeQuery("select ItemName,Quanty from subpartname where Quanty <= "+sqty+" ");
         jTable3.setModel(DbUtils.resultSetToTableModel(rs2));
            
        ResultSet rs3 = s.executeQuery("select ItemName,Quantity  from lubricants where Quantity <= "+lqty+" ");
            jTable4.setModel(DbUtils.resultSetToTableModel(rs3));
        }
        catch(Exception e){
            
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

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        dateChooserCombo3 = new datechooser.beans.DateChooserCombo();
        jLabel20 = new javax.swing.JLabel();
        dateChooserCombo4 = new datechooser.beans.DateChooserCombo();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        dateChooserCombo5 = new datechooser.beans.DateChooserCombo();
        jLabel23 = new javax.swing.JLabel();
        dateChooserCombo6 = new datechooser.beans.DateChooserCombo();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        dateChooserCombo7 = new datechooser.beans.DateChooserCombo();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Type");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Spare Parts", "Lubricants", "Mahindra", "Piaggio" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Get Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Select Time Period");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("To");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("From");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 204));
        jButton5.setText("Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(350, 220));

        dateChooserCombo2.setCalendarPreferredSize(new java.awt.Dimension(350, 220));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(144, 144, 144)))
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dateChooserCombo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 690, 140));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemId", "ItemName", "StockPurchases", "Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 970, 200));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48home.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 60, -1));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout 1.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 60, -1));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48exit.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 530));

        jTabbedPane1.addTab("Purchases", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Type");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "SpareParts", "Lubricants", "Threewheeler" }));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Get Sales");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Report");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Select Time Period");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("To");

        dateChooserCombo3.setCalendarPreferredSize(new java.awt.Dimension(350, 220));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("From");

        dateChooserCombo4.setCalendarPreferredSize(new java.awt.Dimension(350, 220));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(dateChooserCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChooserCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6)
                        .addComponent(jButton2))
                    .addComponent(dateChooserCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 760, 110));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemNo", "ItemName", "Sales", "Revenue"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 950, 230));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48home.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 60, -1));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout 1.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 60, -1));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48exit.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 60, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 530));

        jTabbedPane1.addTab("Sales", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel11.setForeground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Sales");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("SpareParts");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Lubricants");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Expenditure");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Total");

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(204, 204, 204));

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(204, 204, 204));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Profit");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Calulate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(204, 204, 204));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Calculate Profit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Vehicle");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 204, 204));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(190, 190, 190))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton4))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 580, 400));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Select Time Period");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 130, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("To");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 30, 30));

        dateChooserCombo5.setCalendarPreferredSize(new java.awt.Dimension(350, 220));
        jPanel5.add(dateChooserCombo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("From");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        dateChooserCombo6.setCalendarPreferredSize(new java.awt.Dimension(350, 220));
        jPanel5.add(dateChooserCombo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 204));
        jButton7.setText("GetDetails");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 30));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(204, 204, 204));
        jButton11.setText("Report");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 530));

        jTabbedPane1.addTab("Profit", jPanel5);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Re-Order Level Reached Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Spare Parts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(204, 204, 204));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lubricants", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 204, 204));
        jButton8.setText("Report");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton8)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton8)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 450));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Stock Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemNo", "Item Name", "Available Quantity"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(204, 204, 204));
        jButton10.setText("Report");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(46, 46, 46))
        );

        jPanel12.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 670, 340));

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Search");

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 204, 204));
        jButton9.setText("Get Details");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search", "SpareParts", "Lubricants" }));

        dateChooserCombo7.setCalendarPreferredSize(new java.awt.Dimension(350, 220));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(58, 58, 58)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(118, 118, 118))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(dateChooserCombo7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateChooserCombo7, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addContainerGap())
        );

        jPanel12.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 670, 110));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel12.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 488));

        jTabbedPane1.addTab("Stock Report", jPanel12);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 289, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //Stock Details
        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            if(jComboBox3.getSelectedItem().equals("SpareParts")){
                ResultSet rs = s.executeQuery("SELECT  `ItemID`, `ItemName`, `Quanty`  FROM `subpartname ");
                jTable5.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(jComboBox3.getSelectedItem().equals("Lubricants")){
                ResultSet rs = s.executeQuery("SELECT  `ItemName`, `Amount_L`, `Quantity` FROM `lubricants`");
                jTable5.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Please select Type");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // Stcok reports of Relavant Date
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("StockReport "+dateChooserCombo7.getText()+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            Document document = new Document(PageSize.A4, 50, 50, 140, 140);

            //Creation of PdfWriter object
            try {

                PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream(filePath));
                document.open();
                writer.setPageEvent(new MyPdfPageEventHelper("Service.png"));
            } catch (Exception e) {
                System.out.println(e);
            }

            Paragraph title2 = new Paragraph("Stock Report",
                FontFactory.getFont(FontFactory.HELVETICA,
                    18, Font.ITALIC, new CMYKColor(75, 68, 67,90)));
            Chapter chapter2 = new Chapter(title2, 1);
            Paragraph title = new Paragraph("Date : "+dateChooserCombo7.getText(),
                FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));

            try {
                title2.setAlignment(Element.ALIGN_CENTER);
                document.add(title2);

                PdfPTable t = new PdfPTable(3);
                t.setSpacingBefore(5);
                t.setSpacingAfter(5);

                if(!jComboBox3.getSelectedItem().equals("Select")){
                    Paragraph title3 = new Paragraph("Item Type : "+jComboBox3.getSelectedItem().toString(),
                        FontFactory.getFont(FontFactory.HELVETICA,
                            14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));

                    //chapter1.setNumberDepth(0);
                    document.add(title);

                    t.addCell("ItemNo");
                    t.addCell("Item Name");
                    t.addCell("Amount");

                    for(int i = 0; i < jTable5.getRowCount(); i++ ){
                        String ItemNo = jTable5.getValueAt(i, 0).toString();
                        String ItemName = jTable5.getValueAt(i, 1).toString();
                        String amnt = jTable5.getValueAt(i, 2).toString();

                        t.addCell(ItemNo);
                        t.addCell(ItemName);
                        t.addCell(amnt);

                    }
                    document.add(title3);
                    document.add(Chunk.NEWLINE);

                    document.add(t);
                    document.close();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Re-Order level Report

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("ReOrder Report "+dateChooserCombo7.getText()+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            Document document = new Document(PageSize.A4, 50, 50, 140, 140);

            //Creation of PdfWriter object
            try {

                PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream(filePath));
                document.open();
                writer.setPageEvent(new MyPdfPageEventHelper("Service.png"));
            } catch (Exception e) {
                System.out.println(e);
            }

            Paragraph title2 = new Paragraph("Re-Order Report",
                FontFactory.getFont(FontFactory.HELVETICA,
                    18, Font.ITALIC, new CMYKColor(75, 68, 67,90)));
            Chapter chapter2 = new Chapter(title2, 1);
            Paragraph title = new Paragraph("Date : "+dateChooserCombo7.getText(),
                FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));

            try {
                title2.setAlignment(Element.ALIGN_CENTER);
                document.add(title2);

                PdfPTable t = new PdfPTable(2);
                t.setSpacingBefore(5);
                t.setSpacingAfter(5);

                PdfPTable t1 = new PdfPTable(2);
                t1.setSpacingBefore(5);
                t1.setSpacingAfter(5);

                Paragraph title3 = new Paragraph("Item Type : Spare Parts",
                    FontFactory.getFont(FontFactory.HELVETICA,
                        14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));
                Paragraph title4 = new Paragraph("Item Type : Lubricants",
                    FontFactory.getFont(FontFactory.HELVETICA,
                        14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));
                Chapter chapter3 = new Chapter(title3, 1);
                //chapter1.setNumberDepth(0);
                document.add(title);

                //t1.addCell("ItemNo");
                t.addCell("Item Name");
                t.addCell("Amount");

                t1.addCell("Item Name");
                t1.addCell("Amount");

                for(int i = 0; i < jTable3.getRowCount(); i++ ){
                    String ItemName = jTable3.getValueAt(i, 0).toString();
                    String amnt = jTable3.getValueAt(i, 1).toString();

                    //t1.addCell(orderID);
                    t.addCell(ItemName);
                    t.addCell(amnt);

                }
                document.add(title3);
                document.add(Chunk.NEWLINE);

                document.add(t);
                for(int i = 0; i < jTable4.getRowCount(); i++ ){
                    String ItemName = jTable4.getValueAt(i, 0).toString();
                    String amnt = jTable4.getValueAt(i, 1).toString();

                    t1.addCell(ItemName);
                    t1.addCell(amnt);

                }

                document.add(Chunk.NEWLINE);
                document.add(title4);
                document.add(Chunk.NEWLINE);
                document.add(t1);
                document.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // Profit Report
        String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Profit "+dateChooserCombo5.getText()+" , "+dateChooserCombo6.getText()+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            Document document = new Document(PageSize.A4, 50, 50, 140, 140);
            try {

                PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream(filePath));
                document.open();
                writer.setPageEvent(new MyPdfPageEventHelper("Service.png"));
            } catch (Exception e) {
                System.out.println(e);
            }
            Paragraph title2 = new Paragraph("PROFIT DETAILS",
                FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    20, Font.BOLDITALIC, new CMYKColor(75, 68, 67,90)));
            Chapter chapter2 = new Chapter(title2, 1);
            Paragraph title = new Paragraph("To : "+dateChooserCombo5.getText()+"                                                                                  From : "+dateChooserCombo6.getText(),
                FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));

            Paragraph title5 = new Paragraph("Issued Date : "+today,
                FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    12, Font.NORMAL, new CMYKColor(75, 68, 67,90)));
            try {
                //document.add(this.getPara ("Issued Date: "+today));
                title5.setAlignment(Element.ALIGN_RIGHT);
                document.add(title5);
                title2.setAlignment(Element.ALIGN_CENTER);
                document.add(title2);
                document.add(Chunk.NEWLINE);
                document.add(title);
                document.add(Chunk.NEWLINE);
                PdfPTable t = new PdfPTable(3);
                t.setSpacingBefore(5);
                t.setSpacingAfter(5);

                Font blackFont = new Font(Font.FontFamily.TIMES_ROMAN,16,Font.BOLD,BaseColor.BLACK);

                Phrase sect= new Phrase("Sections",blackFont);
                Phrase incom = new Phrase("Income (Rs)",blackFont);
                Phrase expens = new Phrase("Expenses (Rs)",blackFont);
                Phrase spr = new Phrase("Spare Parts",blackFont);
                Phrase lubs = new Phrase("Lubricants",blackFont);
                Phrase veh = new Phrase("Vehicles",blackFont);
                Phrase tot= new Phrase("TOTAL",blackFont);

                t.addCell(sect);t.addCell(incom);t.addCell(expens);
                t.addCell(spr);t.addCell(jTextField1.getText());t.addCell(jTextField1.getText());
                t.addCell(lubs);t.addCell(jTextField3.getText());t.addCell(jTextField4.getText());
                t.addCell(veh);t.addCell(jTextField5.getText());t.addCell(jTextField6.getText());
                t.addCell(tot);t.addCell(jTextField9.getText());t.addCell(jTextField10.getText());

                document.add(t);
                document.add(Chunk.NEWLINE);
                Phrase prof=new Phrase("NET PROFIT : Rs."+jTextField11.getText(),blackFont);

                document.add(prof);
                document.close();

            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Sales purchases details

        //Calculate Sales
        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();

            //-----------------Spareaprts----------
            Double salessape = 0.00;
            ResultSet rs = s.executeQuery("Select TotalCost  from salesspare where Date between '"+dateChooserCombo5.getText()+"' and '"+dateChooserCombo6.getText()+"' ");
            while(rs.next()){
                String spare = rs.getString("TotalCost");
                salessape = salessape + Double.parseDouble(spare);
            }
            String totalspare = Double.toString(salessape);
            jTextField1.setText(totalspare);

            //-----------------lubricants----------
            double saleslub = 0.00;
            ResultSet rs1 = s.executeQuery("Select Total  from salesslub where Date between '"+dateChooserCombo5.getText()+"' and '"+dateChooserCombo6.getText()+"'");
            while(rs1.next()){
                String lub = rs1.getString("Total");
                saleslub = saleslub + Double.parseDouble(lub);
            }
            String totallub = Double.toString(saleslub);
            jTextField3.setText(totallub);

            //Vehicle Sales
            double salesvehicle = 0.00;
            ResultSet rs4 = s.executeQuery("Select Total  from vehiclesales where Date between '"+dateChooserCombo5.getText()+"' and '"+dateChooserCombo6.getText()+"'");
            while(rs4.next()){
                String vehicle = rs4.getString("Total");
                salesvehicle = salesvehicle + Double.parseDouble(vehicle);
            }
            String vehisales = Double.toString(salesvehicle);
            jTextField5.setText(vehisales);

            //Expenditure
            //------------SapareParts-----------------
            Double expspare = 0.00;
            ResultSet rs2 = s.executeQuery("Select TotalAmount  from purchasedetails where OrderDate between '"+dateChooserCombo5.getText()+
                "' and '"+dateChooserCombo6.getText()+"'");
            while(rs2.next()){
                String spare = rs2.getString("TotalAmount");
                expspare = expspare + Double.parseDouble(spare);
            }
            String totalexpspare = Double.toString(expspare);
            jTextField2.setText(totalexpspare);

            //------------Lubricants-----------------
            Double explub = 0.00;
            ResultSet rs3 = s.executeQuery("Select TotalAmount  from purchasedetailslub where OrderDate between '"+dateChooserCombo5.getText()+"' and '"+dateChooserCombo6.getText()+"'");
            while(rs3.next()){
                String lub = rs3.getString("TotalAmount");
                explub = explub + Double.parseDouble(lub);
            }
            String totalexplub = Double.toString(explub);
            jTextField4.setText(totalexplub);

            //expendiutres mahindra piaggio
            Double expmahindra = 0.00;
            Double exppiaggio = 0.00;
            ResultSet rs5 = s.executeQuery("Select Price  from mahindra where Date between '"+dateChooserCombo5.getText()+"' and '"+dateChooserCombo6.getText()+"'");
            while(rs5.next()){
                String expM = rs5.getString("Price");
                expmahindra = expmahindra + Double.parseDouble(expM);
            }
            ResultSet rs6 = s.executeQuery("Select Price  from mahindra where Date between '"+dateChooserCombo5.getText()+"' and '"+dateChooserCombo6.getText()+"'");
            while(rs6.next()){
                String expP = rs6.getString("Price");
                exppiaggio = exppiaggio + Double.parseDouble(expP);
            }
            Double Total = expmahindra + exppiaggio;
            String totalexpM = Double.toString(Total);
            jTextField6.setText(totalexpM);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Profit
        double sales = Double.parseDouble(jTextField9.getText());
        double exp = Double.parseDouble(jTextField10.getText());
        double profit = sales - exp;

        if(profit < 0){
            jTextField11.setForeground(Color.red);
            jTextField11.setText(Double.toString(profit));
        }
        else{
            jTextField11.setText(Double.toString(profit));
        }

        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            s.executeUpdate("INSERT INTO Profit (To_Date, From_Date, Sales, Expenditure,Profit) values('" + dateChooserCombo5.getText() + "','"+  dateChooserCombo6.getText() +" ','" + jTextField9.getText() + "','"+jTextField10.getText()+"','"+jTextField11.getText()+"')");
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Calculations
        double sales1 = Double.parseDouble(jTextField1.getText());
        double sales2 = Double.parseDouble(jTextField3.getText());
        double sales3 = Double.parseDouble(jTextField5.getText());
        double exp1 = Double.parseDouble(jTextField2.getText());
        double exp2 = Double.parseDouble(jTextField4.getText());
        double exp3 = Double.parseDouble(jTextField6.getText());
        double totalsales = sales1 + sales2 + sales3;
        double totalexp = exp1 + exp2 + exp3;

        jTextField9.setText(Double.toString(totalsales));
        jTextField10.setText(Double.toString(totalexp));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Log out ? ");
        if(x== 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // report

        String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Sales between "+dateChooserCombo3.getText()+" , "+dateChooserCombo4.getText()+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            Document document = new Document(PageSize.A4, 50, 50, 140, 140);

            //Creation of PdfWriter object
            try {

                PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream(filePath));
                document.open();
                writer.setPageEvent(new MyPdfPageEventHelper("Service.png"));
            } catch (Exception e) {
                System.out.println(e);
            }

            Paragraph title2 = new Paragraph("SALES DETAILS",
                FontFactory.getFont(FontFactory.HELVETICA,
                    18, Font.ITALIC, new CMYKColor(75, 68, 67,90)));
            Chapter chapter2 = new Chapter(title2, 1);
            Paragraph title = new Paragraph("To : "+dateChooserCombo3.getText()+"                                                                                  From : "+dateChooserCombo4.getText(),
                FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));
            Paragraph title5 = new Paragraph("Issued Date : "+today,
                FontFactory.getFont(FontFactory.TIMES_ROMAN,
                    12, Font.NORMAL, new CMYKColor(75, 68, 67,90)));
            try {
                title5.setAlignment(Element.ALIGN_RIGHT);
                document.add(title5);
                title2.setAlignment(Element.ALIGN_CENTER);
                document.add(title2);

                PdfPTable t = new PdfPTable(5);
                t.setSpacingBefore(5);
                t.setSpacingAfter(5);

                PdfPTable t1 = new PdfPTable(5);
                t1.setSpacingBefore(5);
                t1.setSpacingAfter(5);

                PdfPTable t2 = new PdfPTable(4);
                t2.setSpacingBefore(5);
                t2.setSpacingAfter(5);

                if(jComboBox2.getSelectedItem() == "SpareParts")   {
                    Paragraph title3 = new Paragraph("Item Type : Spare Parts",
                        FontFactory.getFont(FontFactory.HELVETICA,
                            14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));
                    Chapter chapter3 = new Chapter(title3, 1);
                    //chapter1.setNumberDepth(0);
                    document.add(title);
                    document.add(Chunk.NEWLINE);
                    document.add(title3);

                    //t1.addCell("ItemNo");
                    t1.addCell("Item Name");
                    t1.addCell("Date");
                    t1.addCell("Units");
                    t1.addCell("Unit Cost(Rs)");
                    t1.addCell("Total Cost(Rs)");
                    document.add(Chunk.NEWLINE);

                    for(int i = 0; i < jTable2.getRowCount(); i++ ){
                        //String orderID = jTable2.getValueAt(i, 0).toString();
                        String ItemName = jTable2.getValueAt(i, 1).toString();
                        String d = jTable2.getValueAt(i, 2).toString();
                        String units = jTable2.getValueAt(i, 3).toString();
                        String ucost = jTable2.getValueAt(i, 4).toString();
                        String tcost = jTable2.getValueAt(i, 5).toString();

                        //t1.addCell(orderID);
                        t1.addCell(ItemName);
                        t1.addCell(d);
                        t1.addCell(units);
                        t1.addCell(ucost);
                        t1.addCell(tcost);

                    }
                    document.add(t1);
                }
                else if(jComboBox2.getSelectedItem() == "Lubricants")   {
                    Paragraph title3 = new Paragraph(" Item Type : Lubricants",
                        FontFactory.getFont(FontFactory.HELVETICA,
                            14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));
                    Chapter chapter3 = new Chapter(title3, 1);
                    //chapter1.setNumberDepth(0);
                    document.add(title);
                    document.add(Chunk.NEWLINE);
                    document.add(title3);
                    document.add(new Paragraph(""));

                    t.addCell("OrderId");
                    t.addCell("Item Name");
                    t.addCell("Date");
                    t.addCell("Amount");
                    t.addCell("Units");
                    t.addCell("Unit Cost(Rs)");
                    t.addCell("Total Cost(Rs)");

                    for(int i = 0; i < jTable2.getRowCount(); i++ ){
                        String orderID = jTable2.getValueAt(i, 0).toString();
                        String ItemName = jTable2.getValueAt(i, 1).toString();
                        String d = jTable2.getValueAt(i, 2).toString();
                        String amnt= jTable2.getValueAt(i, 3).toString();
                        String units = jTable2.getValueAt(i, 4).toString();
                        String ucost= jTable2.getValueAt(i, 5).toString();
                        String tcost = jTable2.getValueAt(i, 6).toString();

                        t.addCell(orderID);
                        t.addCell(ItemName);
                        t.addCell(d);
                        t.addCell(amnt);
                        t.addCell(units);
                        t.addCell(ucost);
                        t.addCell(tcost);

                    }
                    document.add(t);
                }
                else if(jComboBox2.getSelectedItem() == "Threewheeler")   {
                    Paragraph title3 = new Paragraph(" Item Type : Threewheeler",
                        FontFactory.getFont(FontFactory.HELVETICA,
                            14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));
                    Chapter chapter3 = new Chapter(title3, 1);
                    //chapter1.setNumberDepth(0);
                    document.add(title);
                    document.add(Chunk.NEWLINE);
                    document.add(title3);
                    document.add(new Paragraph(""));

                    t2.addCell("BillNo");
                    t2.addCell("Vehicle Details");
                    t2.addCell("Date");
                    t2.addCell("Amount");

                    for(int i = 0; i < jTable2.getRowCount(); i++ ){
                        String orderID = jTable2.getValueAt(i, 0).toString();
                        String Vdes = jTable2.getValueAt(i, 1).toString();
                        String d = jTable2.getValueAt(i, 2).toString();
                        String amnt= jTable2.getValueAt(i, 3).toString();

                        t2.addCell(orderID);
                        t2.addCell(Vdes);
                        t2.addCell(d);
                        t2.addCell(amnt);

                    }
                    document.add(t2);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Please Select Type to Generate Report");
                }
                //document.add(t);
                document.close();
            }
            catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox2.getSelectedItem() == "Select"){
            JOptionPane.showMessageDialog(rootPane, "Please Select Type");
        }
        else if(jComboBox2.getSelectedItem() == "SpareParts"){
            try{
                Connection c = DB.mycon();
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery("Select *  from salesspare where Date between '"+dateChooserCombo3.getText()+"' and "
                        + "'"+dateChooserCombo4.getText()+"' ");
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(jComboBox2.getSelectedItem() == "Lubricants"){
            try{
                Connection c = DB.mycon();
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery("Select *  from salesslub where Date between '"+dateChooserCombo3.getText()+"' and '"+dateChooserCombo4.getText()+"'");
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(jComboBox2.getSelectedItem() == "Threewheeler"){
            try{
                Connection c = DB.mycon();
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery("Select BillNo,VehicleDetails,Date,Total  from vehiclesales where Date between '"+dateChooserCombo3.getText()+"' and '"+dateChooserCombo4.getText()+"'");
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Log out ? ");
        if(x== 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Report Generate
        String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("purchases of "+ jComboBox1.getSelectedItem().toString() +" between "+dateChooserCombo1.getText()+" , "+dateChooserCombo2.getText()+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
            Document document = new Document(PageSize.A4,50, 20, 140,140);

            //Creation of PdfWriter object
            try {

                PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream(filePath));
                document.open();
                writer.setPageEvent(new MyPdfPageEventHelper("Service.png"));
            } catch (Exception e) {
                System.out.println(e);
            }

            try {

                document.add(Chunk.NEWLINE);
                Paragraph title1 = new Paragraph("PURCHASE DETAILS",
                    FontFactory.getFont(FontFactory.TIMES_ROMAN,
                        18, Font.ITALIC, new CMYKColor(75, 68, 67,90)));
                Chapter chapter1 = new Chapter(title1, 1);
                chapter1.setNumberDepth(0);
                Paragraph title2 = new Paragraph("To : "+dateChooserCombo1.getText()+"                                                                                  From : "+dateChooserCombo2.getText(),
                    FontFactory.getFont(FontFactory.TIMES_ROMAN,
                        14, Font.NORMAL, new CMYKColor(75, 68, 67,90)));
                Chapter chapter2 = new Chapter(title1, 1);
                chapter1.setNumberDepth(0);

                chapter1.setNumberDepth(0);
                Paragraph title5 = new Paragraph("Issued Date : "+today,
                    FontFactory.getFont(FontFactory.TIMES_ROMAN,
                        12, Font.NORMAL, new CMYKColor(75, 68, 67,90)));

                title5.setAlignment(Element.ALIGN_RIGHT);
                document.add(title5);
                title1.setAlignment(Element.ALIGN_CENTER);
                document.add(title1);
                document.add(Chunk.NEWLINE);
                document.add(title2);
                PdfPTable t = new PdfPTable(6);
                PdfPTable t1 = new PdfPTable(7);
                PdfPTable t2 = new PdfPTable(4);
                t.setSpacingBefore(5);
                t.setSpacingAfter(5);

                t1.setSpacingBefore(5);
                t1.setSpacingAfter(5);

                t2.setSpacingBefore(5);
                t2.setSpacingAfter(5);

                if(jComboBox1.getSelectedItem() == "Spare Parts")
                {
                    //dialog.setSelectedFile(new File("spareparts.pdf"));
                    document.add(new Paragraph(" "));
                    Paragraph title3 = new Paragraph("Item Type : Spare Parts",
                        FontFactory.getFont(FontFactory.HELVETICA,
                            14, Font.ITALIC, new CMYKColor(75, 68, 67,90)));
                    Chapter chapter3 = new Chapter(title3, 1);
                    chapter1.setNumberDepth(0);
                    document.add(title3);
                    document.add(Chunk.NEWLINE);
                    t.addCell("OrderId");
                    t.addCell("Item Name");
                    //t.addCell("ModelID");
                    t.addCell("Order Date");
                    //t.addCell("Supplier Name");
                    t.addCell("Unit Cost(Rs)");
                    t.addCell("Units");
                    t.addCell("Total Cost(Rs)");

                    for(int i = 0; i < jTable1.getRowCount(); i++ ){
                        String orderID = jTable1.getValueAt(i, 0).toString();
                        String ItemName = jTable1.getValueAt(i, 1).toString();
                        //String model= jTable1.getValueAt(i, 2).toString();
                        String d = jTable1.getValueAt(i, 3).toString();
                        //String suppName = jTable1.getValueAt(i, 4).toString();
                        String ucost = jTable1.getValueAt(i, 5).toString();
                        String units = jTable1.getValueAt(i, 6).toString();
                        String tcost = jTable1.getValueAt(i, 7).toString();

                        t.addCell(orderID);
                        t.addCell(ItemName);
                        //t.addCell(model);
                        t.addCell(d);
                        //t.addCell(suppName);
                        t.addCell(ucost);
                        t.addCell(units);
                        t.addCell(tcost);

                    }
                    document.add(t1);
                    //title7.setAlignment(Element.ALIGN_BOTTOM);
                    //document.add(title7);
                }
                else if(jComboBox1.getSelectedItem() == "Lubricants")
                {
                    document.add(new Paragraph(" "));
                    // dialog.setSelectedFile(new File("lubricants.pdf"));
                    Paragraph title3 = new Paragraph("Item Type : Lubricants",
                        FontFactory.getFont(FontFactory.HELVETICA,
                            14, Font.ITALIC, new CMYKColor(75, 68, 67,90)));
                    Chapter chapter3 = new Chapter(title3, 1);
                    chapter1.setNumberDepth(0);
                    document.add(title3);
                    document.add(new Paragraph(""));

                    t1.addCell("OrderId");
                    t1.addCell("Item Name");
                    //t1.addCell("Brand");
                    t1.addCell("Amount");
                    t1.addCell("Order Date");
                    //t1.addCell("Supplier Name");
                    t1.addCell("Unit Cost(Rs)");
                    t1.addCell("Units");
                    t1.addCell("Total Cost(Rs)");

                    for(int i = 0; i < jTable1.getRowCount(); i++ ){
                        String orderID = jTable1.getValueAt(i, 0).toString();
                        String ItemName = jTable1.getValueAt(i, 1).toString();
                        //String brand= jTable1.getValueAt(i, 2).toString();
                        String amnt= jTable1.getValueAt(i, 3).toString();
                        String d = jTable1.getValueAt(i, 4).toString();
                        //String suppName = jTable1.getValueAt(i, 5).toString();
                        String ucost= jTable1.getValueAt(i, 6).toString();
                        String units = jTable1.getValueAt(i, 7).toString();
                        String tcost = jTable1.getValueAt(i, 8).toString();

                        t1.addCell(orderID);
                        t1.addCell(ItemName);
                        //t1.addCell(brand);
                        t1.addCell(amnt);
                        t1.addCell(d);
                        //t1.addCell(suppName);
                        t1.addCell(ucost);
                        t1.addCell(units);
                        t1.addCell(tcost);

                    }
                    document.add(t1);
                }
                else if(jComboBox1.getSelectedItem() == "Mahindra")
                {
                    document.add(new Paragraph(" "));
                    // dialog.setSelectedFile(new File("lubricants.pdf"));
                    Paragraph title3 = new Paragraph("Vehicle Brand : Mahindra",
                        FontFactory.getFont(FontFactory.HELVETICA,
                            14, Font.ITALIC, new CMYKColor(75, 68, 67,90)));
                    Chapter chapter3 = new Chapter(title3, 1);
                    chapter1.setNumberDepth(0);
                    document.add(title3);
                    document.add(new Paragraph(""));

                    t2.addCell("Model");
                    t2.addCell("Year");
                    t2.addCell("Price");
                    t2.addCell("Date");

                    for(int i = 0; i < jTable1.getRowCount(); i++ ){
                        String mdl = jTable1.getValueAt(i, 0).toString();
                        String year = jTable1.getValueAt(i, 1).toString();
                        String p= jTable1.getValueAt(i, 2).toString();
                        String d= jTable1.getValueAt(i, 3).toString();

                        t2.addCell(mdl);
                        t2.addCell(year);
                        t2.addCell(p);
                        t2.addCell(d);

                    }
                    document.add(t2);
                }
                else if(jComboBox1.getSelectedItem() == "Piaggio")
                {
                    document.add(new Paragraph(" "));
                    // dialog.setSelectedFile(new File("lubricants.pdf"));
                    Paragraph title3 = new Paragraph("Vehicle Brand : Piaggio",
                        FontFactory.getFont(FontFactory.HELVETICA,
                            14, Font.ITALIC, new CMYKColor(75, 68, 67,90)));
                    Chapter chapter3 = new Chapter(title3, 1);
                    chapter1.setNumberDepth(0);
                    document.add(title3);
                    document.add(new Paragraph(""));

                    t2.addCell("Model");
                    t2.addCell("Year");
                    t2.addCell("Price");
                    t2.addCell("Date");

                    for(int i = 0; i < jTable1.getRowCount(); i++ ){
                        String mdl = jTable1.getValueAt(i, 0).toString();
                        String year = jTable1.getValueAt(i, 1).toString();
                        String p= jTable1.getValueAt(i, 2).toString();
                        String d= jTable1.getValueAt(i, 3).toString();

                        t2.addCell(mdl);
                        t2.addCell(year);
                        t2.addCell(p);
                        t2.addCell(d);

                    }
                    document.add(t2);
                }

                else{
                    JOptionPane.showMessageDialog(rootPane, "Please Select Type to Generate Report");
                }
                document.add(t);
                document.close();
            }
            catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //purchases details
        if(jComboBox1.getSelectedItem() == "Select"){
            JOptionPane.showMessageDialog(rootPane, "Please Select Type");
        }
        else if(jComboBox1.getSelectedItem() == "Spare Parts"){
            try{
                Connection c = DB.mycon();
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery("Select *  from purchasedetails where OrderDate between '"+dateChooserCombo1.getText()+"' and '"+dateChooserCombo2.getText()+"' ");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        else if(jComboBox1.getSelectedItem() == "Lubricants"){
            try{
                Connection c = DB.mycon();
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery("Select *  from purchasedetailslub where OrderDate between '"+dateChooserCombo1.getText()+"' and '"+dateChooserCombo2.getText()+"' ");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        else if(jComboBox1.getSelectedItem() == "Mahindra"){
            try{
                Connection c = DB.mycon();
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery("SELECT  `Model`, `Year`, `Price`, `Date` FROM `mahindra` where Date between '"+dateChooserCombo1.getText()+"' and '"+dateChooserCombo2.getText()+"' ");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(jComboBox1.getSelectedItem() == "Piaggio"){
            try{
                Connection c = DB.mycon();
                Statement s = c.createStatement();
                ResultSet rs = s.executeQuery("SELECT  `Model`, `Year`, `Price`, `Date` FROM `threewheeler` where Date between '"+dateChooserCombo1.getText()+"' and '"+dateChooserCombo2.getText()+"' ");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //purchases details

    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private datechooser.beans.DateChooserCombo dateChooserCombo3;
    private datechooser.beans.DateChooserCombo dateChooserCombo4;
    private datechooser.beans.DateChooserCombo dateChooserCombo5;
    private datechooser.beans.DateChooserCombo dateChooserCombo6;
    private datechooser.beans.DateChooserCombo dateChooserCombo7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
