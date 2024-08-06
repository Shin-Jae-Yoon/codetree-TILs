import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int OMOK_MAX = 19;
    private static final int DIR_NUM = 8;

    private static int[] dr = new int[]{1, 1, 1, -1, -1, -1, 0, 0};
    private static int[] dc = new int[]{-1, 0, 1, -1, 0, 1, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] omok = new int[OMOK_MAX + 1][OMOK_MAX + 1];

        for (int i = 1; i <= OMOK_MAX; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= OMOK_MAX; j++) {
                omok[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int row = 1; row <= OMOK_MAX; row++) {
            for (int col = 1; col <= OMOK_MAX; col++) {
                if (omok[row][col] == 0) {
                    continue;
                }

                for (int direction = 0; direction < DIR_NUM; direction++) {
                    int count = 1;
                    int currentRow = row;
                    int currentCol = col;

                    while (true) {
                        int nextRow = currentRow + dr[direction];
                        int nextCol = currentCol + dc[direction];

                        if (inRange(nextRow, nextCol) == false) {
                            break;
                        }

                        if (omok[nextRow][nextCol] != omok[row][col]) {
                            break;
                        }

                        count++;
                        currentRow = nextRow;
                        currentCol = nextCol;
                    }

                    if (count == 5) {
                        sb.append(omok[row][col]);
                        sb.append("\n");
                        sb.append(row + 2 * dr[direction]);
                        sb.append(" ");
                        sb.append(col + 2 * dc[direction]);

                        System.out.print(sb.toString());
                        System.exit(0);
                    }
                }
            }
        }

        sb.append(0);
        System.out.print(sb.toString());
    }

    private static boolean inRange(int r, int c) {
        return 1 <= r && r <= OMOK_MAX && 1 <= c && c <= OMOK_MAX;
    }
}