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
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import ladyt.cell.TableActionCellEditor;
import ladyt.cell.TableActionCellRender;
import ladyt.cell.TableActionEvent;


/**
 *
 * @author Lady T
 */
public class manage_employee extends javax.swing.JPanel {
      DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form manage_employee
     */
    public manage_employee() {
        initComponents();
        view();
    }
    update_employee jRowData = new update_employee();
    activate_employee jRowData1 = new activate_employee();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SN", "Staff ID", "Full Name", "Department", "Phone Number", "Address", "Basic Salary", "Transport", "Health", "Leave", "Date Joined", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
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
            .addGap(0, 714, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

 
    private void view() {
        jScrollPane1.getViewport().remove(jTable1);
        model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getRowCount();
        String[] ColumnName = {"SN","EMPLOYEE ID", "FULL NAME","DEPARTMENT", "PHONE NUMBER",
            "ADDRESS", "BASIC SALARY","TRANSPORT ALLOWANCE", "HEALTH ALLOWANCE", "LEAVE ALLOWANCE","DATE JOINED","ACTION"};
                   
       String[][] data;
        int Total = 0;
        String viewAllCont = "Select * from employee;";
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
            data = new String[Total][11];
            if (Total != 0) {
                while (result.next()) {
                    
                    data[i][0] = result.getString("id");     
                    data[i][1] = result.getString("employeeId");        
                    data[i][2] = result.getString("employeeFullName");
                    data[i][3] = result.getString("department");
                    data[i][4] = result.getString("employeeEmail");
                    data[i][5] = result.getString("employeePhone");
                    data[i][6] = result.getString("basicSalary");
                    data[i][7] = result.getString("transportAllowance");
                    data[i][8] = result.getString("healthAllowance");
                    data[i][9] = result.getString("leaveAllowance");
                    data[i][10] = result.getString("dateOfJoining");                        
                    i++;

                }
                  
            } else {
  
            }

            model.setDataVector(data, ColumnName);
            jTable1.getColumnModel().getColumn(11).setCellRenderer(new TableActionCellRender());
            TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {  
                 int rows = jTable1.getSelectedRow();       
                 String id = jTable1.getModel().getValueAt(rows, 0).toString();
                 String employeeId = jTable1.getModel().getValueAt(rows, 1).toString();
                 String fullName = jTable1.getModel().getValueAt(rows, 2).toString(); 
                 String department = jTable1.getModel().getValueAt(rows, 3).toString(); 
                 String emailAdd = jTable1.getModel().getValueAt(rows, 4).toString();
                 String phoneNo = jTable1.getModel().getValueAt(rows, 5).toString();
                 String basicSalary = jTable1.getModel().getValueAt(rows, 6).toString();
                 String transAllow = jTable1.getModel().getValueAt(rows, 7).toString();
                 String healthAllow = jTable1.getModel().getValueAt(rows, 8).toString();
                 String leaveAllow = jTable1.getModel().getValueAt(rows, 9).toString();
               
                 
                 try{
                    jRowData.setVisible(true);
                    jRowData.pack();
                    jRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    jRowData.jLabel2.setText(employeeId);
                    jRowData.jTextField1.setText(fullName);
                    jRowData.jTextField5.setText(department);
                    jRowData.jTextField2.setText(emailAdd);
                    jRowData.jTextField3.setText(phoneNo);
                    jRowData.jTextField6.setText(basicSalary);
                    jRowData.jTextField7.setText(transAllow);
                    jRowData.jTextField8.setText(healthAllow);
                    jRowData.jTextField9.setText(leaveAllow);
                
          
                 }catch(Exception m){
                 }
         
            }

            @Override
            public void onDelete(int row) {
                if (jTable1.isEditing()) {
                    jTable1.getCellEditor().stopCellEditing();
                  
                }
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int rows = jTable1.getSelectedRow();       
                 String employeeId = jTable1.getModel().getValueAt(rows, 1).toString();
                try{
                 connection cconnection = new connection();
                 Connection conn = cconnection.getConnection();
                 Statement stat = conn.createStatement();
                 String mysql = "DELETE From employee Where employeeId = '" + employeeId + "';";
                 stat.executeUpdate(mysql); 
                 
                }catch(SQLException k){
                }
                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                 int rows = jTable1.getSelectedRow();       
                 String id = jTable1.getModel().getValueAt(rows, 0).toString();
                 String employeeId = jTable1.getModel().getValueAt(rows, 1).toString();
                 String fullName = jTable1.getModel().getValueAt(rows, 2).toString();  
                 String emailAdd = jTable1.getModel().getValueAt(rows, 4).toString();
                
                 try{
                    jRowData1.setVisible(true);
                    jRowData1.pack();
                    jRowData1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    jRowData1.jLabel1.setText(employeeId);
                    jRowData1.jLabel2.setText(fullName);
                    jRowData1.jLabel4.setText(emailAdd);

                 }catch(Exception m){
                 }

            }
            
        };
              jTable1.getColumnModel().getColumn(11).setCellEditor(new TableActionCellEditor(event));
           
            jTable1.setFillsViewportHeight(true);
            jScrollPane1.getViewport().add(jTable1);
    }catch(SQLException j){
    }
    }
    
}
      
    

