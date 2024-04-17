import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        input[1] = 'a';
        input[input.length - 2] = 'a';

        String result = String.valueOf(input);
        System.out.print(result);
    }
}