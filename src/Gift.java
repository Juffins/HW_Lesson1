import java.util.Scanner;

public class Gift {

    public static void GetCountOfGiftsCombination() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight of gift: ");
        int weightOfGift = scanner.nextInt();
        System.out.println("Enter the weight of apple: ");
        int weightOfApple = scanner.nextInt();
        System.out.println("Enter the weight of orange: ");
        int weightOfOrange= scanner.nextInt();
        System.out.println("Enter the weight of pear: ");
        int weightOfPear= scanner.nextInt();
        int numberOfPearsInCurrentGift;

        if(weightOfGift <= 0 || weightOfApple <= 0 || weightOfOrange <= 0 || weightOfPear <= 0){
            System.out.println("Please, enter positive value of weights.");
            return;
        }

        int maxNumberOfApple = weightOfGift / weightOfApple;
        int maxNumberOfOrange = weightOfGift / weightOfOrange;

        int weightOfAppleInCurrentGift;
        int weightOfOrangeInCurrentGift;
        int weightOfPearInCurrentGift;

        int counter = 0;
        for(int i = 0; i <= maxNumberOfApple * weightOfApple; i += weightOfApple){
            for(int j = 0; j <= maxNumberOfOrange * weightOfOrange; j += weightOfOrange){

                weightOfAppleInCurrentGift = i;
                weightOfOrangeInCurrentGift = j;
                weightOfPearInCurrentGift = weightOfGift - weightOfAppleInCurrentGift - weightOfOrangeInCurrentGift;
                numberOfPearsInCurrentGift = weightOfPearInCurrentGift / weightOfPear;
                if(numberOfPearsInCurrentGift >= 0 && weightOfPearInCurrentGift % weightOfPear == 0){
                    if(weightOfAppleInCurrentGift + weightOfOrangeInCurrentGift + weightOfPearInCurrentGift == weightOfGift) {
                        counter++;
                    }
                }

            }
        }
        System.out.println("The number of possible combinations of a gift with a weight of "
                + weightOfGift + " is " + counter + ".");
    }
}
