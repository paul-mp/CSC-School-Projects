
import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity I will not cheat or lie
 * or steal in academic matters I will promote integrity in the UNCG community
 * Pavel Maslov 10/06/2021
 */

// Lab Five
/*
 * Pavel Maslov CSC 130, Sec #03
 **/

public class MaslovPLab5 {
    public static void main(String[] args) {

        System.out.println("Lab Five \n" + "Pavel Maslov\n" + "CSC 130, Sec #03\n");

        System.out.println("This program will work with formatting.\n");

        double realNumber1 = 5.5;
        double realNumber2 = 2.37;
        double realNumber3 = 5.0;
        double realNumber4 = 1.14;
        double realNumber5 = 0.0;
        int integerNumber = 0;
        int whereIs = 0;
        char myCharacter = 0;
        char letter = 0;
        Boolean testing = true;
        String myWord = "Supercalifragilisticexpialidocious";

        Scanner input = new Scanner(System.in);

        System.out.print("The ceiling is " + Math.ceil(realNumber1));
        System.out.print("\t\t\tThe floor is " + Math.floor(realNumber2));
        System.out.print("\nThe square root is " + Math.sqrt(realNumber3));
        System.out.print("\tThe cosine is " + Math.cos(realNumber4));

        integerNumber = 1 + (int) (Math.random() * (50 - 1));
        realNumber5 = 2.5 + (double) (Math.random() * (8.7 - 2.5));

        System.out.print("\nintegerNumber\'s value is " + integerNumber + "\t\trealNumber5\'s value is " + realNumber5);

        System.out.print("\nEnter a character: ");
        myCharacter = input.next().charAt(0);

        if (myCharacter.isUpperCase()) {
            testing = true;
            System.out.println("That " + myCharacter + " is an upper-case letter is " + testing);
        } else {
            testing = false;
            System.out.println("That " + myCharacter + " is an upper-case letter is " + testing);
        }

    }
}