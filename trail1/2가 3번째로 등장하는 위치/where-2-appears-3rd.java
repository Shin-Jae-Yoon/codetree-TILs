import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int index = -1;
        for (int i = 1; i <= N; i++) {
            if (arr[i] == 2) {
                count++;
            }

            if (count == 3) {
                index = i;
                break;
            }
        }

        System.out.print(index);
    }
}