import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] digits = new int[20];
        int count = 0;

        while (true) {
            if (n < target) {
                digits[count++] = n;
                break;
            }
            
            digits[count++] = n % target;
            n /= target;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}