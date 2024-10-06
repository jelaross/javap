import java.sql.*;

class RecUpdate {
    public static void main(String arg[]) {
        Connection cn = null;
        Statement st = null;
        try {
                       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                       cn = DriverManager.getConnection("jdbc:odbc:abcd");
                        st = cn.createStatement();
                       int rowsAffected = st.executeUpdate("UPDATE student SET sname='Akash.M' WHERE sid=2");
                       if (rowsAffected > 0) {
                System.out.println("Records Successfully Updated: " + rowsAffected);
            } else {
                System.out.println("No records were updated.");
            }
        } catch (Exception e) {
                        e.printStackTrace();
        } 
    }
}
