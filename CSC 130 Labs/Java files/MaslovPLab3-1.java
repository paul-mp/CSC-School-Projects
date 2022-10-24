package maslovplab3;

import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity I will not cheat or lie
 * or steal in academic matters I will promote integrity in the UNCG community
 * Pavel Maslov 09/15/2021
 */

// Lab Three
/*
 * Pavel Maslov CSC 130, Sec #03
 **/

public class MaslovPLab3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lab Three \n" + "Pavel Maslov\n" + "CSC 130, Sec #03\n");

        System.out.println("This program will ask a user to enter three numbers in the range of 0 to 15.\n"
                + "The user will then be shown a menu that has 4 choices.\n"
                + "Choice 1 will add the three numbers together\n" + "Choice 2 will compare and sort the numbers\n"
                + "Choice 3 will generate 4 random numbers to create a 4-digit PIN\n"
                + "Choice 4 will test if numbers are above 2, 4, & 6 respectively");

        int choice = 0;
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        int randomNumber1 = 0;
        int randomNumber2 = 0;
        int randomNumber3 = 0;
        int randomNumber4 = 0;
        int temp = 0;
        int sum = 0;
        boolean testing = true;

        System.out.println("\nEnter a whole number in the range of 0 to 15: ");
        numberOne = input.nextInt();

        System.out.println("Enter another whole number in the range of 0 to 15: ");
        numberTwo = input.nextInt();

        System.out.println("Enter a third whole number in the range of 0 to 15: ");
        numberThree = input.nextInt();

        System.out.println();

        System.out.println("************************* Menu *************************\n"
                + "1. Add the three numbers together\n" + "2. Compare and sort the numbers\n"
                + "3. Use generated random numbers to create a 4-digit PIN\n"
                + "4. Test if numbers are above 2, 4, & 6\n"
                + "********************************************************\n");

        System.out.println("Enter your menu choice, 1, 2, 3, or 4: ");
        choice = input.nextInt();

        switch (choice) {

            case 1:
                sum = numberOne + numberTwo + numberThree;
                System.out
                        .println("The sum is of " + numberOne + " + " + numberTwo + " + " + numberThree + " = " + sum);
                break;
            case 2:

                if (numberTwo < numberOne) {
                    temp = numberOne;
                    numberOne = numberTwo;
                    numberTwo = temp;
                }
                if (numberThree < numberTwo) {
                    temp = numberTwo;
                    numberTwo = numberThree;
                    numberThree = temp;
                }
                if (numberTwo < numberOne) {
                    temp = numberOne;
                    numberOne = numberTwo;
                    numberTwo = temp;
                }

                System.out
                        .println("In sorted order the numbers are: " + numberOne + " " + numberTwo + " " + numberThree);
                break;

            case 3:
                System.out.println("Generating a 4-digit pin number. Numbers can be duplicated");
                randomNumber1 = (int) (Math.random() * 10);
                randomNumber2 = (int) (Math.random() * 10);
                randomNumber3 = (int) (Math.random() * 10);
                randomNumber4 = (int) (Math.random() * 10);
                System.out.println(" Your pin number is: " + randomNumber1 + "" + randomNumber2 + "" + randomNumber3
                        + "" + randomNumber4);
                break;

            case 4:
                testing = (numberOne > 2 && numberTwo > 4 && numberThree > 6);
                if (testing) {
                    System.out.println("The numbers are above 2, 4, & 6.");

                } else {
                    System.out.println("The numbers are not above 2, 4, & 6.");
                }

                break;

        }

    }

}
