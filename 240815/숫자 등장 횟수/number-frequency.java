import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    private static final int MAX_N = 100000;

    private static int n, m;
    private static int[] arr = new int[MAX_N];
    private static HashMap<Integer, Integer> numberFrequence = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (!numberFrequence.containsKey(arr[i])) {
                numberFrequence.put(arr[i], 1);
            } else {
                numberFrequence.put(arr[i], numberFrequence.get(arr[i]) +  1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st3.nextToken());

            if (!numberFrequence.containsKey(key)) {
                sb.append(0);
            } else {
                int value = numberFrequence.get(key);
                sb.append(value);
            }

            sb.append(" ");
        }

        System.out.print(sb.toString());
    }
}