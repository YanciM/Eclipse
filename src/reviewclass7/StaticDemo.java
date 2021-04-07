package reviewclass7;

public class StaticDemo {

    //count how many times and object is called

    static int sum;
    StaticDemo(){
        sum++;
    }

    static void printTotalObjectsCreated(){
        System.out.println(sum);
    }
}
