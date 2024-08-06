import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (input[i] == 'C' && input[j] == 'O' && input[k] == 'W') {
                        count++;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count);
        System.out.print(sb.toString());
    }
}