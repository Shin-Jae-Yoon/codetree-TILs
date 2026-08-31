import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 1;
        int x = 1;

        while (true) {
            temp *= 2;

            if (temp == n) {
                break;
            }

            x++;
        }

        System.out.print(x);
    }
}