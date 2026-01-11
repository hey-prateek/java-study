class Vehicle {
    Vehicle() {
        System.out.println("vehicle default constructor...");
    }
}

class Car extends Vehicle {
    Car() {
        this(20);
        System.out.println("default constructor...");
    }

    Car(int i) {
        super();
        System.out.println("parameterized constructor...");
    }
}

public class code5_constructorChaining {
    public static void main(String[] args) {
        Car c = new Car();
    }
}