import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeapYear = true;

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                isLeapYear = false;
            }
        } else {
            isLeapYear = false;
        }

        System.out.println(isLeapYear);
    }
}