import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            input[i] = sc.nextInt();
        }

        int maxVal = Integer.MIN_VALUE;
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (input[i] > maxVal) {
                maxVal = input[i];
                cnt++;
            } else if (input[i] == maxVal) {
                cnt = 0;
                continue;
            }
        }

        if (cnt == 0) {
            System.out.println(-1);
        } else {
            System.out.println(maxVal);
        }
    }
}