import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month == 1) {
            System.out.println(31);
            return;
        }

        if (month == 2) {
            System.out.println(28);
            return;
        }

        if (month < 8 && month % 2 == 1) {
            System.out.println(31);
        } else if (month >= 8 && month % 2 == 0) {
            System.out.println(31);
        } else {
            System.out.println(30);
        }
    }
}