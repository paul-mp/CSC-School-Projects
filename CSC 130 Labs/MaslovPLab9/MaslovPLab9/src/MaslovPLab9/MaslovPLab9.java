package MaslovPLab9;

import java.util.Scanner;

/**
 *
 * My words and actions will reflect Academic Integrity I will not cheat or lie
 * or steal in academic matters I will promote integrity in the UNCG community
 * Pavel Maslov 11/17/2021
 */

// Lab Nine
/*
 * Pavel Maslov CSC 130, Sec #03
 **/

public class MaslovPLab9 {

    public static final int SIZE = 10;

    public static void main(String[] args) throws Exception {

        System.out.print("Lab Nine \n" + "Pavel Maslov\n" + "CSC 130, Sec #03\n\n");

        System.out.print("This program has 7 methods." + "\nThe 1st method is called getWholeNumber()."
                + "\nIt gets a whole number from a user and returns that value."
                + "\nThe 2nd method is called createArray()."
                + "\nIt creates an array of 10 integers & returns the array."
                + "\nThe 3rd method is called printArray()."
                + "\nIt prints the array, using a for loop or a foreach loop to traverse the array"
                + "\nThe 4th method is called sortArray()." + "\nIt uses the Arrays.sort(() method to sort the array."
                + "\nThe 5th method is called changeElements()."
                + "\nIt asks the user which 2 elements to change and what numbers to change them to."
                + "\nThe 6th method is called createfirstArray()."
                + "\nIt creates a 2nd array having 10 integers & returns the array."
                + "\nThe 7th method is called copyArray()."
                + "\nIt uses the arraycopy() method to copy the elements at index of 2, 3, & 4"
                + "\n  from the firstArray into the firstArray.");

        System.out.println();
        System.out.printf("\nYou will enter %d whole numbers from 1-100", SIZE);
        System.out.print("\nNumbers can be repeated, and they do not need to be in order.\n");

        int[] firstArray = createArray();

        System.out.print("\nThe array is:");
        printArray(firstArray);

        sortArray(firstArray);

        System.out.print("\n\nThe sorted array is:");
        printArray(firstArray);

        System.out.print(
                "\n\nYou will be able to change out two numbers by their position with the 1st number at position 0 and the last at position 9");

        System.out.print("\nFor the first number, which position would you like to change?\n");

        changeElements(firstArray);

        System.out.print("For the second number, which position would you like to change?\n");

        changeElements(firstArray);

        System.out.print("\nThe array with the new elements is:");
        printArray(firstArray);

        int[] secondArray = createSecondArray();

        sortArray(secondArray);

        System.out.print("\n\nThe 2nd array, sorted is:");
        printArray(secondArray);

        System.out.print("\n\nThe firstArray with the elements copied from the second array is:");
        copyArray(firstArray, secondArray);
        printArray(firstArray);

    }

    public static int getWholeNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number, one that does not have a decimal point: ");
        int number = input.nextInt();

        return number;
    }

    public static int[] createArray() {

        int[] firstArray = new int[SIZE];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = getWholeNumber();

        }
        return firstArray;
    }

    public static void printArray(int[] firstArray) {
        System.out.println();
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");

        }
    }

    public static void sortArray(int[] firstArray) {

        java.util.Arrays.sort(firstArray);

    }

    public static void changeElements(int[] firstArray) {

        int start = getWholeNumber();
        System.out.print("What number would you like to be? ");
        int value = getWholeNumber();
        firstArray[start] = value;

    }

    public static int[] createSecondArray() {
        int[] secondArray = new int[] { 30, 12, 17, 51, 18, 19, 20, 65, 30, 20 };
        return secondArray;
    }

    public static void copyArray(int[] firstArray, int[] secondArray) {
        firstArray[0] = secondArray[2];
        firstArray[1] = secondArray[3];
        firstArray[2] = secondArray[4];
    }

}
