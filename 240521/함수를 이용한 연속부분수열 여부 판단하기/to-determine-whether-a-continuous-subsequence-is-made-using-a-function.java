import java.util.Scanner;

public class Main {
    private static final int MAX_N = 100;

    private static int n1, n2;
    private static int[] array1 = new int[MAX_N];
    private static int[] array2 = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        if (isSubsequence()) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    private static boolean isSubsequence() {
        for (int i = 0; i <= n1 - n2; i++) {
            if (isSame(i)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isSame(int n) {
        for (int i = 0; i < n2; i++) {
            if (array1[i + n] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}