import java.util.Scanner;

public class Main {
    private static int m, d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        d = sc.nextInt();

        if (isExist()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isExist() {
        if (isFebruary()) {
            return true;
        }

        if (isThirtyMonth()) {
            return true;
        }

        if (isThirtyOneMonth()) {
            return true;
        }

        return false;
    }

    private static boolean isFebruary() {
        if (m == 2) {
            if (d >= 1 && d <= 28) {
                return true;
            }
        }

        return false;
    }

    private static boolean isThirtyMonth() {
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d >= 1 && d <= 30) {
                return true;
            }
        }

        return false;
    }

    private static boolean isThirtyOneMonth() {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d >= 1 && d <= 31) {
                return true;
            }
        }

        return false;
    }
}