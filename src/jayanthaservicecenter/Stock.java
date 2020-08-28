/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jayanthaservicecenter;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import DBconnection.DB;
import java.awt.Toolkit;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import Validations.Validations;
import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
/**
 *
 * @author Ravindu
 */
public class Stock extends javax.swing.JFrame {
        DefaultListModel reorderspare = new DefaultListModel(); 
        DefaultListModel reorderlub = new DefaultListModel();
        double sqty = 00.00;
        double lqty = 00.00;
       
    
    /**
     * Creates new form Stock
     */
    public Stock() {
        initComponents();
        
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        dateChooserCombo1.setDateFormat(sdf);
        dateChooserCombo2.setDateFormat(sdf);
        dateChooserCombo3.setDateFormat(sdf);
        dateChooserCombo4.setDateFormat(sdf);
        dateChooserCombo5.setDateFormat(sdf);
        
        jPanel1.setBackground(new Color(0,0,0,170));
        jPanel7.setBackground(new Color(0,0,0,170));
        jPanel6.setBackground(new Color(0,0,0,170));
        jPanel15.setBackground(new Color(0,0,0,170));
        jPanel22.setBackground(new Color(0,0,0,170));
        jPanel19.setBackground(new Color(0,0,0,170));
        jPanel9.setBackground(new Color(0,0,0,170));
        jPanel12.setBackground(new Color(0,0,0,170));
        jPanel10.setBackground(new Color(0,0,0,170));
        jPanel21.setBackground(new Color(0,0,0,170));
        jPanel26.setBackground(new Color(0,0,0,170));
        jPanel27.setBackground(new Color(0,0,0,170));
        jPanel29.setBackground(new Color(0,0,0,170));
        jPanel30.setBackground(new Color(0,0,0,170));
        jPanel31.setBackground(new Color(0,0,0,170));
        
        jTextField1.setBackground(new Color(0,0,0,200));
        jTextField10.setBackground(new Color(0,0,0,200));
        jTextField11.setBackground(new Color(0,0,0,200));
        //jTextField12.setBackground(new Color(0,0,0,200));
        jTextField13.setBackground(new Color(0,0,0,200));
        jTextField14.setBackground(new Color(0,0,0,200)); 
        //jTextField16.setBackground(new Color(0,0,0,200));   
        jTextField18.setBackground(new Color(0,0,0,200));
        jTextField19.setBackground(new Color(0,0,0,200));
        jTextField2.setBackground(new Color(0,0,0,200));
        jTextField20.setBackground(new Color(0,0,0,200));    
        jTextField21.setBackground(new Color(0,0,0,200));
        jTextField3.setBackground(new Color(0,0,0,200));
        jTextField4.setBackground(new Color(0,0,0,200));
        jTextField5.setBackground(new Color(0,0,0,200));
        jTextField6.setBackground(new Color(0,0,0,200));
        jTextField7.setBackground(new Color(0,0,0,200));
        jTextField24.setBackground(new Color(0,0,0,200));
        jTextField25.setBackground(new Color(0,0,0,200));
        jTextField26.setBackground(new Color(0,0,0,200));
        jTextField27.setBackground(new Color(0,0,0,200));
        jTextField28.setBackground(new Color(0,0,0,200));
        jTextField31.setBackground(new Color(0,0,0,200));
        jTextField30.setBackground(new Color(0,0,0,200));
        jTextField34.setBackground(new Color(0,0,0,200));
        jTextField36.setBackground(new Color(0,0,0,200));
        jTextField37.setBackground(new Color(0,0,0,200));
        jTextField39.setBackground(new Color(0,0,0,200));
        jTextField32.setBackground(new Color(0,0,0,200));
        jTextField41.setBackground(new Color(0,0,0,200));
        jTextField43.setBackground(new Color(0,0,0,200));
        jTextField44.setBackground(new Color(0,0,0,200));
        jTextField8.setBackground(new Color(0,0,0,200));
        jTextField9.setBackground(new Color(0,0,0,200));
        //jTextField15.setBackground(new Color(0,0,0,200));
        //jTextField17.setBackground(new Color(0,0,0,200));
        jTextField23.setBackground(new Color(0,0,0,200));
        jTextField29.setBackground(new Color(0,0,0,200));
        jTextField33.setBackground(new Color(0,0,0,200));
        jTextField35.setBackground(new Color(0,0,0,200));
        jTextField38.setBackground(new Color(0,0,0,200));
        jTextField40.setBackground(new Color(0,0,0,200));

        jList2.setBackground(new Color(0,0,0,64));
        jButton1.setBackground(new Color(0,0,0,64));
        jButton10.setBackground(new Color(0,0,0,64));
        jButton12.setBackground(new Color(0,0,0,64));
        jButton13.setBackground(new Color(0,0,0,64));
        jButton15.setBackground(new Color(0,0,0,64));
        jButton16.setBackground(new Color(0,0,0,64));
        jButton17.setBackground(new Color(0,0,0,64));
        jButton18.setBackground(new Color(0,0,0,64));
        jButton19.setBackground(new Color(0,0,0,64));
        jButton2.setBackground(new Color(0,0,0,64));
        jButton3.setBackground(new Color(0,0,0,64));
        jButton4.setBackground(new Color(0,0,0,64));
        jButton5.setBackground(new Color(0,0,0,64));
        jButton7.setBackground(new Color(0,0,0,64));
        jButton8.setBackground(new Color(0,0,0,64));
        jButton9.setBackground(new Color(0,0,0,64));
        jButton20.setBackground(new Color(0,0,0,64));
        jButton21.setBackground(new Color(0,0,0,64));
        jButton31.setBackground(new Color(0,0,0,64));
        jButton6.setBackground(new Color(0,0,0,64));
        jButton22.setBackground(new Color(0,0,0,64));
        jButton29.setBackground(new Color(0,0,0,64));
        jButton30.setBackground(new Color(0,0,0,64));
        jButton32.setBackground(new Color(0,0,0,64));
        jButton24.setBackground(new Color(0,0,0,64));
        jButton25.setBackground(new Color(0,0,0,64));
        jButton26.setBackground(new Color(0,0,0,64));
        jButton27.setBackground(new Color(0,0,0,64));
        jButton28.setBackground(new Color(0,0,0,64));
        jButton14.setBackground(new Color(0,0,0,64));
        jButton11.setBackground(new Color(0,0,0,64));
        jButton35.setBackground(new Color(0,0,0,64));
        jButton36.setBackground(new Color(0,0,0,64));
        jButton37.setBackground(new Color(0,0,0,64));
        jButton23.setBackground(new Color(0,0,0,64));
        jButton33.setBackground(new Color(0,0,0,64));
        jButton34.setBackground(new Color(0,0,0,64));
        jButton38.setBackground(new Color(0,0,0,64));
        jButton39.setBackground(new Color(0,0,0,64));
        jButton40.setBackground(new Color(0,0,0,64));
        //supplierDetails.setBackground(new Color(0,0,0,64));
        
       try{
        
        Connection c = DB.mycon();
        Statement s = c.createStatement();
        ResultSet rs1 = s.executeQuery("Select *  from supplier");
        supplierDetails.setModel(DbUtils.resultSetToTableModel(rs1));
        ResultSet rs2 = s.executeQuery("Select *  from subpartname");
        jTable1.setModel(DbUtils.resultSetToTableModel(rs2));
        ResultSet rs4 = s.executeQuery("Select *  from lubricants");
        jTable2.setModel(DbUtils.resultSetToTableModel(rs4));
        ResultSet rs6 = s.executeQuery("Select *  from reorderlevel");
        jTable4.setModel(DbUtils.resultSetToTableModel(rs6));
        ResultSet rs7 = s.executeQuery("Select ReOrderLevel  from reorderlevel where Type = '"+"SpareParts"+"'");
        while(rs7.next()){
            String amnt = rs7.getString("ReOrderLevel");
            sqty = Double.parseDouble(amnt);
        }
        ResultSet rs8 = s.executeQuery("Select ReOrderLevel  from reorderlevel where Type = '"+"Lubricants"+"'");
        while(rs8.next()){
            String amnt = rs8.getString("ReOrderLevel");
            lqty = Double.parseDouble(amnt);
        }
        ResultSet rs3 = s.executeQuery("select ItemID from subpartname where Quanty <= "+sqty+" ");
            while(rs3.next()){
                
                String item = rs3.getString("ItemID");
                reorderspare.addElement(item);
            }
            jList2.setModel(reorderspare);
            ResultSet rs5 = s.executeQuery("select ItemNo from lubricants where Quantity <= "+lqty+" ");
            while(rs5.next()){
                String item = rs5.getString("ItemNo");
                reorderlub.addElement(item);
            }
            jList1.setModel(reorderlub);
            
            
            
       }
       
        catch(Exception e){
           // e.printStackTrace();
        }
         try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM supplier");
            while(rs.next()){
                jComboBox4.addItem(rs.getString("CompanyName"));
                
            }
            ResultSet rs1 = s.executeQuery("SELECT distinct ItemName FROM subpartname");
            while(rs1.next()){
                jComboBox5.addItem(rs1.getString("ItemName"));
            }
            ResultSet rs2 = s.executeQuery("SELECT * FROM brand");
            while(rs2.next()){
                jComboBox6.addItem(rs2.getString("Brand"));
                jComboBox13.addItem(rs2.getString("Brand"));
            }
            ResultSet rs5 = s.executeQuery("SELECT CompanyName FROM supplier where Type = '"+"Spare Parts"+"' ");
            while(rs5.next()){
                jComboBox11.addItem(rs5.getString("CompanyName"));
                jComboBox12.addItem(rs5.getString("CompanyName"));
            }
            
            ResultSet rs6 = s.executeQuery("SELECT CompanyName 	 FROM supplier where Type = '"+"Lubricants"+"' ");
            while(rs6.next()){
                jComboBox9.addItem(rs6.getString("CompanyName"));
                jComboBox10.addItem(rs6.getString("CompanyName"));
            }
                
                
                
                ResultSet rs4 = s.executeQuery("SELECT distinct ItemName FROM lubricants ");
                while(rs4.next()){
                jComboBox3.addItem(rs4.getString("ItemName"));
            }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierDetails = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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
        jButton21 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jComboBox12 = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        dateChooserCombo3 = new datechooser.beans.DateChooserCombo();
        jLabel44 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jComboBox9 = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        dateChooserCombo4 = new datechooser.beans.DateChooserCombo();
        jLabel52 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jComboBox10 = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        dateChooserCombo5 = new datechooser.beans.DateChooserCombo();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel26 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel50 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jButton35 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel2.setPreferredSize(new java.awt.Dimension(1450, 732));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Insert", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Name");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Address");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Email");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Telephone");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Type");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setText("Spare Parts");
        jRadioButton1.setOpaque(false);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("Lubricants");
        jRadioButton2.setOpaque(false);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton3.setText("Both");
        jRadioButton3.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Agent Name");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Contact No:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jTextField6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextField6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Insert");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Reset");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 370));

        jPanel5.setOpaque(false);

        supplierDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Company Name", "Type", "Address", "Telephone", "Email", "AgentName", "AgentContact"
            }
        ));
        supplierDetails.setOpaque(false);
        supplierDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(supplierDetails);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 1030, 270));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Update/Delete", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Supplier ID");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(204, 204, 204));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Update Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Name");

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(204, 204, 204));
        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField24KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField24KeyTyped(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Address");

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(204, 204, 204));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Telephone");

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(204, 204, 204));
        jTextField26.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField26FocusLost(evt);
            }
        });
        jTextField26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField26KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField26KeyTyped(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Agent Name");

        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(204, 204, 204));
        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField27KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField27KeyTyped(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Agent Contact");

        jTextField28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(204, 204, 204));
        jTextField28.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField28FocusLost(evt);
            }
        });
        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField28KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField28KeyTyped(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(204, 204, 204));
        jButton21.setText("Reset");
        jButton21.setOpaque(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(28, 28, 28))
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addGap(41, 41, 41)))
                            .addComponent(jLabel36))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jTextField25)
                            .addComponent(jTextField26)
                            .addComponent(jTextField27)
                            .addComponent(jTextField28)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 470, 360));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Search By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Type");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Spare Parts", "Lubricants", "Both" }));
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Supplier Name");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 204));
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 151, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton5)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 460, 220));

        jPanel8.setOpaque(false);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48home.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48exit.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout 1.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 420, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 1450, 780));

        jTabbedPane1.addTab("Supplier", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Insert", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(204, 204, 204));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Item No ");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(204, 204, 204));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Item Name");

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(204, 204, 204));
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Vehicle Type");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Unit Price");

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(204, 204, 204));
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Stock Amount");

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(204, 204, 204));
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 204, 204));
        jButton9.setText("Insert");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(204, 204, 204));
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Brand");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Supplier");

        jComboBox11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        jComboBox13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });

        jComboBox14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Date");

        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(350, 220));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox13, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton9))
                .addGap(29, 29, 29))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 370));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Update", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("OrderID");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Item Name");

        jTextField18.setBackground(new java.awt.Color(244, 237, 237));
        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(204, 204, 204));
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField18KeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("ModelNo");

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(204, 204, 204));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Date");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("New Stock");

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(204, 204, 204));
        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField20KeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Unit Price");

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(204, 204, 204));
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jTextField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField21KeyTyped(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(204, 204, 204));
        jButton12.setText("Update");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(204, 204, 204));
        jButton13.setText("Reset");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Supplier");

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(204, 204, 204));
        jTextField22.setText("xxxx");

        dateChooserCombo2.setCalendarPreferredSize(new java.awt.Dimension(350, 220));

        jComboBox12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateChooserCombo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jTextField22))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField21, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton12))
                .addGap(42, 42, 42))
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 280, 360));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true), "Search By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("ItemName");

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(204, 204, 204));
        jButton16.setText("Search");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 204, 204));
        jLabel59.setText("Brand");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Model");

        jButton31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton31.setForeground(new java.awt.Color(204, 204, 204));
        jButton31.setText("Refresh");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(204, 204, 204));
        jButton15.setText("Clear Table");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel30))
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jComboBox5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton31)
                    .addComponent(jButton15))
                .addGap(26, 26, 26))
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 520, 250));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Re-Order Level Reached Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(204, 204, 204));
        jPanel13.setOpaque(false);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "Spare Parts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel14.setOpaque(false);

        jList2.setOpaque(false);
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 280, 280));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Tables", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel17.setOpaque(false);

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
                "Item No", "Item Name", "Available Stock", "Unit Price", "Email", "Order Date"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 810, 280));

        jPanel11.setOpaque(false);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48home.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout 1.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48exit.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton20)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 360, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1450, 820));

        jTabbedPane1.addTab("Spare Parts", jPanel3);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Insert", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Item No");

        jTextField30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(204, 204, 204));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText("Item Name");

        jTextField31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField31.setForeground(new java.awt.Color(204, 204, 204));
        jTextField31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField31KeyTyped(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 204, 204));
        jLabel42.setText("Date");

        dateChooserCombo3.setCalendarPreferredSize(new java.awt.Dimension(350, 220));
        dateChooserCombo3.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("Amount");

        jTextField34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField34.setForeground(new java.awt.Color(204, 204, 204));
        jTextField34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField34KeyTyped(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 204, 204));
        jLabel45.setText("Supplier");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 204, 204));
        jLabel46.setText("Unit Price");

        jTextField36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField36.setForeground(new java.awt.Color(204, 204, 204));
        jTextField36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField36KeyTyped(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("Stock Amount");

        jTextField37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(204, 204, 204));
        jTextField37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField37KeyTyped(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Insert");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(204, 204, 204));
        jButton22.setText("Reset");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jComboBox9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel40))
                            .addComponent(jLabel42)
                            .addComponent(jLabel45)
                            .addComponent(jLabel47))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField30)
                                    .addComponent(jTextField31, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(dateChooserCombo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField37)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton22)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton22))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 380));

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true), "Update", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(204, 204, 204));
        jLabel49.setText("Item Name");

        jTextField39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField39.setForeground(new java.awt.Color(204, 204, 204));
        jTextField39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField39KeyTyped(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 204, 204));
        jLabel51.setText("Date");

        dateChooserCombo4.setCalendarPreferredSize(new java.awt.Dimension(350, 220));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("Amount");

        jTextField41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField41.setForeground(new java.awt.Color(204, 204, 204));
        jTextField41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField41KeyTyped(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setText("Supplier");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setText("Unit Price");

        jTextField43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(204, 204, 204));
        jTextField43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField43KeyTyped(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 204, 204));
        jLabel55.setText("New Stock");

        jTextField44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField44.setForeground(new java.awt.Color(204, 204, 204));
        jTextField44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField44KeyTyped(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton24.setForeground(new java.awt.Color(204, 204, 204));
        jButton24.setText("Update");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(204, 204, 204));
        jButton25.setText("Reset");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Brand");

        jTextField32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField32.setForeground(new java.awt.Color(204, 204, 204));
        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });
        jTextField32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField32KeyTyped(evt);
            }
        });

        jComboBox10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jLabel55))
                .addGap(22, 22, 22)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserCombo4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jTextField44))
                .addContainerGap())
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addGap(40, 40, 40)
                .addComponent(jTextField41)
                .addContainerGap())
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField39)
                .addContainerGap())
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField32)
                .addContainerGap())
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton25)
                .addGap(26, 26, 26))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField43)
                    .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24)
                    .addComponent(jButton25))
                .addGap(58, 58, 58))
        );

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 340, 420));

        jPanel20.setOpaque(false);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48home.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout 1.png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48exit.png"))); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton26))
                .addGap(27, 27, 27))
        );

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 330, 80));

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel22.setForeground(new java.awt.Color(204, 204, 204));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(204, 204, 204));
        jLabel57.setText("Item Name");

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton30.setForeground(new java.awt.Color(204, 204, 204));
        jButton30.setText("Search");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(204, 204, 204));
        jLabel60.setText("Liters");

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton29.setForeground(new java.awt.Color(204, 204, 204));
        jButton29.setText("Refresh");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton32.setForeground(new java.awt.Color(204, 204, 204));
        jButton32.setText("Clear Table");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jComboBox8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0.5", "1", "2", "5", "10" }));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel60)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox3, 0, 143, Short.MAX_VALUE)
                    .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(162, 162, 162))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton29)
                .addGap(39, 39, 39)
                .addComponent(jButton30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton32)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton29)
                    .addComponent(jButton30)
                    .addComponent(jButton32))
                .addGap(82, 82, 82))
        );

        jPanel18.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 480, 240));

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Re-Order Level Reach Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel23.setOpaque(false);

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lubricants", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel24.setOpaque(false);

        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 240, 250));

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Tables", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel25.setOpaque(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Item No", "Item Name", "Available Stocks", "Unit Price", "Supplier", "Email", "Order Date"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 810, 220));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel18.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 1450, 810));

        jTabbedPane1.addTab("Lubricants", jPanel18);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Supplier Name");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Supplier Type");

        buttonGroup3.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton4.setText("Spare Parts");
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseReleased(evt);
            }
        });

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton5.setText("Lubricants");
        jRadioButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton5MouseClicked(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel41))
                .addGap(51, 51, 51)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(dateChooserCombo5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(jRadioButton5)
                        .addGap(24, 24, 24))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateChooserCombo5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jPanel16.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 620, 140));

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 204, 204));
        jLabel48.setText("Subject");

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(204, 204, 204));
        jTextField9.setText("Request Orders");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\t\tItem Name\t\t\t\t\tAmount\t\t\n\n\n\n\n\n\n\n\n\n\t\t\t\tJayantha Service Center\n\t\t\t\t       Sooriyawewa");
        jScrollPane6.setViewportView(jTextArea1);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setText("Message");

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(204, 204, 204));
        jButton11.setText("Send");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(204, 204, 204));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("Email");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8)
                            .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jButton11)
                .addGap(0, 467, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton11)
                .addContainerGap())
        );

        jPanel16.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 840, 370));

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Item Name", "Available Amount", "Ordering Amount"
            }
        ));
        jScrollPane7.setViewportView(jTable3);

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(204, 204, 204));
        jButton14.setText("Add to Order List");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jButton14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 650, 210));

        jPanel32.setOpaque(false);

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48home.png"))); // NOI18N
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout 1.png"))); // NOI18N
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48exit.png"))); // NOI18N
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 310, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel16.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 2223, 925));

        jPanel4.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -60, 1410, 800));

        jTabbedPane1.addTab("Request", jPanel4);

        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setOpaque(false);
        jPanel29.setPreferredSize(new java.awt.Dimension(330, 90));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48exit.png"))); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/48home.png"))); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout 1.png"))); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel28.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, 80));

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Set Re-Order Level", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 204, 204));
        jLabel58.setText("Sapre Parts");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(204, 204, 204));
        jLabel61.setText("Lubricants");

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 204, 204));
        jLabel63.setText("New Limit");

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(204, 204, 204));
        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField23KeyTyped(evt);
            }
        });

        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(204, 204, 204));
        jTextField29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField29KeyTyped(evt);
            }
        });

        jButton35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton35.setForeground(new java.awt.Color(204, 204, 204));
        jButton35.setText("Update");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Type", "Re-Order Level"
            }
        ));
        jScrollPane8.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addGap(147, 147, 147)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton35)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton35)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel28.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 780, 210));

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Set Selling Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ItemNo", "ItemName", "UnitCost", "Selling Price"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable5);

        buttonGroup4.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton6.setText("Spare Parts");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton7.setText("Lubricants");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(204, 204, 204));
        jLabel64.setText("ItemNo");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(204, 204, 204));
        jLabel65.setText("Item Name");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(204, 204, 204));
        jLabel66.setText("Unit Cost");

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(204, 204, 204));
        jLabel67.setText("Selling Price");

        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField33.setForeground(new java.awt.Color(204, 204, 204));

        jTextField35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField35.setForeground(new java.awt.Color(204, 204, 204));

        jTextField38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(204, 204, 204));
        jTextField38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField38KeyTyped(evt);
            }
        });

        jTextField40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField40.setForeground(new java.awt.Color(204, 204, 204));
        jTextField40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField40KeyTyped(evt);
            }
        });

        jButton36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton36.setForeground(new java.awt.Color(204, 204, 204));
        jButton36.setText("Set");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton37.setForeground(new java.awt.Color(204, 204, 204));
        jButton37.setText("Search");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel31Layout.createSequentialGroup()
                                        .addComponent(jRadioButton6)
                                        .addGap(97, 97, 97)
                                        .addComponent(jRadioButton7))
                                    .addGroup(jPanel31Layout.createSequentialGroup()
                                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField33)
                                            .addComponent(jTextField35)
                                            .addComponent(jTextField38)
                                            .addComponent(jTextField40, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE))
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton36)
                                .addGap(58, 58, 58)))
                        .addComponent(jButton37)
                        .addGap(98, 98, 98)))
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64))
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton37)
                                    .addComponent(jButton36)))
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel65)
                                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel66)
                                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel28.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 1230, 290));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Service Wall.png"))); // NOI18N
        jPanel28.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 1450, 723));

        jTabbedPane1.addTab("Update", jPanel28);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Reset
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Search according to the details
      /*  try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM supplier");
            while(rs.next()){
                jComboBox4.addItem(rs.getString("CompanyName"));
            }
        }
        catch(Exception e){
            
        }*/
        
        if(!jComboBox4.getSelectedItem().equals("Select")){
            //String id = jTextField8.getText();
            try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM supplier WHERE CompanyName ='" + jComboBox4.getSelectedItem() + "'");
            supplierDetails.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(!jComboBox1.getSelectedItem().equals("Select")){
            String type = (String) jComboBox1.getSelectedItem();
            try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM supplier WHERE Type ='" + type + "'");
            supplierDetails.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(jComboBox4.getSelectedItem().equals("Select") || jComboBox1.getSelectedItem().equals("Select") ){
            JOptionPane.showMessageDialog(rootPane, "Please select items before Search");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // Reset
        jTextField18.setText("");
        jTextField19.setText("");
     //  jTextField15.setText("");
        jTextField18.setText("");
        jTextField21.setText("");
        jTextField20.setText(""); 
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Insert New Supplier details
       
           String type = null;
                if(jRadioButton1.isSelected()){
                    type = jRadioButton1.getText();
                }
                else if(jRadioButton2.isSelected()){
                    type = jRadioButton2.getText();
                }
                else if(jRadioButton3.isSelected()){
                    type = jRadioButton3.getText();
                }
               else {
                    JOptionPane.showMessageDialog(rootPane, "Please Select one");
                }
        if(!jTextField1.getText().isEmpty() || !jTextField2.getText().isEmpty() || !jTextField3.getText().isEmpty() 
        && !jTextField4.getText().isEmpty() || !jTextField6.getText().isEmpty() || !jTextField5.getText().isEmpty())
        {
            try {
                String id = null;
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * supplier");
            //String auto increment
            if(rs.last()){
               String y=rs.getString("SupplierID");
               //String y2 = y.substring(1);
               int y1=Integer.parseInt(y.substring(3));
               y1 = y1 + 1;
                //System.out.println(y1);
               y = "Sup"+String.format("%04d", y1);
               id = y;
            }
               /* Validations valid = new Validations();
                if(valid.validateEmail(jTextField3.getText()) == false){
                    jTextField3.setText("Invalid");
               }*/
                
                
                         //show confirm msg box
                    int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to save this Record ? ");

                    if (x == 0) {

                        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        // jDate = sdf.format(jDateChooser.getDate());


                        
                        s.executeUpdate("INSERT INTO supplier (SupplierID , CompanyName,Type,Address,Telephone,email,AgentName,AgentContact ) values('"+id+"','" + jTextField1.getText() + "','"+ type +"','" + jTextField2.getText() + "','"+jTextField4.getText()+"','"+jTextField3.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"')");
                        JOptionPane.showMessageDialog(rootPane, "record has been saved successfully");

                         ResultSet rs1 = s.executeQuery("Select SupplierID, CompanyName,Telephone,email,AgentName,Type  from supplier");
                         supplierDetails.setModel(DbUtils.resultSetToTableModel(rs1));
                         

                    } else if (x == 1) {
                        //Clearall();
                        // Reset
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
                        jTextField5.setText("");
                        jTextField6.setText("");
                        //jTextField7.setText("");
                    }
            }
        
            catch (Exception e) {
             e.printStackTrace();
                }
        }
            else{
            JOptionPane.showMessageDialog(rootPane, "Fill Empty Fields");
               }
              
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Delete Supplier Details
              if(!jTextField7.getText().isEmpty() || !jTextField24.getText().isEmpty() 
            || !jTextField25.getText().isEmpty() || !jTextField26.getText().isEmpty() 
            || !jTextField27.getText().isEmpty() || !jTextField28.getText().isEmpty()){
                int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete this record ? ");
                try {
                    if(x == 0){
                    Connection c = DB.mycon();
                    Statement s = c.createStatement();
                    s.executeUpdate("DELETE FROM supplier WHERE SupplierID ='" + jTextField7.getText() + "'");
                    JOptionPane.showMessageDialog(rootPane, "record has been Deleted successfully ");
                    
                    ResultSet rs1 = s.executeQuery("Select *  from supplier");
                    supplierDetails.setModel(DbUtils.resultSetToTableModel(rs1));
                    
                    }
                    else if(x== 1){
                       // jTextField17.setText("");
                    }
            } catch (Exception e) {
                //e.printStackTrace();
            }
     }
              else{
                  JOptionPane.showMessageDialog(rootPane, "Fill Empty Fields ");
              }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Back to Home
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // Log out from the System
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Log out ? ");
        if(x== 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // exit from the whole system
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // Reset
        jTextField7.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Update SUpplier DEtails
        
          if(!jTextField7.getText().isEmpty() || !jTextField24.getText().isEmpty() 
            || !jTextField25.getText().isEmpty() || !jTextField26.getText().isEmpty() 
            || !jTextField27.getText().isEmpty() || !jTextField28.getText().isEmpty()){
            try {    
            //show confirm msg box
                int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to Update this Record ? ");

                 if (x == 0) {
                
                    Connection c = DB.mycon();
                    Statement s = c.createStatement();
                    s.executeUpdate("UPDATE supplier SET CompanyName = '" + jTextField24.getText() + "',Address = '" + jTextField25.getText() + "',Telephone = '"+jTextField26.getText()+"',AgentName = '"+jTextField27.getText()+"',AgentContact = '"+jTextField28.getText()+"' where SupplierID = '" + jTextField7.getText() + " ' ");
                    JOptionPane.showMessageDialog(rootPane, "record has been Updated successfully ");
                   
                    ResultSet rs1 = s.executeQuery("Select *  from supplier");
                    supplierDetails.setModel(DbUtils.resultSetToTableModel(rs1));
                    //Clearall();

                } else if (x == 1) {
                    //Clearall();
                }

                } catch (Exception e) {
                    e.printStackTrace();
                }

          }
          else{
              JOptionPane.showMessageDialog(rootPane, "Fill Empty Fields ");
            }
          
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // Alphabetic values only
         
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // numeric only
         
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        //Alphabetic only
           
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // numeric only
        
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // No user inputs
       /* try {

            char c = evt.getKeyChar();
            if(!Character.isDigit(c) || !Character.isAlphabetic(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }*/        
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField24KeyPressed
        //Alphabetic only
                 try {

            char c = evt.getKeyChar();
            if(!Character.isAlphabetic(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }//GEN-LAST:event_jTextField24KeyPressed

    private void jTextField26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField26KeyPressed
       //numeric only
           
    }//GEN-LAST:event_jTextField26KeyPressed

    private void jTextField27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyPressed
        //Alphabetic only
                
    }//GEN-LAST:event_jTextField27KeyPressed

    private void jTextField28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyPressed
/*       //numeric only
        try {

            char c = evt.getKeyChar();
            if(!Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }       */ 
    }//GEN-LAST:event_jTextField28KeyPressed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // Reseting
        jTextField39.setText("");
        jTextField41.setText(""); 
      //  jTextField42.setText("");
        jTextField44.setText("");
        jTextField43.setText("");
        jTextField32.setText("");
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void supplierDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierDetailsMouseClicked
        // TODO add your handling code here:
        try{
            int row = supplierDetails.getSelectedRow();
            String ID = supplierDetails.getValueAt(row, 0).toString();
            String name = supplierDetails.getValueAt(row, 1).toString();
            String Type =  supplierDetails.getValueAt(row, 2).toString();
            String add = supplierDetails.getValueAt(row, 3).toString();
            String tel = supplierDetails.getValueAt(row, 4).toString();
            String email = supplierDetails.getValueAt(row, 5).toString();
            String agnt = supplierDetails.getValueAt(row, 6).toString();
            String agntcntact = supplierDetails.getValueAt(row, 7).toString();
            jTextField7.setText(ID);
            jTextField24.setText(name);
            jTextField25.setText(add);
            jTextField26.setText(tel);
            jTextField27.setText(agnt);
            jTextField28.setText(agntcntact);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_supplierDetailsMouseClicked

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        //referesh spareparts table
          
        try {
          Connection  c = DB.mycon();
        
        Statement s = c.createStatement();
       
        ResultSet rs = s.executeQuery("Select *  from subpartname");
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // Reset items
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
       // jTextField16.setText("");
       // jTextField29.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // update spare part stoock details
        if(!jTextField18.getText().isEmpty() && !jTextField19.getText().isEmpty() && !jComboBox12.getSelectedItem().equals("Select")&& !jTextField18.getText().isEmpty() && !jTextField21.getText().isEmpty() && !jTextField20.getText().isEmpty() )
        {       try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            dateChooserCombo2.setDateFormat(sdf);

            //show confirm msg box
            int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to add this record to ? ");

            if (x == 0) {
               
                double total = 00;
                double qty = Double.parseDouble(jTextField20.getText());
                double unitCost = Double.parseDouble(jTextField21.getText());
                double totalamnt = qty*unitCost;
                String tAmnt = Double.toString(totalamnt);
                String dbqty = null;
                //String tablename = jTextField18.getText();
                //double unitprice = Double.parseDouble(jTextField21.getText());
                Connection c = DB.mycon();
                Statement s = c.createStatement();
                ResultSet rs =  s.executeQuery("select Quanty From subpartname where ModelID = '" + jTextField19.getText() + "' and ItemName = '"+jTextField18.getText()+"' ");
                //code to convert to string
                while(rs.next()){
                   dbqty =  rs.getString("Quanty");
                }
                
                JOptionPane.showMessageDialog(rootPane, "record has been Updated successfully ");
                double dbseqty = Double.parseDouble(dbqty);
                total = qty + dbseqty;
                String Quanty = Double.toString(total);
                s.executeUpdate("UPDATE subpartname SET Quanty = '" +total+ "' where ModelID = '" + jTextField19.getText() + "' and ItemName = '"+jTextField18.getText()+"'");
                s.executeUpdate("insert into purchasedetails (ItemName,ModelID,OrderDate,SupplierName,Unitcost,units,TotalAmount)values('"+jTextField18.getText()+"','" +jTextField19.getText()+ "','" +dateChooserCombo2.getText()+"','"+jComboBox12.getSelectedItem().toString()+"','"+jTextField21.getText()+"','"+jTextField20.getText()+"','"+tAmnt+"') ");
                //Clearall();
                
                //update reorder list
               
                

            } else if (x == 1) {
                //Clearall();
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Fill Empty Fields");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(!jTextField10.getText().isEmpty() && !jTextField11.getText().isEmpty() && !jTextField13.getText().isEmpty() &&
        !jTextField14.getText().isEmpty() && !jComboBox13.getSelectedItem().equals("select") && !jComboBox11.getSelectedItem().equals("select") && !jComboBox14.getSelectedItem().equals("select"))
        {
            try {
            //show confirm msg box
            int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to save this Record as new item ? ");

            if (x == 0) {

                //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                //String jDate = sdf.format(jDateChooser.getDate());


                Connection c = DB.mycon();
                Statement s = c.createStatement();
                s.executeUpdate("INSERT into mainparts  (ItemNo,SparePartsName) values('" + jTextField10.getText() + "','" + jTextField11.getText() + "')");
                JOptionPane.showMessageDialog(rootPane, "Newly added item inserted to the table");

                //Clearall();
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                //jTextField16.setText("");
               // jTextField29.setText("");

            } else if (x == 1) {
                //Clearall();
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                //jTextField16.setText("");
                //jTextField29.setText("");
            }

        } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Fill Emprty Fileds");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // Search for Spare parts
        String ModelID = null;
        if(!jComboBox5.getSelectedItem().equals("Select") ||!jComboBox7.getSelectedItem().equals("Select")|| !jComboBox6.getSelectedItem().equals("Select")){
        try{
         Connection c = DB.mycon();
            Statement s = c.createStatement();
                        //System.out.println("SELECT * FROM subpartname where ItemName = '"+jTextField23.getText()+"'");
                        ResultSet rs1 = s.executeQuery("Select ModelID from vehicletype where Brand = '"+(String)jComboBox6.getSelectedItem()+"' and Model = '"+(String)jComboBox7.getSelectedItem()+"'");
                while(rs1.next()){
                    ModelID = rs1.getString("modelID");
                }

            ResultSet rs = s.executeQuery("SELECT * FROM subpartname where ItemName = '"+(String)jComboBox5.getSelectedItem()+"' and ModelID = '"+ModelID+"'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Fill Emprty Fileds");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // Search Lubricants
        try {
            if(!jComboBox3.getSelectedItem().equals("Select") ||!jComboBox8.getSelectedItem().equals("Select")  ){
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM lubricants WHERE ItemName ='" +jComboBox3.getSelectedItem().toString() + "' and Amount_L = '"+jComboBox8.getSelectedItem().toString()+"'");
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            //SimpleDateFormat DDate = new SimpleDateFormat("yyyy-MM-dd");
            }
            else{
                 JOptionPane.showMessageDialog(rootPane, "Fill Emprty Fileds");
            }

            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Insert new Lubricant
        if(!jTextField31.getText().isEmpty() && !jTextField34.getText().isEmpty() && !jComboBox9.getSelectedItem().equals("Select") && !jTextField36.getText().isEmpty() && !jTextField37.getText().isEmpty()){
            try{
                 String id = null;
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * lubricants");
            //String auto increment
            if(rs.last()){
               String y=rs.getString("ItemNo");
               //String y2 = y.substring(1);
               int y1=Integer.parseInt(y.substring(4));
               y1 = y1 + 1;
                //System.out.println(y1);
               y = "LUBS"+String.format("%04d", y1);
               id = y;
            }
            //show confirm msg box
            int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to save this Record as new item ? ");

            if (x == 0) {

                //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                //dateChooserCombo2.setDateFormat(sdf);


                
                s.executeUpdate("INSERT into lubricants  (ItemName,Amount(L),Quantity,Price) values('" + jTextField31.getText() + "','" + jTextField34.getText() + "','"+jTextField37.getText()+"','"+jTextField36.getText()+"')");
                JOptionPane.showMessageDialog(rootPane, "Newly added item inserted to the table");

                //Clearall();
                jTextField31.setText("");
                jTextField34.setText("");
                //jTextField35.setText("");
                jTextField36.setText("");
                jTextField37.setText("");
                

            } else if (x == 1) {
                //Clearall();
                jTextField31.setText("");
                jTextField34.setText("");
                //jTextField35.setText("");
                jTextField36.setText("");
                jTextField37.setText("");
            }

        } 
            
            catch (Exception e) {
                e.printStackTrace();
            }
        }
           else{
            JOptionPane.showMessageDialog(rootPane, "Fill Emprty Fileds");
        }
        
            
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // Update with new Stock
        if(!jTextField39.getText().isEmpty() && !jTextField41.getText().isEmpty() && !jComboBox10.getSelectedItem().equals("Select") && !jTextField44.getText().isEmpty()&& !jTextField43.getText().isEmpty()){
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    dateChooserCombo4.setDateFormat(sdf);
            try{
                double total = 00;
                double qty = Double.parseDouble(jTextField44.getText());
                double unitCost = Double.parseDouble(jTextField43.getText());
                double totalamnt = qty*unitCost;
                String tAmnt = Double.toString(totalamnt);
                String dbqty = null;
                //String tablename = jTextField18.getText();
                //double unitprice = Double.parseDouble(jTextField21.getText());
                Connection c = DB.mycon();
                Statement s = c.createStatement();
                ResultSet rs =  s.executeQuery("select Quantity From lubricants where ItemName = '"+jTextField39.getText()+"' and Amount_L= '"+jTextField41.getText()+"'and Brand = '"+jTextField32.getText()+"' ");
                //code to convert to string
                while(rs.next()){
                   dbqty =  rs.getString("Quantity");
                }
                
                
                double dbseqty = Double.parseDouble(dbqty);
                total = qty + dbseqty;
                String Quanty = Double.toString(total);
                s.executeUpdate("UPDATE lubricants SET Quantity = '" +total+ "' where ItemName = '"+jTextField39.getText()+"' and Amount_L= '"+jTextField41.getText()+"'and Brand = '"+jTextField32.getText()+"' ");
                s.executeUpdate("insert into purchasedetailslub (ItemName,Amount_L,Brand,OrderDate,SupplierName,Unitcost,units,TotalAmount)values('"+jTextField39.getText()+"','"+jTextField41.getText()+"','"+jTextField32.getText()+"','" +dateChooserCombo4.getText()+"','"+jComboBox10.getSelectedItem().toString()+"','"+jTextField43.getText()+"','"+jTextField44.getText()+"','"+tAmnt+"') ");
                ResultSet rs2 = s.executeQuery("SELECT * FROM lubricants");
                jTable2.setModel(DbUtils.resultSetToTableModel(rs2));
                JOptionPane.showMessageDialog(rootPane, "record has been Updated successfully ");
              }
        catch(Exception e){
            e.printStackTrace();
        }
       }
        else{
           JOptionPane.showMessageDialog(rootPane, "Fill Empty Fields "); 
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
                jTextField31.setText("");
                jTextField34.setText("");
              //  jTextField35.setText("");
                jTextField36.setText("");
                jTextField37.setText("");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // refresh table 2
        try {
          Connection  c = DB.mycon();
        
        Statement s = c.createStatement();
       
        ResultSet rs = s.executeQuery("Select *  from lubricants");
        
        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

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

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
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

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
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
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
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
    }//GEN-LAST:event_jPanel1KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        try {
            String input = jTextField6.getText();
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
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
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
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
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
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
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
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jTextField20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyTyped
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
    }//GEN-LAST:event_jTextField20KeyTyped

    private void jTextField21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField21KeyTyped
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
    }//GEN-LAST:event_jTextField21KeyTyped

    private void jTextField18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyTyped
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
    }//GEN-LAST:event_jTextField18KeyTyped

    private void jTextField31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField31KeyTyped
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
    }//GEN-LAST:event_jTextField31KeyTyped

    private void jTextField34KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField34KeyTyped
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
    }//GEN-LAST:event_jTextField34KeyTyped

    private void jTextField36KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField36KeyTyped
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
    }//GEN-LAST:event_jTextField36KeyTyped

    private void jTextField37KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField37KeyTyped
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
    }//GEN-LAST:event_jTextField37KeyTyped

    private void jTextField39KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField39KeyTyped
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
    }//GEN-LAST:event_jTextField39KeyTyped

    private void jTextField32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField32KeyTyped
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
    }//GEN-LAST:event_jTextField32KeyTyped

    private void jTextField41KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField41KeyTyped
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
    }//GEN-LAST:event_jTextField41KeyTyped

    private void jTextField43KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField43KeyTyped
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
    }//GEN-LAST:event_jTextField43KeyTyped

    private void jTextField44KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField44KeyTyped
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
    }//GEN-LAST:event_jTextField44KeyTyped

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Log out ? ");
        if(x== 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
         new Home().setVisible(true);
         this.dispose();

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
         int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Log out ? ");
        if(x== 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
        Validations valid = new Validations();
        valid.validateEmail_v(jTextField3.getText());
        return;
           //jTextField3.setText("");
           
        
        
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        //Validations valid = new Validations();
        //valid.ValidatePhone(jTextField4.getText());
        //jTextField4.setText("");
        //return;
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
        /*Validations valid = new Validations();
        valid.ValidatePhone(jTextField6.getText());
        jTextField6.setText("");*/
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField28FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField28FocusLost
/*        // TODO add your handling code here:
         Validations valid = new Validations();
        valid.ValidatePhone(jTextField4.getText());
        jTextField28.setText("");*/
    }//GEN-LAST:event_jTextField28FocusLost

    private void jTextField26FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField26FocusLost
        // TODO add your handling code here:
         Validations valid = new Validations();
        valid.ValidatePhone(jTextField26.getText());
        jTextField26.setText("");
    }//GEN-LAST:event_jTextField26FocusLost

    private void jTextField6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextField6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6AncestorAdded

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jTextField28KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyTyped
        // TODO add your handling code here:
        try {
            String input = jTextField28.getText();
            if(input.length() > 9){
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char c = evt.getKeyChar();
            if(!Character.isDigit(c) || !(c == KeyEvent.VK_BACKSPACE))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }//GEN-LAST:event_jTextField28KeyTyped

    private void jTextField27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyTyped
        // TODO add your handling code here:
         try {
             
            char c = evt.getKeyChar();
            if(!Character.isAlphabetic(c) || !(c == KeyEvent.VK_BACKSPACE) )
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }//GEN-LAST:event_jTextField27KeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        //Getting email address
        try{
            ResultSet rs = null;
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            rs = s.executeQuery("SELECT  `email` FROM `supplier` WHERE `CompanyName` = '"+jComboBox2.getSelectedItem()+"'");
            while(rs.next()){
                String mailadd = rs.getString("email");
                jTextField8.setText(mailadd);
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // Update ReOrder Level
        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
             int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to Update Records ? ");
            if(x == 0){
                if(!jTextField29.getText().isEmpty() && !jTextField23.getText().isEmpty()){
                        s.executeUpdate("UPDATE reorderlevel SET ReOrderLevel = '" +jTextField29.getText()+ "' where Type = '"+"Lubricants"+"' ");
                        s.executeUpdate("UPDATE reorderlevel SET ReOrderLevel = '" +jTextField23.getText()+ "' where Type = '"+"SpareParts"+"' ");
                        ResultSet rs6 = s.executeQuery("Select *  from reorderlevel");
                        jTable4.setModel(DbUtils.resultSetToTableModel(rs6));
                    }
                else if(!jTextField29.getText().isEmpty()){
                     s.executeUpdate("UPDATE reorderlevel SET ReOrderLevel = '" +jTextField29.getText()+ "' where Type = '"+"Lubricants"+"' ");
                     ResultSet rs6 = s.executeQuery("Select *  from reorderlevel");
                     jTable4.setModel(DbUtils.resultSetToTableModel(rs6));
                }
                else if(!jTextField23.getText().isEmpty()){
                     s.executeUpdate("UPDATE reorderlevel SET ReOrderLevel = '" +jTextField23.getText()+ "' where Type = '"+"SpareParts"+"' ");
                     ResultSet rs6 = s.executeQuery("Select *  from reorderlevel");
                     jTable4.setModel(DbUtils.resultSetToTableModel(rs6));
                }
                jTextField29.setText("");
                jTextField23.setText(""); 
       } 
            else if(x == 1){
                jTextField29.setText("");
                jTextField23.setText(""); 
            }
       }
        catch(Exception e){
           // e.printStackTrace();
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // Get spareparts which are not set selling price
        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs1 = s.executeQuery("Select ItemID, ItemName,Cost, SellingPrice from subpartname  ");
            jTable5.setModel(DbUtils.resultSetToTableModel(rs1));
            
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // getting Lubricants which not set selling price
        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs1 = s.executeQuery("Select ItemNo, ItemName,Amount_L,Price,SellingPrice from lubricants ");
            jTable5.setModel(DbUtils.resultSetToTableModel(rs1));
            
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // Set Selling Price
         try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            if(jRadioButton6.isSelected() && !jTextField40.getText().isEmpty()){
                    s.executeUpdate("UPDATE subpartname SET SellingPrice = '" +jTextField40.getText()+ "' where ItemID = '"+jTextField33.getText()+"' ");
                     ResultSet rs1 = s.executeQuery("Select ItemID, ItemName,Cost, SellingPrice  from subpartname");
                     jTable5.setModel(DbUtils.resultSetToTableModel(rs1));
                
            }
            else if(jRadioButton7.isSelected() && !jTextField40.getText().isEmpty()){
                    s.executeUpdate("UPDATE lubricants SET SellingPrice = '" +jTextField40.getText()+ "' where ItemNo = '"+jTextField33.getText()+"' ");
                     ResultSet rs1 = s.executeQuery("Select ItemNo, ItemName,Amoun_L,Price, SellingPrice  from lubricants");
                     jTable5.setModel(DbUtils.resultSetToTableModel(rs1));
                
            }
            else if(jTextField40.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Please Set price");
            }
            jTextField33.setText("");
            jTextField35.setText("");
            jTextField38.setText("");
            jTextField40.setText("");
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
        if(jRadioButton6.isSelected()){
            int row = jTable5.getSelectedRow();
            String Id = jTable5.getValueAt(row, 0).toString();
            String Name = jTable5.getValueAt(row, 1).toString();
            String uCost = jTable5.getValueAt(row, 2).toString();
            jTextField33.setText(Id);
            jTextField35.setText(Name);
            jTextField38.setText(uCost);
        }
        else if(jRadioButton7.isSelected()){
            int row = jTable5.getSelectedRow();
            String Id = jTable5.getValueAt(row, 0).toString();
            String Name = jTable5.getValueAt(row, 1).toString();
            String uCost = jTable5.getValueAt(row, 3).toString();
            jTextField33.setText(Id);
            jTextField35.setText(Name);
            jTextField38.setText(uCost);
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
        //load relavant data from supplier spare parts
        jComboBox2.removeAllItems();
        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs1 = s.executeQuery("select `ItemID`, `ItemName`, Quanty from subpartname where Quanty <= "+sqty+" ");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs1));
            ResultSet rs = s.executeQuery("SELECT * FROM supplier where Type = '"+"Spare Parts"+"'");
            while(rs.next()){
                jComboBox2.addItem(rs.getString("CompanyName"));
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void jRadioButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton5MouseClicked
        // load relavant data from supplier lubricant
        jComboBox2.removeAllItems();
        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            ResultSet rs1 = s.executeQuery("select `ItemName`,  `Amount_L`, `Quantity` from lubricants where Quantity <= "+lqty+" ");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs1));
            ResultSet rs = s.executeQuery("SELECT * FROM supplier where Type = '"+"Lubricants"+"'");
            while(rs.next()){
                jComboBox2.addItem(rs.getString("CompanyName"));
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jRadioButton5MouseClicked

    private void jRadioButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton4MouseReleased

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // Send mail
        SendMail sm =  new SendMail(jTextField8.getText(),jTextField9.getText(),jTextArea1.getText());
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        try {

            char c = evt.getKeyChar();
            if(!Character.isDigit(c) || !Character.isAlphabetic(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField24KeyTyped
        // TODO add your handling code here:
        try {

            char c = evt.getKeyChar();
            if(!Character.isAlphabetic(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField24KeyTyped

    private void jTextField26KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField26KeyTyped
        try {
            String input = jTextField26.getText();
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
    }//GEN-LAST:event_jTextField26KeyTyped

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // fill brand table
        try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            jComboBox7.removeAllItems();
            jComboBox7.addItem("Select");
            if(!jComboBox6.getSelectedItem().equals("Select")){
                ResultSet rs = s.executeQuery("SELECT  Model FROM vehicletype where Brand = '"+jComboBox6.getSelectedItem().toString()+"' ");
                while(rs.next()){
                jComboBox7.addItem(rs.getString("Model"));
            }
            
        }
        else if(jComboBox6.getSelectedItem().equals("Select")){
            jComboBox6.addItem("Select");
             
        }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
       try{
            Connection c = DB.mycon();
            Statement s = c.createStatement();
            jComboBox14.removeAllItems();
            jComboBox14.addItem("Select");
            if(!jComboBox13.getSelectedItem().equals("Select")){
                ResultSet rs = s.executeQuery("SELECT  Model FROM vehicletype where Brand = '"+jComboBox13.getSelectedItem().toString()+"' ");
                while(rs.next()){
                jComboBox14.addItem(rs.getString("Model"));
            }
            
        }
        else if(jComboBox13.getSelectedItem().equals("Select")){
            jComboBox14.addItem("Select");
             
        }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Log out ? ");
        if(x== 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to Log out ? ");
        if(x== 0){
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jTextField23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyTyped
        char c = evt.getKeyChar();
            if(!Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_jTextField23KeyTyped

    private void jTextField29KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField29KeyTyped
       char c = evt.getKeyChar();
            if(!Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_jTextField29KeyTyped

    private void jTextField38KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField38KeyTyped
       char c = evt.getKeyChar();
            if(!Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_jTextField38KeyTyped

    private void jTextField40KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField40KeyTyped
        char c = evt.getKeyChar();
            if(!Character.isDigit(c))
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
    }//GEN-LAST:event_jTextField40KeyTyped

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private datechooser.beans.DateChooserCombo dateChooserCombo3;
    private datechooser.beans.DateChooserCombo dateChooserCombo4;
    private datechooser.beans.DateChooserCombo dateChooserCombo5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
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
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable supplierDetails;
    // End of variables declaration//GEN-END:variables
}
