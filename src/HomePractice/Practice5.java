package HomePractice;

public class Practice5 {

	 String newLine;
	  String displayLine;

	  public String printOut() {
	    return newLine;
	  }

	  public String printOut1() {
	    return displayLine;
	  }

	  public static void main(String[] args) {

	    Practice5 statement = new Practice5();
	    statement.newLine = "newLine method implementation";
	    statement.displayLine="displayLine method implementation";
	    System.out.println(statement.printOut());
	    System.out.println(statement.printOut1());

	   

	  }
}
