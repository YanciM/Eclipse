package HomePractice;

public class Practice1 {
	public static void main(String[] args) {

		// Write a program that prints the total number of elements that are negative
		// AND odd

		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		int odd = 0;
		for (int r = 0; r < a.length; r++) {

			for (int c = 0; c < a[r].length; c++) {

				if (a[r][c] % 2 != 0 && a[r][c] < 0) {

					odd++;
				}

			}
		}
		System.out.println(odd);
		
		System.out.println("----------------------------------------------");
		
		
		
	}
}
