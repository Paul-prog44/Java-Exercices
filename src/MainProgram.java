import java.util.ArrayList;
import java.util.Arrays;

public class MainProgram {
	
	
	public static int smallest(int[] array) {
		int smallestInArray = array[0];
		
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallestInArray) {
				smallestInArray = array[i];
			}
		}
		return smallestInArray;

	}
	
	public static int indexOfSmallest(int[] array) {
		int smallestInArray = array[0];
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallestInArray) {
				smallestInArray = array[i];
				index = i;
			}
		}
		return index;

	}
	
	public static int indexOfSmallestFrom(int[] array, int startIndex) {
		int smallestInArray = array[startIndex];
		int index =startIndex;
		
		for (int i = startIndex; i < array.length; i++) {
			if (array[i] < smallestInArray) {
				smallestInArray = array[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void swap(int[]array, int index1, int index2) {
		int tampon = array[index1];
		array[index1] = array[index2];
		array[index2] = tampon;
	}
	
	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			swap(array, indexOfSmallestFrom(array,i), i);
			System.out.println(Arrays.toString(array));
		}
	}
}
