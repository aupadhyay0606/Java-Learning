package GratestNumber;

public class CheckGreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 93;
		int num2 = 100;
		int num3 = 200;
		
		if (num1 > num2) {
			if (num1>num3) {
				System.out.println("The greatest number is : "+num1);
			}
		}
		else if (num2>num1){
			if (num2>num3) {
				System.out.println("The greatest number is : "+num2);
			}
			else {
				System.out.println("The greatest number is : "+num3);
			}
		}	
	}
}

