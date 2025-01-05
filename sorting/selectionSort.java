package sorting;

// Implementation of Selection Sort
// In each iteration, we find the smallest element in the unsorted part of the array
// and swap it with the first element of the unsorted part.

// Time Complexity: O(n^2) (due to nested loops)
// Space Complexity: O(1) (in-place sorting)

public class selectionSort {

    public static void main(String[] args) {

        // Input array
        int arr[] = {4, 2, 9, 2, 5, 7, 2, 2};

        // Outer loop for traversing the array
        // After each iteration, one element is sorted in its correct position
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current index has the smallest element
            int smallerIndex = i;

            // Inner loop to find the smallest element in the unsorted part of the array
            for (int j = i + 1; j < arr.length; j++) {

                // If a smaller element is found, update the smallerIndex
                if (arr[smallerIndex] > arr[j]) {
                    smallerIndex = j;
                }
            }

            // Swap the smallest element with the first element of the unsorted part
            int temp = arr[smallerIndex];
            arr[smallerIndex] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
