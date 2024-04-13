import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int eeCount = 0;
        int ebCount = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'e' && input.charAt(i + 1) == 'e') {
                eeCount++;
            }

            if (input.charAt(i) == 'e' && input.charAt(i + 1) == 'b') {
                ebCount++;
            }
        }

        System.out.print(eeCount + " " + ebCount);
    }
}