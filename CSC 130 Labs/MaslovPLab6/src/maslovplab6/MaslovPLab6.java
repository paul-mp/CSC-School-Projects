package maslovplab6;

import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity I will not cheat or lie
 * or steal in academic matters I will promote integrity in the UNCG community
 * Pavel Maslov 10/20/2021
 */

// Lab Six
/*
 * Pavel Maslov CSC 130, Sec #03
 **/

public class MaslovPLab6 {
	public static void main(String[] args) {

		System.out.print("Lab Six \n" + "Pavel Maslov\n" + "CSC 130, Sec #03\n\n");
		System.out.print("This program will use a while loop to accept integers from a user"
				+ "\n until the user enters a -1"
				+ "\nThe program will count the number of values entered, calculate the sum & average of the numbers,"
				+ "\n show how many of the numbers are even, and display the number in binary form\n\n");

		Scanner input = new Scanner(System.in);

		int numbers = 0;
		int counter = 0;
		int sum = 0;
		double average = 0;
		int evenNumbers = 0;

		System.out.print("Please enter a whole number. Enter a -1 (negative 1) to stop: ");
		numbers = input.nextInt();

		while (numbers != -1) {

			counter++;
			sum += numbers;

			if (numbers % 2 == 0) {
				evenNumbers++;
			}

			System.out.print("Please enter a whole number. Enter a -1 (negative 1) to stop: ");
			numbers = input.nextInt();

		}

		average = ((double) (sum)) / ((double) (counter));

		System.out.printf("\nYou entered %d Numbers", counter);
		System.out.printf("\nThe sum of all of the numbers entered is %,d", sum);
		System.out.printf("\nThe average of all of the numbers entered is %.2f", average);
		System.out.printf("\nOf these numbers, %d of them is/are even.", evenNumbers);
		System.out.printf("\nThe sum in binary is %s", Integer.toString(sum, 2));

	}

}
