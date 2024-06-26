import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static final int MAX_N = 100;
    private static int[] input = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i = i + 2) {
            list.add(determineMedium(i));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static int determineMedium(int number) {
        int[] temp = new int[number + 1];

        for (int i = 0; i < number + 1; i++) {
            temp[i] = input[i];
        }

        Arrays.sort(temp);

        return temp[number / 2];
    }
}