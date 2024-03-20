import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[101];
        int[] count = new int[11];
        int index = 1;

        while(true) {
            input[index] = sc.nextInt();

            if (input[index] == 0) {
                break;
            }

            count[input[index] / 10]++;
            index++;
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i * 10 + " - " + count[i]);
        }
    }
}