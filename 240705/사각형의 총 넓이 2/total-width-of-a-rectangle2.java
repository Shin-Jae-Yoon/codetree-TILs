import java.util.Scanner;

public class Main {
    public static final int MAX_R = 100;
    public static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] rectangle = new int[2 * MAX_R + 1][2 * MAX_R + 1];

        for (int i = 1; i <= n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    rectangle[j][k] = 1;
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < 2 * MAX_R + 1; i++) {
            for (int j = 0; j < 2 * MAX_R + 1; j++) {
                if (rectangle[i][j] == 1) {
                    sum++;
                }
            }
        }

        System.out.print(sum);
    }
}