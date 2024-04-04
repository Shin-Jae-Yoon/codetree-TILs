import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] input = new int[n][m];
        int init = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                input[i][j] = init;
                init++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(input[i][j] + " ");
            }

            System.out.println();
        }
    }
}