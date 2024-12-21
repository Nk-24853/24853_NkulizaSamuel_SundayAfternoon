// IllegalArgumentException:
//Pass an invalid argument to a method.

public class IllegalArgumentExceptionExample {

    // Method that throws IllegalArgumentException for invalid input
    public static int calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative: " + number);
        }
        return (int) Math.sqrt(number);
    }

    public static void main(String[] args) {
        try {
            // Passing an invalid argument (negative number)
            int result = calculateSquareRoot(-25);
            System.out.println("Square root: " + result);

        } catch (IllegalArgumentException e) {
            // Handling the IllegalArgumentException
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println("Invalid argument passed to the method.");
        } finally {
            System.out.println("Execution of the try-catch block is complete.");
        }
    }
}
