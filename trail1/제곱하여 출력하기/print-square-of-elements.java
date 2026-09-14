import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int target = sc.nextInt();
            
            System.out.print((int) Math.pow(target, 2) + " ");
        }
    }
}