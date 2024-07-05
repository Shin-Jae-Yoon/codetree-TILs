import java.util.Scanner;

public class Main {
    public static final int N = 3;
    public static final int MAX_R = 1000;
    public static final int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x1 = new int[N];
        int[] y1 = new int[N];
        int[] x2 = new int[N];
        int[] y2 = new int[N];

        int[][] checked = new int[2 * MAX_R + 1][2 * MAX_R + 1];

        for (int i = 0; i < N; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }

        for (int i = 0; i < N; i++) {
            for (int x = x1[i]; x < x2[i]; x++) {
                for (int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y] = i + 1;
                }
            }
        }

        int area = 0;

        for (int x = 0; x < 2 * MAX_R + 1; x++) {
            for (int y = 0; y < 2 * MAX_R + 1; y++) {
                if (checked[x][y] == 1 || checked[x][y] == 2) {
                    area++;
                }
            }
        }

        System.out.print(area);
    }
}