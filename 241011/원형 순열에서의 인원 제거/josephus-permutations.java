import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int count = 1;

        while (queue.size() != 0) {
            if (count == k) {
                System.out.print(queue.poll() + " ");
                count = 1;

                continue;
            }

            queue.add(queue.poll());
            count++;
        }
    }
}