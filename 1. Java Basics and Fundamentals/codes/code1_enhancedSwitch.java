class code1_enhancedSwitch {
    public static void main(String[] args) {

        int day = 1;

        // • This is Java 14+ switch expression
        // • Uses -> (no break needed)
        // • Always returns a value
        String day_string = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println(day_string);

    }
}