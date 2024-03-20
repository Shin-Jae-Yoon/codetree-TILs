import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[10000];
        int index = 1;
        result[index] = n;

        int cnt = 0;

        while (true) {
            if (cnt == 2) {
                break;
            }

            if (result[index] % 5 == 0) {
                cnt++;
            }

            System.out.print(result[index] + " ");
            index++;
            result[index] = result[index - 1] + n;
        }
    }
}