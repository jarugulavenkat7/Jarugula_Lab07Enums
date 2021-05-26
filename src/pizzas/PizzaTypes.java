/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Venkat Sai Jarugula
 * Description: Making sure everything works
 * Due: 03/24/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public enum PizzaTypes {
    HANDTOSSED_PIZZA(10.50,13.50,16.50),PAN_PIZZA(9.50,12.50,15.50);
    private final double smallPizzaPrice;
    private final double mediumPizzaPrice;
    private final double largePizzaPrice;
 /**
     * Parameterized constructor is to assign user - wanted specific value to the instance variables of different objects
     * @param smallPizzaPrice small pizza price
     * @param mediumPizzaPrice medium pizza price
     * @param largePizzaPrice large pizza price
     */
    private PizzaTypes(double smallPizzaPrice, double mediumPizzaPrice, double largePizzaPrice) {
        this.smallPizzaPrice = smallPizzaPrice;
        this.mediumPizzaPrice = mediumPizzaPrice;
        this.largePizzaPrice = largePizzaPrice;
    }
/**
     * To protect data while creating classes and access private variable
     * @return small pizza price
     */
    public double getSmallPizzaPrice() {
        return smallPizzaPrice;
    }
/**
     * To protect data while creating classes and access private variable
     * @return medium pizza price
     */
    public double getMediumPizzaPrice() {
        return mediumPizzaPrice;
    }
/**
     * To protect data while creating classes and access private variable
     * @return large size price
     */
    public double getLargePizzaPrice() {
        return largePizzaPrice;
    }
    
}
