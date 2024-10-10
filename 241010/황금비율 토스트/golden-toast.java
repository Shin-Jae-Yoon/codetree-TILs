import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 식빵의 개수
        int n = sc.nextInt();
        // 암호문의 개수
        int m = sc.nextInt();
        // 최초 암호문
        String breads = sc.next();

        LinkedList<Character> breadList = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            breadList.add(breads.charAt(i));
        }

        ListIterator<Character> iterator = breadList.listIterator(breadList.size());

        while (m-- > 0) {
            char command = sc.next().charAt(0);

            switch (command) {
                case 'L':
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }

                    break;
                case 'R':
                    if (iterator.hasNext()) {
                        iterator.next();
                    }

                    break;
                case 'D':
                    if (iterator.hasNext()) {
                        iterator.next();
                        iterator.remove();
                    }

                    break;
                case 'P':
                    char addLetter = sc.next().charAt(0);
                    iterator.add(addLetter);

                    break;
            }
        }

        iterator = breadList.listIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        } 
    }
}