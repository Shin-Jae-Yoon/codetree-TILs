import java.util.Scanner;

public class Main {

    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int INT_MIN = Integer.MIN_VALUE;
    private static final int endMinNum = -999;
    private static final int endMaxNum = 999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minValue = INT_MAX;
        int maxValue = INT_MIN;

        while (true) {
            int n = sc.nextInt();

            if (n == endMinNum || n == endMaxNum) {
                break;
            }

            if (n >= maxValue) {
                maxValue = n;
            }

            if (n <= minValue) {
                minValue = n;
            }
        }

        System.out.print(maxValue + " " + minValue);
    }
}