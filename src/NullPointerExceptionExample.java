// NullPointerException:
//Access a null reference.

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            // Declaring a reference and setting it to null
            String myString = null;

            // Attempting to call a method on a null reference
            int length = myString.length();

            System.out.println("Length of the string: " + length);

        } catch (NullPointerException e) {
            // Handling the NullPointerException
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println("You are trying to access a method on a null object.");
        } finally {
            System.out.println("Execution of the try-catch block is complete.");
        }
    }
}
