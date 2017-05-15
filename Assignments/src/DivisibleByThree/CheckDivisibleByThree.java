package DivisibleByThree;

public class CheckDivisibleByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A number is divisible by 3 if the sum of the digits of that number
		// is a multiple of 3 or is completely divisible by 3 anyways
		
				System.out.println("Listing numbers divisible by 3: ");
				for (int i = 10;i<=100;i++) {
				
				if (i%3==0) {
					System.out.println(i);
					}		
				}

	}

}
