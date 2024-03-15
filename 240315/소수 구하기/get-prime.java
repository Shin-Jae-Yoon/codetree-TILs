import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int current = 1; current <= n; current++) {
            int divisorCount = 0;

            for (int divisorNum = 2; divisorNum <= current; divisorNum++) {
                if (current % divisorNum == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount == 1) {
                System.out.print(current + " ");
            }
        }
    }
}