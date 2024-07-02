import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();

        User user = new User();

        System.out.println("user " + user.id + " lv " + user.level);

        user.id = id;
        user.level = level;

        System.out.println("user " + user.id + " lv " + user.level);

    }
}

class User {
    String id;
    int level;

    public User() {
        this.id = "codetree";
        this.level = 10;
    }

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}