import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[7];

        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            count[n]++;
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " - " + count[i]);
        }
    }
}