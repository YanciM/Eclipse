package com.class07;

public class Debug {
public static void main(String[] args) {
	
	System.out.println(" --------------WHAT IS THE OUTPUT ??----------------");
    int sum = 0;
    for (int i = 1; i <= 5; i++) {
        sum = sum + i;
    }
    System.out.println(sum);
    System.out.println();
    
    
    System.out.println(" --------------WHAT IS THE OUTPUT ??----------------");
    int result = 0;
    for (int i = 2; i < 10; i += 2) {
        result += i;
        
    }
    System.out.println(result);

}
}
