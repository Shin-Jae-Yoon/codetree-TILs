import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String target = sc.next();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            
            if (target.equals(input)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}