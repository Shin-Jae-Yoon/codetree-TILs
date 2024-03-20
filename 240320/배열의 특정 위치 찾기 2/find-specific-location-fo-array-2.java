import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[11];
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= 10; i++) {
            input[i] = sc.nextInt();

            if (i % 2 == 0) {
                evenSum += input[i];
            } else {
                oddSum += input[i];
            }
        }

        int result = evenSum - oddSum;

        if (result <= 0) {
            result *= (-1);
        }

        System.out.print(result);
    }
}