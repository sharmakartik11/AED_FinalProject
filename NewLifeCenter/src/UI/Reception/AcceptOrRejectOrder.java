/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package UI.Reception;

import NewLife.Doctors.Doctor;
import NewLife.Doctors.DoctorDirectory;
import NewLife.Porter.PorterDirectory;
import NewLife.UserAccount.UserAccount;
import NewLife.WorkList.LabWorkRequest;
import NewLifeCenter.NewLife;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shivanidatar
 */
public class AcceptOrRejectOrder extends javax.swing.JPanel {

    /** Creates new form AcceptOrRejectOrder */
    JPanel userProcessContainer;
    UserAccount userAccount;
    NewLife ecosystem;
    LabWorkRequest labTestWorkRequest;
    double total = 0.0;
    private PorterDirectory deliveryManDirectory;
    private DoctorDirectory doctorDirectory;
    private int index = -1;
    public AcceptOrRejectOrder(JPanel userProcessContainer, NewLife ecosystem, UserAccount userAccount, LabWorkRequest labTestWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.labTestWorkRequest = labTestWorkRequest;
        deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        doctorDirectory = ecosystem.getDoctorDirectory();
        fillDoctorList(doctorDirectory.getDoctorList());
        changeStatus();
        display();
    }
    
    private void changeStatus() {
        switch(labTestWorkRequest.getStatus()){
            case "Request to Hospital": {
                acceptOrder.setText("Accept appointment");
                declineOrder.setVisible(true);
            }
            case "Waiting for doctor to be assigned": {
                acceptOrder.setText("Ping the Doctor");
                declineOrder.setVisible(false);
            }
            default: {
                declineOrder.setVisible(false);
                acceptOrder.setVisible(false);
            }
        }
        fillStatusUI();
    }
    
    private void fillStatusUI() {
        if(labTestWorkRequest.getDoctor()== null && !("ordered".equalsIgnoreCase(labTestWorkRequest.getStatus()) || "declined".equalsIgnoreCase(labTestWorkRequest.getStatus()))){
            assignDoctorLabel.setVisible(true);
            assignDoctorComboBox.setVisible(true);
            
            jButtonAddDeliveryMan.setVisible(true);
            
        }
        else{
            jButtonAddDeliveryMan.setVisible(false);
            assignDoctorLabel.setVisible(false);
            assignDoctorComboBox.setVisible(false);
            
        }
    }
    
    public void fillDoctorList(ArrayList<Doctor> doctorList) {
        if(labTestWorkRequest.getDeliverMan() == null) {
            assignDoctorComboBox.setVisible(true);
            for (Doctor doctor : doctorList) {
                assignDoctorComboBox.addItem(doctor.getName());
            }
        }
        else {
            assignDoctorComboBox.setVisible(false);
        } 
    }
    
    private void display() {
        
        fillStatusUI();
        status.setText(labTestWorkRequest.getStatus());
        message.setText(labTestWorkRequest.getMessage());
    }
    
    private void declineOrder(){
        labTestWorkRequest.setStatus("Declined");
        JOptionPane.showMessageDialog(null, "Appointment has been declined");
        changeStatus();
        status.setText(labTestWorkRequest.getStatus());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel10 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        acceptOrder = new javax.swing.JButton();
        assignDoctorComboBox = new javax.swing.JComboBox<>();
        jButtonAddDeliveryMan = new javax.swing.JButton();
        assignDoctorLabel = new javax.swing.JLabel();
        declineOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new java.awt.GridBagLayout());

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Message");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 59, 0, 0);
        add(jLabel10, gridBagConstraints);

        message.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        message.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.ipadx = 216;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 93, 0, 0);
        add(message, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("APPOINTMENT DETAILS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 28;
        gridBagConstraints.ipadx = 338;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 0, 3);
        add(jLabel12, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Status");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 80, 0, 0);
        add(jLabel14, gridBagConstraints);

        status.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("<value>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 149;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 93, 0, 0);
        add(status, gridBagConstraints);

        btnBack1.setBackground(new java.awt.Color(255, 255, 204));
        btnBack1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 0);
        add(btnBack1, gridBagConstraints);

        acceptOrder.setBackground(new java.awt.Color(255, 255, 204));
        acceptOrder.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        acceptOrder.setText("Accept Appointment");
        acceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 25, 131, 0);
        add(acceptOrder, gridBagConstraints);

        assignDoctorComboBox.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        assignDoctorComboBox.setForeground(new java.awt.Color(255, 153, 51));
        assignDoctorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignDoctorActionPerformedComboBox(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 92, 0, 0);
        add(assignDoctorComboBox, gridBagConstraints);

        jButtonAddDeliveryMan.setBackground(new java.awt.Color(255, 255, 204));
        jButtonAddDeliveryMan.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jButtonAddDeliveryMan.setText("Assign");
        jButtonAddDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignDoctorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 12, 0, 0);
        add(jButtonAddDeliveryMan, gridBagConstraints);

        assignDoctorLabel.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        assignDoctorLabel.setForeground(new java.awt.Color(255, 255, 255));
        assignDoctorLabel.setText("Assign Doctor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 16, 0, 0);
        add(assignDoctorLabel, gridBagConstraints);

        declineOrder.setBackground(new java.awt.Color(255, 255, 204));
        declineOrder.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        declineOrder.setText("Decline Appointment");
        declineOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                declineOrderMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 10, 131, 0);
        add(declineOrder, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        ManageAppointments viewOrderDetails = new ManageAppointments(userProcessContainer,ecosystem, userAccount);
        userProcessContainer.add("ViewOrderDetails", viewOrderDetails);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void acceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderActionPerformed
        // TODO add your handling code here:
          if (labTestWorkRequest.getStatus().equals("Request to Hospital")) {
            labTestWorkRequest.setStatus("Waiting for doctor to be assigned");
            JOptionPane.showMessageDialog(null, " Appointment Scheduled. Waiting for doctor to be assigned");
        }
        else if(labTestWorkRequest.getStatus().equals("Waiting for doctor to be assigned")) {
            labTestWorkRequest.setStatus("Doctor Assigned");
            if(labTestWorkRequest.getDeliverMan() == null){
                JOptionPane.showMessageDialog(null, " Doctor Assigned");
            }
            else {
                JOptionPane.showMessageDialog(null, "Doctor will be assigned");
            }
        }

        else {
            acceptOrder.setVisible(false);
        }
        changeStatus();
        status.setText(labTestWorkRequest.getStatus());

    }//GEN-LAST:event_acceptOrderActionPerformed

    private void declineOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineOrderMouseClicked
        // TODO add your handling code here:
        declineOrder();
    }//GEN-LAST:event_declineOrderMouseClicked

    private void assignDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignDoctorActionPerformed
        // TODO add your handling code here:
         if(index >= 0) {
            Doctor doctor = doctorDirectory.getDoctorList().get(assignDoctorComboBox.getSelectedIndex());
            labTestWorkRequest.setDoctor(doctor);
            JOptionPane.showMessageDialog(null,doctor+ " Doctor assigned");
            fillStatusUI();
        }
    }//GEN-LAST:event_assignDoctorActionPerformed

    private void assignDoctorActionPerformedComboBox(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignDoctorActionPerformedComboBox
        // TODO add your handling code here:
        index = assignDoctorComboBox.getSelectedIndex();
    }//GEN-LAST:event_assignDoctorActionPerformedComboBox


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptOrder;
    private javax.swing.JComboBox<String> assignDoctorComboBox;
    private javax.swing.JLabel assignDoctorLabel;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton declineOrder;
    private javax.swing.JButton jButtonAddDeliveryMan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel message;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables

}