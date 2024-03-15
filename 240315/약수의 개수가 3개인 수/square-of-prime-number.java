import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;

        for (int current = start; current <= end; current++) {
            int divisorCount = 0;

            for (int i = 1; i <= current; i++) {
                if (current % i == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount == 3) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}