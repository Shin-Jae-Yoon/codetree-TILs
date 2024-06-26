import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static final int MAX_N = 100;
    private static int[] input = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i = i + 2) {
            Arrays.sort(input, 0, i + 1);
            System.out.print(input[i / 2] + " ");
        }
    }
}