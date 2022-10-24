
package maslovplab2;

import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity 
 * I will not cheat or lie or steal in academic matters
 * I will promote integrity in the UNCG community 
 * Pavel Maslov  09/01/2021
 */
 
 // Lab Two
 
 /* 
    Pavel Maslov 
    CSC 130, Sec #03
**/
 
public class MaslovPLab2 {
    public static void main(String[] args) {
        
    
        System.out.println("Lab Two");
        System.out.println("Pavel Maslov");
        System.out.println("CSC 130, Sec #03");
        System.out.println();
        System.out.println("This program will define and initialize two numbers.");
        System.out.println("The user will be asked to enter the two numbers.");        
        System.out.println("The program will then do the calculations to show you.");
        System.out.println("  the sum, difference, product, and quotient of the two numbers.");
        System.out.println("It will also calculate the exponent value of numberOne ^ numberTwo.");
        System.out.println("A sales price with tax rate of 6% will be calculated and displayed");
        System.out.println("Lastly, the program will demonstrate use of the increment and augmented operators.");
        System.out.println();
        
        int numberOne = 0;
        int numberTwo = 0;
        int sum = 0;
        int difference = 0;
        int product = 0;
        double quotient = 0;
        double powerOf = 0;
        int numberThree = 0;
        int numberFour = 0;
        double subTotal = 0;
        double total = 0;
        double tax = 0;
        final double TAX_RATE = .06;
        
       
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("\nEnter a whole number: ");
        numberOne = keyboard.nextInt();
        
        System.out.print("\nEnter another whole number: ");
        numberTwo = keyboard.nextInt();
        
        sum = numberOne + numberTwo;
        difference = numberOne - numberTwo;
        product = numberOne * numberTwo;
        quotient = (double) numberOne / (double) numberTwo;
        powerOf = Math.pow(numberOne, numberTwo);
        subTotal = numberOne + numberTwo + numberThree;
        total = subTotal + subTotal * TAX_RATE;
        
        
        System.out.println();
        System.out.println("The sum of " + numberOne + " + " + numberTwo + " = " + sum + "\n");
        System.out.println("The difference of " + numberOne + " - " + numberTwo + " = " + difference + "\n");
        System.out.println("The product of " + numberOne + " * " + numberTwo + " = " + product + "\n");
        System.out.println("The quotient of " + numberOne + " / " + numberTwo + " = " + quotient +"\n");
        System.out.println("The power of " + numberOne + " ^ " + numberTwo + " = " + powerOf +"\n");
        
        System.out.println();
        
        System.out.println("Sales data");
        System.out.println("The subtotal is: " + subTotal);
        System.out.println("The total is: " + total);
        
        System.out.println();
        
        System.out.println("Increment & decrement fun!");
        numberOne++;
        numberTwo -= 3;

        numberThree = numberOne;
        numberFour = numberTwo;
        System.out.println("numberThree is numberOne increased by one: " + numberThree);
        System.out.println("numberFour is numberTwo decreased by three: " + numberFour);
        
        System.out.println();
        
        
    }
    
}
