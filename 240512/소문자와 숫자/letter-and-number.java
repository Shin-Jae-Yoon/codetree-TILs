import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = "";
        
        for (int i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                result += (char)(input.charAt(i) - 'A' + 'a');
            } else if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                result += input.charAt(i);
            } else if ('0' <= input.charAt(i) && input.charAt(i) <= '9') {
                result += input.charAt(i);
            }
        }

        System.out.print(result);
    }
}