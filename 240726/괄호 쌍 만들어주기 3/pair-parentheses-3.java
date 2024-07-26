import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String letter = br.readLine();
        int count = 0;

        for (int i = 0; i < letter.length(); i++) {
            char target = letter.charAt(i);

            if (target == '(') {
                for (int j = i + 1; j < letter.length(); j++) {
                    char object = letter.charAt(j);

                    if (object == ')') {
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