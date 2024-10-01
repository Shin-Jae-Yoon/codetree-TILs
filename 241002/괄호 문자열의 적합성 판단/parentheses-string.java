import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
            char target = input.charAt(i);

            if (target == ')' && stack.isEmpty() == false) {
                stack.pop();
            } else {
                stack.push(target);
            }
        }

        if (stack.isEmpty()) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}