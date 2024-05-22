import java.util.Scanner;

public class Main {
    private static String target, substr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        target = sc.next();
        substr = sc.next();

        System.out.print(findIndex());
    }

    private static int findIndex() {
        int n = target.length();

        for (int i = 0; i < n; i++) {
            if (isSubstr(i)) {
                return i;
            }
        }

        return -1;
    }

    private static boolean isSubstr(int start) {
        int n = target.length();
        int m = substr.length();

        if (start + m - 1 >= n) {
            return false;
        }

        for (int i = 0; i < m; i++) {
            if (target.charAt(start + i) != substr.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}