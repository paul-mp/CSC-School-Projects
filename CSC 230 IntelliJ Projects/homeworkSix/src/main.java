import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Pavel Maslov, Vaibhav Satheesh, Sarvesh Sridher\n"
                + "Homework 6\n");

        System.out.println("This program will play a lottery with the user.\n");

        Scanner scanner = new Scanner(System.in);

        char playAgain;

        do {

            //CHECK FOR ZEROES
            System.out.print("Enter your lottery pick (three digits, zeros are fine, as are duplicates): ");

            ArrayList<Integer> guessNumber = getGuess();
            ArrayList<Integer> generatedNumber = generateNumber();


            if (guessNumber == null) {
                System.out.println("Your entry is out of bounds. Please restart if you want to continue playing.");
                return;
            }

            System.out.print("The lottery number is ");
            for (int i = 0; i < generatedNumber.size(); i++) {
                System.out.print(generatedNumber.get(i));
            }

            System.out.println();

            checkNumbers(guessNumber, generatedNumber);

            System.out.print("\nWould you like to play again? ");
            playAgain = scanner.next().charAt(0);



        } while (Character.toUpperCase(playAgain) != 'N');

    }

    public static ArrayList<Integer> generateNumber() {

        int number1 = 1 + (int)(Math.random() * 9);
        int number2 =  (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(number1);
        arrayList.add(number2);
        arrayList.add(number3);

        return arrayList;

    }

    public static ArrayList<Integer> getGuess() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        ArrayList<Integer> guessList = new ArrayList<>();

        choice = String.valueOf(scanner.nextInt());

        if (choice.length() != 3) {
            return null;
        }

        int var1 = choice.charAt(0) - '0';
        int var2 = choice.charAt(1) - '0';
        int var3 = choice.charAt(2) - '0';

        guessList.add(var1);
        guessList.add(var2);
        guessList.add(var3);

        return guessList;

    }

    public static void checkNumbers(ArrayList<Integer> guessList, ArrayList<Integer> lotteryList) {
        int perfectCounter = 0;
        int counter = 0;


        for (int i = guessList.size() - 1; i >= 0; i--) {
            if (guessList.get(i).equals(lotteryList.get(i))) {
                perfectCounter++;
                guessList.remove(i);
                lotteryList.remove(i);
            }
        }

        Collections.sort(guessList);
        Collections.sort(lotteryList);

        for (int i = guessList.size() - 1; i >= 0; i--) {
            if (guessList.get(i).equals(lotteryList.get(i))) {
                counter++;
                guessList.remove(i);
                lotteryList.remove(i);
            }
        }

        if (perfectCounter == 3) {
            System.out.println("Exact match: You win $10,000!");
            collectWinners();
        } else if (counter + perfectCounter == 3) {
            System.out.println("You matched all of the numbers: You win $3,000!");
        } else if (counter + perfectCounter == 2) {
            System.out.println("You matched two of the numbers: You win $2,000!");
        } else if (counter + perfectCounter == 1) {
            System.out.println("You matched one of the numbers: You win $1,000!");
        } else if (counter + perfectCounter == 0) {
            System.out.println("Sorry, you did not match the numbers: Try again.");
        }

    }

    public static void collectWinners() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first name and last name, separated by a space: ");
        String name = scanner.nextLine();

        try {
            File file = new File("Winners.txt");
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintWriter pw = new PrintWriter(fos);

            pw.print(name);
            pw.println();

            pw.close();
            fos.close();
        } catch (IOException ioException) {
            System.out.println("IOException found");
        }
    }

}

