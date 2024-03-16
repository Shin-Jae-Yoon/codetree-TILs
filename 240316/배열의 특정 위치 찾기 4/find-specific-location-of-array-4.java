import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10 + 1];
        int evenSum = 0;
        int evenCount = 0;

        for (int i = 1; i <= 10; i++) {
            input[i] = sc.nextInt();

            if (input[i] == 0) {
                break;
            }

            if (input[i] % 2 == 0) {
                evenSum += input[i];
                evenCount++;
            }
        }

        System.out.printf("%d %d", evenCount, evenSum);
    }
}