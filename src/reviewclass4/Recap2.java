package reviewclass4;

public class Recap2 {
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		i=i+j+20;
		System.out.println("int =10;\n"+i);
		i=i+j+10;
		System.out.println("int =10;\n"+i);
		i++;  //i=i+10+i
		System.out.println("int =10;\n"+i);
		i++;
		System.out.println("int =10;\n"+i);
		
		
		
		i=10;
		System.out.println("++i "+(++i));   //first increment the value then use it
		System.out.println("i++ "+(i++));   // first use the value then increment
		System.out.println("i "+i);         // in the next line updated value will reflect in i
		
	}

}
