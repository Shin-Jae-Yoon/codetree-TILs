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

        calculator(aWrap, bWrap);

        a = aWrap.value;
        b = bWrap.value;

        System.out.print(a + " " + b);
    }

    private static void calculator(IntWrapper aWrap, IntWrapper bWrap) {
        if (aWrap.value > bWrap.value) {
            aWrap.value *= 2;
            bWrap.value += 10;
        } else {
            aWrap.value += 10;
            bWrap.value *= 2;
        }
    }
}