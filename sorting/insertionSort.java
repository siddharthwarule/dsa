package sorting;

// In this implementation, we divide the array into a sorted and an unsorted part. 
// We take elements from the unsorted part and place them in the correct position in the sorted part.

public class insertionSort {

    public static void main(String[] args) {

        int arr[] = {12, 5, 7, 9, 3, 8, 3};

        // Insertion sort logic
        // for (int i = 1; i < arr.length; i++) {

        //     int current = arr[i]; // Element to be placed in the sorted part

        //     int j = i - 1; // Index of the last element in the sorted part

        //     // Shift elements of the sorted part to the right to make room for the current element
        //     while (j >= 0 && current < arr[j]) {

        //         arr[j + 1] = arr[j];
        //         j--; // Move backward

        //     }

        //     // Place the current element in the correct position
        //     arr[j + 1] = current;
        // }



        for(int i = 1 ; i < arr.length; i++){

            int current = arr[i];

            int j = i - 1 ;

            while (j >= 0 && arr[j] > current ) {

                arr[j+1]  = arr[j];
                j--;
                
            }

            arr[j+1] = current; 


        }


        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
