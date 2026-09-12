import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[200 + 1];
        int cursor = 1;

        while (true) {
            arr[cursor] = sc.nextInt();

            if (arr[cursor] == 0) {
                System.out.print(arr[cursor - 3] + arr[cursor - 2] + arr[cursor - 1]);
                break;
            }

            cursor++;
        }
    }
}