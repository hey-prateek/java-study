import java.util.*;

class Employee {
    String name;
    int age;
    double salary;
    Date joiningDate;

    Employee(String name, int age, double salary, Date joiningDate) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    int getAge()
    {
        return this.age;
    }
}

//Comparator.comparing creates a Comparator by extracting a key from an object and comparing that key
public class code12_comparatorComparingMethod {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("A", 30, 60000,
                new GregorianCalendar(2020, 5, 10).getTime()));
        list.add(new Employee("B", 25, 70000,
                new GregorianCalendar(2019, 3, 20).getTime()));
        list.add(new Employee("C", 30, 50000,
                new GregorianCalendar(2021, 1, 15).getTime()));

        // 1. comparing(Function) – natural order
        list.sort(Comparator.comparing(e -> e.name));

        // 2. comparing(Function, Comparator) – custom order
        list.sort(Comparator.comparing(
                e -> e.name,
                Comparator.reverseOrder()
        ));

        // 3. comparingInt – primitive int
        list.sort(Comparator.comparingInt(e -> e.age));

        // 4. comparingLong – primitive long
        list.sort(Comparator.comparingLong(e -> e.joiningDate.getTime()));

        // 5. comparingDouble – primitive double
        list.sort(Comparator.comparingDouble(e -> e.salary));

        // 6. reversed
        list.sort(Comparator.comparingInt(Employee::getAge).reversed());

        // 7. thenComparing – multi-level sort
        list.sort(
            Comparator.comparingInt((Employee e) -> e.age)
                      .thenComparingDouble(e -> e.salary)
                      .thenComparing(e -> e.name)
        );
    }
}
