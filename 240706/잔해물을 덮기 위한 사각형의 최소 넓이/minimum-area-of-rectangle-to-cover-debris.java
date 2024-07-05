import java.util.Scanner;

public class Main {
    public static final int N = 2;
    public static final int MAX_R = 1000;
    public static final int OFFSET = 1000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] plane = new int[2 * MAX_R + 1][2 * MAX_R + 1];

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    plane[x][y] = i + 1;
                }
            }
        }

        int xMax = 0;
        int yMax = 0;
        int xMin = 2 * MAX_R + 1;
        int yMin = 2 * MAX_R + 1;

        for (int x = 0; x < 2 * MAX_R + 1; x++) {
            for (int y = 0; y < 2 * MAX_R + 1; y++) {
                if (plane[x][y] == 1) {
                    if (xMax <= x) {
                        xMax = x;
                    }

                    if (yMax <= y) {
                        yMax = y;
                    }

                    if (xMin >= x) {
                        xMin = x;
                    }

                    if (yMin >= y) {
                        yMin = y;
                    }
                }
            }
        }

        int width = (xMax + 1) - xMin;
        int height = (yMax + 1) - yMin;

        System.out.print(width * height);
    }
}