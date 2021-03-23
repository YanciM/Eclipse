package HomePractice;

public class Practice3 {
public static void main(String[] args) {
	
	int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		 
    int sum=0;
		 for(int r=0; r<a.length; r++){
       if(r%2!=0){
         continue;

       }
       
       for(int c=0; c<a[r].length; c++){
         if(a[r][c]%2==0){
        	 
           System.out.println(a[r][c]);
          
         }
        
      
       
         
       }
     

     }
		 
		
}
}
