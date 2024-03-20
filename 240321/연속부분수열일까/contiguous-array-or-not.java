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

        int cnt = 0;

        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n1; j++) {
                if (n1Arr[j] == n2Arr[i]) {
                    cnt++;
                    break;
                }
            }
        }

        if (cnt == n2) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}