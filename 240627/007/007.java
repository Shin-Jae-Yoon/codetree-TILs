import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secretCode = sc.next();
        String meetingPoint = sc.next();
        int time = sc.nextInt();

        Secret secret = new Secret(secretCode, meetingPoint, time);

        System.out.println("secret code : " + secret.secretCode);
        System.out.println("meeting point : " + secret.meetingPoint);
        System.out.println("time : " + secret.time);
    }
}

class Secret {
    String secretCode;
    String meetingPoint;
    int time;

    public Secret(String secretCode, String meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}