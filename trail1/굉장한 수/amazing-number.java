import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean first = (n % 2 == 1) && (n % 3 == 0);
        boolean second = (n % 2 == 0) && (n % 5 == 0);

        System.out.print(first || second ? "true" : "false");
    }
}