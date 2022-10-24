package maslovplab4;

import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity I will not cheat or lie
 * or steal in academic matters I will promote integrity in the UNCG community
 * Pavel Maslov 09/29/2021
 */

// Lab Four
/*
 * Pavel Maslov CSC 130, Sec #03
 **/

public class MaslovPLab4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lab Four \n" + "Pavel Maslov\n" + "CSC 130, Sec #03\n");

        System.out.println("This program will work with the Math and Random classes.\n"
                + "The program will use some of the Escape Characters\n"
                + "It will also demonstrate working with the char and String data types.\n"
                + "\nWorking with the Math and Random classes & the Escape Characters\n");

        double realNumber1 = 5.5;
        double realNumber2 = 2.37;
        double realNumber3 = 5.0;
        double realNumber4 = 1.14;
        double realNumber5 = 0.0;
        int integerNumber = 0;

        System.out.print("The ceiling is " + Math.ceil(realNumber1));
        System.out.print("\t\t\tThe floor is " + Math.floor(realNumber2));
        System.out.print("\nThe square root is " + Math.sqrt(realNumber3));
        System.out.print("\tThe cosine is " + Math.cos(realNumber4));

        integerNumber = 1 + (int) (Math.random() * (50 - 1));
        realNumber5 = 2.5 + (double) (Math.random() * (8.7 - 2.5));

        System.out.print("\nintegerNumber\'s value is " + integerNumber + "\t\trealNumber5\'s value is " + realNumber5);

        System.out.println("\nThe minimum number of 5.5 and 2.37 is " + Math.min(realNumber1, realNumber2));
        System.out.println("The maximum number of 5.0 and 1.14 is " + Math.max(realNumber3, realNumber4));

        System.out.println("\nWorking with the char and string methods\n");

        String firstName = "";
        char middleInitial = 0;
        char symbol = 0;
        String lastName = "";
        String fullName = "";
        String herName = "Pamela";
        String hisName = "Bill";
        int indexWhere = 0;
        int length = 0;

        System.out.print("Enter your first name: ");
        firstName = input.next();

        System.out.print("Enter your middle initial: ");
        middleInitial = input.next().charAt(0);

        System.out.print("Enter your last name: ");
        lastName = input.next();

        System.out.println("\nThe first name in upper case is " + firstName.toUpperCase());
        System.out.println("The first name in lower case is " + firstName.toLowerCase());

        fullName = firstName + " " + middleInitial + ". " + lastName;
        length = fullName.length();

        System.out.println("\nYour full name is " + firstName + " " + middleInitial + ". " + lastName);

        System.out.println("\nThe full name, including spaces is " + length + " characters long");

        if (herName.compareTo(firstName) < 0) {
            System.out.println("\nThe names in alphabetical order are " + herName + " and then " + firstName);
        } else {
            System.out.println("\nThe names in alphabetical order are " + firstName + " and then " + herName);
        }

        System.out.println("\nHi, " + herName.substring(0, 3) + "!");

        indexWhere = hisName.indexOf("l");
        System.out.println("\nThe first letter l in Bill's name is at the index of " + indexWhere);

        System.out.println();

        symbol = '\u20AC';
        System.out.println("The symbol for the Euro sign is " + symbol);
    }

}
