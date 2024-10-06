import java.sql.*;
class RecFind
{
	public static void main(String arg[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection cn=DriverManager.getConnection("jdbc:odbc:abcd");
		Statement st=cn.createStatement();           	
            
            	ResultSet rs=st.executeQuery("SELECT sname,dep FROM student WHERE sid=4");
			while(rs.next())
			{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			}



		}catch(Exception e1){}
		System.out.println("Record Successfully fetched");
		

	}
}