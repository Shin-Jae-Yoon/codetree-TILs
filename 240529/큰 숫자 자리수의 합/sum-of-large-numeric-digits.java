import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int multipleNum = a * b * c;

        System.out.println(digitSum(multipleNum));
    }

    private static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }

        return digitSum(n / 10) + (n % 10);
    }
}