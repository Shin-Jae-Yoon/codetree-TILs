import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[11];

        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.next();
        }

        System.out.print(arr[2] + " " + arr[5] + " " + arr[8]);
    }
}