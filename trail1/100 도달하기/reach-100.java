import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        arr[1] = 1;
        arr[2] = sc.nextInt();
        int position = 3;

        while (true) {
            arr[position] = arr[position - 2] + arr[position - 1];
            
            if (arr[position] >= 100) {
                break;
            }

            position++;
        }

        for (int i = 1; i <= position; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}