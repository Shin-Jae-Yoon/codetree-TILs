import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int length = input.length() - 1;

        input = input.substring(0, 1) + input.substring(2, length - 1) + input.substring(length);
        System.out.print(input);
    }
}