/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.IkeaRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.AmazonRequestHandlingOrganization;
import Business.Organization.IkeaOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AmazonOrderWorkRequest;
import Business.WorkQueue.BestBuyOrderWorkRequest;
import Business.WorkQueue.IkeaOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.BestBuyRole.ProductConfirmationBestBuyJPanel;

/**
 *
 * @author Rishi Nandedkar
 */
public class IkeaWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IkeaWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    IkeaOrganization ikeaSalesTeamOrganization;
    Enterprise enterprise;
    EcoSystem business;
    public IkeaWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, IkeaOrganization ikeaSalesTeamOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ikeaSalesTeamOrganization = ikeaSalesTeamOrganization;
        this.enterprise = enterprise;
        this.business = business;
        populateWorkQueueTable();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateWorkQueueTable(){
         DefaultTableModel model = (DefaultTableModel) ikeaWorkRequestJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkRequest work : ikeaSalesTeamOrganization.getWorkQueue().getWorkRequestList()){
            if(work instanceof BestBuyOrderWorkRequest){ 
            //for(Order o1 : business.getMasterOrder().getMasterOrderList()){
                for(OrderItem oi : work.getOrder().getOrderItemList()){
                    if(oi.getCategory().equals("Furniture")){
               
                 Object[] row = new Object[7];
                 //row[0] = oi.getCategory();
                 row[0] = oi.getProductID();
                 row[1] = oi.getProductName();
                 row[2] = oi.getQuantity();
                 row[3] = oi.getPrice();
//                 row[5] = work.getOrder().getArea();
//                 row[6] = work.getOrder().getMessage();
                    row[4] = work.getOrder().getArea();
                    row[5] = work.getOrder().getMessage();
                    row[6] = work;
            model.addRow(row);
                }
           
        }
    }
        }
     }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ikeaWorkRequestJTable = new javax.swing.JTable();
        sendToAmazonBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(174, 221, 221));

        requestTestJButton.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        requestTestJButton.setText("Request Products");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        enterpriseLabel.setText("IKEA Work Area");

        ikeaWorkRequestJTable.setFont(new java.awt.Font("American Typewriter", 0, 12)); // NOI18N
        ikeaWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Price", "Address", "Message", "Order"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ikeaWorkRequestJTable);
        if (ikeaWorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            ikeaWorkRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            ikeaWorkRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            ikeaWorkRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            ikeaWorkRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            ikeaWorkRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            ikeaWorkRequestJTable.getColumnModel().getColumn(5).setResizable(false);
            ikeaWorkRequestJTable.getColumnModel().getColumn(6).setResizable(false);
        }

        sendToAmazonBtn.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        sendToAmazonBtn.setText("Send to Amazon");
        sendToAmazonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToAmazonBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/nidhisarode/Downloads/unnamed-2.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(sendToAmazonBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestTestJButton)
                    .addComponent(sendToAmazonBtn))
                .addContainerGap(368, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

         int selectedRow = ikeaWorkRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        BestBuyOrderWorkRequest request = (BestBuyOrderWorkRequest)ikeaWorkRequestJTable.getValueAt(selectedRow, 6);
     
        //request.setStatus("Processing");
        
        ProductConfirmationIkeaJPanel pcijp = new ProductConfirmationIkeaJPanel(userProcessContainer, request);
        userProcessContainer.add("productConfirmationIkeaJPanel", pcijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void sendToAmazonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToAmazonBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = ikeaWorkRequestJTable.getSelectedRow();
        //String category = bestBuyRequestAreaConfirmationTable.getValueAt(selectedRow, 0).toString();
        int pID = Integer.parseInt(ikeaWorkRequestJTable.getValueAt(selectedRow, 0).toString());
        String pName = ikeaWorkRequestJTable.getValueAt(selectedRow, 1).toString();
        int quantity = Integer.parseInt(ikeaWorkRequestJTable.getValueAt(selectedRow, 2).toString());
        int totalCost = Integer.parseInt(ikeaWorkRequestJTable.getValueAt(selectedRow, 3).toString());
        String address = ikeaWorkRequestJTable.getValueAt(selectedRow, 4).toString();
        WorkRequest work = (WorkRequest) ikeaWorkRequestJTable.getValueAt(selectedRow, 6);
        String message = "Order ready to ship";
         IkeaOrderWorkRequest
                 iowr = new IkeaOrderWorkRequest();
         
            // aowr.setCategory(category);
             iowr.setProductID(pID);
             iowr.setProductName(pName);
             iowr.setQuantity(quantity);
             iowr.setPrice(totalCost);
             iowr.setArea(address);
             iowr.setMessage(message);
             iowr.setOrder(work.getOrder());
            
             
               Organization org = null;
        
        
        for (Network ntw : business.getNetworkList()){
        for (Enterprise e : ntw.getEnterpriseDirectory().getEnterpriseList())
                {
                {
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                    { 
                        
                      if(o instanceof AmazonRequestHandlingOrganization){
                          
                          org = o;
                          break;
                    }
                    
                   
                        
                     
                    
                }
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(iowr);
            account.getWorkQueue().getWorkRequestList().add(iowr);
        }
        }
         JOptionPane.showMessageDialog(null, "Request sent to Amazon");
    }//GEN-LAST:event_sendToAmazonBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable ikeaWorkRequestJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton sendToAmazonBtn;
    // End of variables declaration//GEN-END:variables
}