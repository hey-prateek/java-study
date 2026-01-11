import java.util.Stack;

public class stackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // 1. push() - Add elements to stack
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack after pushes: " + stack);

        // 2. peek() - View top element without removing
        System.out.println("Top element (peek): " + stack.peek());

        // 3. pop() - Remove top element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // 4. search() - Find position (1-based from top)
        System.out.println("Position of A: " + stack.search("A"));
        System.out.println("Position of B: " + stack.search("B"));

        // 5. empty() - Check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 6. size() - Number of elements
        System.out.println("Stack size: " + stack.size());
    }
}
