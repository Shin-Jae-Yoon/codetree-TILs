import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            sum += (int)(input.charAt(i) - '0');
        }

        System.out.print(sum);
    }
}