import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MAX_LOCATION = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());
        int[] x = new int[MAX_LOCATION + 1];

        int maxValue = 0;
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int location = Integer.parseInt(st2.nextToken());
            char alphabet = st2.nextToken().charAt(0);

            if (alphabet == 'G') {
                x[location] = 1;
            } else {
                x[location] = 2;
            }

            maxValue = Math.max(maxValue, location);
        }

        int maxScore = 0;

        for (int i = 1; i <= MAX_LOCATION - k; i++) {
            int sumScore = 0;

            for (int j = i; j <= i + k; j++) {
                sumScore += x[j];
            }

            maxScore = Math.max(maxScore, sumScore);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(maxScore);
        System.out.print(sb.toString());
    }
}