public class Main {
    public static void main(String[] args) {
        Person bob = new Person();
        bob.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person sam = new Person("Sam", 25);
        sam.displayInfo();
        System.out.println();

        // Person_2
        Person undef = new Person();
        undef.displayInfo();

        Person tom_2 = new Person("Tom");
        tom_2.displayInfo();

        Person sam_2 = new Person("Sam", 25);
        sam_2.displayInfo();
        System.out.println();

        // Person 3
        Person undef3 = new Person();
        undef3.displayInfo();

        Person tom3 = new Person("Tom");
        tom3.displayInfo();
    }
}