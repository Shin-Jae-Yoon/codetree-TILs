public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        int aTemp = a;
        int bTemp = b;
        int cTemp = c;

        a = cTemp;
        b = aTemp;
        c = bTemp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}