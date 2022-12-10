/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import NewLifeCenter.NewLife;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shivanidatar
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkArea
     */
    JPanel userProcessContainer;
    NewLife ecosystem;
    public SystemAdminWorkArea(JPanel userProcessContainer,NewLife ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
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

        btnManageHospital = new javax.swing.JButton();
        btnManagePharmaceutical = new javax.swing.JButton();
        btnManagePharmacy = new javax.swing.JButton();
        btnManageGovernment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new java.awt.GridBagLayout());

        btnManageHospital.setBackground(new java.awt.Color(255, 255, 204));
        btnManageHospital.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnManageHospital.setText("Manage Hospital");
        btnManageHospital.setBorderPainted(false);
        btnManageHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospitalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 199;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 207, 0, 0);
        add(btnManageHospital, gridBagConstraints);

        btnManagePharmaceutical.setBackground(new java.awt.Color(255, 255, 204));
        btnManagePharmaceutical.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnManagePharmaceutical.setText("Manage Pharmaceutical");
        btnManagePharmaceutical.setBorderPainted(false);
        btnManagePharmaceutical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmaceuticalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 133;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 207, 0, 0);
        add(btnManagePharmaceutical, gridBagConstraints);

        btnManagePharmacy.setBackground(new java.awt.Color(255, 255, 204));
        btnManagePharmacy.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnManagePharmacy.setText("Manage Pharmacy");
        btnManagePharmacy.setBorderPainted(false);
        btnManagePharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmacyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 186;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 207, 0, 0);
        add(btnManagePharmacy, gridBagConstraints);

        btnManageGovernment.setBackground(new java.awt.Color(255, 255, 204));
        btnManageGovernment.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnManageGovernment.setText("Manage Government");
        btnManageGovernment.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 207, 28, 0);
        add(btnManageGovernment, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/SystemAdmin/systemadminColor.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 237;
        gridBagConstraints.ipady = -193;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 30, 0, 0);
        add(jLabel3, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME SYSTEM ADMIN !");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 251;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 24, 0, 25);
        add(jLabel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospitalActionPerformed
        // TODO add your handling code here:
        ManageHospital manageHospitalJPanel =new ManageHospital(userProcessContainer, ecosystem);
        userProcessContainer.add("manageHospitalJPanel",manageHospitalJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageHospitalActionPerformed

    private void btnManagePharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmacyActionPerformed
        // TODO add your handling code here:
        ManagePharmacy managePharmacyJPanel =new ManagePharmacy(userProcessContainer, ecosystem);
        userProcessContainer.add("managePharmacyJPanel",managePharmacyJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePharmacyActionPerformed

    private void btnManagePharmaceuticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmaceuticalActionPerformed
        // TODO add your handling code here:
        ManagePharmaceutical manageParmaceuticalJPanel =new ManagePharmaceutical(userProcessContainer, ecosystem);
        userProcessContainer.add("manageParmaceuticalJPanel",manageParmaceuticalJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePharmaceuticalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageGovernment;
    private javax.swing.JButton btnManageHospital;
    private javax.swing.JButton btnManagePharmaceutical;
    private javax.swing.JButton btnManagePharmacy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
