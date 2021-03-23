package reviewclass3;

public class LogicalOperators {

	public static void main(String[] args) {
		
		/*
		 * Logical operators are used to combine multiple conditions in the same if block
		 */
		
		//Without logical operators
		String day="Monday";
		if("Sunday".equals(day)) {
			System.out.println("Relax its weekend, dont blink otherwise its over");
			
		}else if(day.equals("Saturday")) {
			System.out.println("Relax its weekend, dont blink otherwise its over");
			
		}else {
			System.out.println("I have to go to work");
		}
		
		
		//Using logical operators
		if("Sunday".equals(day) || day.equals("Saturday")) {
			System.out.println("Relax its weekend, dont blink otherwise its over");
			
		}else {
			System.out.println("I have to go to work");
		}
	}

}
