/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PorterRole;

import NewLife.NewLife;
import NewLife.UserAccount.UserAccount;
import NewLife.WorkList.LabWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kartik
 */
public class ProcessPorterRequest extends javax.swing.JPanel {

    /**
     * Creates new form ProcessPorterRequest
     */
    public ProcessPorterRequest() {
        initComponents();
    }
    JPanel userProcessContainer;
    NewLife newlife;
    UserAccount userAccount;
    LabWorkRequest workRequest;
    LabWorkRequest labTestWorkRequest;
    /**
     * Creates new form ProcessWorkRequestJPanel
     * @param userProcessContainer
     * @param newlife
     * @param account
     * @param workRequest
     */
    public ProcessPorterRequest(JPanel userProcessContainer, NewLife newlife, UserAccount account, LabWorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.newlife = newlife;
        this.userAccount = account;
        this.workRequest = workRequest;
        changeButtonText();
        display();
    }

    private void display() {

        restaurantNameValue.setText(workRequest.getPharmacy().getPharmacyName());
        customerNameValue.setText(workRequest.getPatient().getName());
        patientaddress.setText(workRequest.getPatient().getAddress());
        patientcontact.setText(workRequest.getPatient().getPhone());
        status.setText(workRequest.getStatus());

    }

    private void changeButtonText() {
        switch (workRequest.getStatus()) {
            case "Prepared":
                btnStatus.setText("Pick Order");
                break;
            case "Out for delivery":
                btnStatus.setText("Complete Delivery");
                break;
            default:
                btnStatus.setVisible(false);
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        restaurantNameValue = new javax.swing.JLabel();
        customerNameValue = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnStatus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        patientaddress = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientcontact = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pharmacy Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(56, 136, 0, 0);
        add(jLabel1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 159, 0, 0);
        add(jLabel3, gridBagConstraints);

        restaurantNameValue.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        restaurantNameValue.setForeground(new java.awt.Color(255, 255, 255));
        restaurantNameValue.setText("<Value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(56, 23, 0, 0);
        add(restaurantNameValue, gridBagConstraints);

        customerNameValue.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        customerNameValue.setForeground(new java.awt.Color(255, 255, 255));
        customerNameValue.setText("<Value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 23, 0, 0);
        add(customerNameValue, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ORDER DETAILS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 438;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 6);
        add(jLabel9, gridBagConstraints);

        btnStatus.setBackground(new java.awt.Color(255, 255, 204));
        btnStatus.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnStatus.setText("Pick Order");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 223, 213, 0);
        add(btnStatus, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 219, 0, 0);
        add(jLabel5, gridBagConstraints);

        status.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("<Value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 0);
        add(status, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Patient Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 143, 0, 0);
        add(jLabel4, gridBagConstraints);

        patientaddress.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        patientaddress.setForeground(new java.awt.Color(255, 255, 255));
        patientaddress.setText("<Value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 23, 0, 0);
        add(patientaddress, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Patient Contact");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 145, 0, 0);
        add(jLabel6, gridBagConstraints);

        patientcontact.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        patientcontact.setForeground(new java.awt.Color(255, 255, 255));
        patientcontact.setText("<Value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 23, 0, 0);
        add(patientcontact, gridBagConstraints);

        backJButton.setBackground(new java.awt.Color(255, 255, 204));
        backJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(backJButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed

        if (workRequest.getStatus().equals("Prepared")) {
            workRequest.setStatus("Out for delivery");
            workRequest.setTestResult("In Process");
            JOptionPane.showMessageDialog(null, "order picked up");
        } else if (workRequest.getStatus().equals("Out for delivery")) {
            workRequest.setStatus("Delivered");
            workRequest.setTestResult("Completed");
            JOptionPane.showMessageDialog(null, "Order delivered");
        } else {
            btnStatus.setVisible(false);
        }
        changeButtonText();
        status.setText(workRequest.getStatus());

    }//GEN-LAST:event_btnStatusActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        PorterWorkArea deliveryManWorkAreaJPanel = new PorterWorkArea(userProcessContainer, userAccount, newlife);
        userProcessContainer.add("DeliveryManWorkAreaJPanel", deliveryManWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnStatus;
    private javax.swing.JLabel customerNameValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel patientaddress;
    private javax.swing.JLabel patientcontact;
    private javax.swing.JLabel restaurantNameValue;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
