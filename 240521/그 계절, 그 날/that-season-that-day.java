import java.util.Scanner;

public class Main {
    private static int y, m, d;

    private static final String SPRING = "Spring";
    private static final String SUMMER = "Summer";
    private static final String FALL = "Fall";
    private static final String WINTER = "Winter";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();

        if (judgeDay()) {
            printSeason();
        } else {
            System.out.println(-1);
        }
    }

    private static boolean judgeDay() {
        if (m <= 12 && d <= lastDay()) {
            return true;
        }

        return false;
    }

    private static int lastDay() {
        if (m == 2) {
            if (isLeapYear()) {
                return 29;
            } else {
                return 28;
            }
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }

        return 31;
    }

    private static boolean isLeapYear() {
        if (y % 4 != 0) {
            return false;
        }

        if (y % 100 != 0) {
            return true;
        }

        if (y % 400 == 0) {
            return true;
        }

        return false;
    }

    private static void printSeason() {
        if (m >= 3 && m <= 5) {
            System.out.println(SPRING);
        }

        if (m >= 6 && m <= 8) {
            System.out.println(SUMMER);
        }

        if (m >= 9 && m <= 11) {
            System.out.println(FALL);
        }

        if (m >= 1 && m <= 2 || m == 12) {
            System.out.println(WINTER);
        }
    }
}