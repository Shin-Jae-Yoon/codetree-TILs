import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();

        Arrays.sort(input);
        
        String result = new String(input);
        System.out.print(result);
    }
}