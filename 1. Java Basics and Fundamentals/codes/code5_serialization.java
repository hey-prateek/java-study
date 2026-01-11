import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// this class needs to be serialized, so implementing Serializable
class Person implements Serializable {

    private String name;
    private int id;
    private transient int salary; // will not be serialized

    Person(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return this.name + " " + this.id + " " + this.salary;
    }
}

public class code5_serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person p = new Person("kanye", 123, 100000);

        // serializing object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
        oos.writeObject(p);
        oos.close();

        // de-serializing object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
        Person p1 = (Person) ois.readObject();
        ois.close();

        // printing output object
        System.out.println(p1);
    }
}
