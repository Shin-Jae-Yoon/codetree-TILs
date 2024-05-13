import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            String input = sc.next();

            if (input.equals("0")) {
                break;
            }

            list.add(input);
        }

        int count = list.size();
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            if ((i + 1) % 2 == 1) {
                System.out.println(list.get(i));
            }
        }
    }
}