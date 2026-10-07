import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int position = 1;
        int count = 0;
        int[] arr = new int[100];

        while (true) {
            arr[position] = n * position;

            if (arr[position] % 5 == 0) {
                count++;
            }

            position++;

            if (count == 2) {
                break;
            }
        }

        for (int i = 1; i < position; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}