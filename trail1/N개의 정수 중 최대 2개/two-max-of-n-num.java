import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Integer[] sortedArr = Arrays.stream(arr)
                                    .boxed()
                                    .toArray(Integer[]::new);

        Arrays.sort(sortedArr, Collections.reverseOrder());
        
        System.out.print(sortedArr[0] + " " + sortedArr[1]);
    }
}