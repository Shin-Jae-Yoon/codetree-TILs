import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] n = br.readLine().toCharArray();

        boolean containZero = false;
        int candidate = n.length;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == '0') {
                containZero = true;
                candidate = i;
                break;
            }
        }

        // 0 포함된 이진법이면, 맨 앞에서부터 후보 index를 1로 변경
        // 0 포함X 이진법이면, 맨 뒤에 index를 0으로 변경
        if (containZero) {
            n[candidate] = '1';
        } else {
            n[candidate - 1] = '0';
        }

        int result = 0;

        for (int i = 0; i < n.length; i++) {
            result += (int)Math.pow(2, i) * (n[n.length - 1 - i] - '0');
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.print(sb.toString());
    }
}