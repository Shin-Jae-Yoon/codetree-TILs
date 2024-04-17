import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();

        char firstChar = input[0];
        char secondChar = input[1];

        for (int i = 0; i < input.length; i++) {
            if (input[i] == secondChar) {
                input[i] = firstChar;
            }
        }

        System.out.print(String.valueOf(input));
    }
}