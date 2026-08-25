import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("\\.");

        String y = input[0];
        String m = input[1];
        String d = input[2];

        System.out.print(m + "-" + d + "-" + y);
    }
}