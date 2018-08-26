/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.IkeaRole;

import Business.WorkQueue.BestBuyOrderWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rishi Nandedkar
 */
public class ProductConfirmationIkeaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    BestBuyOrderWorkRequest request;
    /**
     * Creates new form ProductConfirmationIkeaJPanel
     */
    public ProductConfirmationIkeaJPanel(JPanel userProcessContainer, BestBuyOrderWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        ikeaMessageTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(174, 221, 221));
        setLayout(null);

        requestTestJButton4.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        requestTestJButton4.setText("Confirm Order");
        requestTestJButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton4ActionPerformed(evt);
            }
        });
        add(requestTestJButton4);
        requestTestJButton4.setBounds(197, 207, 141, 29);

        jLabel2.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel2.setText("Ikea Confirmation Area");
        add(jLabel2);
        jLabel2.setBounds(190, 29, 286, 30);

        backJButton.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(26, 747, 110, 29);

        ikeaMessageTextField.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        add(ikeaMessageTextField);
        ikeaMessageTextField.setBounds(313, 128, 258, 31);

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel1.setText("Message");
        add(jLabel1);
        jLabel1.setBounds(181, 127, 71, 31);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton4ActionPerformed

        request.getOrder().setMessage(ikeaMessageTextField.getText());

        //request.setStatus("Completed");

        //        String message = messageTextField.getText();
        //
        //        BestBuyOrderWorkRequest request = new BestBuyOrderWorkRequest();
        //        request.setMessage(message);
        //        //request.setSender(account);
        //        //request.setStatus("Product packed and ready to shipped");
        //
        //        Organization org = null;
        //
        //                    for (Network ntw : business.getNetworkList()){
            //        for (Enterprise e : ntw.getEnterpriseDirectory().getEnterpriseList())
            //                {
                //            if (e instanceof RetailerEnterprise){
                    //                {
                        //                    for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                        //                    {
                            //                        if(o instanceof BestBuyOrganization){
                                //                          org = o;
                                //                          break;
                                //                    }
                            //                    }
                        //                }
                    //            }
                //            }
            //            if (org!=null){
                //            org.getWorkQueue().getWorkRequestList().add(request);
                //            account.getWorkQueue().getWorkRequestList().add(request);
                //        }
            //                    }
            JOptionPane.showMessageDialog(null, "Order processed successfully");

    }//GEN-LAST:event_requestTestJButton4ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        System.out.println("working back code");
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        IkeaWorkAreaJPanel bbwajp = (IkeaWorkAreaJPanel) component;
        bbwajp.populateWorkQueueTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField ikeaMessageTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton requestTestJButton4;
    // End of variables declaration//GEN-END:variables
}
