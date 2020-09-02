
public class BubbleSort {

	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

	}

	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int arr[] = { 10, 4, 5, 3, 5, 2 };
		ob.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Sorted Array" + arr[i]);
		}
	}
}
