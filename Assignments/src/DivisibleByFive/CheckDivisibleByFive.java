package DivisibleByFive;

public class CheckDivisibleByFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12245;
		int temp = (num/10)*10;
		int lastDigit = num-temp;
		
		
		if (lastDigit == 5 || lastDigit == 0) {
			
			System.out.println("Number is divisible by 5");
		}
		else {

			System.out.println("Number is not divisible by 5");
		}
	}

}
