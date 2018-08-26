/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Rishi Nandedkar
 */
public class MasterOrder {
    private ArrayList<Order> masterOrderList;
    
    public MasterOrder() {
        masterOrderList=new ArrayList<>();
    }

    public ArrayList<Order> getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(ArrayList<Order> masterOrderList) {
        this.masterOrderList = masterOrderList;
    }
    
    public Order addOrder(Order o)
    {
        //Order mo=new Order();
        masterOrderList.add(o);  //was mo before
        return o;  //was mo before
    }
    
    public void deleteOrder(Order a)
    {
        masterOrderList.remove(a);
    }
}
