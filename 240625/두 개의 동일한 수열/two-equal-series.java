import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final int MAX_N = 100;

    private static int n;
    private static int[] arr1 = new int[MAX_N];
    private static int[] arr2 = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (equal()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean equal() {
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}