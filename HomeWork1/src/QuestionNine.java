import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] arge) {
        int positiveNumber = positiveNumber();
        checkForPrimeNumber(positiveNumber);
        for (int i = 2; i < positiveNumber; i++) {
            boolean isPrime = checkForPrimeNumber(i);

            if (isPrime == true) {

                System.out.print(i + " ");
            }
        }
    }

    public static boolean remainingDivision(int num1, int num2) {
        boolean dividedWithResidue;

        if (num1 % num2 != 0) {
            dividedWithResidue = false;
        } else {
            dividedWithResidue = true;
        }
        return dividedWithResidue;

    }

    public static boolean checkForPrimeNumber(int numberForCheck) {

        boolean isPrime = true;

        if (numberForCheck==1){
            isPrime = false;
        }

        for (int i = 2; i < numberForCheck; i++) {
            if (remainingDivision(numberForCheck, i) == true) {
                isPrime = false;
            }

        }

        return isPrime;
    }


    public static int positiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a positive number : ");
            number = scanner.nextInt();
        }
        while (number < 0);

        return number;
    }

}





