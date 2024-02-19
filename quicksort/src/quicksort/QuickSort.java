package quicksort;



public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array into two halves and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = arr[high];

        // Index of the smaller element
        int i = low - 1;

        // Traverse the array and swap elements such that elements smaller than the pivot
        // are moved to the left and elements greater than the pivot are moved to the right
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Swap the pivot element with the element at (i+1) to place the pivot in its correct position
        swap(arr, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] myArray = {12, 11, 13, 5, 6, 7};
        int n = myArray.length;

        System.out.print("Original array: ");
        for (int i : myArray) {
            System.out.print(i + " ");
        }

        quickSort(myArray, 0, n - 1);

        System.out.print("\nSorted array: ");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }
}
