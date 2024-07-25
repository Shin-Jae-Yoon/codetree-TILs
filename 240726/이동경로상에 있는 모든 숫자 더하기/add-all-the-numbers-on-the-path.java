import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MAX_N = 100;
    private static final int DIR_NUM = 4;

    private static int n, t, sum;
    private static int currentRow, currentCol;
    private static int[][] matrix = new int[MAX_N][MAX_N];

    // 동 남 서 북
    private static int[] dr = new int[]{0, 1, 0, -1};
    private static int[] dc = new int[]{1, 0, -1, 0};
    private static int directionNum = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken());
        t = Integer.parseInt(st1.nextToken());

        String input = br.readLine();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        currentRow = n / 2;
        currentCol = n / 2;
        sum = matrix[currentRow][currentCol];

        for (int i = 0; i < t; i++) {
            char command = input.charAt(i);

            switch (command) {
                case 'R':
                    turnRight();
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'F':
                    goStraight();
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.print(sb.toString());
    }

    private static void turnRight() {
        directionNum = (directionNum + 1) % DIR_NUM;
    }

    private static void turnLeft() {
        directionNum = (directionNum - 1 + DIR_NUM) % DIR_NUM;
    }

    private static void goStraight() {
        int nextRow = currentRow + dr[directionNum];
        int nextCol = currentCol + dc[directionNum];

        if (inRange(nextRow, nextCol)) {
            currentRow = nextRow;
            currentCol = nextCol;
            sum += matrix[currentRow][currentCol];
        }
    }

    private static boolean inRange(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < n;
    }
}