/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BestBuyAdminRole;
import Business.Role.BestBuySalesRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author GUEST1
 */
public class BestBuyOrganization extends Organization {
    
    public BestBuyOrganization() {
        super(Organization.Type.BestBuyOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
   ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BestBuyAdminRole());
       
        return roles;  }
    
}
