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
public enum Sides {
    GARLIC_CHEESEBREAD(6.99,24.99,39.99),
    CHEFSALAD(3.99,15.99,29.99),
    RANCH_STIX(1.99,7.99,12.99),
    RANCH_POTATO_WEDGES(2.99,10.99,20.99),
    MASHED_POTATOES(5.99,16.99,32.99),
    RANCH_CHIPS(3.99,17.99,32.99),
    PARMESAN_BROCCOLI(2.99,7.99,16.99),
    ONION_RINGS(4.99,7.49,29.49),
    NO_SIDES(0.00,0.00,0.00);
    
    private double smallSidesPrice; 
    private double familySidesPrice;
    private double partySidesPrice;
/**
     * constants constructors for assigning values
     * @param smallSidesPrice small size side price
     * @param familySidesPrice family size side price
     * @param partySidesPrice party size side price
     */
    private Sides(double smallSidesPrice, double familySidesPrice, double partySidesPrice) {
        this.smallSidesPrice = smallSidesPrice;
        this.familySidesPrice = familySidesPrice;
        this.partySidesPrice = partySidesPrice;
    }
/**
     * To protect data while creating classes and access private variable
     * @return small side price
     */
    public double getSmallSidesPrice() {
        return smallSidesPrice;
    }
/**
     * To protect data while creating classes and access private variable
     * @return family side price
     */
    public double getFamilySidesPrice() {
        return familySidesPrice;
    }
/**
     * To protect data while creating classes and access private variable
     * @return party side price
     */
    public double getPartySidesPrice() {
        return partySidesPrice;
    }
   
    public enum Cheese{
        AMERICAN_CHEESE(0.55),CHEDDAR_CHEESE(0.60),CHEDDAR_JACK_CHEESE(0.70),PEPPER_JACK_CHEESE(0.59),
        QUESO_CHEESE(0.65), SWISS_CHEESE(0.60),BLUE_CHEESE(0.60),RANCH(0.60),NO_CHEESE(0.0);
        private double CheesePrice;
/**
         * Constructor of the constants
         * @param CheesePrice price of the cheese
         */
        private Cheese(double CheesePrice) {
            this.CheesePrice = CheesePrice;
        }
/**
        * To protect data while creating classes and access private variable
        * @return cheese price
        */
        public double getCheesePrice() {
            return CheesePrice;
        }
        
        
    }
    
}
