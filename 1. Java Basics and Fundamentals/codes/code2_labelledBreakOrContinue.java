public class code2_labelledBreakOrContinue {

    public static void main(String[] args) {

        // Label for the outer loop
        outer_loop: for (int i = 0; i < 10; i++) {

            // Label for the inner loop
            inner_loop: for (int j = 0; j < 10; j++) {

                // If j becomes 3, exit ONLY the inner loop
                if (j == 3) {
                    break inner_loop; // breaks inner_loop, outer_loop continues
                }

                // Prints current values of i and j
                System.out.println(i + "-" + j);
            }

            // If i becomes 3, exit the outer loop completely
            if (i == 3) {
                break outer_loop; // breaks outer_loop and ends the program
            }
        }
    }
}
