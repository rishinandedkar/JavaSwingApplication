/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PeopleEnterprise;
import Business.Network.Network;
import Business.Organization.CustomerFacingOrganization;
import Business.Organization.Organization;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rishi Nandedkar
 */
public class CustomerSignUp extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSignUp
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem business;
    CustomerFacingOrganization customerFacingOrganization;
    Enterprise enterprise;
   
    public CustomerSignUp(JPanel userProcessContainer,EcoSystem business) {
        initComponents();
    this.account = account;
    this.customerFacingOrganization= customerFacingOrganization;
    this.enterprise= enterprise;
    this.userProcessContainer= userProcessContainer;
    this.business = business;
    
    }

   

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        userNameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        submmitJButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(174, 221, 221));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("Hello Customer!!!");

        jLabel2.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel4.setText("Email Address:");

        jLabel5.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel5.setText("Password:");

        nameTxt.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N

        userNameTxt.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N

        emailTxt.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N

        submmitJButton.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        submmitJButton.setText("Submit");
        submmitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submmitJButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(submmitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(365, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submmitJButton)
                    .addComponent(jButton2))
                .addContainerGap(448, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submmitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submmitJButtonActionPerformed
        String name = nameTxt.getText();
        String userName = userNameTxt.getText();
        String password = jPasswordField1.getText();
        //Employee employee = new Employee();       
        Role role = new CustomerRole();
        
        for(Network ntw : business.getNetworkList()){
          for(Enterprise ent : ntw.getEnterpriseDirectory().getEnterpriseList()){
              if(ent instanceof PeopleEnterprise){
            for(Organization o : ent.getOrganizationDirectory().getOrganizationList()){
                
               if(o instanceof CustomerFacingOrganization){
                Employee employee = o.getEmployeeDirectory().createEmployee(name);
                   o.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
               }  
            }
          }
          }
        }
        
        JOptionPane.showMessageDialog(null, "Customer Account created successfully");
    }//GEN-LAST:event_submmitJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        nameTxt.setText("");
        userNameTxt.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton submmitJButton;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
