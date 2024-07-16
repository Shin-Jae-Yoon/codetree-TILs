import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        int[][] grid = new int[n][m];
        int r = 0;
        int c = 0;
        grid[r][c] = 1;

        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};
        int directionNumber = 0;
        
        for (int i = 2; i <= n * m; i++) {
            int nr = r + dr[directionNumber];
            int nc = c + dc[directionNumber];

            if (!inRange(nr, nc, n, m) || grid[nr][nc] != 0) {
                directionNumber = (directionNumber + 1) % 4;
            }

            r = r + dr[directionNumber];
            c = c + dc[directionNumber];
            grid[r][c] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(grid[i][j]).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    private static boolean inRange(int r, int c, int n, int m) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }
}