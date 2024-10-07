import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        while (n-- > 0) {
            String command = sc.next();
            
            switch (command) {
                case "push_back":
                    int data = sc.nextInt();
                    list.add(data);
                    break;
                case "pop_back":
                    list.remove(list.size() - 1);
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "get":
                    int index = sc.nextInt();
                    System.out.println(list.get(index - 1));
                    break;
            }
        }
    }
}