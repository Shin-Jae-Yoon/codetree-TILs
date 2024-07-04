import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum = 0;

        StringBuilder reversed = new StringBuilder(input).reverse();

        for (int i = 0; i < reversed.length(); i++) {
            int num = reversed.charAt(i) - '0';
            sum += num * Math.pow(2, i);
        }

        System.out.println(sum);
    }
}