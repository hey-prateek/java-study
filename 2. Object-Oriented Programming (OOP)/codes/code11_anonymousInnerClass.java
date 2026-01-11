// Interface declaring a single method
interface car {
    void running();
}

public class code11_anonymousInnerClass {

    public static void main(String[] args) {

        // Creating an anonymous inner class that implements the car interface
        // No separate class is created; implementation is provided on the spot
        car c = new car() {

            // Implementing the interface method
            public void running() {
                System.out.println("car is running...");
            }
        };

        // Calling the method of the anonymous inner class
        c.running();
    }
}