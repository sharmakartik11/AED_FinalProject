/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmacyAdminRole;

import NewLifeCenter.NewLife;
import NewLife.UserAccount.UserAccount;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kartik
 */
public class PharmacyAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyAdminWorkArea
     */
    
    JPanel userProcessContainer;
    NewLife newlife;
    UserAccount userAccount;
    public PharmacyAdminWorkArea(JPanel userProcessContainer, UserAccount userAccount, NewLife newlife) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.newlife=newlife;
        this.userAccount = userAccount; 
    }
    
    private void manageOrders() {
        ManageOrders viewOrderDetails = new ManageOrders(userProcessContainer,newlife,userAccount);
        userProcessContainer.add("ViewOrderDetails",viewOrderDetails);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    
    private void manageMenu() {
        CreateItem createMenuItemJPanel = new CreateItem(userProcessContainer,userAccount,newlife);
        userProcessContainer.add("CreateMenuItemJPanel",createMenuItemJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    
    private void manageInfo() {
        ManagePharmacies updateRestaurantInfoJPanel = new ManagePharmacies(userProcessContainer,newlife, userAccount);
        userProcessContainer.add("UpdateRestaurantInfoJPanel",updateRestaurantInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    private void manageDeliveryMan() {
        ManagePorter manageDeliveryManJPanel = new ManagePorter(userProcessContainer,newlife, userAccount);
        userProcessContainer.add("ManageDeliveryManJPanel",manageDeliveryManJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    private void managePharmaceutical() {
        OrderMeds medicineOrderJPanel = new OrderMeds(userProcessContainer,userAccount,newlife);
        userProcessContainer.add("MedicineOrderJPanel",medicineOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        manageOrganizationJButton1 = new javax.swing.JButton();
        manageOrganizationJButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME PHARMACY ADMIN !");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 0, 6);
        add(jLabel1, gridBagConstraints);

        userJButton.setBackground(new java.awt.Color(255, 255, 204));
        userJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        userJButton.setText("Manage Pharmacy Information");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 234, 0, 0);
        add(userJButton, gridBagConstraints);

        manageEmployeeJButton.setBackground(new java.awt.Color(255, 255, 204));
        manageEmployeeJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        manageEmployeeJButton.setText("Manage Inventory");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 234, 0, 0);
        add(manageEmployeeJButton, gridBagConstraints);

        manageOrganizationJButton.setBackground(new java.awt.Color(255, 255, 204));
        manageOrganizationJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        manageOrganizationJButton.setText("Manage Orders");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 234, 0, 0);
        add(manageOrganizationJButton, gridBagConstraints);

        manageOrganizationJButton1.setBackground(new java.awt.Color(255, 255, 204));
        manageOrganizationJButton1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        manageOrganizationJButton1.setText("Manage DeliveryMan");
        manageOrganizationJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 234, 0, 0);
        add(manageOrganizationJButton1, gridBagConstraints);

        manageOrganizationJButton2.setBackground(new java.awt.Color(255, 255, 204));
        manageOrganizationJButton2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        manageOrganizationJButton2.setText("Manage Pharmaceutical Order");
        manageOrganizationJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 234, 6, 0);
        add(manageOrganizationJButton2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/PharmacyAdminRole/pharmacy.jpeg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(8000, 4929));
        jLabel3.setPreferredSize(new java.awt.Dimension(8000, 4929));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 444;
        gridBagConstraints.ipady = -4705;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 55, 0, 0);
        add(jLabel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        manageInfo();
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        manageMenu();
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        manageOrders();
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageOrganizationJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButton1ActionPerformed
        manageDeliveryMan();
    }//GEN-LAST:event_manageOrganizationJButton1ActionPerformed

    private void manageOrganizationJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButton2ActionPerformed
        managePharmaceutical();
    }//GEN-LAST:event_manageOrganizationJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageOrganizationJButton1;
    private javax.swing.JButton manageOrganizationJButton2;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
