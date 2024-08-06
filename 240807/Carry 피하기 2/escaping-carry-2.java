import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        
        int max = -1;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    boolean carry = false;

                    if (nums[i] % 10 + nums[j] % 10 + nums[k] % 10 >= 10) {
                        carry = true;
                    }

                    if (nums[i] % 100 / 10 + nums[j] % 100 / 10 + nums[k] % 100 / 10 >= 10) {
                        carry = true;
                    }

                    if (nums[i] % 1000 / 100 + nums[j] % 1000 / 100 + nums[k] % 1000 / 100 >= 10) {
                        carry = true;
                    }

                    if (nums[i] % 10000 / 1000 + nums[j] % 10000 / 1000 + nums[k] % 10000 / 1000 >= 10) {
                        carry = true;
                    }

                    if (carry == false) {
                        max = Math.max(max, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max);
        System.out.print(sb.toString());
    }
}