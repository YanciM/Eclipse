package HomePractice;

public class Practice {
	public static void main(String[] args) {

		double[][] a = { { 1.4, 2.0, 3.3, 2 }, { 4., 1.5, 6.1, 1 }, { 1.2, 3.1, 4, 1.6 } };

		// Double and print array

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {

				System.out.print(a[r][c] * 2 + " ");

			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------------");
		
		 int[][] arr = {
	                {5,2,3,7},
	                {1,5,1,1},
	                {8,3,1,2}
	        };
	        // Initialize maximum element
	        int max = arr[0][0];

	        // Traverse array elements from second and
	        // compare every element with current max
	        for (int [] arr1:arr
	             ) {
	            for (int element:arr1
	                 ) {
	                if(element>max){
	                    max=element;
	                }
	            }
	        }

	        System.out.print(max);
	        
	        System.out.println("-----------------------------------------------------------");
	        
	  
	}

}
