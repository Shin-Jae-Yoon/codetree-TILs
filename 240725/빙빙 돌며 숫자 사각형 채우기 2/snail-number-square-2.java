import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static int[] dr = new int[]{1, 0, -1, 0};
    private static int[] dc = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[n][m];

        int directionNum = 0;
        int r = 0;
        int c = 0;
        matrix[r][c] = 1;

        for (int num = 2; num <= n * m; num++) {
            int nr = r + dr[directionNum];
            int nc = c + dc[directionNum];

            if (!inRange(nr, nc, n, m) || matrix[nr][nc] != 0) {
                directionNum = (directionNum + 1) % 4;
            }

            r = r + dr[directionNum];
            c = c + dc[directionNum];
            matrix[r][c] = num;
        }

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(matrix[i][j]);
                sb.append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    private static boolean inRange(int r, int c, int n, int m) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }
}