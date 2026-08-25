import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("-");

        String y = input[2];
        String m = input[0];
        String d = input[1];

        System.out.print(y + "." + m + "." + d);
    }
}