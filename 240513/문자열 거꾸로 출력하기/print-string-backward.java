import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.next();

            if (input.equals("END")) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            System.out.println(sb.append(input).reverse());
        }
    }
}