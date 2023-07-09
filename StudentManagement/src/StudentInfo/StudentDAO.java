package StudentInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class StudentDAO {
	
 public static boolean insertStudent(Student st)
 {
	 boolean f=false;
	 try {
		 Connection con=ConProvider.createcon();
		 String query="insert into studentinfo(id,name_,percentage) values(?,?,?)";
		 PreparedStatement pst=con.prepareStatement(query);
		 pst.setInt(1,st.getStudentid());
		 pst.setString(2,st.getStudentname());
		 pst.setDouble(3,st.getPercentage());
		 pst.executeUpdate();
		 f=true;
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return f;
 }

public static boolean deleteStudent(int uid) {
	// TODO Auto-generated method stub
	boolean f=false;
	 try {
		 Connection con=ConProvider.createcon();
		 String query="delete from studentinfo where id=?";
		 PreparedStatement pst=con.prepareStatement(query);
		 pst.executeUpdate();
		 f=true;
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return f;
}

public static void displayStudent() {
	try {
		 Connection con=ConProvider.createcon();
		 String query="select * from studentinfo";
		 Statement pst=con.createStatement();
		ResultSet rs= pst.executeQuery(query);
		while(rs.next())
		{
			
			System.out.println("id :"+rs.getInt(1)+"\n Name :"+rs.getString(2)+"\n percentage :"+rs.getDouble(3));
			
			
		}
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	// TODO Auto-generated method stub
	
}
}
