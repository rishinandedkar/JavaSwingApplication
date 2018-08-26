/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.UPSAdminRole;
import java.util.ArrayList;

/**
 *
 * @author GUEST1
 */
public class UPSOrgnaization extends Organization {

    public UPSOrgnaization() {
        super(Organization.Type.UPSOrgnaization.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
   ArrayList<Role> roles = new ArrayList<>();
        roles.add(new UPSAdminRole());
        return roles;  
    }
    
    
}
