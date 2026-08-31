import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int loop = a;
        boolean result = false;

        while (loop <= b) {
            if (loop % c == 0) {
                result = true;
            }

            loop++;
        }

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}