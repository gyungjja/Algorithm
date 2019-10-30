package week11;

import java.util.Arrays;

public class SortMain_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 1, 9, 8, 4};
		int arr_select[] = Arrays.copyOf(arr,  arr.length);
		int arr_bubble[] = Arrays.copyOf(arr,  arr.length);
		int arr_insert[] = Arrays.copyOf(arr,  arr.length);
		
		System.out.println("Base Array =>");
		for(int i = 0; i < arr.length; i++)
			System.out.print("| " + arr[i] + " |");
		System.out.println("\n");
		
		Sorting.selectionSort(arr_select);
		Sorting.bubbleSort(arr_bubble);
		Sorting.insertionSort(arr_insert);

	}
	

}