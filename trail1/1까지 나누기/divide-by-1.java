import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int midResult = n;
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            midResult = midResult / i;
            count++;

            if (midResult <= 1) {
                break;
            }
        }

        System.out.print(count);
    }
}