/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.InsuranceAdminRole;

import NewLife.UserAccount.UserAccount;
import NewLifeCenter.NewLife;
import UI.InsuranceAdminRole.PatientRecords;
import UI.InsuranceAdminRole.ViewOrderDetails;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shivanidatar
 */
public class InsuranceAdmin extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceAdmin
     */
    JPanel userProcessContainer;
    NewLife ecosystem;
    UserAccount userAccount;
    public InsuranceAdmin(JPanel userProcessContainer, UserAccount userAccount, NewLife ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.userAccount = userAccount; 
    }
    
    // Manage orders
    private void manageClaims() {
        ViewOrderDetails viewOrderDetails = new ViewOrderDetails(userProcessContainer,ecosystem,userAccount);
        userProcessContainer.add("ViewOrderDetails",viewOrderDetails);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    
    private void manageInfo() {
        PatientRecords updatePatientInfoJPanel = new PatientRecords(userProcessContainer,ecosystem, userAccount);
        userProcessContainer.add("updatePatientInfoJPanel",updatePatientInfoJPanel);
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
        btnManageApprovals = new javax.swing.JButton();
        btnViewPatientRecords = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Malayalam Sangam MN", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME INSURANCE ADMIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(105, 0, 0, 0);
        add(jLabel1, gridBagConstraints);

        btnManageApprovals.setBackground(new java.awt.Color(255, 255, 204));
        btnManageApprovals.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnManageApprovals.setText("Manage approvals");
        btnManageApprovals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageApprovalsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(448, 40, 0, 0);
        add(btnManageApprovals, gridBagConstraints);

        btnViewPatientRecords.setBackground(new java.awt.Color(255, 255, 204));
        btnViewPatientRecords.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnViewPatientRecords.setText("View Patient Records");
        btnViewPatientRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientRecordsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(458, 20, 85, 1);
        add(btnViewPatientRecords, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/InsuranceAdminRole/insuranceimage.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -59;
        gridBagConstraints.ipady = -54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(85, 0, 0, 0);
        add(jLabel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageApprovalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageApprovalsActionPerformed
        // TODO add your handling code here:
        manageClaims();
    }//GEN-LAST:event_btnManageApprovalsActionPerformed

    private void btnViewPatientRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientRecordsActionPerformed
        // TODO add your handling code here:
        manageInfo();
    }//GEN-LAST:event_btnViewPatientRecordsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageApprovals;
    private javax.swing.JButton btnViewPatientRecords;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
