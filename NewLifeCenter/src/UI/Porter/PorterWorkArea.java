/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Porter;

import NewLifeCenter.NewLife;
import NewLife.UserAccount.UserAccount;
import NewLife.WorkList.LabWorkRequest;
import NewLife.WorkList.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kartik
 */
public class PorterWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form PorterWorkArea
     */
    private JPanel userProcessContainer;
    private NewLife newlife;
    private UserAccount userAccount;
    private List<WorkRequest> workRequestList;
    
    
    public PorterWorkArea(JPanel userProcessContainer, UserAccount userAccount, NewLife newlife) {
        initComponents();
        creatingListenerForDelInfo();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.newlife = newlife;
        fillDelRqTable();
    }
    
      private void fillDelRqTable(){
        DefaultTableModel model = (DefaultTableModel) tblDeliveryManWorkRequest.getModel();
        model.setRowCount(0);
        workRequestList = newlife.getWorkQueue().getWorkRequestListDeliveryMan(userAccount);
        for (WorkRequest request : workRequestList) {
            Object[] row = new Object[tblDeliveryManWorkRequest.getColumnCount()];
            row[0] = request;
            row[1] = request.getPharmacy();
            row[2] = request.getPatient();
            row[2] = request.getPharmaceutical();
            row[3] = request.getStatus();
            model.addRow(row);
        }
        }

        private void creatingListenerForDelInfo() {
        tblDeliveryManWorkRequest.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                int selectedRow = tblDeliveryManWorkRequest.getSelectedRow();
                if (selectedRow >= 0) {
                    WorkRequest request = (WorkRequest) tblDeliveryManWorkRequest.getValueAt(selectedRow, 0);
                    if (request instanceof LabWorkRequest) {
                        LabWorkRequest orderWorkRequest = (LabWorkRequest) tblDeliveryManWorkRequest.getValueAt(selectedRow, 0);
                        if (orderWorkRequest != null) {
                           ProcessPorterRequest processOrderJPanel = new ProcessPorterRequest(userProcessContainer,newlife,userAccount,orderWorkRequest);
                           userProcessContainer.add("ProcessOrderJPanel", processOrderJPanel);
                           CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                           layout.next(userProcessContainer);
                        }
                    }

                }
            }
        });
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryManWorkRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new java.awt.GridBagLayout());

        tblDeliveryManWorkRequest.setBackground(new java.awt.Color(204, 255, 204));
        tblDeliveryManWorkRequest.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        tblDeliveryManWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MESSAGE", "SENDER", "RECEIVER", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryManWorkRequest.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tblDeliveryManWorkRequest);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 957;
        gridBagConstraints.ipady = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(29, 6, 0, 0);
        add(jScrollPane2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDERS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 842;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 6, 0, 0);
        add(jLabel1, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Porter/delivery.jpeg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(750, 400));
        jLabel3.setMinimumSize(new java.awt.Dimension(750, 400));
        jLabel3.setPreferredSize(new java.awt.Dimension(750, 400));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 6, 104, 0);
        add(jLabel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDeliveryManWorkRequest;
    // End of variables declaration//GEN-END:variables
}
