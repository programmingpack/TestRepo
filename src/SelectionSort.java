
public class SelectionSort {

	public static void main(String args[]) {
		SelectionSort ob = new SelectionSort();
		int arr[] = { 7, 4, 18, 68, 90, 3 };
		ob.selectionSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i <= n - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[smallest])
					smallest = j;

				int temp = arr[smallest];
				arr[smallest] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
