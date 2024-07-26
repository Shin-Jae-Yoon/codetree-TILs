import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MIN_VAL = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxCount = MIN_VAL;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 2; j++) {
                maxCount = Math.max(maxCount, matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(maxCount);
        System.out.print(sb.toString());
    }
}