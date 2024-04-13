import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String target = sc.next();

        int count = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == target.charAt(0) && input.charAt(i + 1) == target.charAt(1)) {
                count++;
            }
        }

        System.out.print(count);
    }
}