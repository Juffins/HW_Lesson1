import java.util.Scanner;

public class LuckyNumber {

    public static void CheckNumber() {
        System.out.print("Enter six-digit number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int requiredLength = 6;
        int minSixDigitNumber = 100000;
        int maxSixDigitNumber = 999999;

        if (number < minSixDigitNumber || number > maxSixDigitNumber){
            System.out.println("Please, enter a positive six-digit number!");
            return;
        }

        int[] digits = new int[requiredLength];

        for(int i = 5; i >= 0; i--){
            digits[i] = number % 10;
            number /= 10;
        }

        int SumFirstThree = digits[0] + digits[1] + digits[2];
        int SumSecondThree = digits[3] + digits[4] + digits[5];

        if(SumFirstThree == SumSecondThree) {
            System.out.println("Congratulations! It's a lucky number!!!");
        }
        else {
            System.out.println("Better luck next time!");
        }
    }
}
