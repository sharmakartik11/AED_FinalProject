/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmaAdminRole;

import NewLifeCenter.NewLife;
import NewLife.Pharmaceutical.Inventory;
import NewLife.Pharmaceutical.Medicines;
import NewLife.Pharmaceutical.Pharmaceutical;
import NewLife.UserAccount.UserAccount;
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
public class CreateMenuItem extends javax.swing.JPanel {

    /**
     * Creates new form CreateMenuItem
     */
    
    JPanel userProcessContainer;
    NewLife newlife;
    UserAccount userAccount;
    Pharmaceutical pharmaceutical;
    public CreateMenuItem(JPanel userProcessContainer, UserAccount userAccount, NewLife newlife) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.newlife = newlife;
        this.userAccount = userAccount;
        pharmaceutical = (Pharmaceutical) userAccount;
        populateTable();
    }
    
    private void populateTable() {
        Inventory menu = pharmaceutical.getInventory();
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        model.setRowCount(0);
        if(menu != null){
        for (Medicines item : menu.getItemList()) {

            Object[] row = new Object[2];
            row[0] = item;
            row[1] = item.getMedicinePrice();
            model.addRow(row);
        }
        }
    }
    private void initListners() {
        tblMenu.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblMenu.getSelectedRow();
                if (selectedRow >= 0) {
                    Medicines item = (Medicines) tblMenu.getValueAt(selectedRow, 0);
                    if (item != null) {
                        display(item);
                    }
                }
            }
        });
    }
    
    private void display(Medicines item) {
        itemName.setText(item.getMedicineName());
        itemPrice.setText(String.valueOf(item.getMedicinePrice()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        itemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        itemPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMenu.setBackground(new java.awt.Color(204, 255, 204));
        tblMenu.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblMenu.setForeground(new java.awt.Color(204, 255, 204));
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM NAME", "ITEM PRICE"
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
        tblMenu.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblMenu);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 820, 151));

        itemName.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        itemName.setSelectionColor(new java.awt.Color(0, 0, 0));
        add(itemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 203, -1));

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Price");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        itemPrice.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        itemPrice.setSelectionColor(new java.awt.Color(0, 0, 0));
        add(itemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 203, -1));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        btnAddItem.setBackground(new java.awt.Color(255, 255, 204));
        btnAddItem.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        add(btnAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 195, 40));

        btnUpdateItem.setBackground(new java.awt.Color(255, 255, 204));
        btnUpdateItem.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnUpdateItem.setText("Update");
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });
        add(btnUpdateItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 191, 40));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE INVENTORY");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 753, -1));

        btnBack2.setBackground(new java.awt.Color(255, 255, 204));
        btnBack2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBack2.setText("<<");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        if (itemName.getText().isEmpty() || itemPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
            return;
        }
        if(pharmaceutical.getInventory()!= null){
            for (Medicines item : pharmaceutical.getInventory().getItemList()) {
                if (itemName.getText().equals(item.getMedicineName())) {
                    JOptionPane.showMessageDialog(null, "Duplicate Items");
                    return;
                }
            }
        }
        try {
            Double.valueOf(itemPrice.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a valid number");
            return;
        }

        Medicines item = new Medicines(itemName.getText(), Double.valueOf(itemPrice.getText()));

        if(pharmaceutical.getInventory()!= null){
            pharmaceutical.getInventory().addItem(item);
            populateTable();
            itemName.setText("");
            itemPrice.setText("");
        } else{
            Inventory menu = new Inventory();
            menu.addItem(item);
            pharmaceutical.setInventory(menu);
            populateTable();
            itemName.setText("");
            itemPrice.setText("");
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
        int selectedRow = tblMenu.getSelectedRow();
        if (selectedRow >= 0) {

            Medicines item = (Medicines) tblMenu.getValueAt(selectedRow, 0);
            item.setMedicineName(itemName.getText());
            item.setMedicinePrice(Double.valueOf(itemPrice.getText()));
            populateTable();
            itemName.setText("");
            itemPrice.setText("");

        } else {
            JOptionPane.showMessageDialog(null,"Pick a row");
        }
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        PharmaceuticalAdminWorkArea adminWorkAreaJPanel = new PharmaceuticalAdminWorkArea(userProcessContainer,userAccount, newlife);
        userProcessContainer.add("AdminWorkAreaJPanel", adminWorkAreaJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMenu;
    // End of variables declaration//GEN-END:variables
}