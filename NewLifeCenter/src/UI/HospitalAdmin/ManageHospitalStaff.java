/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalAdmin;

import NewLife.Account.Account;
import NewLife.Account.AccountDirectory;
import NewLife.AmbulanceDriver.AmbulanceDriver;
import NewLife.AmbulanceDriver.AmbulanceDriverDirectory;
import NewLife.Doctors.Doctor;
import NewLife.Doctors.DoctorDirectory;
import NewLifeCenter.NewLife;
import NewLife.Hospital.HospitalAdmin;
import NewLife.LabAssistant.LabAssistant;
import NewLife.LabAssistant.LabAssistantDirectory;
import NewLife.Reception.Reception;
import NewLife.Reception.ReceptionDirectory;
import NewLife.Role.AccountantRole;
import NewLife.Role.AmbulanceDriverRole;
import NewLife.Role.DoctorRole;
import NewLife.Role.LabExaminerRole;
import NewLife.Role.ReceptionistRole;
import NewLife.UserAccount.UserAccount;
import NewLife.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kartik
 */
public class ManageHospitalStaff extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalStaff
     */
    
    JPanel userProcessContainer;
    NewLife newlife;
    UserAccountDirectory userAccountDirectory;
    UserAccount userAccount;
    private int index = -1;
    HospitalAdmin admin = new HospitalAdmin();
    public ManageHospitalStaff(JPanel userProcessContainer,NewLife newlife,UserAccount userAccount) {
        initComponents();
        creatingListenerForModification();
        this.userProcessContainer = userProcessContainer;
        this.newlife = newlife;
        this.userAccount = userAccount;
        for(HospitalAdmin admin1 : newlife.getHospitalDirectory().getHospitalList()){
            if(admin1.equals(userAccount)){
                admin = admin1;
            }
        }
        populateTable();
        fillRstStaff();
        fillRstDocType();
    }
    
    private void fillRstDocType(){
        comboDoctor.addItem("Paediatrician");
        comboDoctor.addItem("Physician");
        comboDoctor.addItem("Neurologist");
        comboDoctor.addItem("Internist");
        comboDoctor.addItem("Psychiatrists");
        comboDoctor.addItem("Gynaecologist");
        comboDoctor.addItem("Surgeon");
        comboDoctor.addItem("Dermatologist");
        comboDoctor.addItem("Opthalmologist");
    }
    
    private void fillRstStaff(){
        comboStaff.addItem("Doctor");
        comboStaff.addItem("Lab");
        comboStaff.addItem("Ambulance");
        comboStaff.addItem("Reception");
        comboStaff.addItem("Account");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        staff = new javax.swing.JTextField();
        txtpswrd = new javax.swing.JTextField();
        comboStaff = new javax.swing.JComboBox<>();
        comboDoctor = new javax.swing.JComboBox<>();
        availdoc = new javax.swing.JTextField();
        btnaddstaff = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnback.setBackground(new java.awt.Color(255, 255, 204));
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 21, 111, 48));

        jLabel1.setBackground(new java.awt.Color(166, 206, 55));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE HOSPITAL STAFF");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 26, 578, -1));

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 204));

        tblMenu.setBackground(new java.awt.Color(204, 255, 204));
        tblMenu.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STAFF NAME", "STAFF PASSWORD", "STAFF TYPE", "DOCTOR AVAILABILITY", "DOCTOR TYPE", "ADDRESS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 87, 789, 146));

        jLabel2.setBackground(new java.awt.Color(166, 206, 55));
        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Staff Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 259, -1, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Staff Type");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 304, -1, -1));

        jLabel4.setBackground(new java.awt.Color(166, 206, 55));
        jLabel4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 347, -1, -1));

        enterpriseLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel2.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel2.setText("Doctor Type");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 438, -1, -1));

        jLabel5.setBackground(new java.awt.Color(166, 206, 55));
        jLabel5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Doctor Availability");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 493, -1, -1));

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("***** Fill the below details only for Doctor *****");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 390, 746, -1));
        add(staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 259, 126, -1));
        add(txtpswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 347, 126, -1));

        add(comboStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 305, 130, -1));

        add(comboDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 439, 130, -1));
        add(availdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 493, 126, -1));

        btnaddstaff.setBackground(new java.awt.Color(255, 255, 204));
        btnaddstaff.setText("ADD STAFF");
        btnaddstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddstaffActionPerformed(evt);
            }
        });
        add(btnaddstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 483, 198, 48));
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddstaffActionPerformed
        // TODO add your handling code here:
        if (staff.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
            return;
        }
        String choice = comboStaff.getSelectedItem().toString();
        if(newlife.getUserAccountDirectory().checkUsernameUnique(staff.getText())){
            if(choice.equalsIgnoreCase("Doctor")){
                Doctor hospitalStaff = new Doctor();
                       
                hospitalStaff.setName(staff.getText());
                hospitalStaff.setType(choice);
                hospitalStaff.setDocType(comboDoctor.getSelectedItem().toString());
                hospitalStaff.setTime(availdoc.getText());
                hospitalStaff.setUsername(staff.getText());
                hospitalStaff.setPassword(txtpswrd.getText());
                hospitalStaff.setRole(new DoctorRole());
 
                newlife.getUserAccountDirectory().addUserAccount(hospitalStaff);
                newlife.getDoctorDirectory().addDoctor(hospitalStaff);
            
                populateTable();
                staff.setText("");
                txtpswrd.setText("");
                
                availdoc.setText("");
            }
            if(choice.equalsIgnoreCase("Reception")){
                Reception hospitalStaff = new Reception();
                
                hospitalStaff.setName(staff.getText());
                hospitalStaff.setType(choice);
                hospitalStaff.setUsername(staff.getText());
                hospitalStaff.setPassword(txtpswrd.getText());
                hospitalStaff.setRole(new ReceptionistRole());
                newlife.getUserAccountDirectory().addUserAccount(hospitalStaff);
                newlife.getReceptionDirectory().addReception(hospitalStaff);
            
                populateTable();
                staff.setText("");
                txtpswrd.setText("");
                
                availdoc.setText("");
            }
            if(choice.equalsIgnoreCase("Ambulance")){
                AmbulanceDriver hospitalStaff = new AmbulanceDriver();
                
                hospitalStaff.setAmbulanceDriverName(staff.getText());
                hospitalStaff.setType(choice);
                hospitalStaff.setUsername(staff.getText());
                hospitalStaff.setPassword(txtpswrd.getText());
                hospitalStaff.setRole(new AmbulanceDriverRole());
                newlife.getUserAccountDirectory().addUserAccount(hospitalStaff);
                newlife.getAmbulanceDirectory().addAmbulanceDriver(hospitalStaff);
            
                populateTable();
                staff.setText("");
                txtpswrd.setText("");
                
                availdoc.setText("");
            }
            if(choice.equalsIgnoreCase("Lab")){
                LabAssistant hospitalStaff = new LabAssistant();
                
                hospitalStaff.setLabAssistantName(staff.getText());
                hospitalStaff.setType(choice);
                hospitalStaff.setUsername(staff.getText());
                hospitalStaff.setPassword(txtpswrd.getText());
                hospitalStaff.setRole(new LabExaminerRole());
                newlife.getUserAccountDirectory().addUserAccount(hospitalStaff);
                newlife.getLabAssistantDirectory().addLabAssistant(hospitalStaff);
            
                populateTable();
                staff.setText("");
                txtpswrd.setText("");
                
                availdoc.setText("");
            }
            if(choice.equalsIgnoreCase("Account")){
                Account hospitalStaff = new Account();
                hospitalStaff.setAccountName(staff.getText());
                hospitalStaff.setType(choice);
                hospitalStaff.setUsername(staff.getText());
                hospitalStaff.setPassword(txtpswrd.getText());
                hospitalStaff.setRole(new AccountantRole());
                newlife.getUserAccountDirectory().addUserAccount(hospitalStaff);
                newlife.getAccountDirectory().addAccount(hospitalStaff);
            
                populateTable();
                staff.setText("");
                txtpswrd.setText("");
                
                availdoc.setText("");
            }
         }

        else{
            JOptionPane.showMessageDialog(null, "Username " + staff.getText() + " exists");
         }
    }//GEN-LAST:event_btnaddstaffActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        HospitalAdminArea adminWorkAreaJPanel = new HospitalAdminArea(userProcessContainer,userAccount, newlife);
        userProcessContainer.add("AdminWorkAreaJPanel", adminWorkAreaJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availdoc;
    private javax.swing.JButton btnaddstaff;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> comboDoctor;
    private javax.swing.JComboBox<String> comboStaff;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField staff;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtpswrd;
    // End of variables declaration//GEN-END:variables

private void populateTable() {

            DoctorDirectory doctorDirectory = newlife.getDoctorDirectory();
            AccountDirectory accountDirectory = newlife.getAccountDirectory();
            LabAssistantDirectory labAssistantDirectory = newlife.getLabAssistantDirectory();
            AmbulanceDriverDirectory ambulanceDriverDirectory = newlife.getAmbulanceDirectory();
            ReceptionDirectory receptionDirectory = newlife.getReceptionDirectory();
            DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
            
            model.setRowCount(0);
            for (Doctor doctor : doctorDirectory.getDoctorList()) {

                        Object[] row = new Object[6];
                        row[0] = doctor.getUsername();
                        row[1] = doctor.getPassword();
                        row[2] = doctor.getType();
                        row[3] = doctor.getTime();
                        row[4] = doctor.getDocType();
                        row[5] = admin.getAddress();
                        model.addRow(row);
                    
            }
            for (Account account : accountDirectory.getAccountList()) {

                        Object[] row = new Object[6];
                        row[0] = account.getUsername();
                        row[1] = account.getPassword();
                        row[2] = account.getType();
                        row[5] = admin.getAddress();
                   
                        model.addRow(row);
                    
            }
            for (LabAssistant labAssistant : labAssistantDirectory.getLabAssistantList()) {

                        Object[] row = new Object[6];
                        row[0] = labAssistant.getUsername();
                        row[1] = labAssistant.getPassword();
                        row[2] = labAssistant.getType();
                        row[5] = admin.getAddress();
                        model.addRow(row);
                    
            }
            for (AmbulanceDriver ambDriver : ambulanceDriverDirectory.getAmbulanceDriverList()) {

                        Object[] row = new Object[6];
                        row[0] = ambDriver.getUsername();
                        row[1] = ambDriver.getPassword();
                        row[2] = ambDriver.getType();
                        row[5] = admin.getAddress();
                        model.addRow(row);
                    
            }   
            for (Reception reception : receptionDirectory.getReceptionList()) {

                        Object[] row = new Object[6];
                        row[0] = reception.getUsername();
                        row[1] = reception.getPassword();
                        row[2] = reception.getType();
                        row[5] = admin.getAddress();
                        model.addRow(row);
                    
            }
    }
        
    private void creatingListenerForModification() {
       tblMenu.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblMenu.getSelectedRow();
             if (selectedRow >= 0) {
                  Doctor doctor = (Doctor) tblMenu.getValueAt(selectedRow, 0);
                  Account account = (Account) tblMenu.getValueAt(selectedRow, 0);
                  AmbulanceDriver ambDriver = (AmbulanceDriver) tblMenu.getValueAt(selectedRow, 0);
                  Reception reception = (Reception) tblMenu.getValueAt(selectedRow, 0);
                  LabAssistant labAssistant = (LabAssistant) tblMenu.getValueAt(selectedRow, 0);
                 if(doctor!=null || account!=null || ambDriver!=null || reception!=null || labAssistant!=null){
                     display(doctor,account,ambDriver,reception,labAssistant);
                 }
             }
        }
    });
    }
    
    private void display(Doctor doctor,Account account,AmbulanceDriver ambDriver,Reception reception,LabAssistant labAssistant) {
        
        if(doctor != null) {
        staff.setText(doctor.getUsername());
        txtpswrd.setText(doctor.getPassword());
        availdoc.setText(doctor.getTime());
        }
        if(account != null){
        staff.setText(account.getUsername());
        txtpswrd.setText(account.getPassword());
        }
        if(ambDriver != null){
        staff.setText(ambDriver.getUsername());
        txtpswrd.setText(ambDriver.getPassword());
        }
        if(reception != null){
        staff.setText(reception.getUsername());
        txtpswrd.setText(reception.getPassword());
        }
        if(labAssistant != null){
        staff.setText(labAssistant.getUsername());
        txtpswrd.setText(labAssistant.getPassword());
        }
    }

}
