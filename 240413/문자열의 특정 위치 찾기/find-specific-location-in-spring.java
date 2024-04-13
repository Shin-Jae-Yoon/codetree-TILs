import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char alphabet = sc.next().charAt(0);
        int index = str.indexOf(alphabet);

        if (index != -1) {
            System.out.print(index);
        } else {
            System.out.print("No");
        }
    }
}