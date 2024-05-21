import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper aWrap = new IntWrapper(a);
        IntWrapper bWrap = new IntWrapper(b);

        modify(aWrap, bWrap);

        a = aWrap.value;
        b = bWrap.value;

        System.out.print(a + " " + b);
    }

    private static void modify(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        } else {
            a.value *= 2;
            b.value += 25;
        }
    }
}