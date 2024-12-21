// ClassNotFoundException:
// Demonstrate a scenario where a class file is missing at runtime.

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to load a class that does not exist
            Class<?> missingClass = Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            // Handling the ClassNotFoundException
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println("The specified class could not be found.");
        }
    }
}
