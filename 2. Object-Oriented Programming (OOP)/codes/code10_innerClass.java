class Car {
    private String name;
    private static String model = "2025";

    Car(String name) {
        this.name = name;
    }

    class InnerCar {
        public void printInner() {
            System.out.println("car name : " + name);
        }
    }

    static class StaticInnerClass {
        public void printStaticInner() {
            System.out.println("static model name: " + model);
        }
    }
}

public class code10_innerClass {
    public static void main(String[] args) {
        Car c = new Car("ford");
        Car.InnerCar ic = c.new InnerCar();
        ic.printInner();

        Car.StaticInnerClass sic = new Car.StaticInnerClass();
        sic.printStaticInner();

    }
}
