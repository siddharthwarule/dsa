#include<stdio.h>


void printArray(int * A, int n){

  for(int i = 0;i < n; i++){

      printf("%d ",A[i]);

  }

  printf("\n");

}
    // sorted portion      unsorted
//     12,13,14,76,90,|33,32,35

// key = 33 ;

// j = 90 to 12 array

//get on element 33 and insert it on its position then get anotjer number and insert on its position

void  insersionSort(int * A , int n){

   int key ,j ;

   for(int i = 0 ; i < n ; i++){

         key = A[i];

         j = i - 1 ;

         while(j >= 0 && A[j] > key){

            A[j+1] = A[j];    

            j--;           

         }

         A[j+1] = key;

   }


}

void bobbleSort(int * A , int n){


        int temp = 0 ;

}

void bobbleSort(int * A,int n){

      int temp = 0;

   for(int i = 0 ; i < n ;i++){   //for number of pass

       for(int j = 0; j<n-1-i; j++){
         
         if(A[j]>A[j+1]){

              temp = A[j];
              A[j] =A[j+1];
              A[j+1] = temp;

         }

       }
   }

}



int main(){

   int A[] = {12,13,14,76,90,33};
   int n  = sizeof(A)/sizeof(int);
    
   printArray(A,n);

//    insersionSort(A,n);
       bobbleSort(A,n);

   printArray(A,n);

   
    return 0;
}