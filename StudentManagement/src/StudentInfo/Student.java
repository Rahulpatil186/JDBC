package StudentInfo;

public class Student {
	private int studentid;
	private String studentname;
	private double percentage;
	public Student(int studentid, String studentname, double percentage) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.percentage = percentage;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", percentage=" + percentage + "]";
	}
	

}
