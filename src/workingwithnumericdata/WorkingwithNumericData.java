
package workingwithnumericdata;

import java.text.*;

public class WorkingwithNumericData {
    
    
    public static void main(String[] args) {
        int bill;// Declares a integar called bill
        double hst;// Declares a double called hst
        double total;// Declares a double called total
        
        bill = 10; // Sets bill to 10
        hst = 10 * 0.13; // Sets hst to 10 / 0.13
        total = hst + bill; // Sets total to add hst and bill
        
        DecimalFormat x = new DecimalFormat ("##.##"); // Creates a new decimal format called x
        
        System.out.println("Restaurant Bill");// Prints Restaurant Bill to the screen
        System.out.println("_______________");// Prints Underscore to the screen
        
        System.out.println("Meal: " + bill); // Prints Meal: and the value that is stored in bill
        System.out.println("HST:  " + x.format(hst)); // Prints HST: and the value that is stored in hst and formatted to two decimal spaces 
        System.out.println("Total: " + x.format(total)); // Prints Total: and the value that is stored in total and formatted to two decimal spaces
        
        
    }
    
}
