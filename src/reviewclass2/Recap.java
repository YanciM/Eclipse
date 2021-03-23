package reviewclass2;

public class Recap {
	
	public static void main(String[] args) {
		
		byte num=10;
		byte num3=10;
		short num2=(short)(num+10);
		char letter='A';  //a char can be stored in int
		int numberLetter=letter+100;
		System.out.println(numberLetter);
		int num4=num+10;
		
		//always try to use int for whole numbers
		//always try to use doubles for decimals
		
		byte number1=10;
		short number2=number1;  // a smaller value can easily fit in a larger value, no need to manually covert 
		int number3=number2;
		long number4=number3;
		
		number3=(int)number4;
		
		
	    
		
		
		
		
		
	}

}
