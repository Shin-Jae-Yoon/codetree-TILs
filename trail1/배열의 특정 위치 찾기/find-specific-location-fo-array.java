import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10 + 1];
        
        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();
        }

        int evenSum = 0;
        int thirdSum = 0;
        int thirdCount = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            }

            if (i % 3 == 0) {
                thirdSum += arr[i];
                thirdCount++;
            }   
        }

        System.out.printf("%d %.1f", evenSum, (double) thirdSum / thirdCount);
    }
}