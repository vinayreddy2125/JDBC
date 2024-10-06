// 1. Importing packages
import com.mysql.cj.jdbc.Driver; // Corrected the import statement

import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) {
        try {
            // 2. Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Establish a connection (corrected the host to 'localhost')
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "******");

            // 4. Create a statement
            Statement stmt = con.createStatement();

            // 5. Execute a query
            String sql = "SELECT * FROM students WHERE student_id = 1";
            ResultSet rs = stmt.executeQuery(sql);

            // 6. Process the result set
            if (rs.next()) { // Move the cursor to the first row
                String name = rs.getString("student_name"); // Use the correct column name
                System.out.println("Name of the student = " + name);
            } else {
                System.out.println("No student found with ID 1.");
            }

            // 7. Close resources
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception stack trace for debugging
        }
    }
}
