package reviewclass10.interfaces;

public interface Interface1I {

    int number1=10;

    void method1();

    default void method(){
        System.out.println("method 1");
    }

    static void method3(){
        System.out.println("static method");
    }

}
