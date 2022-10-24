package MaslovPLab7;

import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity I will not cheat or lie
 * or steal in academic matters I will promote integrity in the UNCG community
 * Pavel Maslov 10/27/2021
 */

// Lab Seven
/*
 * Pavel Maslov CSC 130, Sec #03
 **/

public class MaslovPLab7 {

    static final double PI = 3.14159;

    public static void main(String[] args) {

        System.out.print("Lab Seven \n" + "Pavel Maslov\n" + "CSC 130, Sec #03\n\n");
        System.out.print("This program will show the user a menu that allows him to have"
                + "\n the program calculate the area of a square, rectangle, or circle."
                + "\nThe menu is in a loop so the user may use it as often as he wishes."
                + "\nThe code for the calculations is in methods called by main.\n\n");

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("**************************************************************" + "\n\t    Menu"
                    + "\n\t1 - Square" + "\n\t2 - Rectangle" + "\n\t3 - Circle" + "\n\t4 - Print star pattern"
                    + "\n\t5 - Quit program" + "\n************************************************************");

            System.out.print("Please make your choice from the menu: ");
            choice = input.nextInt();

            while (choice <= 0 || choice > 5) {
                System.out.print("Invalid choice. Please select 1, 2, 3, or 4. ");
                choice = input.nextInt();

            }

            switch (choice) {

            case 1:
                System.out.printf("The area of the square is %,1.2f\n\n ", squareArea());
                continue;

            case 2:
                System.out.printf("The area of the rectangle is %,1.2f\n\n ", rectangleArea());
                continue;

            case 3:
                System.out.printf("The area of the circle is %,1.2f\n\n ", circleArea());
                continue;

            case 4:
                printStars();

                continue;

            case 5:
                System.out.println("\nThank you for using my program!");

                break;

            }

            break;

        } while (choice != 5);

    }

    public static double squareArea() {
        Double side;
        Double area;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of one side of the square? ");
        side = input.nextDouble();

        area = side * side;
        return area;
    }

    public static double rectangleArea() {
        Double length;
        Double width;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the rectangle? ");
        length = input.nextDouble();
        System.out.print("What is the width of the rectangle? ");
        width = input.nextDouble();

        Double area = length * width;

        return area;
    }

    public static double circleArea() {
        Double r;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the radius of the circle? ");
        r = input.nextDouble();
        Double area = PI * r * r;
        return area;
    }

    public static void printStars() {
        int rows = 1;

        System.out.println();

        for (int i = 5; i >= rows; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

    }

}
