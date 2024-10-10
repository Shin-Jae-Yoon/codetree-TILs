import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        while (n-- > 0) {
            String command = sc.next();

            switch (command) {
                case "push":
                    int data = sc.nextInt();
                    queue.add(data);
                    break;
                case "pop":
                    System.out.println(queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    System.out.println(queue.peek());
                    break;
            }
        }
    }
}