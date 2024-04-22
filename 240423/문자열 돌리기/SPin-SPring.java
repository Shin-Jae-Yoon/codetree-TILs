import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len = input.length();

        System.out.println(input);

        for (int i = 0; i < len; i++) {
            input = input.substring(len - 1) + input.substring(0, len - 1);
            System.out.println(input);
        }
    }
}