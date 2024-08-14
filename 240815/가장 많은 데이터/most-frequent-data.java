import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.HashMap;

public class Main {
    private static final int MIN_VAL = Integer.MIN_VALUE;

    private static int n;
    private static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int max = MIN_VAL;

        for (int i = 0; i < n; i++) {
            String letter = br.readLine();
            map.put(letter, map.getOrDefault(letter, 0) + 1);

            max = Math.max(max, map.get(letter));
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max);
        System.out.print(sb.toString());
    }
}