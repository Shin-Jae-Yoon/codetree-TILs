import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.print("None");
        } else {
            System.out.print(idx);
        }
    }
}