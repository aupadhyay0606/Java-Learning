package StudentValidation;

public class Validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("========Creating new students============");
		
		Student abhi = new Student(1,"Abhi",43.5f,32.5f,66.5f);
		Student rahul = new Student(2,"Rahul",67.5f,32.5f,42.5f);
		Student rohit = new Student(3,"Rohit",19.5f,23.5f,23.5f);
		Student suresh = new Student(4,"Suresh",42.5f,20.5f,98.5f);
		
		System.out.println("========Students Created============");
		
		System.out.println("===========Validating abhi=============");
		
		abhi.show();
		Validator(abhi);
		
		System.out.println("===========Validating rahul=============");
		
		rahul.show();
		Validator(rahul);
		
		System.out.println("===========Validating rohit=============");
		
		rohit.show();
		Validator(rohit);
		
		System.out.println("===========Validating suresh=============");
		
		suresh.show();
		Validator(suresh);	
		
	}
	
	
	public static void Validator (Student s) {
		
		
		System.out.println("===========Validation Started=============");
		
		if (s.getMarks1()<40) {
			s.setMarks1(40);
		}
		
		if (s.getMarks2()<40) {
			s.setMarks2(40);
		}
		
		if (s.getMarks3()<40) {
			s.setMarks3(40);
		}
		
		System.out.println("===========Validation Ended=============");
		

		System.out.println("===========Printing New Details==========");
		
		s.show();
	}

}
