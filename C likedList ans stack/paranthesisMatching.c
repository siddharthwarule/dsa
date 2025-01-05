#include<stdio.h>
#include<stdlib.h>


struct stack{

  int size;
  int top ;
  char * arr;

};


int stackIsEmpty(struct stack * sp){

    if(sp->top=-1){

     return 1; 

    }else{

        return 0 ;
    }
}

 void push(struct stack * sp,int value){

     sp->top++;
    
     sp->arr[sp->top]=value;

 }

 void pop(struct stack * sp){

    sp->top--;   

 }

//__________________________________________________________________________________________________________________
 int parenthesisMatch(char * arr){
     
   struct stack * sp = (struct stack *)malloc(sizeof(struct stack));

    sp->size = 50 ;
    sp->top = -1  ;
    sp->arr = (char *)malloc(sp->size*sizeof(char)); 


    for(int i =0 ; i <=4;i++){

        printf("%c \n",arr[i]);

     if(arr[i]=='('){

       push(sp,arr[i]);

     }else if(arr[i]==')'){

         
    if(stackIsEmpty(sp)){

        return 0;

    }else{

        pop(sp);
    }

    if(stackIsEmpty(sp)){
        return 1; 
    }else{

     return 0 ;

    }

    }
    }

 }
//__________________________________________________________________________________________________________________


int main(){
 
    char arr[]="(s)))";

   if( parenthesisMatch(arr)){

   printf("Paranthesis are Nutral");

   }else{

   printf("Paranthesis are Not Nutral");
     

   }
      return 0; 
}