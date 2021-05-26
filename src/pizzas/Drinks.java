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
public enum Drinks {
    /**
     * Drinks enum constants
     */
    FOUNTAIN_SODA_20_OZ(2.99),RED_BULL(4.29),IZZE_SPARKLING_JUICE(2.79),
    FRESH_BREWED_ICED_TEA(2.99),WATER(0.00);
/**
     * Parameterized constructor 
     * @param drinkPrice price of the drink on basis of constants
     */
    private Drinks(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
    private double drinkPrice;
/**
     * To get the drink price
     * @return it returns the price of the drink on basis of constants
     */
    public double getDrinkPrice() {
        return drinkPrice;
    }
    
    
}
