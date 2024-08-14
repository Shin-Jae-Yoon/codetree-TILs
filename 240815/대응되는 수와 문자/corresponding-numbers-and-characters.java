import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static final int MAX_N = 100000;

    public static int n, m;
    public static String[] words = new String[MAX_N + 1];
    public static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            words[i] = br.readLine();
            map.put(words[i], i);
        }

        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {
            String key = br.readLine();

            if ('0' <= key.charAt(0) && key.charAt(0) <= '9') {
                sb.append(words[Integer.parseInt(key)]);
            } else {
                sb.append(map.get(key));
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}