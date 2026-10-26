import java.util.Scanner;

public class Main {

    private static final int MAX_INT = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[101];
        long minValue = MAX_INT;

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextLong();

            if (arr[i] <= minValue) {
                minValue = arr[i];
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (arr[i] == minValue) {
                count++;
            }
        }

        System.out.print(minValue + " " + count);
    }
}