
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 1, 2, 9}; // Input array
        // insertionSort(arr); // Call the sorting function
        // Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { // Start from the second element
            int key = arr[i]; // Element to be inserted
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Insert the key in the correct position
        }
    }
}
