import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int number = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            if (number == 1) {
                sb.append(str.substring(1)).append(str.charAt(0));
            }

            if (number == 2) {
                sb.append(str.substring(len - 1)).append(str.substring(0, len - 1));
            }

            if (number == 3) {
                sb.append(str.substring(0)).reverse();
            }

            str = sb.toString();
            System.out.println(str);
        }
    }
}