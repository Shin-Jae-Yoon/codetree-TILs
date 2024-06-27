import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secretCode = sc.next();
        char meetingPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        Spy spy = new Spy(secretCode, meetingPoint, time);

        System.out.println("secret code : " + spy.getSecretCode());
        System.out.println("meeting point : " + spy.getMeetingPoint());
        System.out.println("time : " + spy.getTime());
    }
}

class Spy {
    private String secretCode;
    private char meetingPoint;
    private int time;

    public Spy(String secretCode, char meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

    public String getSecretCode() {
        return this.secretCode;
    }

    public char getMeetingPoint() {
        return this.meetingPoint;
    }

    public int getTime() {
        return this.time;
    }
}