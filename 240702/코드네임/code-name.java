import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Spy[] spys = new Spy[5];
        
        for (int i = 0; i < 5; i++) {
            String codename = sc.next();
            int score = sc.nextInt();

            spys[i] = new Spy(codename, score);
        }

        int minIndex = 0;

        for (int i = 0; i < 5; i++) {
            if (spys[minIndex].score >= spys[i].score) {
                minIndex = i;
            }
        }

        System.out.println(spys[minIndex].codename + " " + spys[minIndex].score);
    }
}

class Spy {
    String codename;
    int score;

    public Spy(String codename, int score) {
        this.codename = codename;
        this.score = score;
    }
}