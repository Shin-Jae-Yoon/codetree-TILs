import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 1) {
                    System.out.print(cnt + " ");
                    cnt++;
                } else {
                    System.out.print(cnt + " ");
                    cnt--;
                }
            }

            if (i % 2 == 1) {
                cnt += (n - 1);
            } else {
                cnt += (n + 1);
            }

            System.out.println();
        }
    }
}