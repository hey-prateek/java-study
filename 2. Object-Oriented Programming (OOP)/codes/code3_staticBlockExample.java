// Class definition
class Person {
    // Static variable (shared across all objects of Person)
    static int val = 1;

    // Static block - executed only once when the class is loaded into memory
    static {
        System.out.println("inside static block...");
    }

    // Constructor - executed every time an object of Person is created
    Person() {
        System.out.println("inside constructor, val=" + val);
    }
}

public class code3_staticBlockExample {
    public static void main(String[] args) {
        // First object creation
        // --> When the Person class is referenced for the first time,
        // JVM loads the class and executes the static block (only once).
        // --> Then constructor runs.
        Person p1 = new Person(); // prints "inside static block..." + "inside constructor, val=1"

        // Increment static variable through object reference (not recommended but
        // valid).
        // Since 'val' is static, it's shared across all objects.
        p1.val++; // val becomes 2

        // Second object creation
        // --> Static block will NOT execute again (it already ran once when class was
        // loaded).
        // --> Constructor runs, now printing val=2.
        Person p2 = new Person(); // prints "inside constructor, val=2"
    }
}
