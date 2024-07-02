import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String beonJi = sc.next();
            String location = sc.next();

            persons[i] = new Person(name, beonJi, location);
        }

        int lastIndex = 0;

        for (int i = 1; i < n; i++) {
            if (persons[i].name.compareTo(persons[lastIndex].name) > 0) {
                lastIndex = i;
            }
        }

        System.out.println("name " + persons[lastIndex].name);
        System.out.println("addr " + persons[lastIndex].beonJi);
        System.out.println("city " + persons[lastIndex].location);
    }
}

class Person {
    String name;
    String beonJi;
    String location;

    public Person(String name, String beonJi, String location) {
        this.name = name;
        this.beonJi = beonJi;
        this.location = location;
    }
}