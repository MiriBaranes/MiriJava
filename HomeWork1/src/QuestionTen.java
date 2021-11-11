import java.util.Random;
import java.util.Scanner;

public class QuestionTen {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(1000) + 1;
        int playerOne = 0;
        int playerTow = 0;
        int counter1 = 1;
        int counter2 = 1;
        boolean isFinished = false;


        while (isFinished == false) {
            System.out.println("Player one made your guess: ");
            playerOne = scanner.nextInt();
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

            System.out.println("Player two tap your guess: ");
            playerTow = scanner.nextInt();
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

        }


    }
}

