package reviewclass8.Constructors;

public class Employee {
    String name;
    String empId;
    String grade;
    String departments;

    public void method1(){
        System.out.println("Important code");
    }

    public Employee(String name, String empId, String grade, String departments) {
       /* this.name = name;
        this.empId = empId;
        this.grade = grade;*/
        this(name,empId,grade);
        this.departments = departments;
        this.method1();
    }

    public Employee(String name, String empId, String grade) {
        /*this.name = name;
        this.empId = empId;*/
        this(name,empId);
        this.grade = grade;

    }

    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;


    }

    public Employee(String name) {
        this();

        this.name = name;

    }

    public Employee() {
        System.out.println("Important line of code, must be executed when ever an object of this class is created");
        System.out.println("Important line of code, must be executed when ever an object of this class is created");
        System.out.println("Important line of code, must be executed when ever an object of this class is created");
        System.out.println("Important line of code, must be executed when ever an object of this class is created");
        System.out.println("Important line of code, must be executed when ever an object of this class is created");
        System.out.println("Important line of code, must be executed when ever an object of this class is created");
        System.out.println("Important line of code, must be executed when ever an object of this class is created");
        System.out.println("Important line of code, must be executed when ever an object of this class is created");

    }

    public static void main(String[] args) {
        Employee employee = new Employee("Roheen", "123", "M4", "IT");
        Employee employee1 = new Employee();
    }
}
