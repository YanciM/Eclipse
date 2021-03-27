package reviewclass6;

public class StringBuilderDemo {




    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("Hello");
        //stringBuilder.append("Batch 9").delete(0,5);
       // stringBuilder.append("Batch 9").deleteCharAt(0);
        //stringBuilder.append("Batch 9").insert( 12, "Bye");
        stringBuilder.append("Batch 9").append(" How are you Jack");
        stringBuilder.insert(stringBuilder.indexOf("you")+4, "bye ");
        System.out.println(stringBuilder.indexOf("you"));

        System.out.println(stringBuilder);


        String string=new String("Hello");
        string=string.concat("Batch 9");
        System.out.println(string);


    }
}
