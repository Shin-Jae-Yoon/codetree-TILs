import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] checked = new int[101];

        for (int i = 1; i <= n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int j = x1; j <= x2; j++) {
                checked[j]++;
            }
        }

        int max = 0;

        for (int i = 1; i <= 100; i++) {
            if (max <= checked[i]) {
                max = checked[i];
            }
        }

        System.out.print(max);
    }
}