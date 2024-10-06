import java.sql.*;
class DelColumn
{
	public static void main(String arg[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection cn=DriverManager.getConnection("jdbc:odbc:abcd");
		Statement st=cn.createStatement();
 		String alterSQL = "ALTER TABLE student drop column email ";
            	st.executeUpdate(alterSQL);
           	System.out.println("Column altered .");

            // Execute a SELECT query to retrieve data
            	ResultSet rs=st.executeQuery("select *from student");
			while(rs.next())
			{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			}


		}catch(Exception e1){}
		System.out.println("One column Successfully Deleted");
		

	}
}