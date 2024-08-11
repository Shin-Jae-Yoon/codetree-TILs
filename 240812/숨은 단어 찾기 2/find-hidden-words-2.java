import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MAX_N = 50;
    private static final int MAX_M = 50;
    private static final int DIR_NUM = 8;

    private static int n, m;
    private static char[][] letters = new char[MAX_N][MAX_M];
    private static int[] dr = new int[]{1, 1, 1, -1, -1, -1, 0, 0};
    private static int[] dc = new int[]{-1, 0, 1, -1, 0, 1, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            for (int j = 0; j < m; j++) {
                letters[i][j] = input.charAt(j);
            }
        }

        int count = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (letters[row][col] != 'L') {
                    continue;
                }
                
                for (int direction = 0; direction < DIR_NUM; direction++) {
                    int current = 1;
                    int currentRow = row;
                    int currentCol = col;
                    
                    while (true) {
                        int nextRow = currentRow + dr[direction];
                        int nextCol = currentCol + dc[direction];

                        if (inRange(nextRow, nextCol) == false) {
                            break;
                        }

                        if (letters[nextRow][nextCol] != 'E') {
                            break;
                        }

                        current++;
                        currentRow = nextRow;
                        currentCol = nextCol;
                    }

                    if (current >= 3) {
                        count++;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count);
        System.out.print(sb.toString());
    }

    private static boolean inRange(int row, int col) {
        return 0 <= row && row < n && 0 <= col && col < m;
    }
}