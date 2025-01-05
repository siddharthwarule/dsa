#include<stdio.h>
#include<stdlib.h>


struct Array{

  int total_size ;
  int used_size ;
  int * arr ;

};

 
 void createArray( struct Array * ptr,int tSize , int uSize){

      ptr->total_size = tSize;

      ptr->used_size = uSize;

      ptr->arr = (int *) malloc(tSize * sizeof(int));

    

 }

void setValue(struct Array * ptr){

     int n = 0 ; 

     for(int i = 0 ; i < ptr->used_size; i++){

            printf("Enter the %d element \n ",i);
            scanf("%d",& n);
            (ptr->arr)[i]= n ;

     }
    
}

void show(struct Array * ptr){


 for(int i = 0 ; i < ptr->used_size; i++){

     printf("%d \n",(ptr->arr)[i]);

 }

}

int main (){

   
   struct Array marks ;


    createArray(&marks,100,10);
    setValue(& marks);
    show(& marks); 

   return 0 ; 
  
}