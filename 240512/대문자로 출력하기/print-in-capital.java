import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        String result = "";

        for (int i = 0; i < input.length; i++) {
            if ('A' <= input[i] && input[i] <= 'Z') {
                result += input[i];
            }

            if ('a' <= input[i] && input[i] <= 'z') {
                result += (char)(input[i] - 'a' + 'A');
            }
        }

        System.out.print(result);
    }
}