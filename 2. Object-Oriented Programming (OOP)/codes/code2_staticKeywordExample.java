class Cars {
    String name;
    static int count;

    Cars(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return this.name;
    }

    public static int getCount() {
        return count;
    }
}

public class code2_staticKeywordExample {
    public static void main(String[] args) {
        Cars c1 = new Cars("Volvo");
        System.out.println(c1.getName() + " " + Cars.getCount());
        Cars c2 = new Cars("Ford");
        System.out.println(c2.getName() + " " + Cars.getCount());
    }
}