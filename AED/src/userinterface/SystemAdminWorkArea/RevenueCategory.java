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
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author Rishi Nandedkar
 */
public class RevenueCategory extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem business;
    /**
     * Creates new form RevenueCategory
     */
    public RevenueCategory(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        generateRevenueByCategoryElectronics();
        generateRevenueByCategoryFurniture();
        generateRevenueByCategoryClothes();
        generateTotalRevenue();
    }

    
    
     public void generateTotalRevenue(){
     
     
        int total=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
           
                for(OrderItem oi : o.getOrderItemList())
                {
                    
                    total += oi.getPrice() * oi.getQuantity();
                }
            
        
        //revenueTotaal.setText(String.valueOf(total));
    }
     }
    
    public void generateRevenueByCategoryElectronics(){
    
     int total8=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
           
                for(OrderItem oi : o.getOrderItemList())
                    if(oi.getCategory().equals("Electronics")){
                {
                    
                    total8 += oi.getPrice() * oi.getQuantity();
                }
            
        
          revenueFromElectronics.setText(String.valueOf(total8));
    }
            }
    }
    
    
    public void generateRevenueByCategoryFurniture(){
    
    int total1=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
           
                for(OrderItem oi : o.getOrderItemList())
                    if(oi.getCategory().equals("Furniture")){
                {
                    
                    total1 += oi.getPrice() * oi.getQuantity();
                }
            
        
          revenueForFurniture.setText(String.valueOf(total1));
    }
            }
        
    }
    public void generateRevenueByCategoryClothes(){
    
    int total2=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
           
                for(OrderItem oi : o.getOrderItemList())
                    if(oi.getCategory().equals("Clothes")){
                {
                    
                    total2 += oi.getPrice() * oi.getQuantity();
                }
            
        
          revenueFromClothes.setText(String.valueOf(total2));
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
        revenueFromElectronics = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        revenueForFurniture = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        revenueFromClothes = new javax.swing.JTextField();
        barChartForCategory = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(174, 221, 221));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("Revenue by Category");
        add(jLabel1);
        jLabel1.setBounds(400, 20, 252, 30);

        jLabel2.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel2.setText("Revenue for Electronics:");
        add(jLabel2);
        jLabel2.setBounds(358, 118, 163, 17);

        revenueFromElectronics.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        add(revenueFromElectronics);
        revenueFromElectronics.setBounds(577, 114, 130, 26);

        jLabel3.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel3.setText("Revenue for Furniture:");
        add(jLabel3);
        jLabel3.setBounds(358, 177, 152, 17);

        revenueForFurniture.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        add(revenueForFurniture);
        revenueForFurniture.setBounds(577, 173, 130, 26);

        jLabel4.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel4.setText("Revenue for Clothes:");
        add(jLabel4);
        jLabel4.setBounds(358, 236, 135, 17);

        revenueFromClothes.setFont(new java.awt.Font("American Typewriter", 0, 13)); // NOI18N
        add(revenueFromClothes);
        revenueFromClothes.setBounds(577, 232, 130, 26);

        barChartForCategory.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        barChartForCategory.setText("Bar Chart for Revenue");
        barChartForCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barChartForCategoryActionPerformed(evt);
            }
        });
        add(barChartForCategory);
        barChartForCategory.setBounds(414, 305, 253, 37);

        jButton1.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(15, 635, 95, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void barChartForCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barChartForCategoryActionPerformed
        
        //for electronics
         int total8=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
           
                for(OrderItem oi : o.getOrderItemList())
                    if(oi.getCategory().equals("Electronics")){
                {
                    
                    total8 += oi.getPrice() * oi.getQuantity();
                }
            
        
     
    }
            }
        
        
        //for furniture
        
        int total1=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
           
                for(OrderItem oi : o.getOrderItemList())
                    if(oi.getCategory().equals("Furniture")){
                {
                    
                    total1 += oi.getPrice() * oi.getQuantity();
                }
            
    }
            }
        
        //for clothes
        
        int total2=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
           
                for(OrderItem oi : o.getOrderItemList())
                    if(oi.getCategory().equals("Clothes")){
                {
                    
                    total2 += oi.getPrice() * oi.getQuantity();
                }
            
        
          
    }
            }
        
        //for all categories
        
          int total=0;
       
        for(Order o : business.getMasterOrder().getMasterOrderList())
            {
           
                for(OrderItem oi : o.getOrderItemList())
                {
                    
                    total += oi.getPrice() * oi.getQuantity();
                }
            
        
       
    }
       
        
        
        
        
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         dataset.setValue(total8, "Revenue", "Electronics");
         dataset.setValue(total1, "Revenue", "Furniture");
         dataset.setValue(total2, "Revenue", "Clothes");
         
         JFreeChart chart = ChartFactory.createBarChart("Revenue according to categories", "Category","Revenue",dataset,PlotOrientation.VERTICAL,false,true,false);
         CategoryPlot p = chart.getCategoryPlot();
         p.setRangeGridlinePaint(Color.BLACK);
         ChartFrame frame = new ChartFrame("Revenue Analysis for Amazon", chart);
         frame.setVisible(true);
         frame.setSize(450, 350);
    }//GEN-LAST:event_barChartForCategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barChartForCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField revenueForFurniture;
    private javax.swing.JTextField revenueFromClothes;
    private javax.swing.JTextField revenueFromElectronics;
    // End of variables declaration//GEN-END:variables
}
