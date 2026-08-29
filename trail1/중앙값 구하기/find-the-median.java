import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mid = 0;

        if (a > b && a > c) {
            if (b > c) {
                mid = b;
            } else {
                mid = c;
            }
        }

        if (b > a && b > c) {
            if (a > c) {
                mid = a;
            } else {
                mid = c;
            }
        }

        if (c > b && c > a) {
            if (a > b) {
                mid = a;
            } else {
                mid = b;
            }
        }        

        System.out.print(mid);
    }
}