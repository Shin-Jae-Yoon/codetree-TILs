import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int DIR_NUM = 4;

    private static int n;

    private static int currentRow, currentCol;
    private static int directionNum, moveCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        currentRow = n / 2;
        currentCol = n / 2;
        directionNum = 0;
        moveCount = 1;
        
        int currentNum = 1;

        int[][] matrix = new int[n][n];

        while(!end()) {
            for (int i = 0; i < moveCount; i++) {
                matrix[currentRow][currentCol] = currentNum++;
                move();

                if (end()) {
                    break;
                }
            }

            directionNum = (directionNum + 1) % DIR_NUM;

            if (directionNum == 0 || directionNum == 2) {
                moveCount++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(matrix[i][j]);
                sb.append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    private static void move() {
        int[] dr = new int[]{0, -1, 0, 1};
        int[] dc = new int[]{1, 0, -1, 0};

        currentRow = currentRow + dr[directionNum];
        currentCol = currentCol + dc[directionNum];
    }

    private static boolean end() {
        return !inRange(currentRow, currentCol);
    }

    private static boolean inRange(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < n;
    }
}