import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_VAL = Integer.MAX_VALUE;
        final int MIN_VAL = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        int[] input = new int[100];
        int maxVal = MIN_VAL;
        int minVal = MAX_VAL;
        int idx = 0;

        while (true) {
            input[idx] = sc.nextInt();

            if (input[idx] == 999 || input[idx] == -999) {
                break;
            }

            if (maxVal <= input[idx]) {
                maxVal = input[idx];
            }

            if (minVal >= input[idx]) {
                minVal = input[idx];
            }

            idx++;
        }

        System.out.print(maxVal + " " + minVal);
    }
}