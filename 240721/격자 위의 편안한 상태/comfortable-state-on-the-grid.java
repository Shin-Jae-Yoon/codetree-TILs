import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MAX_N = 100;
    private static final int DIRECTION_NUM = 4;
    private static int n, m;
    private static int[][] matrix = new int[MAX_N + 1][MAX_N + 1];
    private static int[] dr = new int[]{-1, 0, 1, 0};
    private static int[] dc = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st2.nextToken());
            int c = Integer.parseInt(st2.nextToken());

            matrix[r][c] = 1;

            int result = comfortableState(r, c);
            sb.append(result);
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    private static int comfortableState(int r, int c) {
        int count = 0;

        for (int directionNumber = 0; directionNumber < DIRECTION_NUM; directionNumber++) {
            int nr = r + dr[directionNumber];
            int nc = c + dc[directionNumber];

            if (inRange(nr, nc) && matrix[nr][nc] == 1) {
                count++;
            }
        }

        if (count == 3) {
            return 1;
        }

        return 0;
    }

    private static boolean inRange(int r, int c) {
        return 1 <= r && r <= n && 1 <= c && c <= n;
    }
}