import java.util.Scanner;

public class Main {

    private static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int maxVal = INT_MIN;

        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] >= maxVal) {
                maxVal = arr[i];
            }
        }
        
        System.out.print(maxVal);
    }
}