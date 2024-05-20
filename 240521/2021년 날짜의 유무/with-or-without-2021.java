import java.util.Scanner;

public class Main {
    private static int m, d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        d = sc.nextInt();

        if (judgeDay()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean judgeDay() {
        if (m <= 12 && d <= lastDayNumber()) {
            return true;
        }

        return false;
    }

    private static int lastDayNumber() {
        if (m == 2) {
            return 28;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }

        return 31;
    }
}