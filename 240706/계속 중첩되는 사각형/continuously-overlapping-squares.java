import java.util.Scanner;

public class Main {
    public static final int MAX_R = 100;
    public static final int OFFSET = 100;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] plane = new int[2 * MAX_R + 1][2 * MAX_R + 1];
        
        for (int i = 1; i <= n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    // 빨간색 1
                    if (i % 2 == 1) {
                        plane[x][y] = 1;
                    }

                    // 파란색 2
                    if (i % 2 == 0) {
                        plane[x][y] = 2;
                    }
                }
            }
        }

        int area = 0;

        for (int x = 0; x < 2 * MAX_R + 1; x++) {
            for (int y = 0; y < 2 * MAX_R + 1; y++) {
                if (plane[x][y] == 2) {
                    area++;
                }
            }
        }

        System.out.print(area);
    }
}