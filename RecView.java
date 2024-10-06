import java.sql.*;
class RecView
{
	public static void main(String arg[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection cn=DriverManager.getConnection("jdbc:odbc:abcd");
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("select *from student");
			while(rs.next())
			{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			}
		}catch(Exception e1){}
		System.out.println("Fetch the records Successfully");
	}
}