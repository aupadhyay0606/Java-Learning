package PrintDigit;

public class PrintDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2;
		String digitWord = null;
		
		switch(i) {
		
		case 0: digitWord = "Zero";
				break;
		
		case 1: digitWord = "One";
				break;
		
		case 2: digitWord = "Two";
				break;
		
		case 3: digitWord = "Three";
				break;
		
		case 4: digitWord = "Four";
				break;
		
		case 5: digitWord = "Five";
				break;
		
		case 6: digitWord = "Six";
				break;
		
		case 7: digitWord = "Seven";
				break;
		
		case 8: digitWord = "Eight";
				break;
		
		case 9: digitWord = "Nine";
				break;
		
		default : System.out.println("Please pass a single digit");
		        break;
		
		}
		System.out.println("Your Digit in Word is : "+digitWord);	
	}

}
