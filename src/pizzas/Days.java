/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Venkat Sai Jarugula
 * Description: Making sure everything works
 * Due: 03/24/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */

public class Days {
/**
     * Class constructor 
     */
    public Days() {
    }
    /**
     * Method used to calculate the week day from the date
     * @param orderDate it's date come from the input file
     * @return it's returns the week day
     */
    public static DayOfWeek  getOrderDayOfWeek(String orderDate){
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                return LocalDate.parse(orderDate, formatter).getDayOfWeek();
    }
   
    public static boolean isDiscountDay(String orderDate){
        return (getOrderDayOfWeek(orderDate).equals(DayOfWeek.SATURDAY)|| getOrderDayOfWeek(orderDate ).equals(DayOfWeek.SUNDAY));
    }
    
}
