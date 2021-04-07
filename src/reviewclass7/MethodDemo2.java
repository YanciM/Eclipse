package reviewclass7;

public class MethodDemo2 {

    static void methodWithStaticModifier(){
        System.out.println("Can call me by just writing name of the class");

       // instanceMethod(); need to create the object of this class to call
    }

    void instanceMethod(){
        System.out.println("Create an object of my class if you want to call me outside of this class, or in the static methods");

        methodWithStaticModifier();  // I can call it because static members belong to the class, not to instance/object
    }

    void instanceMethod2(){

        methodWithStaticModifier();
        instanceMethod();
        String [] a={"can call main method as well"};
        main(a);  // main method as well
    }

    public static void main(String[] args) {

        methodWithStaticModifier();
    }
}
