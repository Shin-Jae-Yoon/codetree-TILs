import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String first = "ee";
        String second = "ab";

        if (str.contains(first)) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }

        if (str.contains(second)) {
            System.out.print("Yes");
        } else {
            System.out.print("No ");
        }
    }
}