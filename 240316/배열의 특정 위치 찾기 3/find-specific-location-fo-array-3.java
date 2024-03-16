import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[100 + 1];
        int index = 1;
        
        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                index--;
                break;
            }

            input[index] = n;
            index++;
        }

        int sum = 0;

        for (int i = index; i >= index - 2; i--) {
            sum += input[i];
        }

        System.out.print(sum);
    }
}