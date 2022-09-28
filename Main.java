import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String args[]) {
        Person p1 = new Person("e");
        Person p2 = new Person("e");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}