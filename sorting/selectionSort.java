package sorting;
//in that we can do one swap as per one itration we can select the smaller element and swap

// time complexity  =   O(n^2);


public class selectionSort {

    public static void main(String [] args){

        int arr [] = {4,2,9,2,5,7,2,2};

        for(int i = 0 ; i < arr.length-1;i++ ){

            int smallerIndex = i ; 

            for(int j = i+1 ; j < arr.length; j++ ){

                if (arr[smallerIndex] > arr[j]) {
                   
                    //we got a smaller index
                    smallerIndex = j ; 

                }
                
            }

            //now swap
             int temp = arr[smallerIndex];
             arr[smallerIndex] = arr[i];
             arr[i] = temp;

        }


        for(int i = 0  ; i  < arr.length ; i++){

            System.out.println(arr[i]);
        }


    }
    
}
