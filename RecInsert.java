import java.sql.*;
class RecInsert
{
	public static void main(String arg[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection cn=DriverManager.getConnection("jdbc:odbc:abcd");
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("INSERT INTO student(sid, sname, dep) VALUES (4, 'Harish', 'Physics')");
		}catch(Exception e1){}
		System.out.println("Records Successfully Inserted");
	}
}