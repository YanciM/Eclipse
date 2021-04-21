package HomePractice;

public class Repel176 implements Functions{

    @Override
    public void display(double result) {
        System.out.println("Result is :::"+result);
    }
    public void add(double firstNumber, double secondNumber){
        this.display(firstNumber+secondNumber);


    }

    public static void main(String[]args){
        Functions obj=new Repel176();
        obj.add(120.0, 0.0);

    }
}
interface Outputs{
    void display(double result);
}
interface Functions extends Outputs{

    void add(double firstNumber, double secondNumber);
//void sub(double firstNumber, double secondNumber);
//void mult(double firstNumber, double secondNumber);
//void div(double firstNumber, double secondNumber);

}
