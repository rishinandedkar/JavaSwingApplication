package Business;

import Business.Network.Network;
import Business.Order.MasterOrder;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private MasterOrder masterOrder;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        masterOrder =new MasterOrder();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public MasterOrder getMasterOrder() {
        return masterOrder;
    }

    public void setMasterOrder(MasterOrder masterOrder) {
        this.masterOrder = masterOrder;
    }

     public static void setInstance(EcoSystem system) {
        system=system; //might be a problem uh oh
    }
    
    
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

       

        return true;
    }
}