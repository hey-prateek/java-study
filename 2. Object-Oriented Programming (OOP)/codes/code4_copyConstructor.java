class car {

    String name;

    // copy constructor
    car(car c) {
        this.name = c.name;
    }

    car(String name) {
        this.name = name;
    }
}

public class code4_copyConstructor {
    public static void main(String[] args) {
        car c1 = new car("toyota");
        System.out.println(c1.name);

        // creating class using copied constructor
        car c2 = new car(c1);
        System.out.println(c2.name);
    }

}