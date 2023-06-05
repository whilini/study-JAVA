package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "Seoul Gangnam";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "Geongkido SeongNam";
		
		studentKim.showStudentInfo();
		
	}
	
}
