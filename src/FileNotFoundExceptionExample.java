// FileNotFoundException:
// specific type of IOException that occurs when a file is not found.
// Example: Try to open a file that doesn’t exist.

import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to open a file that does not exist
            FileInputStream file = new FileInputStream("missingfile.txt");
            System.out.println("File opened successfully.");
            file.close();
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("The specified file was not found: " + e.getMessage());
        } catch (IOException e) {
            // Optional: Handle general IO exceptions
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
