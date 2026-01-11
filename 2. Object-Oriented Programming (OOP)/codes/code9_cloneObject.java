// Car class implements Cloneable to allow object cloning
class Car implements Cloneable {

    // Instance variable to store car name
    private String name;

    // Constructor to initialize the Car object
    Car(String name) {
        this.name = name;
    }

    // Overrides clone() method from Object class
    // super.clone() performs a shallow copy of the object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Getter method to access the car name
    public String getName() {
        return this.name;
    }
}

public class code9_cloneObject {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Creating original Car object
        Car c1 = new Car("ford");
        System.out.println(c1.getName());

        // Cloning the original object (creates a new object with same data)
        Car c2 = (Car) c1.clone();
        System.out.println(c2.getName());
    }
}
