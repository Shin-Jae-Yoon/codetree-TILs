import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int len = a.length();

        int cnt = 0;
        boolean isEqual = false;

        for (int i = 1; i <= len; i++) {
            String temp = a.substring(len - i, len) + a.substring(0, len - i);
            cnt++;

            if (temp.equals(b)) {
                isEqual = true;
                break;
            }
        }

        if (isEqual) {
            System.out.print(cnt);
        } else {
            System.out.print(-1);
        }
    }
}