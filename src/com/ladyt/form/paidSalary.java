/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ladyt.form;

import employee_connectivity.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lady T
 */
public class paidSalary extends javax.swing.JPanel {
     DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form paidSalary
     */
    public paidSalary() {
        initComponents();
        paidSal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Staff ID", "Full Name", "Department", "Present Days", "Basic Salary", "Transport", "Health", "Leave", "Grosspay", "Tax", "Deduction", "From Date", "To Date", "Payment Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setRowHeight(35);
        jTable1.setSelectionBackground(new java.awt.Color(56, 138, 112));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


    private void paidSal() {
       jScrollPane1.getViewport().remove(jTable1);
        model = (DefaultTableModel) jTable1.getModel();
        String[] ColumnName = {"SN","EMPLOYEE ID", "FULL NAME", "DEPARTMENT","DAYS PRESENT", "BASIC SALARY",
            "TRANSPORT","HEALTH","LEAVE","GROSSPAY","TAX","DEDUCTION","PAID","FROM DATE","TO DATE","PAYMENT DATE"};
                   
       String[][] data;
        int Total = 0;
        String viewAllCont = "Select * from paidsalary;";
        System.out.println("Seen");
        try {
                    connection cconnection = new connection();
                    Connection conn = cconnection.getConnection();
               
            Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet result = stat.executeQuery(viewAllCont);
            

            int i = 0;
            result.afterLast();
            if (result.previous()) {
                Total = result.getRow();
            }
            result.beforeFirst();
            data = new String[Total][16];
            if (Total != 0) {
                while (result.next()) {
                    
                    data[i][0] = result.getString("id");     
                    data[i][1] = result.getString("employeeId");        
                    data[i][2] = result.getString("employeeFullName");
                    data[i][3] = result.getString("department");
                    data[i][4] = result.getString("daysPresent");
                    data[i][5] = result.getString("basSalary");
                    data[i][6] = result.getString("transport");
                    data[i][7] = result.getString("health");
                    data[i][8] = result.getString("leave");
                    data[i][9] = result.getString("grosspay");
                    data[i][10] = result.getString("tax");
                    data[i][11] = result.getString("deduction");
                    data[i][12] = result.getString("paid");
                    data[i][13] = result.getString("datFrom");
                    data[i][14] = result.getString("datTo");
                    data[i][15] = result.getString("datePaid");
                                
                    i++;

                }
                  
            } else {
                data[i][0] = null;
                data[i][1] = null;
                data[i][2] = null;
                data[i][3] = null;
                data[i][4] = null;
                data[i][5]= null; 
                data[i][6] = null;
                data[i][7]= null;
                data[i][8] = null;
                data[i][9] = null;
                data[i][10] = null;
                data[i][11] = null;
                data[i][12] = null;
                data[i][13]= null; 
                data[i][14] = null;
                data[i][15]= null;
            }
            jTable1 = new JTable(data,ColumnName);
            jTable1.setFillsViewportHeight(true);
             jTable1.setEnabled(false);
            jScrollPane1.getViewport().add(jTable1);

        }
            catch(SQLException e){
        }
    }   
}
