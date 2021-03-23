package reviewclass2;

public class IfBlocks {
	
	public static void main(String[] args) {
		
	int num1=10;
		
		if (num1%5==0) {
			System.out.println("Number is divisible by 5");
			
		}else {
			if (num1%2==0) {
				System.out.println("Number is divisible by 2");
			}else {
				
			}
		}
		
		
		System.out.println("------------------------------------------");
		
		if (num1%5==0) {
			System.out.println("Number is divisible by 5");{
				
				
			}if (num1%2==0) {
				System.out.println("Number is divisible by 2");
				
			}if (num1%10==0) {
				System.out.println("Number is divisible by 10");
			}
		}
		
	}

}
