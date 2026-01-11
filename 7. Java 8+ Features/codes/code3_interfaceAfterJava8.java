interface in {

    //abstract method
    void abs();

    //default method
    default void prints() {
        System.out.println("inside default method of interface...");
    }
}

public class code3_interfaceAfterJava8 implements in {
    public static void main(String[] args) {
        code3_interfaceAfterJava8 temp = new code3_interfaceAfterJava8();
        temp.abs();
    }

    @Override
    public void abs() {
        System.out.println("inside abstract method...");

        prints();
    }
}
