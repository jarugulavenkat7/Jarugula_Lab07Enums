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
public enum Desserts {
    /**
     * Enum constants used for deserts which specific prices
     */
    CHOCOLATE_FUDGE_CAKE(11.99),CHEESECAKE_BITES(10.49),
    DESSERT_NACHOS(14.49),LOADED_ICE_CREAM(4.49),NO_DESSERTS(0.00);
    private double dessertPrice;
/**
     * Parameterized constructor 
     * @param dessertPrice  price of the desert
     */
    private Desserts(double dessertPrice) {
        this.dessertPrice = dessertPrice;
    }
/**
     * Method to get the price of desert
     * @return the price of the desert
     */
    public double getDessertPrice() {
        return dessertPrice;
    }
    
}
