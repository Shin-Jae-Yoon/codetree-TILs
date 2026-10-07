import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int position = 1;

        while (true) {
            arr[position] = sc.nextInt();
            
            if (arr[position] == 0) {
                break;
            }

            position++;
        }

        for (int i = 1; i <= position - 1; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] += 3;
            } else {
                arr[i] /= 2;
            }

            System.out.print(arr[i] + " ");
        }
    }
}