import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_VAL = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n + 1];
        int minVal = MAX_VAL;

        for (int i = 1; i <= n; i++) {
            input[i] = sc.nextInt();

            if (input[i] <= minVal) {
                minVal = input[i];
            }
        }

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (input[i] == minVal) {
                cnt++;
            }
        }

        System.out.print(minVal + " " + cnt);
    }
}