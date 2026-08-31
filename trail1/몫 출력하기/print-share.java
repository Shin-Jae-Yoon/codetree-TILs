import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 3;

        while (count > 0) {
            int n = sc.nextInt();

            if (n % 2 == 1) {
                continue;
            }

            if (n % 2 == 0) {
                System.out.println(n / 2);
            }
            
            count--;
        }
    }
}