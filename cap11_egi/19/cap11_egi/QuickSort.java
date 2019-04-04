package cap11_egi;

import java.util.Arrays;

// Java program for implementation of QuickSort 
/*This code is contributed by Rajat Mishra */
class QuickSort {
	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or equal to pivot
			if (arr[j] <= pivot) {
				i++;
				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	void sort(int arr[]) {
		sort(arr,0,arr.length - 1);
	}
	
	/**
	 * The main function that implements QuickSort() 
	 * @param arr[] --> Array to be sorted,
	 * @param low --> Starting index, 
	 * @param high --> Ending index
	 */
	void sort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}


	// Driver program
	public static void main(String args[]) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		QuickSort ob = new QuickSort();
		ob.sort(arr);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(arr));
	}
}
