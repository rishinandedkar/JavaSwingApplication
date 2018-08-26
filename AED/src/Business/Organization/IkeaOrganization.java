/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.IkeaAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author GUEST1
 */
public class IkeaOrganization  extends Organization {
 
     public IkeaOrganization() {
        super(Organization.Type.IkeaOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
        roles.add(new IkeaAdminRole());
        return roles; }
}
