import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }

        if (year % 100 != 0) {
            return true;
        }

        if (year % 400 == 0) {
            return true;
        }

        return false;
    }
}