
public class BubbleSortExample {

    public static void bubbleSort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // Edge case check
        }
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) { // Outer loop
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) { // Inner loop
                if (array[j] > array[j + 1]) {
                    // Swap adjacent elements if they're in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps were made, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 0, 2}; // Input array
        System.out.println("Unsorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSort(numbers); // Call the bubble sort method

        System.out.println("\nSorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
