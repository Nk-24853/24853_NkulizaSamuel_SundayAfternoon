// ArrayIndexOutOfBoundsException:
//Access an invalid array index.

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            // Creating an array of size 3
            int[] numbers = {10, 20, 30};

            // Attempting to access an invalid index (out of bounds)
            int invalidElement = numbers[5];

            System.out.println("Element at index 5: " + invalidElement); // Won't execute

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println("You tried to access an invalid array index.");
        } finally {
            System.out.println("Execution of the try-catch block is complete.");
        }
    }
}
