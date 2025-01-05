// #include<stdio.h>
// #include<stdlib.h>

// struct Node {

//  int data ; 
//  struct Node * next ; 
 
// };


// // ------------------------------------INSERTION---------------------------------



// struct Node * insertAtIndex(struct Node * head, int index, int value){

//           struct Node * n = (struct Node *)malloc(sizeof(struct Node));
//           n->data = value ;

//          struct Node * ptr  = head;

//             int i = 0 ;

//             while(i <= index - 1){

//                ptr = ptr->next;
//                i++;
               
//                }

//             n->next = ptr ->next; 
//             ptr->next = n;

//             return head;

// }


// struct Node * insertFirst(struct Node * head , int value){

//         struct Node * n = (struct Node *)malloc(sizeof(struct Node));
//         n->data = value; 

//         n->next = head ;
//         head = n ;
//         return head ; 

//    }

//     struct Node * insertLast(struct Node * head , int value){


//         struct Node * n = (struct Node *) malloc(sizeof(struct Node));
//         n->data = value; 
    

        
//           struct Node * p = head ;

//           while(p->next != NULL){

//                 p = p ->next; 
           
//              }
        
//             p->next = n ; 
//             n->next = NULL;
              
//               return head;
 
//     }


// void linkedListTraversed(struct Node * head){

//     while(head != NULL){

//       printf("%d \n" , head->data);
//        head  = head->next ; 

//     }

// }


// // ------------------------------------DELETION ---------------------------------

// //delete first

// struct Node * deleteFirst(struct Node * head){

//    struct Node * ptr = head;
   
//    head = ptr->next;
 
//    free(ptr);

//    return head;

// }

// //delete last

// struct Node * deleteLast(struct Node * head){

//      struct Node * p = head;
//      struct Node * q = head->next;


//      while(q->next != NULL){

//         p = p->next;
//         q = q->next;

//      }

//     p ->next = NULL;

//     free(q);

//     return head;

    
// }



// struct Node * deleteAtIndex(struct Node * head, int index){

//         struct Node * p = head;
//         struct Node * q = head->next;

//        for(int i = 0 ; i < index-1 ; i++ ){

//                 p = p->next;
//                 q = q->next;

//        }

//        p ->next = q->next;

//        free(q);

//        return head;
        
// }


// struct Node * deleteByValue(struct Node * head , int value){

//      struct Node * p = head;

//      struct Node * q = head->next;

//      while(q->data != value && q->next != NULL){

//          p = p->next;
//          q = q->next;

//      }

//      p->next = q->next ;
//       free(q);

//       return head;     

// }


// int main(){

//       struct Node * head ;
//       struct Node * second ;
//       struct Node * third;
//       struct Node * fourth ;


//        head   = (struct Node *)malloc(sizeof(struct Node));
//        second = (struct Node *)malloc(sizeof(struct Node));
//        third  = (struct Node *)malloc(sizeof(struct Node));
//        fourth = (struct Node *)malloc(sizeof(struct Node));


//          head ->data = 10 ;
//          head ->next = second;

//          second->data = 20 ;
//          second->next = third;

//          third->data = 30 ;
//          third->next = fourth;

//         fourth->data = 40 ;
//         fourth->next = NULL;
        
//          printf("-----------before insertion----------------\n");

//          linkedListTraversed(head);

//         //  insert first  
//         head = insertFirst(head,5);

//          printf("-----------after insertion at first-----------------\n");

//          linkedListTraversed(head);

//          printf("-----------before insertion at last----------------\n");

//          linkedListTraversed(head);

//         //  insert Last  

//           head = insertLast(head,50);

//          printf("-----------after insertion at last-----------------\n");

//          linkedListTraversed(head);

//          printf("-----------before insertion at index 3----------------\n");

//          linkedListTraversed(head);
 
//         head =  insertAtIndex(head,3,30);
        

//          printf("-----------after insertion at index 3----------------\n");
   
//          linkedListTraversed(head);

//          printf("-----------after deleting first index----------------\n");


//          head = deleteFirst(head);
         
//          linkedListTraversed(head);

//          printf("-----------after deleting last index----------------\n");
 
//          head = deleteLast(head);

//          linkedListTraversed(head);


//          printf("-----------after deleting the 3 index----------------\n");

//          head = deleteAtIndex(head,3);

//          linkedListTraversed(head);     


//          printf("-----------after deleting the 20 value----------------\n");

       
//        head = deleteByValue(head,20);

//        linkedListTraversed(head);

//          return 0 ; 
// }


#include<stdio.h>
#include<stdlib.h>

 struct Node{

   int data;
   struct Node * next;

 };


 void printLinkedList(struct Node * head){

    while(head != NULL){
          
       int data = head->data;

       printf("%d ",data);

       head=head->next;

             }
       }


// struct Node * insertAtFirst(struct Node * head,int data){
    
//       struct Node * n = (struct Node *)malloc(sizeof(struct Node));

//          n->data = data;

//          n->next = head;

//          head = n ;

//          return head;
     
// } 

struct Node * insertAtFirst(struct Node * head , int data){

   printf("\nINSERT AT THE FIRST : %d \n",data);
    struct Node * n = (struct Node *) malloc(sizeof(struct Node));

    n->data = data; 

    n->next = head;

    head = n ; 

    return head;


}

// struct Node * insertAtLast(struct Node *head,int data){
      
//       struct Node * n = (struct Node *)malloc(sizeof(struct Node));
        
//         n->data = data;

//         struct Node * ptr = head;

//         while(ptr->next != NULL){
         
              
//               ptr = ptr->next;

//         }

//         ptr->next = n;
//         n->next = NULL;

//         return head;
// }


struct Node * insertAtLast(struct Node * head , int data){

      printf("\n INSERT AT THE LAST THE %d \n",data);

   struct Node * n = (struct Node *)malloc(sizeof(struct Node));

   n->data  = data ; 

   struct Node * ptr = head ; 

   while(ptr->next != NULL){
   
      ptr = ptr ->next;

   }

   ptr ->next = n; 

   n -> next = NULL;

   return head ; 
}

//  struct Node * insertAtIndex(struct Node * head,int data,int index){

//        struct Node * n = (struct Node *)malloc(sizeof(struct Node));
//        n->data = data;

//       struct Node * ptr = head;

//           int i = 0;
//         while(i != index-1){
           
//             ptr = ptr->next;
      
//             i++;
//         }

//         n->next = ptr->next;
//         ptr->next = n;


//         return head;


//   }


 struct Node * insertAtIndex(struct Node * head,int data,int index){

  struct Node * n = (struct Node *) malloc(sizeof(struct Node));
  
  struct Node * ptr = head ; 
  n->data  = data ;

  int  i  =  0;
 
  while(i != index-1){

   ptr = ptr->next ; 
      
  }

  n->next = ptr->next ; 

  ptr->next = n;

  return head ;    

  }

 

 int main(){

   struct Node * head;
   struct Node * second;
   struct Node * third;
   struct Node * fourth;


   head = (struct Node *)malloc(sizeof(struct Node));
   second = (struct Node *)malloc(sizeof(struct Node));
   third = (struct Node *)malloc(sizeof(struct Node));
   fourth = (struct Node *)malloc(sizeof(struct Node));

   head->data = 10 ;
   head->next = second;

   second->data = 20 ;
   second->next = third;

   third->data = 30 ;
   third->next = fourth;

   fourth->data = 40 ;
   fourth->next = NULL;

   printLinkedList(head);

  head = insertAtFirst(head,5);   

   printf("\n");
   printLinkedList(head);

   head = insertAtLast(head,50);

   printf("\n");
   printLinkedList(head);

   head = insertAtIndex(head , 30 , 3);
   printf("\n");
   printLinkedList(head);



  return 0 ;

 }



// #include<stdio.h>
// #include<stdlib.h>

// struct Node{

//  int data ;

// struct Node * next; 

// };
 
// void printLinkedList( struct Node * head){

// while(head != NULL){

// printf("Data Element : %d \n",head->data);

// head = head->next; 

// }

// }

// struct Node* insertAtFirst(struct Node * head,int data){
    
//       struct Node * n = (struct Node *)malloc(sizeof(struct Node));

//          n->data = data;

//          n->next = head;

//          head = n ;

//          return head;
     
// } 


// // void InsertAtLast

// int main(){

//   struct Node * head ;
//   struct Node * second ;
//   struct Node * third ;
//   struct Node * fourth ;


//   head = (struct Node*)malloc(sizeof(struct Node));
//   second = (struct Node*)malloc(sizeof(struct Node));
//   third = (struct Node *)malloc(sizeof(struct Node));
//   fourth = (struct Node *)malloc(sizeof(struct Node));

//   head->data = 10 ;
//   head->next = second; 

//  second->data = 20;
//  second->next = third;

//  third->data = 30;
//  third->next = fourth;
  
//  fourth->data = 40 ;
//  fourth->next = NULL;

// // printLinkedList(head);

// head = InsertAtFirst(head,5);

// // printLinkedList(head);

//       return 0 ; 
// }