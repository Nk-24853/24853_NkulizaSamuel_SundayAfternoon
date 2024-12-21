// IOException:
//        Simulate a scenario like reading a file from disk that might cause an input/output error.
//        o Example: Attempt to read a non-existent file.


import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to open a non-existent file
            FileReader file = new FileReader("nonexistentfile.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // Reading the first line (this line will not execute as an exception is thrown earlier)
            System.out.println(fileInput.readLine());
            fileInput.close();
        } catch (IOException e) {
            // Handle the IOException
            System.out.println("An error occurred while trying to read the file: " + e.getMessage());
        }
    }
}
