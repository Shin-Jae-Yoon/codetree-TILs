public class Main {
    public static void main(String[] args) {
        int cnt = 0;

        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
                cnt++;

                if (cnt == 1 && j != 19) {
                    System.out.print(" / ");
                }

                if (cnt == 2) {
                    System.out.println();
                    cnt = 0;
                }
            }

            System.out.println();
            cnt = 0;
        }
    }
}