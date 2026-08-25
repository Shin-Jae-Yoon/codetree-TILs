import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("-");

        System.out.println(input[0] + "-" + input[2] + "-" + input[1]);
    }
}