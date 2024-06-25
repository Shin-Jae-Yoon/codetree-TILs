import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] firstWord = sc.next().toCharArray();
        char[] secondWord = sc.next().toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        if (equal(firstWord, secondWord)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean equal(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}