/*

My words and actions will reflect Academic Integrity.
I will not cheat or lie or steal in academic matters.
I will promote integrity in the UNCG community.

Student’s Signature Pavel Maslov Date 03/14/22

 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;

public class main {

    public static void main(String[] args) throws Exception {

        System.out.println("MaslovPHW4" + "\nPavel Maslov" + "\nCSC 230, Sec #2");

        System.out.println("\nThis program loads to an array a list of 50 grades read from a file."
                          + "\nOnce the scores have been loaded to the array, provide the user with a menu of options:"
                          + "\n A. Print the grades to the screen sorted in ascending order"
                          + "\n B. Calculate and print to the screen the average value of the scores"
                          + "\n C. Calculate and print to the screen the standard deviation of the scores"
                          + "\n D. Print the grades to a file sorted in ascending order, along with the average value"
                          + "\n\t and standard deviation of the scores"
                          + "\n E. Quit");

        Scanner input = new Scanner(System.in);

        try {
            File file = new File("gradesIn.txt");
            Scanner gradesIn = new Scanner(file);

            int counter = 0;

            while (gradesIn.hasNextLine()) {
                counter++;
                gradesIn.nextLine();
            }

            gradesIn.close();

            Scanner gradesIn2 = new Scanner(file);

            int[] numArray = new int[counter];

            for (int i = 0; i < counter; i++) {
                numArray[i] = gradesIn2.nextInt();
            }

            gradesIn2.close();

            char choice;

            do {

                System.out.println("\n\n******************************************************************"
                        + "\n* Menu:                                                        *"
                        + "\n* A - Show Grades in Ascending Order.                          *"
                        + "\n* B - Calculate and Print Average of Grades                    *"
                        + "\n* C - Calculate and Print Standard Deviation of Grades         *"
                        + "\n* D - Create File with Grades, Average, and Standard Deviation *"
                        + "\n* E - Quit                                                     *"
                        + "\n******************************************************************\n");

                System.out.print("Enter a letter for your choice on the menu (A, B, C, D, or E): ");
                choice = input.next().charAt(0);
                
                switch (Character.toUpperCase(choice)) {
                    case ('A'):
                        sortArraysMethod(numArray);
                        printValuesMethod(numArray);
                        continue;
                    case ('B'):
                        System.out.printf("%.3f", averageArrayMethod(numArray));
                        continue;
                    case ('C'):
                        System.out.printf("%.3f", StandDev(numArray));
                        continue;
                    case ('D'):
                        printToFileArray(numArray);
                        continue;
                    case ('E'):
                        System.out.println("Thanks for using my program!");
                        break;

                }

                break;

            } while(choice != 'E');

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        }

    }

    public static double averageArrayMethod(int[] array) {
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;

    }

    public static void sortArraysMethod(int[] array) {
        Arrays.sort(array);
    }

    public static void printValuesMethod(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static double StandDev(int[] numArray) {
        double mean = averageArrayMethod(numArray);
        double result = 0;

        for (int i = 0; i < numArray.length; i++) {
            result += Math.pow(numArray[i] - mean, 2);
        }

        double squaredDifference = result / numArray.length;

        return Math.sqrt(squaredDifference);

    }

    public static void printToFileArray(int[] printedArray) {

        try {
            sortArraysMethod(printedArray);

            File file = new File("gradesOut.txt");
            PrintWriter output = new PrintWriter(file);

            output.print("The array in ascending order is: \n" + Arrays.toString(printedArray));

            output.print("\n\nThe Average of the Grades is " + averageArrayMethod(printedArray));
            output.printf("\nThe Standard Deviation of the Grades is %.3f", StandDev(printedArray));

            output.close();

        } catch (IOException ioException) {
            System.out.println("IOException");
        }

    }


}