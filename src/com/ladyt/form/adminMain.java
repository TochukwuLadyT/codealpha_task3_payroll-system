package com.ladyt.form;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.ladyt.menu.EventMenu;
import com.ladyt.menu.MainForm;
import com.ladyt.menu.MenuItem;
import java.awt.Component;
import java.awt.Toolkit;





/**
 *
 * @author raven
 */
public class adminMain extends javax.swing.JFrame {
    private MainForm main;
    /**
     * Creates new form Main
     */
   public adminMain() {
        initComponents();
         FlatAnimatedLafChange.showSnapshot();
         FlatDarculaLaf.setup();
         FlatLaf.updateUI();
         FlatAnimatedLafChange.hideSnapshotWithAnimation();
        
        setLogo();
        menu1.addEventMenuSelected(new EventMenu(){
            @Override
            public void mainMenuSelected(MainForm mainForm, int index, MenuItem menuItem) {
               
            }

            @Override
            public void subMenuSelected(MainForm mainForm, int index, int subMenuIndex, Component menuItem) {

              if (index == 0) {
                    if (subMenuIndex == 0) {
                      mainForm.displayForm(new add_employee());               
                    } 
                    else if (subMenuIndex == 1) {             
                        mainForm.displayForm(new manage_employee());
                    }  
                }
              
                 if (index == 1) {
                    if (subMenuIndex == 0) {
                      mainForm.displayForm(new mark_attendance());               
                    } 
                    else if (subMenuIndex == 1) {             
                        mainForm.displayForm(new view_attendance());
                    }  
                    else if (subMenuIndex == 2) {             
                        mainForm.displayForm(new employeelogindetails());
                    }  
                }
                 
                 if (index == 2) {
                    if (subMenuIndex == 0) {
                      mainForm.displayForm(new request_leave());               
                    } 
                    else if (subMenuIndex == 1) {             
                        mainForm.displayForm(new leave_response());
                    }
                    else if (subMenuIndex == 2) {             
                        mainForm.displayForm(new allLeave());
                    }
                }
                 
                 if (index == 3) {
                    if (subMenuIndex == 0) {
                      mainForm.displayForm(new calculate_salary());               
                    }  
                     if (subMenuIndex == 1) {
                      mainForm.displayForm(new paidSalary());               
                    } 
                 }
                if (index == 4) {
                    if (subMenuIndex == 0) {
                      mainForm.displayForm(new removeEmployee());               
                    }  
                    
                     if (subMenuIndex == 1) {
                      mainForm.displayForm(new adminLogout());               
                    } 
                 }
    
            }
            
        });
      
        menu1.setSelectedIndex(0);
  
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new com.ladyt.menu.Menu();
        jLabel1 = new javax.swing.JLabel();
        menuItem1 = new com.ladyt.menu.MenuItem();
        menuItem2 = new com.ladyt.menu.MenuItem();
        menuItem3 = new com.ladyt.menu.MenuItem();
        menuItem4 = new com.ladyt.menu.MenuItem();
        menuItem5 = new com.ladyt.menu.MenuItem();
        subMenuPanel1 = new com.ladyt.menu.SubMenuPanel();
        mainForm = new com.ladyt.menu.MainForm();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page");

        menu1.setMainForm(mainForm);
        menu1.setSubMenuPanel(subMenuPanel1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ladyt/form/logo_1.png"))); // NOI18N
        menu1.add(jLabel1);

        menuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ladyt/icon/im3 - Copy.png"))); // NOI18N
        menuItem1.setText("menuItem1");
        menuItem1.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/ladyt/icon/im3.png", "com/ladyt/icon/im4.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem1.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Add", "Manage" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu1.add(menuItem1);

        menuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ladyt/icon/im2 - Copy.png"))); // NOI18N
        menuItem2.setText("menuItem2");
        menuItem2.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/ladyt/icon/im5.png", "com/ladyt/icon/im3.png", "com/ladyt/icon/login - Copy.png", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem2.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Attendance", "View", "Login Details" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu1.add(menuItem2);

        menuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ladyt/icon/im5 - Copy.png"))); // NOI18N
        menuItem3.setText("menuItem3");
        menuItem3.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/ladyt/icon/im1.png", "com/ladyt/icon/im2.png", "com/ladyt/icon/paylogo.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem3.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Leave Request", "Leave Response", "All Leaves" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu1.add(menuItem3);

        menuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ladyt/icon/im6 - Copy.png"))); // NOI18N
        menuItem4.setText("menuItem4");
        menuItem4.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/ladyt/icon/im6.png", "com/ladyt/icon/im8.png", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem4.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Calculate Salary", "Paid Salary" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu1.add(menuItem4);

        menuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ladyt/icon/logout.png"))); // NOI18N
        menuItem5.setText("menuItem5");
        menuItem5.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/ladyt/icon/2im1.png", "com/ladyt/icon/logout - Copy.png", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem5.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Remove Staff", "Logout" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu1.add(menuItem5);

        subMenuPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(40, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(subMenuPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addComponent(subMenuPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuItem1ActionPerformed
        // TODO add your handling code here:
    
    
    }//GEN-LAST:event_mainMenuItem1ActionPerformed

    public static void main(String args[]) {
        FlatLaf.registerCustomDefaultsSource("com.ladyt.style");
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.ladyt.menu.MainForm mainForm;
    private com.ladyt.menu.Menu menu1;
    private com.ladyt.menu.MenuItem menuItem1;
    private com.ladyt.menu.MenuItem menuItem2;
    private com.ladyt.menu.MenuItem menuItem3;
    private com.ladyt.menu.MenuItem menuItem4;
    private com.ladyt.menu.MenuItem menuItem5;
    private com.ladyt.menu.SubMenuPanel subMenuPanel1;
    // End of variables declaration//GEN-END:variables

    private void setLogo() {
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_1.png")));
    }

}
