import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static final int MAX_N = 100000;

    public static int n, k;
    public static long[] nums = new long[MAX_N];
    public static HashMap<Long, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st1.nextToken());
        k = Integer.parseInt(st1.nextToken());

        for (int i = 0; i < n; i++) {
            nums[i] = Long.parseLong(st2.nextToken());

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        int count = 0;

        for (int i = 0; i < n; i++) {
            long candidate = k - nums[i];

            if (map.containsKey(candidate)) {
                count += map.get(candidate);

                if (nums[i] == candidate) {
                    count--;
                }

                if (map.get(nums[i]) > 0) {
                    map.put(nums[i], map.get(nums[i]) - 1);
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        sb.append(count);
        System.out.print(sb.toString());
    }
}