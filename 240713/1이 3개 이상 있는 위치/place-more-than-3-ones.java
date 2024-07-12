import java.util.Scanner;

public class Main {
    private static final int DIR_NUM = 4;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                grid[row][col] = sc.nextInt();
            }
        }

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int count = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int tempCount = 0;

                for (int dirNum = 0; dirNum < DIR_NUM; dirNum++) {
                    int nx = row + dx[dirNum];
                    int ny = col + dy[dirNum];

                    if (inRange(nx, ny, n) && grid[nx][ny] == 1) {
                        tempCount++;
                    }
                }

                if (tempCount >= 3) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }

    private static boolean inRange(int row, int col, int n) {
        return (0 <= row && row < n && 0 <= col && col < n);
    }
}