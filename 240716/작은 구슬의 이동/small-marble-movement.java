import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int ASCII_NUM = 128;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st1.nextToken());
        int t = Integer.parseInt(st1.nextToken());

        int r = Integer.parseInt(st2.nextToken());
        int c = Integer.parseInt(st2.nextToken());
        char d = st2.nextToken().charAt(0);

        int[] dr = new int[]{0, 1, -1, 0};
        int[] dc = new int[]{1, 0, 0, -1};

        int[] mapper = new int[ASCII_NUM];
        mapper['R'] = 0;
        mapper['D'] = 1;
        mapper['U'] = 2;
        mapper['L'] = 3;

        int direction = mapper[d];

        for (int i = t; i > 0; i--) {
            int nr = r + dr[direction];
            int nc = c + dc[direction];

            if (inRange(nr, nc, n)) {
                r = nr;
                c = nc;
            } else {
                direction = 3 - direction;
            }
        }

        br.close();
        sb.append(r).append(" ").append(c);
        System.out.print(sb.toString());
    }

    private static boolean inRange(int r, int c, int n) {
        return 1 <= r && r <= n && 1 <= c && c <= n;
    }
}