package sorting;

// Implementation of Bubble Sort
// In each iteration, adjacent elements are compared, and they are swapped if they are in the wrong order.
// The largest element "bubbles up" to its correct position at the end of the array in each iteration.

// Time Complexity: O(n^2) (due to nested loops)
// Space Complexity: O(1) (in-place sorting)

public class bubbleSort {

    public static void main(String[] args) {

        // Input array
        int arr[] = {4, 2, 9, 2, 5, 7, 2, 2};

        // Outer loop for the number of passes
        // After each pass, the largest unsorted element is moved to its correct position
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];

                    arr[j] = arr[j + 1];
                    
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
