import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] candidate = new String[n];

        for (int i = 0; i < n; i++) {
            candidate[i] = sc.next();
        }

        Arrays.sort(candidate);

        int tLength = t.length();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (candidate[i].substring(0, tLength).equals(t)) {
                list.add(candidate[i]);
            }
        }

        System.out.println(list.get(k - 1));
    }
}