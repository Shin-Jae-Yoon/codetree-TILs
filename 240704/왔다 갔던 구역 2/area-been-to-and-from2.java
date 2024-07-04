import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] checked = new int[2001];
        int current = 1000;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            char direction = sc.next().charAt(0);

            if (direction == 'R') {
                for (int j = current + 1; j <= current + x; j++) {
                    checked[j]++;
                }

                current = current + x;
            }

            if (direction == 'L') {
                for (int j = current; j > current - x; j--) {
                    checked[j]++;
                }

                current = current - x;
            }
        }

        int sum = 0;

        for (int i = 1; i <= 2000; i++) {
            if (checked[i] > 1) {
                sum++;
            }
        }

        System.out.print(sum);
    }
}