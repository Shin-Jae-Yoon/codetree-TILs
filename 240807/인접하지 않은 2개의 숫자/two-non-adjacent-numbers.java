import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MIN_VAL = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = MIN_VAL;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 2; j < n; j++) {
                max = Math.max(max, nums[i] + nums[j]);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max);
        System.out.print(sb.toString());
    }
}