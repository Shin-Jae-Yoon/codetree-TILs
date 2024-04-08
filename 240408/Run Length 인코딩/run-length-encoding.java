import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int cnt = 1;
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            }

            if (str.charAt(i) != str.charAt(i + 1)) {
                result = result + str.charAt(i) + cnt;
                cnt = 1;
            }
        }

        result = result + str.charAt(str.length() - 1) + cnt;

        System.out.println(result.length());
        System.out.println(result);
    }
}