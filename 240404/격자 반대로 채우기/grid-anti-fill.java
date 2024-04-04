import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] result = new int[n][n];
        int cnt = 1;

        for (int col = n - 1; col >= 0; col--) {
            if ((n - 1 - col) % 2 == 0) {
                for (int row = n - 1; row >= 0; row--) {
                    result[row][col] = cnt;
                    cnt++;
                }
            } else {
                for (int row = 0; row < n; row++) {
                    result[row][col] = cnt;
                    cnt++;
                }
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(result[row][col] + " ");
            }

            System.out.println();
        }
    }
}