import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MAX_VAL = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int s = Integer.parseInt(st1.nextToken());
        int[] numbers = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st2.nextToken());
            sum += numbers[i];
        }

        int min = MAX_VAL;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = sum - (numbers[i] + numbers[j]);
                min = Math.min(min, Math.abs(s - temp));
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min);
        System.out.print(sb.toString());
    }
}