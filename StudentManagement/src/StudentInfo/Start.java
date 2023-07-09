
package StudentInfo;
import java.util.Scanner;
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Welcome to student info");
        while(true)
        {
        	System.out.println("1. Add student");
        	System.out.println("2. Delete student");
        	System.out.println("3. Display student");
        	System.out.println("3. exit ");
        	System.out.println("enter choice ");
        	int c=s.nextInt();
        	if(c==1)
        	{
        		//add
        		System.out.println("enter student id");
        		int id=s.nextInt();
        		s.nextLine();
        		System.out.println("enter student name");
        		String name=s.nextLine();
        		System.out.println("enter student percentage");
        		double percentage=s.nextDouble();
        		Student st=new Student(id,name,percentage);
        		StudentDAO sd=new StudentDAO();
        		sd.insertStudent(st);
        		boolean answer=StudentDAO.insertStudent(st);
        		if(answer)
        		{
        			System.out.println("Student added successfully");
        		}
        		else
        		{
        			System.out.println("something went wrong");
        		}
        		System.out.println(st);
        	}else if(c==2)
        	{
        		//delete
        		System.out.println("enter student id to delete");
        		int uid=s.nextInt();
        		StudentDAO.deleteStudent(uid);
        		boolean ans=false;
        		if(ans)
        		{
        			System.out.println("student delelted successfully");
        		}else
        		{
        			System.out.println("something went wrong");
        		}
        	}else if(c==3)
        	{
        		StudentDAO.displayStudent();
        		//display
        	}else if(c==4)
        	{
        		break;
        		//exit
        	}
        	else
        	{
        	  System.out.println("Wrong choice please enter choce again");	
        	}
        	System.out.println("thank you for using this application");
        }
	}

}
