import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int INT_MIN = Integer.MIN_VALUE;
        int maxVal = INT_MIN;

        Scanner sc = new Scanner(System.in);
        int[] input = new int[11];

        for (int i = 1; i <= 10; i++) {
            input[i] = sc.nextInt();

            if (input[i] >= maxVal) {
                maxVal = input[i];
            }
        }

        System.out.print(maxVal);
    }
}