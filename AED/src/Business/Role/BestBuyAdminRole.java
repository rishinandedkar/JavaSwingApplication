/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AmazonRequestHandlingOrganization;
import Business.Organization.BestBuyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BestBuyRole.BestBuyWorkAreaJPanel;

/**
 *
 * @author GUEST1
 */
public class BestBuyAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
           return new BestBuyWorkAreaJPanel(userProcessContainer, account, (BestBuyOrganization)organization,enterprise, business);
    }
    
}
