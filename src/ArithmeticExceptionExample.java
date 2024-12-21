//ArithmeticException:
//Simulate an arithmetic operation that fails.

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Deliberately dividing a number by zero to trigger ArithmeticException
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;

            System.out.println("Result: " + result); // This line won't execute

        } catch (ArithmeticException e) {
            // Handling the ArithmeticException
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println("You cannot divide a number by zero.");
        } finally {
            System.out.println("Execution of the try-catch block is complete.");
        }
    }
}
