/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jayanthaservicecenter;

import DBconnection.DB;
import java.awt.Color;
import Validations.SQLHandler;
import Validations.Validations;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Ravindu
 */
public class Vehicles extends javax.swing.JFrame {

    
    
    public Vehicles() {
        initComponents();
        jPanel6.setBackground(new Color(0,0,0,170));
        jPanel11.setBackground(new Color(0,0,0,170));
        jPanel14.setBackground(new Color(0,0,0,170));
        jPanel15.setBackground(new Color(0,0,0,170));
        jPanel8.setBackground(new Color(0,0,0,170));
        jPanel2.setBackground(new Color(0,0,0,170));
        jPanel3.setBackground(new Color(0,0,0,170));
        jPanel12.setBackground(new Color(0,0,0,170));
        jTabbedPane1.setBackground(new Color(0,0,0,64));
        jTextField1.setBackground(new Color(0,0,0,200));
       // jTextField10.setBackground(new Color(0,0,0,64));
       // jTextField11.setBackground(new Color(0,0,0,64));
        jTextField2.setBackground(new Color(0,0,0,200));
        jTextField3.setBackground(new Color(0,0,0,200));
        jTextField4.setBackground(new Color(0,0,0,200));
        jTextField5.setBackground(new Color(0,0,0,200));
        jTextField6.setBackground(new Color(0,0,0,64));
        jTextField7.setBackground(new Color(0,0,0,64));
        jTextField8.setBackground(new Color(0,0,0,64));
        jTextField9.setBackground(new Color(0,0,0,64));
       //jTextField10.setBackground(new Color(0,0,0,64));
        jTextField13.setBackground(new Color(0,0,0,200));
       // jTextField14.setBackground(new Color(0,0,0,200));
        jTextField15.setBackground(new Color(0,0,0,200));
        jTextField16.setBackground(new Color(0,0,0,200));
        jTextField17.setBackground(new Color(0,0,0,200));
        jTextField18.setBackground(new Color(0,0,0,200));
        jTextField19.setBackground(new Color(0,0,0,200));
        jTextField20.setBackground(new Color(0,0,0,200));
        jTextField21.setBackground(new Color(0,0,0,200));
        jTextField22.setBackground(new Color(0,0,0,200));
        jTextField23.setBackground(new Color(0,0,0,200));
        jTextField24.setBackground(new Color(0,0,0,200));
        jTextField25.setBackground(new Color(0,0,0,200));
        jTextField26.setBackground(new Color(0,0,0,200));
        jTextField27.setBackground(new Color(0,0,0,200));
        jTextField28.setBackground(new Color(0,0,0,200));
        jTextField29.setBackground(new Color(0,0,0,200));
        jTextField30.setBackground(new Color(0,0,0,200));
        
       
        jButton1.setBackground(new Color(0,0,0,64));
        jButton2.setBackground(new Color(0,0,0,64));
        jButton3.setBackground(new Color(0,0,0,64));
        jButton4.setBackground(new Color(0,0,0,64));
        jButton5.setBackground(new Color(0,0,0,64));
        jButton6.setBackground(new Color(0,0,0,64));
        jButton7.setBackground(new Color(0,0,0,64));
        jButton7.setBackground(new Color(0,0,0,64));
        jButton8.setBackground(new Color(0,0,0,64));
        jButton9.setBackground(new Color(0,0,0,64));
        jButton10.setBackground(new Color(0,0,0,64));
        jButton11.setBackground(new Color(0,0,0,64));
        jButton12.setBackground(new Color(0,0,0,64));
        jButton13.setBackground(new Color(0,0,0,64));
       // jButton14.setBackground(new Color(0,0,0,64));
       // jButton15.setBackground(new Color(0,0,0,64));
        jButton16.setBackground(new Color(0,0,0,64));
        jButton17.setBackground(new Color(0,0,0,64));
        jButton18.setBackground(new Color(0,0,0,64));
        jButton19.setBackground(new Color(0,0,0,64));
        jButton20.setBackground(new Color(0,0,0,64));
        jButton21.setBackground(new Color(0,0,0,64));
        
        SQLHandler sql = new SQLHandler(); //create new object
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        dateChooserCombo1.setDateFormat(sdf);
        dateChooserCombo2.setDateFormat(sdf);
        dateChooserCombo3.setDateFormat(sdf);
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        dateChooserCombo3 = new datechooser.beans.DateChooserCombo();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jLabel29 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VEHICLE");
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setForeground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true), "Insert", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setText("Mahindra");
        jRadioButton1.setToolTipText("");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("Piaggio");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Chassie Number ");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 204, 204));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Model");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Ape", " " }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Fuel Type");

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Diesel", "Petrol" }));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Color");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Year");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Price");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(204, 204, 204));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(204, 204, 204));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(204, 204, 204));
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        dateChooserCombo3.setCalendarPreferredSize(new java.awt.Dimension(350, 220));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jTextField7))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jTextField8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(jRadioButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel18))
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField6)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField9))))
                .addGap(43, 43, 43))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(dateChooserCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(dateChooserCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 380, 400));

        jPanel9.setOpaque(false);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48home.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout 1.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48exit.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 25, 310, 100));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Search By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(204, 204, 204));
        jPanel12.setOpaque(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Brand");

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mahindra", "Piaggio" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText("Search Type");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Brand", "Color", "Year", "Type" }));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Model");

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 204, 204));
        jLabel42.setText("Color");

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Black", "Blue", "Green", "Red", "Yellow" }));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(204, 204, 204));
        jButton13.setText("Search");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel42)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 46, Short.MAX_VALUE)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addGap(186, 186, 186))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton13)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 500, 260));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Searched Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(204, 204, 204));
        jPanel13.setOpaque(false);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cahssie", "Model", "Color", "Year", "Fuel Type", "Price(Rs)"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 880, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -7, 2446, 720));

        jTabbedPane1.addTab("Purchase Orders", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Customer Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Customer ID");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("xxxx");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Name");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 20));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 300, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("NIC");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 20));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Address");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 300, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Telephone");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel6.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 180, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Date");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 20));

        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(350, 220));
        jPanel6.add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 470, 380));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48home.png"))); // NOI18N
        jButton10.setMaximumSize(new java.awt.Dimension(83, 55));
        jButton10.setPreferredSize(new java.awt.Dimension(83, 55));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(204, 204, 204));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout 1.png"))); // NOI18N
        jButton11.setMaximumSize(new java.awt.Dimension(83, 55));
        jButton11.setPreferredSize(new java.awt.Dimension(83, 55));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 70, -1));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48exit.png"))); // NOI18N
        jButton12.setMaximumSize(new java.awt.Dimension(83, 55));
        jButton12.setPreferredSize(new java.awt.Dimension(83, 55));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 60, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 350, 90));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Tables Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel10.setOpaque(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Search By");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "NIC", "Telephone", "Address", "Vehicle"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1260, 110));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 204));
        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Name", "NIC" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 180, 30));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel10.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 150, 30));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1300, 190));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Vehicle Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Chassie No");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 230, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Brand");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Model");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 20));

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 230, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Fuel Type");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 230, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Year");
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, 20));

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 230, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Color");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 230, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Price");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 60, 20));

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 230, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Engine No");
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(204, 204, 204));
        jPanel11.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 230, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 204, 204));
        jButton8.setText("Select");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 204, 204));
        jButton9.setText("Reset");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        jComboBox8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Piaggio", "Mahindra" }));
        jPanel11.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 230, -1));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 510, 430));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -10, 1460, 750));

        jTabbedPane1.addTab("Registration", jPanel5);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Create Bill", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Bill No");
        jPanel14.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("xxxx");
        jPanel14.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 44, 50, 20));

        dateChooserCombo2.setCalendarPreferredSize(new java.awt.Dimension(350, 220));
        jPanel14.add(dateChooserCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Buyers Name");
        jPanel14.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 81, -1, 23));

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 81, 372, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Contact No");
        jPanel14.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 122, -1, 22));

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(204, 204, 204));
        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField22KeyTyped(evt);
            }
        });
        jPanel14.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 122, 372, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Address");
        jPanel14.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 163, 61, 24));

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 164, 372, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Vehicle Details");
        jPanel14.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, -1, 23));

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 205, 372, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Chassie No");
        jPanel14.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 252, -1, -1));

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 246, 372, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Engine No");
        jPanel14.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 287, 372, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Price");
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 383, 37, 24));

        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 384, 142, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Other");
        jPanel14.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 426, -1, 22));

        jTextField28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 426, 142, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Discount");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 473, 66, -1));

        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 467, 142, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Total");
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 513, 40, -1));

        jTextField30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 510, 142, -1));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(204, 204, 204));
        jButton16.setText("Calculate");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 120, -1));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(204, 204, 204));
        jButton17.setText("Print");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 120, -1));

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(204, 204, 204));
        jButton18.setText("Reset");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 120, -1));

        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 510, 580));

        jPanel4.setOpaque(false);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48home.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(204, 204, 204));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout 1.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48exit.png"))); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 320, 90));

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true), "Bill History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Bill No", "Date", "Vehicle Details", "Total", "Customer", "Contact No"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel15.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 720, 270));

        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 740, 420));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1450, 750));

        jTabbedPane1.addTab("Bill", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 750));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 1570, 1010));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
   
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(" Vehicle Sales "+dateChooserCombo2.getText()+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        Document document = new Document(PageSize.A4, 50, 50, 140, 140);
        
        //Creation of PdfWriter object
        try {
            
            PdfWriter writer = PdfWriter.getInstance(document,
            new FileOutputStream(filePath));
            document.open();
            writer.setPageEvent(new MyPdfPageEventHelper("Service2.png"));
        } catch (Exception e) {
            System.out.println(e);
        }
          
            try {
                
            Paragraph title1 = new Paragraph("Invoice", 
            FontFactory.getFont(FontFactory.TIMES_ROMAN, 
            20, Font.BOLDITALIC, new CMYKColor(75, 68, 67,90)));
            Chapter chapter1 = new Chapter(title1, 1);
            Paragraph title5 = new Paragraph("Issued Date : "+today, 
            FontFactory.getFont(FontFactory.TIMES_ROMAN, 
            12, Font.NORMAL, new CMYKColor(75, 68, 67,90)));
            
            Paragraph title2 = new Paragraph("Bill Details", 
            FontFactory.getFont(FontFactory.TIMES_ROMAN, 
            14, Font.BOLDITALIC, new CMYKColor(75, 68, 67,90)));
            
            Paragraph title3 = new Paragraph("Invoice No : .........", 
            FontFactory.getFont(FontFactory.TIMES_ROMAN, 
            14, Font.BOLDITALIC, new CMYKColor(75, 68, 67,90)));
        
            Paragraph title4 = new Paragraph("Vehicle Details : "+jTextField24.getText(), 
            FontFactory.getFont(FontFactory.TIMES_ROMAN, 
            14, Font.BOLDITALIC, new CMYKColor(75, 68, 67,90)));
            
            title5.setAlignment(Element.ALIGN_RIGHT);
            document.add(title5);
            
            title1.setAlignment(Element.ALIGN_CENTER);
            document.add(title1);
            document.add(Chunk.NEWLINE);
            
            title2.setAlignment(Element.ALIGN_CENTER );
            document.add(title2);
            
            
            title3.setAlignment(Element.ALIGN_LEFT );
            document.add(title3);
            title4.setAlignment(Element.ALIGN_LEFT );
            document.add(title4);
            

      
          Paragraph title6 = new Paragraph("Amount     :" + jTextField27.getText()+" Rs", 
          FontFactory.getFont(FontFactory.TIMES_ROMAN, 
          14, Font.NORMAL, new CMYKColor(75, 68, 67,90))); 
          
          Paragraph title9 = new Paragraph("Other     :" + jTextField28.getText()+" Rs", 
          FontFactory.getFont(FontFactory.TIMES_ROMAN, 
          14, Font.NORMAL, new CMYKColor(75, 68, 67,90))); 
        
          Paragraph title7 = new Paragraph("Discount   :" + jTextField29.getText()+" Rs", 
          FontFactory.getFont(FontFactory.TIMES_ROMAN, 
          14, Font.NORMAL, new CMYKColor(75, 68, 67,90))); 
        
          Paragraph title8 = new Paragraph("Net Amount :" + jTextField30.getText()+" Rs", 
          FontFactory.getFont(FontFactory.TIMES_ROMAN, 
          14, Font.NORMAL, new CMYKColor(75, 68, 67,90))); 
          
          title6.setAlignment(Element.ALIGN_LEFT);
          document.add(title6);
          title9.setAlignment(Element.ALIGN_LEFT);
          document.add(title9);
          title7.setAlignment(Element.ALIGN_LEFT);
          document.add(title7);
          title8.setAlignment(Element.ALIGN_LEFT);
          document.add(title8);

      
            
            }    
        catch (DocumentException ex) {
                Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                
                document.close();
                JOptionPane.showMessageDialog(null, "Report was successfully generated !", "Success !", JOptionPane.INFORMATION_MESSAGE);
              
        }
        
        
        
    }                                        

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {                                     
       try {

            char c = evt.getKeyChar();
            if(Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }                                    

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        try {

            char c = evt.getKeyChar();
            if(!Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }                                    

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {                                     
        try {

            char c = evt.getKeyChar();
            if(!Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // Reset
        jTextField13.setText("");
        jTextField20.setText("");
        jTextField15.setText("");
        jTextField17.setText("");
        jTextField16.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //Select vehicle from the list
        jTextField25.setText(jTextField13.getText());
        jTextField26.setText(jTextField20.getText());
        jTextField24.setText(jComboBox8.getSelectedItem().toString()+" "+jTextField15.getText()+" "+jTextField17.getText()+" "+jTextField16.getText());
            try{    
                if(jComboBox8.getSelectedItem().equals("Piaggio")){
                    Connection c = DB.mycon();
                    Statement s = c.createStatement();
                    s.executeUpdate("DELETE FROM threewheeler WHERE Chassie_No ='" + jTextField13.getText() + "'");
                    //JOptionPane.showMessageDialog(rootPane, "record has been Deleted successfully ");
                }
                else if(jComboBox8.getSelectedItem().equals("Mahindra")){
                    Connection c = DB.mycon();
                    Statement s = c.createStatement();
                    s.executeUpdate("DELETE FROM mahindra WHERE Chassie_No ='" + jTextField13.getText() + "'");
                }
                else if(jComboBox8.getSelectedItem().equals("Mahindra")){
                    JOptionPane.showMessageDialog(rootPane, "You haven't select a Brand ");
                }
            }
            catch(Exception e){
                
            }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Log out ? ");
        if(x== 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // reset
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // add newly entered Items
          String brand = null;
                if(jRadioButton1.isSelected()){
                    brand = jRadioButton1.getText();
                }
                else if(jRadioButton2.isSelected()){
                    brand = jRadioButton2.getText();
                }
                
               else {
                    JOptionPane.showMessageDialog(rootPane, "Please Select one");
                }
        if(!jTextField7.getText().isEmpty() || !jTextField8.getText().isEmpty() || !jTextField9.getText().isEmpty() 
         || !jComboBox2.getSelectedItem().equals("Select") || !jTextField6.getText().isEmpty() || !jComboBox3.getSelectedItem().equals("Select"))
        {
            
            try {
                
               /* Validations valid = new Validations();
                if(valid.validateEmail(jTextField3.getText()) == false){
                    jTextField3.setText("Invalid");
               }*/
                
                
                         //show confirm msg box
                    int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to add this item ? ");

                    if (x == 0) {

                        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        // jDate = sdf.format(jDateChooser.getDate());


                        Connection c = DB.mycon();
                        Statement s = c.createStatement();
                        if(jRadioButton1.getText() == "Mahindra"){
                        s.executeUpdate("INSERT INTO mahindra (`Chassie_No`, `Model`, `Fuel_type`, `Color`, `Year`, `Price`, Date) VALUES ('"+jTextField6.getText()+"', '"+jComboBox2.getSelectedItem()+"', '"+jComboBox3.getSelectedItem()+"', '"+jTextField7.getText()+"', '"+jTextField8.getText()+"', '"+jTextField9.getText()+"','"+dateChooserCombo3.getText()+"')");
                        JOptionPane.showMessageDialog(rootPane, "New Item added to the system");
                        }
                        else if(jRadioButton1.getText() == "threewheeler"){
                        s.executeUpdate("INSERT INTO threewheeler (`Chassie_No`, `Model`, `Fuel_type`, `Color`, `Year`, `Price`, Date) VALUES ('"+jTextField6.getText()+"', '"+jComboBox2.getSelectedItem()+"', '"+jComboBox3.getSelectedItem()+"', '"+jTextField7.getText()+"', '"+jTextField8.getText()+"', '"+jTextField9.getText()+"','"+dateChooserCombo3.getText()+"')");
                        JOptionPane.showMessageDialog(rootPane, "New Item added to the system");
                        }
                        
                        // ResultSet rs1 = s.executeQuery("Select SupplierID, CompanyName,Telephone,email,AgentName,Type  from supplier");
                         
                         

                    } else if (x == 1) {
                        //Clearall();
                        // Reset
                       
                        jTextField9.setText("");
                        jTextField7.setText("");
                        jTextField8.setText("");
                        jTextField6.setText("");
                        jTextField7.setText("");
                    }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Re check Data");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // Search
        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = null;
            if(jComboBox4.getSelectedItem().equals("Mahindra") && jComboBox6.getSelectedItem().equals("Select") ){
                rs = s.executeQuery("SELECT `Chassie_No`, `Model`, `Fuel_type`, `Color`, `Year`, `Price`  FROM mahindra");
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(jComboBox4.getSelectedItem().equals("Piaggio")&& jComboBox6.getSelectedItem().equals("Select")){
                rs = s.executeQuery("SELECT `Chassie_No`, `Model`, `Fuel_type`, `Color`, `Year`, `Price`  FROM threewheeler");
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(jComboBox4.getSelectedItem().equals("Mahindra") && !jComboBox6.getSelectedItem().equals("Select")){
                rs = s.executeQuery("SELECT `Chassie_No`, `Model`, `Fuel_type`, `Color`, `Year`, `Price`  FROM mahindra where Model = '"+jComboBox6.getSelectedItem().toString()+"'");
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(jComboBox4.getSelectedItem().equals("Piaggio") && !jComboBox6.getSelectedItem().equals("Select")){
                rs = s.executeQuery("SELECT `Chassie_No`, `Model`, `Fuel_type`, `Color`, `Year`, `Price`  FROM threewheeler where Model = '"+jComboBox6.getSelectedItem().toString()+"'");
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(jComboBox4.getSelectedItem().equals("Mahindra") && !jComboBox6.getSelectedItem().equals("Select") && !jComboBox7.getSelectedItem().equals("Select")){
                rs = s.executeQuery("SELECT `Chassie_No`, `Model`, `Fuel_type`, `Color`, `Year`, `Price`  FROM mahindra where Model = '"+jComboBox6.getSelectedItem().toString()+"' and Color = '"+jComboBox7.getSelectedItem().toString()+"'");
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(jComboBox4.getSelectedItem().equals("Piaggio") && !jComboBox6.getSelectedItem().equals("Select") && !jComboBox7.getSelectedItem().equals("Select") ){
                rs = s.executeQuery("SELECT `Chassie_No`, `Model`, `Fuel_type`, `Color`, `Year`, `Price`  FROM threewheeler where Model = '"+jComboBox6.getSelectedItem().toString()+"' and Color = '"+jComboBox7.getSelectedItem().toString()+"' ");
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(jComboBox4.getSelectedItem().equals("Mahindra") && !jComboBox7.getSelectedItem().equals("Select")){
                rs = s.executeQuery("SELECT `Chassie_No`, `Model`, `Fuel_type`, `Color`, `Year`, `Price`  FROM mahindra where Color = '"+jComboBox7.getSelectedItem().toString()+"'");
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(jComboBox4.getSelectedItem().equals("Piaggio") && !jComboBox7.getSelectedItem().equals("Select")){
                rs = s.executeQuery("SELECT `Chassie_No`, `Model`, `Fuel_type`, `Color`, `Year`, `Price`  FROM threewheeler where Color = '"+jComboBox7.getSelectedItem().toString()+"'");
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Customeer Registration
        try{
            String id = null;
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from customer");
            //String auto increment
            if(rs.last()){
               String y=rs.getString("CustomerID");
               //String y2 = y.substring(1);
               int y1=Integer.parseInt(y.substring(3));
               y1 = y1 + 1;
                //System.out.println(y1);
               y = "Cus"+String.format("%03d", y1);
               id = y;
            } 
            if(!jTextField1.getText().isEmpty() || !jTextField2.getText().isEmpty() || !jTextField3.getText().isEmpty() 
                || !jTextField4.getText().isEmpty() )
        {
            int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to save this Record ? ");

                    if (x == 0) {

                        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        // jDate = sdf.format(jDateChooser.getDate());


                        
                        s.executeUpdate("INSERT INTO `customer`(`CustomerID`, `Name`, `Address`, `NIC`, `Telephone`) VALUES('"+ id +"','"+jTextField1.getText()+"','" + jTextField2.getText() + "','"+jTextField3.getText()+"','"+jTextField4.getText()+"')");
                        JOptionPane.showMessageDialog(rootPane, "record has been saved successfully");

                         //ResultSet rs1 = s.executeQuery("Select SupplierID, CompanyName,Telephone,email,AgentName,Type  from supplier");
                         //supplierDetails.setModel(DbUtils.resultSetToTableModel(rs1));
                        jTextField21.setText(jTextField1.getText());
                        jTextField22.setText(jTextField4.getText());
                        jTextField23.setText(jTextField3.getText());
                         
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                        
                        
                       

                    }
                    else if (x == 1) {
                        //Clearall();
                        // Reset
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                       
                    }
        }
                
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Search by name and nic
        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = null;
            if(jComboBox1.getSelectedItem().equals("NIC")){
            
                 rs = s.executeQuery("select * from customer where NIC = '"+jTextField5.getText()+"'");
                 jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(jComboBox1.getSelectedItem().equals("Name")){
                
                 rs = s.executeQuery("select * from customer where Name = '"+jTextField5.getText()+"'");
                 jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(jComboBox1.getSelectedItem().equals("Select") || jTextField5.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please Select Search Type");
            }
            
            
        }
            
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Log out ? ");
        if(x== 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
             System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
         int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Log out ? ");
        if(x== 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        //Sales Details
        double price = Double.parseDouble(jTextField27.getText());
        double other = Double.parseDouble(jTextField28.getText());
        double discount = Double.parseDouble(jTextField29.getText());
        double total = (price + other) - discount;
       
        jTextField30.setText(String.valueOf(total));
        try{
            String id =  null;
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from VehicleSales");
            //String auto increment
            if(rs.last()){
               String y=rs.getString("BillNo");
               //String y2 = y.substring(1);
               int y1=Integer.parseInt(y.substring(4));
               y1 = y1 + 1;
                //System.out.println(y1);
               y = "VSel"+String.format("%03d", y1);
               id = y;
            } 
            int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to save this Record ? ");

                    if (x == 0) {

                        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        // jDate = sdf.format(jDateChooser.getDate());


                        
                        s.executeUpdate("INSERT INTO `VehicleSales`(`BillNo`, `Date`, `VehicleDetails`, `Total`, `Customer`, `ContactNo`)values ('" + id + "','"+ dateChooserCombo2.getText() +"','" + jTextField24.getText() + "','"+jTextField30.getText()+"','"+jTextField21.getText()+"','"+jTextField22.getText()+"')");
                        JOptionPane.showMessageDialog(rootPane, "record has been saved successfully");

                         ResultSet rs1 = s.executeQuery("Select *  from VehicleSales");
                         jTable2.setModel(DbUtils.resultSetToTableModel(rs1));
       
                    
                    }
        }            
        catch(Exception e){
            
        }
                
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        try {
            
            String input = jTextField4.getText();
            if(input.length() > 9){
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char c = evt.getKeyChar();
            if(!Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // Set Model Combo Box
            jComboBox6.removeAllItems();
            jComboBox6.addItem("Select");
        if(jComboBox4.getSelectedItem().equals("Mahindra")){
            jComboBox6.addItem("Alpha");
            jComboBox6.addItem("Alpha Plus");
        }
        else if(jComboBox4.getSelectedItem().equals("Piaggio")){
            jComboBox6.addItem("Ape");
             
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        try {

            char c = evt.getKeyChar();
            if(Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
       try {

            char c = evt.getKeyChar();
            if(!Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        try {

            char c = evt.getKeyChar();
            if(Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
       try {

            char c = evt.getKeyChar();
            if(Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        Validations valid = new Validations();
        valid.validateNIC_v(jTextField2.getText());
        return;
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField22KeyTyped
         try {
            
            String input = jTextField22.getText();
            if(input.length() > 9){
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char c = evt.getKeyChar();
            if(!Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jTextField22KeyTyped

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
            java.util.logging.Logger.getLogger(Vehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehicles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehicles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private datechooser.beans.DateChooserCombo dateChooserCombo3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
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
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
