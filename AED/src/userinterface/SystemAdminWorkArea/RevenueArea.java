/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Rishi Nandedkar
 */
public class RevenueArea extends javax.swing.JPanel {
JPanel userProcessContainer;
EcoSystem business;
    /**
     * Creates new form RevenueArea
     */
    public RevenueArea(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        generateRevenueByArea();
        generateRevenueByAreaFenway();
        generateRevenueByAreaBackBay();
    }

    public void generateRevenueByArea(){}

    
    public void generateRevenueByAreaFenway(){
    
    double total2=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
                if(o.getArea().equals("Fenway")){
           
                for(OrderItem oi : o.getOrderItemList())
                   
                {
                    
                    total2 += oi.getPrice() * oi.getQuantity();
                }
            
        
          fenwayAreaTxtField.setText(String.valueOf(total2));
    }
            
            }
    
    }
    
    public void generateRevenueByAreaBackBay(){
    
    double total3=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
                if(o.getArea().equals("Back Bay")){
           
                for(OrderItem oi : o.getOrderItemList())
                   
                {
                    
                    total3 += oi.getPrice() * oi.getQuantity();
                }
            
        
          backBayAreaTxtField.setText(String.valueOf(total3));
    }
            
            }
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fenwayAreaTxtField = new javax.swing.JTextField();
        backBayAreaTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(174, 221, 221));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("Revenue by Area");
        add(jLabel1);
        jLabel1.setBounds(367, 44, 203, 30);

        jLabel2.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel2.setText("Revenue by Fenway:");
        add(jLabel2);
        jLabel2.setBounds(316, 142, 136, 17);

        jLabel3.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel3.setText("Revenue by BackBay:");
        add(jLabel3);
        jLabel3.setBounds(316, 203, 143, 17);

        fenwayAreaTxtField.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        add(fenwayAreaTxtField);
        fenwayAreaTxtField.setBounds(515, 138, 133, 26);

        backBayAreaTxtField.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        add(backBayAreaTxtField);
        backBayAreaTxtField.setBounds(515, 199, 133, 26);

        jButton1.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jButton1.setText("PieChart of Revenue by Area");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(368, 280, 232, 42);

        jButton2.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(20, 770, 95, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        //For fenway area
        
        double total2=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
                if(o.getArea().equals("Fenway")){
           
                for(OrderItem oi : o.getOrderItemList())
                   
                {
                    
                    total2 += oi.getPrice() * oi.getQuantity();
                }
            
            
            }
            }
                
                
                //for back bay area
                
                 double total3=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
                if(o.getArea().equals("Back Bay")){
           
                for(OrderItem oi : o.getOrderItemList())
                   
                {
                    
                    total3 += oi.getPrice() * oi.getQuantity();
                }
            
        
          backBayAreaTxtField.setText(String.valueOf(total3));
    }
            
            }
        
        
        //for both areas
        
        
        double totalFinal=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
               
           
                for(OrderItem oi : o.getOrderItemList())
                   
                {
                    
                    totalFinal += oi.getPrice() * oi.getQuantity();
                }
            
        
         
    }
            
           
    
        
        
        
        
        DefaultPieDataset pieDataSet = new DefaultPieDataset();
       pieDataSet.setValue("Fenway",new Integer((int) total2));
       pieDataSet.setValue("Back Bay",new Integer((int) total3));
        JFreeChart chart = ChartFactory.createPieChart("Revenue PieChart",pieDataSet,true,true,true );
        PiePlot pp = (PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Revenue PieChart", chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField backBayAreaTxtField;
    private javax.swing.JTextField fenwayAreaTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
