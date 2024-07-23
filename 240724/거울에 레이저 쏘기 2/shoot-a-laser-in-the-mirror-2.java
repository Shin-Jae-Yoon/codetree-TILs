import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MAX_N = 1000;

    private static int n;
    private static int x, y, directionNum;
    private static char[][] matrix = new char[MAX_N + 1][MAX_N + 1];

    // 1번부터 0
    private static int[] dx = new int[]{1, 0, -1, 0};
    private static int[] dy = new int[]{0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String line = st.nextToken();

            for (int j = 1; j <= n; j++) {
                matrix[i][j] = line.charAt(j - 1);
            }
        }

        int k = Integer.parseInt(br.readLine());

        initDirection(k);

        int result = reflection();

        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.print(sb.toString());
    }

    private static void initDirection(int k) {
        if (k <= 4 * n) {
            x = n - (k - 3 * n);
            y = 1;
            directionNum = 3;
        }

        if (k <= 3 * n) {
            x = n;
            y = n - (k - 2 * n);
            directionNum = 2;
        }

        if (k <= 2 * n) {
            x = k - n;
            y = n;
            directionNum = 1;
        }

        if (k <= n) {
            x = 1;
            y = k;
            directionNum = 0;
        }
    }

    private static int reflection() {
        int moveNum = 0;

        while (inRange(x, y)) {
            if (matrix[x][y] == '/') {
                move(directionNum ^ 1);
            } 
            
            if (matrix[x][y] == '\\') {
                move(3 - directionNum);
            }

            moveNum++;
        }

        return moveNum;
    }

    private static void move(int nextDirection) {
        x += dx[nextDirection];
        y += dy[nextDirection];
        directionNum = nextDirection;
    }

    private static boolean inRange(int x, int y) {
        return 1 <= x && x <= n && 1 <= y && y <= n;
    }
}