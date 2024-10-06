import java.sql.*;
class RecDel
{
	public static void main(String arg[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection cn=DriverManager.getConnection("jdbc:odbc:abcd");
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("delete student where sid=2");
		}catch(Exception e1){}
		System.out.println("Record Successfully Deleted");
	}
}