import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];

        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.print(Math.max(evenSum, oddSum) - Math.min(evenSum, oddSum));
    }
}