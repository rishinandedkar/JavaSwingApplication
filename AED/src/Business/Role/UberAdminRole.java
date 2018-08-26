/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.UberOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.TargetRole.TargetWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.UberRole.UberWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class UberAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new UberWorkAreaJPanel(userProcessContainer, account, (UberOrganization)organization, enterprise,business);
    }
    
    
}
