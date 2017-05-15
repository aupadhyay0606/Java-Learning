package PrintTwoDigitInteger;

public class PrintTwoDigitNumber {

	public static void main(String[] args) {
		// Considering the number is defined not by the user but is static in this code
		
		String i = "5565699";
		int len = i.length();
		System.out.println("The last 2 digits of "+i+ " is : "+i.substring(len-2));	

	}

}
