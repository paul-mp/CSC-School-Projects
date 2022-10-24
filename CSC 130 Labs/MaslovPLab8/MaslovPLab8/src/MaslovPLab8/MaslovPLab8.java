package MaslovPLab8;

import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity I will not cheat or lie
 * or steal in academic matters I will promote integrity in the UNCG community
 * Pavel Maslov, Sarvesh Sridher, Joseph Calcagno, Philip Duffield, Mario
 * Mandujano, and Carissa Boddie 11/03/2021
 */

// Lab Eight
/*
 * Pavel Maslov CSC 130, Sec #03
 **/

public class MaslovPLab8 {
    public static void main(String[] args) throws Exception {

        System.out.print("Lab Eight \n" + "Pavel Maslov\n" + "CSC 130, Sec #03\n\n");
        System.out.print("This program had 4 methods." + "\nThe 1st method is called getWholeNumber()."
                + "\nThe menu is in a loop so the user may use it as often as he wishes."
                + "\nIt gets an integer from a user and returns that value."
                + "\nThe 2nd method is called getRealNumber()."
                + "\nIt gets a real number from a user and returns that value."
                + "\nThe program has an example of overloading." + "\nThe 3rd method is called printCharacter()."
                + "\nIt uses the value from the getWholeNumber() method and displays the number and its character equivalent."
                + "\nThe 4th method is also called printCharacter()."
                + "\nIt uses the value from the getRealNumber() method and displays the number and its character equivalent."
                + "\nIn order to be able to print from the ASCII table, the program limits the values that the user can enter.\n\n");

        System.out.println(
                "*** You will enter values in the range of 33 - 126 for whole numbers and 33.0 - 126.0 for real numbers ***");

        int wholeNumber = getWholeNumber();
        Double realNumber = getRealNumber();

        printCharacter(wholeNumber);
        printCharacter(realNumber);

    }

    public static int getWholeNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter a whole number, one that does not have a decimal point: ");
        int number = input.nextInt();

        return number;
    }

    public static double getRealNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a real number, one that has a decimal point: ");
        Double number = input.nextDouble();

        return number;
    }

    public static void printCharacter(int wholeNumber) {

        char letter = (char) wholeNumber;

        System.out.printf("The number is %d and the character for this is a(n) %c\n", wholeNumber, letter);
    }

    public static void printCharacter(double realNumber) {
        char letter = (char) Math.round(realNumber);

        System.out.println("The number is " + realNumber + " and the character for this is a(n) " + letter);

    }

}
