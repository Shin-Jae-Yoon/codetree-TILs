import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split(":");
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        System.out.printf("%d:%d", h + 1, m);
    }
}