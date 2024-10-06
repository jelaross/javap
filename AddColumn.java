import java.sql.*;
class AddColumn
{
	public static void main(String arg[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection cn=DriverManager.getConnection("jdbc:odbc:abcd");
		Statement st=cn.createStatement();
 		String alterSQL = "ALTER TABLE student ADD email VARCHAR(20)";
            	st.executeUpdate(alterSQL);
           	System.out.println("Table altered successfully.");

            // Execute a SELECT query to retrieve data
            	ResultSet rs=st.executeQuery("select *from student");
			while(rs.next())
			{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			}

		}catch(Exception e1){}
		System.out.println("Records Successfully Altered");
		

	}
}