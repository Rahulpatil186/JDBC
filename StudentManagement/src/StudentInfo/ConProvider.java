package StudentInfo;
import java.sql.*;
public class ConProvider {
	static Connection con;
	public static Connection createcon()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String pass="root";
			String user="root";
			String url="jdbc:mysql://localhost:3306/student";
			con=DriverManager.getConnection(url,user,pass);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}

}
