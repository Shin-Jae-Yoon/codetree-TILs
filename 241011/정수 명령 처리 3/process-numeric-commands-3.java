import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();

        while (n-- > 0) {
            String command = sc.next();

            switch (command) {
                case "push_front":
                    deque.addFirst(sc.nextInt());
                    break;
                case "push_back":
                    deque.addLast(sc.nextInt());
                    break;
                case "pop_front":
                    System.out.println(deque.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(deque.pollLast());
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    System.out.println(deque.peekFirst());
                    break;
                case "back":
                    System.out.println(deque.peekLast());
                    break;
            }
        }
    }
}