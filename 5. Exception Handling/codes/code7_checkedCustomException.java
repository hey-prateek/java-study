//this is a custom exception
class invalidAgeException extends Exception {
    public invalidAgeException(String message) {
        super(message);
    }
}

public class code7_checkedCustomException {
    public static void main(String[] args) throws invalidAgeException {
        int age = 17;
        if (age < 18) {
            throw new invalidAgeException("person is minor...");
        }
    }
}
