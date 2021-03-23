package reviewclass2;

public class Demo2 {
	
	public static void main(String[] args) {
		
		int number1=15;
		if (number1%5==0) {
			
			System.out.println("Number is divisible by 5");
			
		}else {
			System.out.println("Number is not divisible by 5");
		}
		
		
		System.out.println("---------------------------------------------------------------");
		
		int num1=15;
		
		if (num1%5==0) {
			System.out.println("Number is divisible by 5");
			
			if(num1%2==0) {
				System.out.println("Number is divisible by 2");
				
				if(num1%10==0) {
					System.out.println("Number is divisible by 10");
				}
			}
		}
		
	}

}
