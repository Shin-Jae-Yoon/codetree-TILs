import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int position = 10;

        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();
            
            if (arr[i] == 0) {
                position = i - 1;
                break;
            }
        }

        for (int i = position; i >= 1; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}