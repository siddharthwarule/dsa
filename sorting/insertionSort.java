package sorting;

// in that we can make to partation one is sorted array and one is unsorted array and take element and placed in sorted array 

public class insertionSort {
    
    public static void main(String[] args) {
      
        // for(int i = 1 ; i < arr.length; i++){   

        //     int current = arr[i];

        //     int j = i-1;

        //     while (j >= 0 && current < arr[j] ) {
                
        //         arr[j+1] = arr[j];
        //         j--;

        //     }

        //     arr[j+1] = current;
        // }


                      //  j    i
            int arr [] = {12 , 5  , 7 , 9 , 3 , 8, 3 };
                      //       c

        for(int i = 1 ; i < arr.length; i++){

            int current = arr[i];
    
             int j = i - 1 ;

             while (j >= 0 && current < j ) {
                
                 arr[j] = arr[j+1];
                
             }

              

        }

        
        for(int i  = 0 ; i < arr.length; i++ ){

            System.out.println(arr[i]);

        }

    }
}