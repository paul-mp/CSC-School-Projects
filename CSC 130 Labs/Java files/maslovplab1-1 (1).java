package MaslovPLab1;
 
 import java.util.Scanner;
/**
 *
 * My words and actions will reflect Academic Integrity 
 * I will not cheat or lie or steal in academic matters
 * I will promote integrity in the UNCG community 
 * Pavel Maslov   08/25/2021
 */
 
 // Lab One
 
 /* 
    Pavel Maslov 
    CSC 130, Sec #03
**/
 
public class maslovplab1 {

    public static void main(String[] args) {
       
        
        System.out.println("Lab One");
        System.out.println("Pavel Maslov");
        System.out.println("CSC 130, Sec #03");
        
        System.out.println();
        
        System.out.println("This program will define and initialize two numbers.\n" +
       "The user will be asked to enter the two numbers. \n" +
        "The program will then do the calculations to show you. \n" +
       " The program will then do the calculations to show you.");
        
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int Number_One = input.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter another whole number: ");
        int Number_Two = input2.nextInt();
        
        System.out.println();
        
        int Sum = Number_One + Number_Two;
        int Product = Number_One * Number_Two;
        int Difference = Number_One - Number_Two;
        System.out.println("The sum of " + Number_One + " + " + Number_Two + " = " + Sum);
        System.out.println("The difference of " + Number_One + " - " + Number_Two + " = " + Difference);
        System.out.println("The product of " + Number_One + " * " + Number_Two + " = " + Product);
        
    
       
        
    }
    
}
