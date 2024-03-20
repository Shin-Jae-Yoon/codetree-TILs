import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[100];
        result[1] = 1;
        result[2] = n;
        int index = 3;

        while(true) {
            result[index] = result[index - 2] + result[index - 1];
            
            if (result[index] >= 100) {
                break;
            }

            index++;
        }

        for (int i = 1; i <= index; i++) {
            System.out.print(result[i] + " ");
        }
    }
}