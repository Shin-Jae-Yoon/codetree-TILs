import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int ASCII_NUM = 128;
    
    // 동 서 남 북
    private static int x, y, n;
    private static int[] dx = new int[]{1, -1, 0, 0};
    private static int[] dy = new int[]{0, 0, -1, 1};

    private static int answer = - 1;
    private static int elapsedTime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int[] mapper = new int[ASCII_NUM];
        mapper['E'] = 0;
        mapper['W'] = 1;
        mapper['S'] = 2;
        mapper['N'] = 3;

        int x = 0, y = 0;
        
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char direction = st.nextToken().charAt(0);
            int distance = Integer.parseInt(st.nextToken());
            int directionNumber = mapper[direction];

            boolean done = move(directionNumber, distance);

            if (done) {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        System.out.print(sb.toString());
    }

    private static boolean move(int directionNumber, int distance) {
        while (distance-- > 0) {
            x += dx[directionNumber];
            y += dy[directionNumber];

            elapsedTime++;

            if (x == 0 && y == 0) {
                answer = elapsedTime;
                return true;
            }
        }

        return false;
    }
}