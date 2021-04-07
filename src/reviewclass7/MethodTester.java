package reviewclass7;

public class MethodTester {

    public static void main(String[] args) {

        MethodsDemo1.method1();
        MethodsDemo1.method2();
        MethodsDemo1.method3();
       // MethodsDemo1.method4(); CE BECAUSE METHOD IS PRIVATE

        MethodsDemo1 methodsDemo1=new MethodsDemo1();
        methodsDemo1.method4();

    }
}
