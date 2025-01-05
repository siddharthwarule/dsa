// #include<stdio.h>
// #include<stdlib.h>

// struct stack{

//  int size;
//  int top ;
//  int * arr ;

// };

//  int stackIsEmpty(struct stack * sp){

//    if(sp->top == -1){

//     return 1;

//    }else{
    
//     return 0;
//    }
//  }


//  int stackIsFull(struct stack * sp){

//    if(sp->top == sp->size-1){

//       return 1;

//    }
//    else{

//     return 0 ;
//    }

//  }


// void push(struct stack * sp , int value){

//      if(stackIsFull(sp)){

//         printf("Stack is Overflow");

//      }else{

//        sp->top++;
//        sp->arr[sp->top]=value;
       
//      }
// }



// int pop(struct stack * sp){

//     if(stackIsEmpty(sp)){

//           printf("Stack Underflow");

//     }else{

//        int value = sp->arr[sp->top];
//        sp->top--;
//        return value;

//     }
// }


// int peak(struct stack * sp,int i){
 
//      if(sp->top+1-i < 0){

//         printf("Not a valid position");

//         return -1;

//      }else{

//         return sp->arr[sp->top-i];     
     
//      }
// }

//  int stackTop(struct stack * sp){

//      return sp->arr[sp->top];

//  }

//  int stackBottom(struct stack * sp){
  
//   return sp->arr[0];

//  }



//     int main(){

//     struct stack * sp = (struct stack *)malloc(sizeof(struct stack));
    
//     sp->size = 50 ;

//     sp->top = -1  ;

//     sp->arr = (int *) malloc(sp->size*sizeof(int));

//     push(sp,10);
//     push(sp,20);
//     push(sp,30);
//     push(sp,40);
//     push(sp,50);



//    printf("Stack Top : %d \n",stackTop(sp));

//    printf("Stack Bottom : %d \n",stackBottom(sp));


    

// for(int i=0; i<=sp->top ; i++){
 
//     printf("The Value Of Position : %d is : %d \n",i+1,peak(sp,i));         

// }

//   printf("after pop first 2 \n");

//     pop(sp);
//     pop(sp);

//    printf("Stack Top : %d \n",stackTop(sp));

//    printf("Stack Bottom : %d \n",stackBottom(sp));
  

// for(int i=0; i<=sp->top ; i++){
 
// printf("The Value Of Position : %d is : %d \n",i+1,peak(sp,i));         

// }


//     return 0;

// }


#include<stdio.h>
#include<stdlib.h>


struct stack{

  int size ;
  int top  ;
  int * arr;

};



void push(struct stack * sp,int data){

   sp->top++;

   sp->arr[sp->top]=data; 

}

int pop(struct stack * sp){

   int value = sp->arr[sp->top];

   sp->top--;

   return value;
   
}

int peak(struct stack * sp,int index){

    if(sp->top-index <0){

    return -1;

    printf("not a valid position");

    }
    
  return sp->arr[sp->top-index];

}

void stackTop(struct stack * sp){

   printf("Stack Top is : %d \n",sp->arr[sp->top]);

}


void stackBottom(struct stack * sp){

   printf("Stack Bottom is :%d \n",sp->arr[0]);

}


int main(){

    struct stack * sp = (struct stack *)malloc(sizeof(struct stack));

       sp->size=50;
       sp->top=-1;
       sp->arr = (int *)malloc(sp->size * sizeof(int));


       push(sp,10);
       push(sp,20);
       push(sp,30);
       push(sp,40);
       push(sp,50);

     printf("This value is Poped : %d \n", pop(sp));
  
        stackTop(sp);
       stackBottom(sp);

    for(int i= 0 ; i <= sp->top;i++){

         printf("%d \n",peak(sp,i));

    }

   return 0;

}

