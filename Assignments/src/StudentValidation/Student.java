package StudentValidation;

public class Student {
	
	private int rollNo;
	private String name;
	private float marks1;
	private float marks2;
	private float marks3;
	
	public Student(int rollNo, String name, float marks1, float marks2,
			float marks3) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getMarks1() {
		return marks1;
	}


	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}


	public float getMarks2() {
		return marks2;
	}


	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}


	public float getMarks3() {
		return marks3;
	}


	public void setMarks3(float marks3) {
		this.marks3 = marks3;
	}


	public void show() {
		
		System.out.println("==================================");
		System.out.println("Student Details : ");
		System.out.println("Roll No :"+ this.getRollNo());
		System.out.println("Student Name :"+ this.getName());
		System.out.println("Marks1 :"+ this.getMarks1());
		System.out.println("Marks2 :"+ this.getMarks2());
		System.out.println("Marks3 :"+ this.getMarks3());
		System.out.println("==================================");
		
	}
	
}
