public class MergeSort {

	void sort(int arr[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2; // Find the middle element
			sort(arr, start, mid);// Sort first half
			sort(arr, mid + 1, end); // Sort second half
			mergeSort(arr, start, mid, end); // Merge the sorted halves
		}
	}

	void mergeSort(int arr[], int start, int mid, int end) {
		
		// Find sizes of two subarrays to be merged
		int l = mid - start + 1;
		int r = end - mid;
		int LeftArray[] = new int[l]; // Create Temp arrays
		int RightArray[] = new int[r];
		
		// Copy data to temp arrays
		for (int i = 0; i < l; i++) {
			LeftArray[i] = arr[start + i];
		}
		for (int j = 0; j < r; j++) {
			RightArray[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0; // Initial indexes of first and second sub arrays
		int k = start; // Initial indexes of merged Sub arrays

		while (i < l && j < r) {
			if (LeftArray[i] <= RightArray[j]) {
				arr[k] = LeftArray[i];
				i++;
			} else {
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < l) { // Checking if any element left for LeftArray
			arr[k] = LeftArray[i];
			i++;
			k++;
		}
		while (j < r) { // Checking if any element left for RightArray
			arr[k] = RightArray[j];
			j++;
			k++;
		}
	}

	public static void main(String args[]) {
		int arr[] = { 5, 2, 8, 3, 9, 1, 7, 4 };
		MergeSort ob = new MergeSort();
		System.out.println("Given Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		ob.sort(arr, 0, arr.length - 1);
		System.out.println("\nSorted Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
