import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        IntWrapper a = new IntWrapper(n);
        IntWrapper b = new IntWrapper(m);

        swap(a, b);

        System.out.print(a.value + " " + b.value);
    }

    private static void swap(IntWrapper a, IntWrapper b) {
        IntWrapper temp = new IntWrapper(a.value);
        a.value = b.value;
        b.value = temp.value;
    }
}

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }   
}