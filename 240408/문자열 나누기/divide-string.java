import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String str = "";

        for (int i = 0; i < n; i++) {
            str += sc.next();
        }

        int cnt = 1;

        for (int i = 0; i < str.length(); i++) {
            if (cnt <= 5) {
                System.out.print(str.charAt(i));
                cnt++;
            }

            if (cnt == 6) {
                cnt = 1;
                System.out.println();
            }
        }
    }
}