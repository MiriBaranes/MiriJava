import java.util.Random;
import java.util.Scanner;

public class QuestionTen {

    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess = 0;
        int counter1 = 1;
        int counter2 = 1;
        int turn = 0;

        boolean isFinished = false;

        while (isFinished == false) {

            if (turn == 0 ) {

                System.out.println("Player one make your guess: ");
                guess = scanner.nextInt();
                counter1++;

                isFinished = check(number, guess);

                if (isFinished == true) {
                    System.out.println("Player 1 won in " + counter1 + " turns");
                }
                turn = 1;
            }

            else {

                System.out.println("Player two make your guess: ");
                guess = scanner.nextInt();
                counter2++;
                isFinished = check(number, guess);

                if (isFinished == true) {
                    System.out.println("Player 2 won in " + counter2 + " turns");
                }
                turn = 0;

            }

            /*
            if (number < playerOne) {
                System.out.println("The number you selected is greater than the number drawn");
                counter1++;

            } else if (number > playerOne) {
                System.out.println("The number you selected is less than the number drawn");
                counter1++;

            } else {
                System.out.println("One player won.The number of guesses is " + counter1);
                isFinished = true;
            }
/*
            System.out.println("Player two tap your guess: ");
            playerTowGuess = scanner.nextInt();

            if (number < playerTow) {
                System.out.println("The number you selected is greater than the number drawn");
                counter2++;
            } else if (number > playerTow) {
                System.out.println("The number you selected is less than the number drawn");
                counter2++;
            } else {
                System.out.println("Player two won,The number of guesses is : " + counter2);
                isFinished = true;
            }

             */
/// lwt me fix it one moment...
        }


    }


    public static boolean check(int number, int playerGuess) {

        if (number < playerGuess) {
            System.out.println("The number you selected is greater than the number drawn");
            //counter1++;


        } else if (number > playerGuess) {
            System.out.println("The number you selected is less than the number drawn");
            //counter1++;

        } else {
           // System.out.println();
            return true;
        }
        return false;
    }
}
