package HomePractice;

public class Practice2 {
public static void main(String[] args) {
	
	//Write a program that will print the sum of all elements in 2D array.
	
	int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2, 2},
			{1,-2, 3,-4}
		};
	
  int sum=0;
	for(int r=0; r<a.length; r++){
  
    for(int c=0; c<a[r].length; c++){
     sum= sum+a[r][c];
     
    }    
    System.out.println(sum);
  }

}
}
