package reviewclass8.inheritance;





public class ParentTester {
    public static void main(String[] args) {
        Child child=new Child("12345","Yanci");
        child.method2();
        System.out.println("------------------------------");
       GrandChild grandChild=new GrandChild("12345","Bella");
       grandChild.method2();
    }
}
