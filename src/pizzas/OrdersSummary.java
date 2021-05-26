/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.util.ArrayList;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Venkat Sai Jarugula
 * Description: Making sure everything works
 * Due: 03/24/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class OrdersSummary {
    private ArrayList<Order> orders;

    /**
     *Constructs OrderSummary
     */
    public OrdersSummary() {
        orders=new ArrayList<>();
    }

    /**
     *Returns list of orders
     * @return Returns list of orders
     */
    public ArrayList<Order> getOrders() {
        return orders;
    }

    /**
     *Sets list of orders
     * @param order list of Orders to set
     */
    public void addAOrder(Order order){
        orders.add(order);
    } 
    
    /**
     * calculates and Returns the total cost of all orders
     * @param orderDate
     * @return Returns the total cost of all orders
     */
    public double calcTotalCostOfAllOrders(String orderDate){
      double totalCost=0.0;
      for(Order order:orders){
          totalCost+=order.getTotalCost(orderDate);
      }
      return totalCost;
  } 

    /**
     *calculates and Returns the total bill with tax
     * @param orderDate
     * @return Returns the total bill with tax
     */
    public double calcTotalBillWithTax(String orderDate) {
     double totalBill=0.0;
          for(Order order:orders){
             totalBill= order.getTotalCost(orderDate)-order.calcDiscount(orderDate);
          }
     return totalBill+(totalBill*8.6)/100;
 }

    /**
     * Returns the print Receipt
     * @param orderDate
     * @return Returns the print Receipt
     */
    public String printReceipt(String orderDate){
     
 String printReceipt="";
     for(Order order:orders){
    printReceipt+=   
            "**************  "+orderDate+", "+Days.getOrderDayOfWeek(orderDate)+"  ***************"+

     order.toString(orderDate)
+"\n-----------------------------------------------------"
+"\n		Order Total :		$"+String.format("%.2f",this.calcTotalCostOfAllOrders(orderDate))
+"\n		Discount@50 :		$"+String.format("%.2f",order.calcDiscount(orderDate))
+"\n		Tax@8.6 :		$"+String.format("%.2f",((order.getTotalCost(orderDate)-order.calcDiscount(orderDate))*8.6)/100)
+"\n		Total Amount with tax : $"+String.format("%.2f",calcTotalBillWithTax(orderDate))
+"\n-----------------------------------------------------";

     }
      return printReceipt;
}
    
}