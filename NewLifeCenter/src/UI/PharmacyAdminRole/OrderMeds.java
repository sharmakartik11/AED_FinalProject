/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmacyAdminRole;

import NewLifeCenter.NewLife;
import NewLife.Pharmaceutical.Inventory;
import NewLife.Pharmaceutical.Medicines;
import NewLife.Pharmaceutical.Pharmaceutical;
import NewLife.Pharmaceutical.PharmaceuticalDirectory;
import NewLife.Pharmacy.Pharmacy;
import NewLife.Pharmacy.PharmacyMedicine;
import NewLife.WorkList.PharmacyInventory;
import NewLife.UserAccount.UserAccount;
import NewLife.WorkList.LabWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kartik
 */
public class OrderMeds extends javax.swing.JPanel {

    /**
     * Creates new form OrderMeds
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Pharmacy pharmacy;
    private DefaultTableModel defaultTableModel;
    private DefaultTableModel defaultCartTable;
    private int index = -1;
    private int row = 0;
    private int column = 0;
    private int quantity = 0;
    private NewLife newlife;
    private PharmaceuticalDirectory pharmaceuticalDirectory;
    private List<PharmacyInventory> itemQuantityList = new ArrayList<>();
    
    public OrderMeds(JPanel userProcessContainer, UserAccount account, NewLife newlife) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.newlife = newlife;
        pharmacy = (Pharmacy) account;
        pharmaceuticalDirectory = newlife.getPharmaceuticalDirectory();
        fillRstList(pharmaceuticalDirectory.getPharmaceuticalList());
        defaultTableModel = (DefaultTableModel) tblPharmaInventory.getModel();
        defaultCartTable  = (DefaultTableModel) tblCart.getModel();
        if(pharmaceuticalDirectory.getPharmaceuticalList().size() > 0){
            index = 0;
            populateMenu();
        }
        txtMessage1.setEditable(false);
    }
    
    

    public boolean isItemSelected(PharmacyMedicine pharmacyMedicine) {
        int nRow = tblPharmaInventory.getRowCount();
        int count1 = 0;
        boolean res = true;

 

        for (int i = 0; i < nRow; i++) {
            if (null != tblPharmaInventory.getValueAt(i, 2)) {
                if ((Boolean) tblPharmaInventory.getValueAt(i, 2) == false) {
                    count1++;
                }
            }
        }
        if (count1 == nRow) {
            res = false;
            JOptionPane.showMessageDialog(null, "Please select an item");
        }
        return res;
    }
    
    private void populateMenu() {
        defaultTableModel.setRowCount(0);
        Pharmaceutical pharmaceutical = pharmaceuticalDirectory.getPharmaceuticalList().get(index);
        Inventory inventory = pharmaceutical.getInventory();
        List<Medicines> items = inventory.getItemList();
        for (Medicines item : items) {
            Object[] row = new Object[defaultTableModel.getColumnCount()];
            row[0] = item;
            row[1] = item.getMedicinePrice();
            defaultTableModel.addRow(row);
        }
    }
    
    private void populateCartTable() {
        double total = 0.0;
        defaultCartTable.setRowCount(0);
        for (PharmacyInventory itemWithQuantity : itemQuantityList) {
            Object[] row = new Object[defaultCartTable.getColumnCount()];
            row[0] = itemWithQuantity;
            row[1] = itemWithQuantity.getQuantity();
            row[2] = itemWithQuantity.getMedicines().getMedicinePrice() * itemWithQuantity.getQuantity();
            total += itemWithQuantity.getMedicines().getMedicinePrice() * itemWithQuantity.getQuantity();
            defaultCartTable.addRow(row);
        }
        txtMessage1.setText(total + "");
    }
    
    private void initListners() {
        tblPharmaInventory.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblPharmaInventory.getSelectedRow();
                if (selectedRow >= 0) {
                    Medicines medicines = (Medicines) tblPharmaInventory.getValueAt(selectedRow, 0);
                    if (medicines != null) {
                        String response = JOptionPane.showInputDialog("Please provide Quantity");
                        try {
                            quantity = Integer.parseInt(response);
                        } catch (NumberFormatException e) {
                        }
                        if (quantity != 0) {
                            PharmacyInventory itemWithQuantity = new PharmacyInventory(medicines, quantity);
                            itemQuantityList.add(itemWithQuantity);
                            populateCartTable();
                        }
                    }
                }
            }
        });
    }

    public void fillRstList(ArrayList<Pharmaceutical> pharmacyList) {
        for (Pharmaceutical pharmaceutical : pharmacyList) {
            rstCombo.addItem(pharmaceutical.getPharmaceuticalName());
        }
    }
    
    

    private boolean creatingOrder() {
            LabWorkRequest orderWorkRequest = new LabWorkRequest();
            orderWorkRequest.setPharmaItemQuantitys(itemQuantityList);
            orderWorkRequest.setMessage(txtMessage.getText());
            if (pharmacy != null) {
                orderWorkRequest.setPharmacy(pharmacy);
            } else {
                return false;
            }
            Pharmaceutical pharmaceutical = pharmaceuticalDirectory.getPharmaceuticalList().get(rstCombo.getSelectedIndex());         
            if (pharmaceutical != null) {
                orderWorkRequest.setPharmaceutical(pharmaceutical);  
            } else {
                return false;
            }
            orderWorkRequest.setRequestDate(new Date());
            orderWorkRequest.setStatus("Request to Pharmaceutical");
            newlife.getWorkQueue().addWorkRequest(orderWorkRequest);
            return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        rstCombo = new javax.swing.JComboBox<>();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPharmaInventory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMessage1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(255, 255, 204));
        requestTestJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        requestTestJButton.setText("Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 543, 122, 60));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 481, -1, -1));

        txtMessage.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 478, 184, -1));

        rstCombo.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        rstCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstComboActionPerformed(evt);
            }
        });
        add(rstCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 145, 190, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Choose Pharmaceutical");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 149, -1, 20));

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Order Medicines");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 79, 868, 48));

        backJButton.setBackground(new java.awt.Color(255, 255, 204));
        backJButton.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 16, 111, 45));

        tblCart.setBackground(new java.awt.Color(204, 255, 204));
        tblCart.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT NAME", "PRODUCT QUANTITY", "PRODUCT PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCart);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 305, 868, 110));

        tblPharmaInventory.setBackground(new java.awt.Color(204, 255, 204));
        tblPharmaInventory.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblPharmaInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT NAME", "PRODUCT PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPharmaInventory);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 189, 868, 110));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Amount");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 436, -1, -1));

        txtMessage1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        add(txtMessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 433, 184, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        if (creatingOrder()) {
            JOptionPane.showMessageDialog(null, "Order Placed");
            MedsOrderInfo medicineOrderInfoJPanel = new MedsOrderInfo(userProcessContainer, newlife, pharmacy);
            userProcessContainer.add("MedicineOrderInfoJPanel", medicineOrderInfoJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void rstComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstComboActionPerformed
        index = rstCombo.getSelectedIndex();
    }//GEN-LAST:event_rstComboActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        PharmacyAdminWorkArea pharmacyAdminWorkAreaJPanel = new PharmacyAdminWorkArea(userProcessContainer, userAccount, newlife);
        userProcessContainer.add("DeliveryManWorkAreaJPanel", pharmacyAdminWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox<String> rstCombo;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblPharmaInventory;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtMessage1;
    // End of variables declaration//GEN-END:variables
}
