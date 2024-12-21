// NumberFormatException:
//Attempt to convert a string to a number when the format is invalid.

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // String with invalid format for numeric conversion
            String invalidNumber = "123ABC";

            // Attempting to convert an invalid string to an integer
            int result = Integer.parseInt(invalidNumber);

            System.out.println("Converted Number: " + result); // Won't execute

        } catch (NumberFormatException e) {
            // Handling the NumberFormatException
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println("The input string is not a valid number.");
        } finally {
            System.out.println("Execution of the try-catch block is complete.");
        }
    }
}
