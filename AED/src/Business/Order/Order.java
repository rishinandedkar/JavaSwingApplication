/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.UserAccount.UserAccount;
import Utilities.HelperClass;
import java.util.ArrayList;

/**
 *
 * @author Rishi Nandedkar
 */
public class Order {
    private String orderNumber;
    private ArrayList<OrderItem> orderItemList;
    private static int count=0;
    private String area;
    private String message;
    
    public Order()
    {
        orderItemList =new ArrayList<>();
        count++;
        //orderNumber=count;
        orderNumber = HelperClass.randomID();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
     public OrderItem addOrderItem(int q,int price, UserAccount userAcc)        
    {
         //UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        OrderItem o=new OrderItem();
        //o.setMarketoffer(p);
        o.setQuantity(q);
        o.setPrice(price);
  
       // o.setCustomer(c);
       o.setUserAcc(userAcc);
        orderItemList.add(o);
        return o;
    }
      public void removeOrderItem (OrderItem o)
    {
        orderItemList.remove(o);
    }
}
