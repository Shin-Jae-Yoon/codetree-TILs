import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MAX_VAL = Integer.MAX_VALUE;
    private static final int MAX_N = 100;
    private static final int OFFSET = 1000;

    private static int n;
    private static int[] checkpointX = new int[MAX_N + 1];
    private static int[] checkpointY = new int[MAX_N + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            checkpointX[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            checkpointY[i] = Integer.parseInt(st.nextToken()) + OFFSET;
        }

        int min = MAX_VAL;

        for (int candidate = 2; candidate <= n - 1; candidate++) {
            int distance = 0;
            int prevIndex = 1;

            for (int index = 2; index <= n; index++) {
                if (index == candidate) {
                    continue;
                }

                int distanceX = Math.abs(checkpointX[prevIndex] - checkpointX[index]);
                int distanceY = Math.abs(checkpointY[prevIndex] - checkpointY[index]);
                distance += distanceX + distanceY;
                prevIndex = index;
            }

            min = Math.min(min, distance);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min);
        System.out.println(sb.toString());
    }
}