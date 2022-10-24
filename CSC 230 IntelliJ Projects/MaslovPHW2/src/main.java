import java.util.Scanner;

/*
My words and actions will reflect Academic Integrity.
I will not cheat or lie or steal in academic matters.
I will promote integrity in the UNCG community.

Student’s Signature Pavel Maslov Date 02/14/22
 */

public class main {

    private static int countUppercase(String string) {

        if (string.length() < 1) {
            return 0;
        } else {
            return countUppercase(string.substring(1)) + (Character.isUpperCase(string.charAt(0)) ? 1 : 0);
        }
    }


    public static int count(char [] chars) {
        return count(chars, chars.length-1);
    }


    public static int count(char [] chars, int high){


        if (high == 0) {
            if (Character.isUpperCase(chars[high])) {
                return 1;
            } else {
                return 0;
            }
        } else if (high < 0) {
            return 0;
        } else {

            if (Character.isUpperCase(chars[high])) {
                return count(chars, high-1) +1;
            } else {
                return count(chars,high-1);
            }
        }
    }



    public static void main(String[] args) {

        System.out.print("MaslovPHW2\n" + "Pavel Maslov\n" + "CSC 230, Sec #02\n\n");

        System.out.println("This program creates a recursive method called countUppercase() to return"
                + "\n the number of uppercase letters in a string"
                + "\nA second method uses a recursive method and a helper method."
                + "\nThe method is called count() and it returns the number of uppercase letters in an array of"
                + "\n characters.");

        Scanner input = new Scanner(System.in);

        System.out.println("\nThis is the run from calling countUppercase()");
        System.out.print("Enter a string: ");
        String userInputOne = input.nextLine();
        System.out.println("The uppercase letters in " + userInputOne + " is " + countUppercase(userInputOne));

        System.out.println("\nThis is the run from calling count()");
        System.out.print("Enter a string: ");
        String userInputTwo = input.nextLine();
        int conversion = count(userInputTwo.toCharArray());
        System.out.println("The number of uppercase letters is " + conversion);

    }
}



