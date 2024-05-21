import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        String substr = sc.next();

        System.out.print(target.indexOf(substr));
    }
}