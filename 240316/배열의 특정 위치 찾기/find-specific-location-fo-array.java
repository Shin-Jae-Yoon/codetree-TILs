import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10 + 1];

        int secondSum = 0;
        int thirdSum = 0;
        int thirdCount = 0;

        for (int i = 1; i <= 10; i++) {
            input[i] = sc.nextInt();

            if (i % 2 == 0) {
                secondSum += input[i];
            }

            if (i % 3 == 0) {
                thirdSum += input[i];
                thirdCount++;
            }
        }

        double thirdAvg = (double)thirdSum / thirdCount;

        System.out.printf("%d %.1f", secondSum, thirdAvg);
    }
}