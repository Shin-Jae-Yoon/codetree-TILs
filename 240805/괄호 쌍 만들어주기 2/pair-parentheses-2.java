import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String letter = br.readLine();
        int count = 0;

        for (int i = 0; i < letter.length() - 1; i++) {
            char firstTarget = letter.charAt(i);
            char secondTarget = letter.charAt(i + 1);

            if (firstTarget == '(' && secondTarget == '(') {
                for (int j = i + 2; j < letter.length() - 1; j++) {
                    char firstObject = letter.charAt(j);
                    char secondObject = letter.charAt(j + 1);

                    if (firstObject == ')' && secondObject == ')') {
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