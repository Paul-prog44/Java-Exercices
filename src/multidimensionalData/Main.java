package multidimensionalData;

public class Main {
	public static String arrayAsString(int[][] array) {
		String numbers ="";
		for (int i = 0; i <array.length; i++) {
			for (int j = 0; j< array[i].length; j++) {
				numbers += array[i][j];
			}
			numbers+= " ";
		}
		return numbers;
	}
	
	
	
	public static void main(String[] args) {
		MagicSquare ms = new MagicSquare();
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};

			System.out.println(ms.sumsOfDiagonals(matrix));
	}
}
