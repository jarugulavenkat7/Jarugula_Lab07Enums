/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import pizzas.Sides.Cheese;
/**
 * Class: 44542-02 Object Oriented Programming
 * @author Venkat Sai Jarugula
 * Description: Making sure everything works
 * Due: 03/24/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class OrderDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
      //1. Declare and initialize a scanner object to read from file "input.txt"
        Scanner scan = new Scanner(new File("input.txt"));
      
        System.out.println("*****************************************************");
        System.out.println("*********************** Pizza Hut ******************");
        System.out.println("*****************************************************");
        while (scan.hasNext()) {
			//2. Declare and initialize an OrderSummary object and name it as orderSum
                        OrdersSummary orderSum= new OrdersSummary();
                    
			//3. Read date and pass the date to the getOrderDayOfWeek method
                        String date=scan.nextLine();
                        
                        Days.getOrderDayOfWeek(date);
                       
			//4. Read pizzas name and convert it to PizzaTypes enum. Note: You can convert to PizzaTypes enum here in the main method 
                        //or you can create a   
                        //private static method after main method in the same class to convert a string that is read to PizzaTypes enum.
                        //Do not use switch or if                              else to convert to enums
                        String pizzaTypeString=scan.nextLine();
                        PizzaTypes pizzaTypeEnum=Enum.valueOf(PizzaTypes.class, pizzaTypeString.toUpperCase().replace(" ", "_"));
                        String sizeOfPizza=scan.next();
                        int numberOfPizzas=scan.nextInt();
                        
                        
			//5. Read size and number of Pizzas per order according to the input given in the input file
                        
                        
			//6. Read Sauce, Sides, Cheese and Drinks and convert them to corresponding enums. 
                        scan.nextLine();
                        String sauceString=scan.nextLine();
                        
                        Sauces sauceEnum=Enum.valueOf(Sauces.class, sauceString.toUpperCase().replace(" ", "_"));
                        String[] sidesAndSize=scan.nextLine().split("- ");
                        
                         Sides sidesEnum=Enum.valueOf(Sides.class, sidesAndSize[0].toUpperCase().trim().replace(" ", "_"));
                         String sidesSize=sidesAndSize[1];
                        String cheeseString=scan.nextLine();
                        Cheese cheeseEnum=Enum.valueOf(Cheese.class, cheeseString.toUpperCase().replace(" ", "_"));
                      
                        String drinksString=scan.nextLine();
                         Drinks drinksEnum=Enum.valueOf(Drinks.class, drinksString.toUpperCase().replace(" ", "_"));
                         String dessertsString=scan.nextLine();
                        Desserts  dessertEnum= Enum.valueOf(Desserts.class, dessertsString.toUpperCase().trim().replace(" ", "_"));
                           //  Please follow same rules as provided above for PizzaTypes enums. 
                        //7. Create an Order object with above attributes and name it as order
			Order order=new Order(pizzaTypeEnum, sizeOfPizza, numberOfPizzas, 
                                sauceEnum, sidesEnum, sidesSize, drinksEnum, cheeseEnum, 
                                dessertEnum);
                        
                        orderSum.addAOrder(order);
			//8. Add order, an Order object created above to orderSum object which is an orderSummary Class object
                        
			//9. Print the receipt for orders.
                      System.out.println(orderSum.printReceipt(date));
        }               
        

    }
    
    
}