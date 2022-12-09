/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmacyAdminRole;

import NewLife.NewLife;
import NewLife.Porter.Porter;
import NewLife.Porter.PorterDirectory;
import NewLife.UserAccount.UserAccount;
import NewLife.WorkList.LabWorkRequest;
import NewLife.WorkList.ProductQuantity;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kartik
 */
public class OrderDecision extends javax.swing.JPanel {

    /**
     * Creates new form OrderDecision
     */
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    NewLife newlife;
    LabWorkRequest labTestWorkRequest;
    double total = 0.0;
    private DefaultTableModel defaultTableModel;
    private PorterDirectory deliveryManDirectory;
    private int index = -1;
    public OrderDecision(JPanel userProcessContainer, NewLife newlife, UserAccount userAccount, LabWorkRequest labTestWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.newlife = newlife;
        this.userAccount = userAccount;
        this.labTestWorkRequest = labTestWorkRequest;
        defaultTableModel = (DefaultTableModel) tblOrderDetails.getModel();
        deliveryManDirectory = newlife.getDeliveryManDirectory();   
        fillDelList(deliveryManDirectory.getDeliveryManList());
        change();
        display();
    }
    
    private void declineOrder(){
        labTestWorkRequest.setStatus("Declined");
        JOptionPane.showMessageDialog(null, "Order has been declined");
        change();
        status.setText(labTestWorkRequest.getStatus());
    }
    
    private void change() {
        switch(labTestWorkRequest.getStatus()){
            case "Request to Pharmacy": {
                acceptOrder.setText("Accept order");
                declineOrder.setVisible(true);
            }
            case "Preparing": {
                acceptOrder.setText("Ready for delivery");
                declineOrder.setVisible(false);
            }
            default: {
                declineOrder.setVisible(false);
                acceptOrder.setVisible(false);
            }
        }
        fillDelUI();
    }
    
    private void display() {
        
        fillDelUI();
        
        restaurantName.setText(labTestWorkRequest.getPharmacy().getPharmacyName());
        status.setText(labTestWorkRequest.getStatus());
        message.setText(labTestWorkRequest.getMessage());
        name.setText(labTestWorkRequest.getPatient().getName());
        address.setText(labTestWorkRequest.getPatient().getAddress());

        defaultTableModel.setRowCount(0);
        for (ProductQuantity itemWithQuantity : labTestWorkRequest.getItemsWithQuatityList()) {
            Object[] row = new Object[defaultTableModel.getColumnCount()];
            row[0] = itemWithQuantity;
            row[1] = itemWithQuantity.getQuantity();
            row[2] = itemWithQuantity.getItem().getPrice() * itemWithQuantity.getQuantity();
            total += itemWithQuantity.getItem().getPrice() * itemWithQuantity.getQuantity();
            defaultTableModel.addRow(row);
        }
        totalPrice.setText(total + "");

    }

    private void fillDelUI() {
        if(labTestWorkRequest.getDeliverMan() == null && !("Request to Pharmacy".equalsIgnoreCase(labTestWorkRequest.getStatus()) || "declined".equalsIgnoreCase(labTestWorkRequest.getStatus()))){
            assignDeliveryPersonLabel.setVisible(true);
            assignDeliveryPerson.setVisible(true);
            deliveryManNameValue.setVisible(false);
            jButtonAddDeliveryMan.setVisible(true);
            deliveryManLabel.setVisible(false);
        }
        else{
            jButtonAddDeliveryMan.setVisible(false);
            assignDeliveryPersonLabel.setVisible(false);
            assignDeliveryPerson.setVisible(false);
            deliveryManNameValue.setVisible(true);
            deliveryManLabel.setVisible(true);
             
            if(labTestWorkRequest.getDeliverMan() != null){
                deliveryManNameValue.setText(labTestWorkRequest.getDeliverMan().getDeliveryManName());
            }else{
              deliveryManNameValue.setText("Not Assigned");  
            }
        }
    }
    
    public void fillDelList(ArrayList<Porter> deliveryManList) {
        if(labTestWorkRequest.getDeliverMan() == null) {
            assignDeliveryPerson.setVisible(true);
            for (Porter deliveryMan : deliveryManList) {
                assignDeliveryPerson.addItem(deliveryMan.getDeliveryManName());
            }
        }
        else {
            assignDeliveryPerson.setVisible(false);
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

        totalPrice = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        deliveryManLabel = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        restaurantName = new javax.swing.JLabel();
        deliveryManNameValue = new javax.swing.JLabel();
        cartScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        assignDeliveryPerson = new javax.swing.JComboBox<>();
        assignDeliveryPersonLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonAddDeliveryMan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        acceptOrder = new javax.swing.JButton();
        declineOrder = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        totalPrice.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        totalPrice.setText("<value>");

        message.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        message.setText("<value>");

        jLabel12.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ORDER DETAILS");

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pharmacy Name");

        jLabel14.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Status");

        deliveryManLabel.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        deliveryManLabel.setForeground(new java.awt.Color(255, 255, 255));
        deliveryManLabel.setText("Delivery Man Name");

        status.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        status.setText("<value>");

        restaurantName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        restaurantName.setText("<value>");

        deliveryManNameValue.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        deliveryManNameValue.setText("<value>");

        cartScrollPane1.setForeground(new java.awt.Color(255, 153, 51));

        tblOrderDetails.setBackground(new java.awt.Color(204, 255, 204));
        tblOrderDetails.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Qty", "Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartScrollPane1.setViewportView(tblOrderDetails);

        assignDeliveryPerson.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        assignDeliveryPerson.setForeground(new java.awt.Color(255, 153, 51));
        assignDeliveryPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignDeliveryPersonActionPerformed(evt);
            }
        });

        assignDeliveryPersonLabel.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        assignDeliveryPersonLabel.setForeground(new java.awt.Color(255, 255, 255));
        assignDeliveryPersonLabel.setText("Assign Delivery Person");

        jLabel9.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total");

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Message");

        jButtonAddDeliveryMan.setBackground(new java.awt.Color(255, 255, 204));
        jButtonAddDeliveryMan.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jButtonAddDeliveryMan.setText("Assign");
        jButtonAddDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDeliveryManActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Patient Name");

        name.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        name.setText("<value>");

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Patient Address");

        address.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        address.setText("<value>");

        acceptOrder.setBackground(new java.awt.Color(255, 255, 204));
        acceptOrder.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        acceptOrder.setText("Accept Order");
        acceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderActionPerformed(evt);
            }
        });

        declineOrder.setBackground(new java.awt.Color(255, 255, 204));
        declineOrder.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        declineOrder.setText("Decline Order");
        declineOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                declineOrderMousePressed(evt);
            }
        });
        declineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineOrderActionPerformed(evt);
            }
        });

        btnBack1.setBackground(new java.awt.Color(255, 255, 204));
        btnBack1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(deliveryManLabel)
                                .addGap(37, 37, 37)
                                .addComponent(deliveryManNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addComponent(restaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel14)
                                .addGap(42, 42, 42)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel5)
                                .addGap(41, 41, 41)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel6)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(assignDeliveryPersonLabel)
                                .addGap(36, 36, 36)
                                .addComponent(assignDeliveryPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(cartScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddDeliveryMan)))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(278, 278, 278)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(251, 251, 251)
                            .addComponent(jLabel10))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(185, 185, 185)
                            .addComponent(acceptOrder)
                            .addGap(18, 18, 18)
                            .addComponent(declineOrder)))
                    .addContainerGap(132, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jButtonAddDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(cartScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(assignDeliveryPersonLabel))
                            .addComponent(assignDeliveryPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deliveryManLabel)
                    .addComponent(deliveryManNameValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(restaurantName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(status))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(name))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(address))
                .addGap(18, 18, 18)
                .addComponent(totalPrice)
                .addGap(18, 18, 18)
                .addComponent(message)
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jLabel12)
                    .addGap(434, 434, 434)
                    .addComponent(jLabel9)
                    .addGap(12, 12, 12)
                    .addComponent(jLabel10)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(acceptOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(declineOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(54, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignDeliveryPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignDeliveryPersonActionPerformed
        index = assignDeliveryPerson.getSelectedIndex();
    }//GEN-LAST:event_assignDeliveryPersonActionPerformed

    private void jButtonAddDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDeliveryManActionPerformed

        if(index >= 0) {
            Porter deliveryMan = deliveryManDirectory.getDeliveryManList().get(assignDeliveryPerson.getSelectedIndex());
            labTestWorkRequest.setDeliverMan(deliveryMan);
            JOptionPane.showMessageDialog(null,deliveryMan+ " Delivery Man assigned");
            fillDelUI();
        }
        
    }//GEN-LAST:event_jButtonAddDeliveryManActionPerformed

    private void acceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderActionPerformed
    if (labTestWorkRequest.getStatus().equals("Request to Pharmacy")) {
            labTestWorkRequest.setStatus("Preparing"); 
            JOptionPane.showMessageDialog(null, " Order Accepted");
        }
        else if(labTestWorkRequest.getStatus().equals("Preparing")) {
            labTestWorkRequest.setStatus("Prepared");
            if(labTestWorkRequest.getDeliverMan() == null){
                JOptionPane.showMessageDialog(null, " Order Prepared");
            }
            else {
                JOptionPane.showMessageDialog(null, "Order will be picked up");
            }
        }
        else {  
            acceptOrder.setVisible(false);
        }
        change();
        status.setText(labTestWorkRequest.getStatus());

    }//GEN-LAST:event_acceptOrderActionPerformed

    private void declineOrderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineOrderMousePressed
//        declineOrder();
    }//GEN-LAST:event_declineOrderMousePressed

    private void declineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_declineOrderActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        ManageOrders viewOrderDetails = new ManageOrders(userProcessContainer,newlife, userAccount);
        userProcessContainer.add("ViewOrderDetails", viewOrderDetails);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptOrder;
    private javax.swing.JLabel address;
    private javax.swing.JComboBox<String> assignDeliveryPerson;
    private javax.swing.JLabel assignDeliveryPersonLabel;
    private javax.swing.JButton btnBack1;
    private javax.swing.JScrollPane cartScrollPane1;
    private javax.swing.JButton declineOrder;
    private javax.swing.JLabel deliveryManLabel;
    private javax.swing.JLabel deliveryManNameValue;
    private javax.swing.JButton jButtonAddDeliveryMan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel message;
    private javax.swing.JLabel name;
    private javax.swing.JLabel restaurantName;
    private javax.swing.JLabel status;
    private javax.swing.JTable tblOrderDetails;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
