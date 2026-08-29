import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = -100;

        if (a >= b && a >= c) {
            max = a;
        }

        if (b >= a && b >= c) {
            max = b;
        }

        if (c >= b && c >= a) {
            max = c;
        }

        System.out.println(max);
    }
}