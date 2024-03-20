import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] n1Arr = new int[n1 + 1];
        int[] n2Arr = new int[n2 + 1];

        for (int i = 1; i <= n1; i++) {
            n1Arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= n2; i++) {
            n2Arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= n1; i++) {
            boolean success = true;

            for (int j = 1; j <= n2; j++) {
                if (i + j >= n1) {
                    success = false;
                    break;
                }

                if (n1Arr[i + j] != n2Arr[j]) {
                    success = false;
                    break;
                }
            }

            if (success) {
                System.out.print("Yes");
                System.exit(0);
            }
        }

        System.out.print("No");
    }
}