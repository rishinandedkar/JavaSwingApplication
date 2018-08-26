/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.AmazonRequestHandlingOrganization.getValue())){
            organization = new AmazonRequestHandlingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.UberOrganization.getValue())){
            organization = new UberOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.UPSOrgnaization.getValue())){
            organization = new UPSOrgnaization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TargetOrganization.getValue())){
            organization = new TargetOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BestBuyOrganization.getValue())){
            organization = new BestBuyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.IkeaOrganization.getValue())){
            organization = new IkeaOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CustomerFacingOrganization.getValue())){
            organization = new CustomerFacingOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}