import java.io.*;

class Car implements Serializable {
    private String name;

    Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

public class code8_serializableExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car c = new Car("maruti");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(baos);
        os.writeObject(c);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream is = new ObjectInputStream(bais);
        Car outputCar = (Car) is.readObject();

        System.out.println(outputCar.getName());

    }
}
