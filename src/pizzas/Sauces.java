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
public enum Sauces {
    PESTO(0.20),TOMATO(0.15),BECHAMEL(0.25),BBQ(0.35),HUMMUS(0.10),MARINARA(0.13),
    TAPENADE(0.15),PUMPKIN_PIZZA_SAUCE(0.35),NO_SAUCE(0.00);
    private double priceOfSauce;
 /**
     * Constructor to assign values
     * @param priceOfSauce price of sauce 
     */
    private Sauces(double priceOfSauce) {
        this.priceOfSauce = priceOfSauce;
    }
/**
     * To protect data while creating classes and access private variable
     * @return sauce price
     */
    public double getPriceOfSauce() {
        return priceOfSauce;
    }
    


}
