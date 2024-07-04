import java.util.Scanner;

public class Main {
    private static final int MAX_SIZE = 200;
    private static int[] checked = new int[MAX_SIZE + 1];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;

            for (int j = x1; j < x2; j++) {
                checked[j]++;
            }
        }

        int max = 0;

        for (int i = 1; i <= MAX_SIZE; i++) {
            if (max <= checked[i]) {
                max = checked[i];
            }
        }

        System.out.print(max);
    }
}