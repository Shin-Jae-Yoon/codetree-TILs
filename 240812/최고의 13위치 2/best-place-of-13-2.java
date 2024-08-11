import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MAX_N = 20;

    private static int n;
    private static int[][] matrix = new int[MAX_N][MAX_N];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int firstMax = 0;
        int targetRow = 0;
        int targetCol = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - 2; col++) {
                if (firstMax <= matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]) {
                    firstMax = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2];
                    targetRow = row;
                    targetCol = col;
                }
            }
        }

        matrix[targetRow][targetCol] = -1;
        matrix[targetRow][targetCol + 1] = -1;
        matrix[targetRow][targetCol + 2] = -1;

        int secondMax = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - 2; col++) {
                if (matrix[row][col] == -1) {
                    continue;
                }

                if (secondMax <= matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]) {
                    secondMax = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2];
                }
            }
        }

        int max = firstMax + secondMax;

        StringBuilder sb = new StringBuilder();
        sb.append(max);
        System.out.print(sb.toString());
    }
}