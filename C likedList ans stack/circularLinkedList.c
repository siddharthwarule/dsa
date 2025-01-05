#include<stdio.h>
#include<stdlib.h>


struct Node {

   int data ;
   struct Node * next;   

};

void linkedListTraversed(struct Node * head){

   struct Node * ptr = head->next;

   printf("%d \n",head->data);
   

   while(ptr != head){
 
   printf("%d \n",ptr->data);
      
       ptr=ptr->next;

   }
}

struct Node * insertFirst(struct Node * head, int value){

          struct Node * n = (struct Node *)malloc(sizeof(struct Node));

          n->data = value;
          struct Node * p = head->next;

        
        while(p->next != head){

           p = p->next;

        }
           
           p->next = n;

           n->next= head;
          
            head = n;

          return head;

}

 struct Node *  insertAtLast(struct Node * head,int data){
   
       struct Node * n = (struct Node *)malloc(sizeof(struct Node));

       n->data = data;

       struct Node * p = head;

       while(p->next != head){
 
            p = p->next;

       }
      
       p->next = n ;
       n->next = head;

       return head;


 }




int main(){

struct Node * head ;
struct Node * second ;
struct Node * third ;
struct Node * forth ;

head = (struct Node *)malloc(sizeof(struct Node));
second = (struct Node *)malloc(sizeof(struct Node));
third = (struct Node *)malloc(sizeof(struct Node));
forth = (struct Node *)malloc(sizeof(struct Node));

   head->data = 10;
   head->next = second;

   second->data = 20 ;
   second->next = third;

   third->data = 30 ;
   third->next = forth;

//_________circular linked list_________________

   forth->data = 40;
   forth->next = head;

//__________________________ 

linkedListTraversed(head);

printf("after insert first \n");

head = insertFirst(head,5);

linkedListTraversed(head);

head = insertAtLast(head,50);

printf("after insert last \n");
linkedListTraversed(head);



}
