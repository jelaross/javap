import java.sql.*;
class connection
{
	public static void main(String arg[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection cn=DriverManager.getConnection("jdbc:odbc:abcd");
		Statement st=cn.createStatement();
		}catch(Exception e1){}
		System.out.println("Connection Successfully Completed");
	}
}