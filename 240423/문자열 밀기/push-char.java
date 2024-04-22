import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len = input.length();

        String result = input.substring(1, len) + input.substring(0, 1);
        System.out.print(result);
    }
}