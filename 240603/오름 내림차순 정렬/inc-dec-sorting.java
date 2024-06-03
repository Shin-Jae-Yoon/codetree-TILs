import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        Integer[] arr = Arrays.stream(input)
                                .boxed()
                                .toArray(Integer[]::new);

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");    
        }

        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");    
        }
    }
}