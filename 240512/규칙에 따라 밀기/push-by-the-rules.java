import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len = input.length();
        String command = sc.next();

        for (int i = 0; i < command.length(); i++) {
            char current = command.charAt(i);

            if (current == 'L') {
                input = input.substring(1, len) + input.substring(0, 1);
            } else {
                input = input.substring(len - 1, len) + input.substring(0, len - 1);
            }
        }

        System.out.print(input);
    }
}