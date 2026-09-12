import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10 + 1];

        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = arr[3] + arr[5] + arr[10];
        System.out.print(sum);
    }
}