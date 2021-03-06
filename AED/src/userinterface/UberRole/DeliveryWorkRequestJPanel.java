/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UberRole;

import Business.WorkQueue.AmazonOrderWorkRequest;
import Business.WorkQueue.IkeaOrderWorkRequest;
import Business.WorkQueue.UberOrderWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DeliveryWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UberOrderWorkRequest request;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public DeliveryWorkRequestJPanel(JPanel userProcessContainer, UberOrderWorkRequest request) {
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

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        uberMessageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(174, 221, 221));
        setLayout(null);

        submitJButton.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        submitJButton.setText("Fulfill Request and Deliver");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(400, 210, 223, 29);

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 18)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1);
        jLabel1.setBounds(400, 110, 85, 29);

        uberMessageJTextField.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        add(uberMessageJTextField);
        uberMessageJTextField.setBounds(500, 110, 173, 29);

        backJButton.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(26, 752, 92, 29);

        jLabel2.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel2.setText("Uber Request Processing Area ");
        add(jLabel2);
        jLabel2.setBounds(314, 33, 368, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UberWorkAreaJPanel dwjp = (UberWorkAreaJPanel) component;
        dwjp.populateWorkQueueTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        request.getOrder().setMessage(uberMessageJTextField.getText());
        JOptionPane.showMessageDialog(null, "Order successfully delivered to customer");
    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField uberMessageJTextField;
    // End of variables declaration//GEN-END:variables
}
