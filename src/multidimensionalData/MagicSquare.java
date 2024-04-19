package multidimensionalData;

import java.util.ArrayList;

public class MagicSquare {
	ArrayList array = new ArrayList<>();
	
	public ArrayList<Integer> sumsOfRows(int[][] array) {
		for (int i = 0;i<array.length; i++) {
			int sum=0;
			for(int j = 0; j<array[i].length; j++) {
				sum += array[i][j];
			}
			this.array.add(sum);
		}
		
		return this.array;
	}
	
	public ArrayList<Integer> sumsOfColumns(int[][] array) {
		for (int i = 0;i<array.length; i++) {
			int sum=0;
			for(int j = 0; j<array[i].length; j++) {
				sum += array[j][i];
			}
			this.array.add(sum);
		}
		
		return this.array;
	}
	
	public ArrayList<Integer> sumsOfDiagonals(int[][] array) {
		int diagSum1=0;
		for(int i =0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				diagSum1+= array[i][i];
			}
		}
		this.array.add(diagSum1);

		int diagSum2=0;
		for (int i = array.length-1; i>0 ;i--) {
			for(int j = 0 ; j<array[i].length ; j++) {
				diagSum2+=array[i][j];
			}
		}
		this.array.add(diagSum2);
		
		return this.array;
	}

}
