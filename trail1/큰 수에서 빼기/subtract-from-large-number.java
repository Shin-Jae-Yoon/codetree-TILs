import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int big;
        int small;

        if (A <= B) {
            big = B;
            small = A;
        } else {
            big = A;
            small = B;
        }

        System.out.println(big - small);
    }
}