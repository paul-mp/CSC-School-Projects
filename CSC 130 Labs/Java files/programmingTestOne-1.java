package programmingTestOne;

import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity I will not cheat or lie
 * or steal in academic matters I will promote integrity in the UNCG community
 * Pavel Maslov 09/22/2021
 */

// Programming Test #1
/*
 * Pavel Maslov CSC 130, Sec #03
 **/

public class programmingTestOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Programming Test #1 \n" + "Pavel Maslov\n" + "CSC 130, Sec #03\n");

        int choice = 0;
        int randomNumberOne = 0;
        int randomNumberTwo = 0;
        int getNumber = 0;
        double radius = 0;
        double area = 0;
        boolean testing = true;

        System.out.println("****************************** Menu ************************");
        System.out.println("1. Generate and compare random numbers");
        System.out.println("2. Get a whole number and check to see if the number is even or odd");
        System.out.println("3. Get real number and use it to calculate the area of a circle. ");
        System.out.println("************************************************************");

        System.out.println();

        System.out.print("Enter your choice, 1, 2, or 3: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                randomNumberOne = (int) ((Math.random() * 15) + 1);
                randomNumberTwo = (int) ((Math.random() * 15) + 1);

                if (randomNumberOne == randomNumberTwo) {
                    System.out.println(randomNumberOne + " = " + randomNumberTwo);
                }
                if (randomNumberOne != randomNumberTwo) {
                    System.out.println(randomNumberOne + " != " + randomNumberTwo);
                }
                if (randomNumberOne >= randomNumberTwo) {
                    System.out.println(randomNumberOne + " >= " + randomNumberTwo);
                }
                if (randomNumberOne <= randomNumberTwo) {
                    System.out.println(randomNumberOne + " <= " + randomNumberTwo);
                }
                if (randomNumberOne > randomNumberTwo) {
                    System.out.println(randomNumberOne + " > " + randomNumberTwo);
                }
                if (randomNumberOne < randomNumberTwo) {
                    System.out.println(randomNumberOne + " < " + randomNumberTwo);
                }
                break;

            case 2:
                System.out.print("Enter a whole number: ");
                getNumber = input.nextInt();

                if (getNumber % 2 == 0) {
                    testing = true;
                    System.out.println("Testing is " + testing);
                } else {
                    testing = false;
                    System.out.println("Testing is " + testing);
                }
                break;

            case 3:
                System.out.print("Enter a real number as the radius: ");
                radius = input.nextDouble();

                final double PI = 3.1415926536;
                area = radius * radius * PI;

                System.out.println("The area of a circle that has a radius of " + radius + " is " + area);

                break;
        }

    }

}
