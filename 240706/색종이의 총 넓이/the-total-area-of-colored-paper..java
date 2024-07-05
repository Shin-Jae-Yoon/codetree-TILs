import java.util.Scanner;

public class Main {
    public static final int MAX_R = 100;
    public static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] plane = new int[2 * MAX_R + 1][2 * MAX_R + 1];

        for (int i = 1; i <= n; i++) {
            int inputX = sc.nextInt() + OFFSET;
            int inputY = sc.nextInt() + OFFSET;

            for (int x = inputX; x < inputX + 8; x++) {
                for (int y = inputY; y < inputY + 8; y++) {
                    plane[x][y] = 1;
                }
            }
        }

        int area = 0;

        for (int x = 0; x < 2 * MAX_R + 1; x++) {
            for (int y = 0; y < 2 * MAX_R + 1; y++) {
                if (plane[x][y] == 1) {
                    area++;
                }
            }
        }

        System.out.print(area);
    }
}