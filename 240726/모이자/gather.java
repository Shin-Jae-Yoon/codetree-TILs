import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int[] candidate = new int[n];
        for (int i = 0; i < n; i++) {
            candidate[i] = Integer.parseInt(st2.nextToken());
        }

        int min = INT_MAX;

        for (int target = 1; target <= n; target++) {
            int sum = 0;

            for (int object = 1; object <= n; object++) {
                sum += (Math.abs(target - object)) * candidate[object - 1];
            }

            min = Math.min(min, sum);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min);
        System.out.print(sb.toString());
    }
}