import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try {
            // Create a temporary file with minimal content for demonstration
            FileOutputStream fos = new FileOutputStream("example.txt");
            fos.write("Hello".getBytes()); // Writing some content to the file
            fos.close();

            // Reading content from the file
            FileInputStream fis = new FileInputStream("example.txt");
            DataInputStream dis = new DataInputStream(fis);

            // Reading more bytes than available to trigger EOFException
            while (true) {
                System.out.println(dis.readUTF());
            }
        } catch (EOFException e) {
            // Handle EOFException when the end of file is reached
            System.out.println("End of file reached: " + e.getMessage());
        } catch (IOException e) {
            // Handle general I/O exceptions
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
