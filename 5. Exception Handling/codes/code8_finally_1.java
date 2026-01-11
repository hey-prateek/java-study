public class code8_finally_1 {

    static int getNumber() {
        try {
            return 10;
        } finally {
            return 20; // this will be returned, not 10
        }
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}
