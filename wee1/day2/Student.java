package wee1.day2;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Student info = new Student();
		System.out.println("Student Info");
        info.studentInfo();
	}
	
	String studentName = "Shaly";
    int rollNumber = 16;
    String collegeName = "KEC";
    int markScored = 88;
    float cGPA = 8.6f;
    
    public void studentInfo() {
    	System.out.println("Student Name: " +studentName);
    	System.out.println("Roll Number: " +rollNumber);
    	System.out.println("College Name: " +collegeName);
    	System.out.println("Mark Scored: " +markScored);
    	System.out.println("CGPA: " +cGPA);
    }
	
	

}
