/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PatientRole;

import NewLifeCenter.NewLife;
import NewLife.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shivaniguglani
 */
public class PatientAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientAreaPanel
     */
    
    private JPanel userProcessContainer;
    NewLife newLife;
    private UserAccount userAccount;
    
    public PatientAreaPanel(JPanel userProcessContainer, UserAccount account, NewLife newLife) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.newLife = newLife;
        this.userAccount = account;
    }
    private void OrderIssue() {
        AppointmentSchedule placeOrderJPanel = new AppointmentSchedule(userProcessContainer, userAccount, newLife);
        userProcessContainer.add("PlaceOrderJPanel", placeOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    
    private void OrderInfoAndFeedback() {
        AppointmentInfo orderStatusJPanel = new AppointmentInfo(userProcessContainer, newLife, userAccount);
        userProcessContainer.add("MedicineOrderInfo", orderStatusJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    private void MedicineOrderIssue(){
        MedicineOrder medicineOrderJPanel = new MedicineOrder(userProcessContainer, userAccount, newLife);
        userProcessContainer.add("MedicineOrder", medicineOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    private void emergencyRequest() {
        EmergencyRequest emergencyRequestJPanel = new EmergencyRequest(userProcessContainer, userAccount, newLife);
        userProcessContainer.add("EmergencyRequest", emergencyRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    private void doctorInfo() {
        DoctorInfo doctorInfo = new DoctorInfo(userProcessContainer, userAccount, newLife);
        userProcessContainer.add("DoctorInfo", doctorInfo);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    
    private void insuranceForm(){
        InsuranceClaimApprovalForm approvalForm = new InsuranceClaimApprovalForm(userProcessContainer, userAccount, newLife);
        userProcessContainer.add("ApprovalForm", approvalForm);
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

        btnOrderIssue = new javax.swing.JButton();
        btnorderInfoAndFeedback = new javax.swing.JButton();
        btnOrderIssue1 = new javax.swing.JButton();
        btnOrderIssue2 = new javax.swing.JButton();
        btnorderInfoAndFeedback1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnorderInfoAndFeedback2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        btnOrderIssue.setBackground(new java.awt.Color(255, 255, 204));
        btnOrderIssue.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnOrderIssue.setText("Manage Medicine Order");
        btnOrderIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderIssueActionPerformed(evt);
            }
        });

        btnorderInfoAndFeedback.setBackground(new java.awt.Color(255, 255, 204));
        btnorderInfoAndFeedback.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnorderInfoAndFeedback.setText("Insurance Claim Form");
        btnorderInfoAndFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuranceClaimApprovalbtnActionPerformed(evt);
            }
        });

        btnOrderIssue1.setBackground(new java.awt.Color(255, 255, 204));
        btnOrderIssue1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnOrderIssue1.setText("Manage Appointment");
        btnOrderIssue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderIssue1ActionPerformed(evt);
            }
        });

        btnOrderIssue2.setBackground(new java.awt.Color(255, 255, 204));
        btnOrderIssue2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnOrderIssue2.setText("Schedule Emergency Request");
        btnOrderIssue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderIssue2ActionPerformed(evt);
            }
        });

        btnorderInfoAndFeedback1.setBackground(new java.awt.Color(255, 255, 204));
        btnorderInfoAndFeedback1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnorderInfoAndFeedback1.setText("View Doctor Information");
        btnorderInfoAndFeedback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderInfoAndFeedback1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/PatientRole/aaaa1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME, DEAR PATIENT!");

        btnorderInfoAndFeedback2.setBackground(new java.awt.Color(255, 255, 204));
        btnorderInfoAndFeedback2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnorderInfoAndFeedback2.setText("View Hospital Information");
        btnorderInfoAndFeedback2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderInfoAndFeedback2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnorderInfoAndFeedback2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnOrderIssue1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnorderInfoAndFeedback1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOrderIssue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOrderIssue2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnorderInfoAndFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnOrderIssue1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnorderInfoAndFeedback1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnOrderIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrderIssue2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnorderInfoAndFeedback2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnorderInfoAndFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderIssueActionPerformed
        MedicineOrderIssue();
    }//GEN-LAST:event_btnOrderIssueActionPerformed

    private void btnOrderIssue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderIssue1ActionPerformed
        OrderIssue();
    }//GEN-LAST:event_btnOrderIssue1ActionPerformed

    private void btnOrderIssue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderIssue2ActionPerformed
        emergencyRequest();
    }//GEN-LAST:event_btnOrderIssue2ActionPerformed

    private void btnorderInfoAndFeedback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderInfoAndFeedback1ActionPerformed
        doctorInfo();
    }//GEN-LAST:event_btnorderInfoAndFeedback1ActionPerformed

    private void btnorderInfoAndFeedback2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderInfoAndFeedback2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnorderInfoAndFeedback2ActionPerformed

    private void insuranceClaimApprovalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuranceClaimApprovalbtnActionPerformed
        // TODO add your handling code here:
        insuranceForm();
    }//GEN-LAST:event_insuranceClaimApprovalbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderIssue;
    private javax.swing.JButton btnOrderIssue1;
    private javax.swing.JButton btnOrderIssue2;
    private javax.swing.JButton btnorderInfoAndFeedback;
    private javax.swing.JButton btnorderInfoAndFeedback1;
    private javax.swing.JButton btnorderInfoAndFeedback2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
