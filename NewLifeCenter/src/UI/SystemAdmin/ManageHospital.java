/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import NewLife.Hospital.HospitalAdmin;
import NewLife.Hospital.HospitalAdminDirectory;
import NewLife.Role.HospitalAdminRole;
import NewLife.UserAccount.UserAccountDirectory;
import NewLifeCenter.NewLife;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanidatar
 */
public class ManageHospital extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospital
     */
    JPanel userProcessContainer;
    NewLife ecosystem;
    UserAccountDirectory userAccountList;
    public ManageHospital(JPanel userProcessContainer,NewLife ecosystem) {
        initComponents();
        creatingListenerForModification();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        fillTable();
    }
    
    private void fillTable() {
        HospitalAdminDirectory hospitalAdminDirectory = ecosystem.getHospitalDirectory();
        DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();
        
        model.setRowCount(0);
        
        for (HospitalAdmin hospitalAdmin : hospitalAdminDirectory.getHospitalList()) {
                    Object[] row = new Object[5];
                    row[0] = hospitalAdmin;
                    row[1] = hospitalAdmin.getUsername();
                    row[2] = hospitalAdmin.getPassword();
                    row[3] = hospitalAdmin.getAddress();
                    row[4] = hospitalAdmin.getContactNumber();
                    model.addRow(row);
                
        }
    }
    
    private void creatingListenerForModification() {
       tblDeliveryMan.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblDeliveryMan.getSelectedRow();
             if (selectedRow >= 0) {
                  HospitalAdmin  hospitalAdmin  = (HospitalAdmin) tblDeliveryMan.getValueAt(selectedRow, 0);
                 if(hospitalAdmin!=null){
                     display(hospitalAdmin);
                 }
             }
        }
    });
    }
    
    private void display(HospitalAdmin hospitalAdmin) {
        userNameTextfield.setText(hospitalAdmin.getUsername());
        passwordTextfield.setText(hospitalAdmin.getPassword());
        deliveryManNameTextfield.setText(hospitalAdmin.getHospitalName());
        locationTxtField.setText(hospitalAdmin.getAddress());
        contacttxt.setText(hospitalAdmin.getContactNumber());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        deliveryManNameTextfield = new javax.swing.JTextField();
        passwordTextfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        userNameTextfield = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        locationTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contacttxt = new javax.swing.JTextField();
        btnDeliveryMan = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        btnModify.setBackground(new java.awt.Color(255, 255, 204));
        btnModify.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 204));
        btnDelete.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        deliveryManNameTextfield.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        deliveryManNameTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        deliveryManNameTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        passwordTextfield.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        passwordTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDeliveryMan.setBackground(new java.awt.Color(204, 255, 204));
        tblDeliveryMan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblDeliveryMan.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "USERNAME", "PASSWORD", "ADDRESS", "CONTACT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryMan.setGridColor(new java.awt.Color(56, 90, 174));
        tblDeliveryMan.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblDeliveryMan.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblDeliveryMan);

        userNameTextfield.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        userNameTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameTextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        backjButton1.setBackground(new java.awt.Color(255, 255, 204));
        backjButton1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        backjButton1.setText("Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE HOSPITAL");

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Address");

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");

        locationTxtField.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        locationTxtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        locationTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contact");

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");

        contacttxt.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        contacttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contacttxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnDeliveryMan.setBackground(new java.awt.Color(255, 255, 204));
        btnDeliveryMan.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        btnDeliveryMan.setText("Create");
        btnDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(backjButton1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(userNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(passwordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(deliveryManNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(locationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(userNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passwordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(deliveryManNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(locationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkArea sysAdminwjp = (SystemAdminWorkArea) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    } 
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if( userNameTextfield.getText().isEmpty()||passwordTextfield.getText().isEmpty()|| deliveryManNameTextfield.getText().isEmpty()|| locationTxtField.getText().isEmpty() || contacttxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
            return;
        }
        if(contacttxt.getText().length() != 10){
            JOptionPane.showMessageDialog(null, "Enter a valid phone number");
            return;
        }
        if(ecosystem.getUserAccountDirectory().checkUsernameUnique(userNameTextfield.getText())){
            HospitalAdmin hospitalAdmin = new HospitalAdmin();
            hospitalAdmin.setHospitalName(deliveryManNameTextfield.getText());
            hospitalAdmin.setAddress(locationTxtField.getText());
            hospitalAdmin.setUsername(userNameTextfield.getText());
            hospitalAdmin.setPassword(passwordTextfield.getText());
            hospitalAdmin.setContactNumber(contacttxt.getText());
            hospitalAdmin.setRole(new HospitalAdminRole());
            ecosystem.getUserAccountDirectory().addUserAccount(hospitalAdmin);
            ecosystem.getHospitalDirectory().addHospital(hospitalAdmin);

            fillTable();
            userNameTextfield.setText("");
            passwordTextfield.setText("");
            deliveryManNameTextfield.setText("");
            locationTxtField.setText("");
            contacttxt.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Username " + userNameTextfield.getText() + " exists");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMan.getSelectedRow();
        if (selectedRow >= 0) {

            HospitalAdmin hospitalAdmin = (HospitalAdmin) tblDeliveryMan.getValueAt(selectedRow, 0);

            hospitalAdmin.setUsername(userNameTextfield.getText());
            hospitalAdmin.setPassword(passwordTextfield.getText());
            hospitalAdmin.setHospitalName(deliveryManNameTextfield.getText());
            hospitalAdmin.setAddress(locationTxtField.getText());
            hospitalAdmin.setContactNumber(contacttxt.getText());
            hospitalAdmin.setRole(new HospitalAdminRole());

            fillTable();
            userNameTextfield.setText("");
            passwordTextfield.setText("");
            deliveryManNameTextfield.setText("");
            locationTxtField.setText("");
            contacttxt.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Select a row");
        }

    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryMan.getSelectedRow();

        if (selectedRow >= 0) {
            HospitalAdmin admin = (HospitalAdmin) tblDeliveryMan.getValueAt(selectedRow, 0);
            HospitalAdminDirectory hospitalAdminDirectory = ecosystem.getHospitalDirectory();
            hospitalAdminDirectory.deleteHospital(admin);
            JOptionPane.showMessageDialog(null, "Hospital Admin"  + userNameTextfield.getText() + " deleted");
            fillTable();
            userNameTextfield.setText("");
            passwordTextfield.setText("");
            deliveryManNameTextfield.setText("");
            locationTxtField.setText("");
            contacttxt.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Select a row.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeliveryMan;
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JTextField deliveryManNameTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locationTxtField;
    private javax.swing.JTextField passwordTextfield;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JTextField userNameTextfield;
    // End of variables declaration//GEN-END:variables
}
