// 1. Importing packages
import java.sql.*;

public class insertJDBC {
    public static void main(String[] args) {
        try {
            // 2. Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Establish a connection (corrected the host to 'localhost')
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "*******");

            // 4. Create a statement
            Statement stmt = con.createStatement();

            // 5. Execute a query
            String sql = "insert into students values(4,'jeevan',3035,'mp')," +
                    "(5,'prasanna',3036,'del')";
             stmt.execute(sql);
            //System.out.print(rs);
            // 6. Process the result set
            /*while (rs.next())
            {
                System.out.print(rs.getInt(1)+"-");
                System.out.print(rs.getString(2)+"-");
                System.out.print(rs.getInt(3)+"-");
                System.out.println(rs.getString(4));
            }*/

            // 7. Close resources
            //rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception stack trace for debugging
        }
    }
}
