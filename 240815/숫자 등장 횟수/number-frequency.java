import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st2.nextToken());
            
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                int value = map.get(key) + 1;
                map.put(key, value);
            }
        }

        StringBuilder sb = new StringBuilder();
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st3.nextToken());

            if (!map.containsKey(key)) {
                sb.append(0);
            } else {
                int value = map.get(key);
                sb.append(value);
            }

            sb.append(" ");
        }

        System.out.print(sb.toString());
    }
}