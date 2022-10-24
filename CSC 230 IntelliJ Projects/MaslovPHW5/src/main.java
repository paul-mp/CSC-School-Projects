/*

My words and actions will reflect Academic Integrity.
I will not cheat or lie or steal in academic matters.
I will promote integrity in the UNCG community.

Student’s Signature Pavel Maslov Date 03/26/22

 */

import java.io.*;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        System.out.println("MaslovPHW5" + "\nPavel Maslov" + "\nCSC 230, Sec #2");

        System.out.println("\nThis program consists of three classes, a main class, the GeometricObject class, and a Triangle\n"
                + "class."
                + "\nThe Triangle class extends from the GeometricObject class."
                + "\nThe user will be asked to enter the 3 sides and the color of the triangle."
                + "\nThe user will also be asked to enter if the triangle is filled or not by entering a true if it is filled\n"
                + "\tand a false if it not filled"
                + "\nThe results will be printed to the screen and to a file called triangleOut.out. When the program is\n"
                + "run again, the new data will be appended to the old data in the file.\n");

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter the 1st of three sides: ");
            double firstSide = input.nextInt();

            System.out.print("Enter the 2nd of three sides: ");
            double secondSide = input.nextInt();

            System.out.print("Enter the 3rd of three sides: ");
            double thirdSide = input.nextInt();

            Triangle Triangle = new Triangle(firstSide, secondSide, thirdSide);

            System.out.print("Enter the color: ");
            Triangle.setColor(input.next());

            System.out.print("Enter a Boolean value for filled (true or false): ");
            Triangle.setFilled(input.nextBoolean());

            String isFilledResult;

            if (Triangle.isFilled()) {
                isFilledResult = "is filled";
            } else {
                isFilledResult = "is not filled";
            }

            System.out.println("\nThe color is " + Triangle.getColor());
            System.out.println("The triangle " + isFilledResult);
            System.out.printf("The area is %.3f\n", Triangle.getArea());
            System.out.printf("The perimeter is %.3f\n", Triangle.getPerimeter());
            System.out.println("Triangle: side1 = " + Triangle.getFirstSide() + " side2 = " + Triangle.getSecondSide() + " side3 = " + Triangle.getThirdSide());

            FileOutputStream fos = new FileOutputStream("triangleOut.out", true);
            PrintWriter pw = new PrintWriter(fos);

            pw.println("The color is " + Triangle.getColor());
            pw.println("The triangle " + isFilledResult);
            pw.printf("The area is %.3f\n", Triangle.getArea());
            pw.printf("The perimeter is %.3f\n", Triangle.getPerimeter());
            pw.println("Triangle: side1 = " + Triangle.getFirstSide() + " side2 = " + Triangle.getSecondSide() + " side3 = " + Triangle.getThirdSide());

            pw.println();

            pw.close();
            fos.close();

        } catch (IOException ioException) {
            System.out.println("IOException Has Occurred!");
        }


    }
}
