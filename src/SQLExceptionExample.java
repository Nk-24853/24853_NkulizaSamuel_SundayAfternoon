// SQLException:
//        Simulate a database error.
//        o Example: Attempt to connect to a non-existent database or execute invalid SQL.


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Attempting to connect to a non-existent database
            String url = "jdbc:mysql://localhost:3306/non_existent_db";
            String username = "root";
            String password = "password";

            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!"); // This line won't be executed.

        } catch (SQLException e) {
            // Handling the SQLException
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("SQL State: " + e.getSQLState());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
