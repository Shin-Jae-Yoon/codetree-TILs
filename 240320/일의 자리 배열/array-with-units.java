import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] result = new int[11];
        result[1] = a;
        result[2] = b;

        for (int i = 3; i <= 10; i++) {
            result[i] = (result[i - 2] + result[i - 1]) % 10;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(result[i] + " ");
        }
    }
}