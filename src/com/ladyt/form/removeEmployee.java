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
import javax.swing.JOptionPane;

/**
 *
 * @author Lady T
 */
public class removeEmployee extends javax.swing.JPanel {

    /**
     * Creates new form removeEmployee
     */
    public removeEmployee() {
        initComponents();
        employeeId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setText("Remove Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Employee ID" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, 252, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           try {
         String empId = jComboBox1.getSelectedItem().toString();
         String delete = "Delete From employee where employeeId = '"+empId+"';";
         String delet = "Delete From employeelogindetails where employeeId = '"+empId+"';";
         String dele = "Delete From attendance where employeeId = '"+empId+"';";
         String deler = "Delete From leave_request where employeeId = '"+empId+"';";
         int Choser = JOptionPane.showConfirmDialog(null,"'This will remove all information about the selected Employee'Are you sure you want to Delete",
         "Delete Info",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
         try{
                    connection cconnection = new connection();
                    Connection conn = cconnection.getConnection();
                    Statement stat = conn.createStatement();
              
                    if(Choser == 0){

                            stat.executeUpdate(delete);
                            stat.executeUpdate(delet);
                            stat.executeUpdate(dele);
                            stat.executeUpdate(deler);
                            JOptionPane.showMessageDialog(null,"Delete Successful",
                            "Information",JOptionPane.INFORMATION_MESSAGE);

                }else{
                        
                    }

        }catch(SQLException x){
           
        }
  
    }catch(Exception y){
       
    }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables

    private void employeeId() {
             String se = "Select DISTINCT employeeId From employee;";
        try {
            connection cconnection = new connection();
                    Connection conn = cconnection.getConnection();
                    Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(se);
            while (res.next()) {
                jComboBox1.addItem(res.getString("employeeId"));

            }
             conn.close();
        } catch (SQLException ex) {
        }
    }
}
