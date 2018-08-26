/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;


public class RetailerEnterprise extends Enterprise{

      public RetailerEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Retailer);
    }
 @Override
    public ArrayList<Role> getSupportedRole() {
      return null;
    }
}
