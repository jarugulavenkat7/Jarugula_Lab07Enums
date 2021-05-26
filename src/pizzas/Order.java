/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

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
public class Order {
    private PizzaTypes pizzasName;
    private String pizzasSize;
    private int quantity;
    private Sauces sauce;
    private Sides side;       
    private String sideSize;
    private Drinks drink;
    private Cheese cheese;
    private Desserts dessert;
    private Double cost;

    /**
     *
     * @param pizzasName
     * @param pizzasSize
     * @param quantity
     * @param sauce
     * @param side
     * @param sideSize
     * @param drink
     * @param cheese
     * @param dessert
     */
    public Order(PizzaTypes pizzasName, String pizzasSize, int quantity, Sauces sauce, Sides side, String sideSize, Drinks drink, Cheese cheese, Desserts dessert) {
        this.pizzasName = pizzasName;
        this.pizzasSize = pizzasSize;
        this.quantity = quantity;
        this.sauce = sauce;
        this.side = side;
        this.sideSize = sideSize;
        this.drink = drink;
        this.cheese = cheese;
        this.dessert = dessert;
        this.cost=0.0;
    }

    /**
     *Returns the name of the pizza
     * @return Returns the name of the pizza
     */
    public PizzaTypes getPizzasName() {
        return pizzasName;
    }

    /**
     *Returns the size of the pizza
     * @return Returns the size of the pizza
     */
    public String getPizzasSize() {
        return pizzasSize;
    }

    /**
     * Returns quantity
     * @return Returns quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *Returns sauce ordered
     * @return Returns sauce ordered
     */
    public Sauces getSauce() {
        return sauce;
    }

    /**
     *Returns side ordered
     * @return Returns side ordered
     */
    public Sides getSide() {
        return side;
    }

    /**
     *Returns size of side ordered
     * @return Returns size of side ordered
     */
    public String getSideSize() {
        return sideSize;
    }

    /**
     *Returns drink ordered
     * @return Returns drink ordered
     */
    public Drinks getDrink() {
        return drink;
    }

    /**
     *Returns cheese ordered
     * @return Returns cheese ordered
     */
    public Cheese getCheese() {
        return cheese;
    }

    /**
     *Returns Desserts ordered
     * @return Returns Desserts ordered
     */
    public Desserts getDessert() {
        return dessert;
    }

    /**
     *Returns cost
     * @return Returns cost
     */
    public Double getCost() {
        return cost;
    }
            
       private double calcDessertCost()     {

           return dessert.getDessertPrice();
       }
       	private double calcSauceCost(){
             
             return sauce.getPriceOfSauce();
        }
       	private double calcCheeseCost(){
             
             return cheese.getCheesePrice();
        }
       	private double calcDrinkCost(){
             
             return drink.getDrinkPrice();
        }
       	private double calcSideCost(){
            double sideCost=0;
             if(sideSize.equalsIgnoreCase("small")){
                 sideCost= side.getSmallSidesPrice();
             }
             else if(sideSize.equalsIgnoreCase("family")){
                 sideCost= side.getFamilySidesPrice();
             }
             else{
                 sideCost= side.getPartySidesPrice();
             }
             return sideCost;
        }
        private double calcPizzasCost(){
            double pizzaCost;
            if(pizzasName.equals(PizzaTypes.HANDTOSSED_PIZZA)){
                if(pizzasSize.equalsIgnoreCase("large")){
                    pizzaCost=PizzaTypes.HANDTOSSED_PIZZA.getLargePizzaPrice();
                }
                else if(pizzasSize.equalsIgnoreCase("medium")){
                    pizzaCost=PizzaTypes.HANDTOSSED_PIZZA.getMediumPizzaPrice();
                }
                else{
                    pizzaCost=PizzaTypes.HANDTOSSED_PIZZA.getSmallPizzaPrice();
                }
            }
            else{
                if(pizzasSize.equalsIgnoreCase("large")){
                    pizzaCost=PizzaTypes.PAN_PIZZA.getLargePizzaPrice();
                }
                else if(pizzasSize.equalsIgnoreCase("medium")){
                    pizzaCost=PizzaTypes.PAN_PIZZA.getMediumPizzaPrice();
                }
                else{
                    pizzaCost=PizzaTypes.PAN_PIZZA.getSmallPizzaPrice();
                }
              
            }
         return pizzaCost*quantity;
        }

    /**
     *Calculates and returns discount
     * @param orderDate
     * @return Calculates and returns discount
     */
    public double calcDiscount(String orderDate) {
            double discount=0;
            
            if(pizzasName.equals(PizzaTypes.HANDTOSSED_PIZZA) && Days.isDiscountDay(orderDate)){
               discount= calcPizzasCost()*0.5;
                
            }
            return discount;
        }
  
    /**
     *Returns the total cost
     * @param orderDate
     * @return Returns the total cost
     */
    public double getTotalCost(String orderDate){  
            cost=calcPizzasCost()+calcSideCost()+
                    calcSauceCost()+calcDrinkCost()+
                    calcDessertCost()+calcCheeseCost();
            return cost;
        }

    /**
     *Returns the order object in toString format
     * @param orderDate
     * @return Returns the order object in toString format
     */
    public String toString(String orderDate)  {
           return "\nPIZZA TYPE: "+this.pizzasName.toString().replace("_", " ")+
            "\nPIZZA SIZE: "+this.pizzasSize.toUpperCase()+
            "\nQUANTITY: "+this.quantity+
            "\nSAUCE: "+this.sauce.toString().replace("_", " ")+
            "\nSIDES: "+this.side.toString().replace("_", " ")+" ("+this.sideSize.toUpperCase()+")"+
            "\nCHEESE: "+this.cheese.toString().replace("_", " ")+
            "\nDRINKS: "+this.drink.toString().replace("_", " ")+
            "\nDESSERTS: "+this.dessert.toString().replace("_", " ")+
            "\nCOST: "+String.format("%.2f",getTotalCost(orderDate));

            
        }
}
