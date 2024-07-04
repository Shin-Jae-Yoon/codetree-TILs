import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] blocked = new int[n + 1];

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                blocked[j]++;
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            if (max <= blocked[i]) {
                max = blocked[i];
            }
        }

        System.out.print(max);
    }
}