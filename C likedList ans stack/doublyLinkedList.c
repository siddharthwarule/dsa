#include <stdio.h>
#include <stdlib.h>

struct Node{

  struct Node * prev;
  int data;
  struct Node * next;

};

void linkedListTraversedInForword(struct Node * head){
  
    while(head != NULL){

    printf("%d \n",head->data);

        head = head->next;

    }

}


void linkedListTraversedInReverse(struct Node * head){

       struct Node * p = head;

     while(p->next != NULL){

        p = p->next;

     }     
   

     while(p !=head){

   
   printf("%d \n",p->data);
      p = p->prev;
   
     }
   printf("%d \n",p->data);


}


struct Node * insertAtFirst(struct Node * head,int data){

struct Node * n = (struct Node *)malloc(sizeof(struct Node));

n ->data = data;

n->prev = NULL;

head->prev = n;
n->next = head;

head = n ;

return head;
   
}


void inserAtLast(struct Node * head, int data){

struct Node * n = (struct Node *)malloc(sizeof(struct Node));

n ->data = data;

n->next = NULL;

struct Node * p = head;

while(p->next !=NULL){

p = p->next ;

}

p->next = n;
n->prev = p;


}

int main(){

struct Node * head ;
struct Node * second;
struct Node * third;
struct Node * forth;


head = (struct Node *)malloc(sizeof(struct Node));
second = (struct Node *)malloc(sizeof(struct Node));
third= (struct Node *)malloc(sizeof(struct Node));
forth = (struct Node *)malloc(sizeof(struct Node));


head->prev=NULL;
head->data=100;
head->next=second; 


second->prev=head;
second->data=200;
second->next=third; 

third->prev=second;
third->data=300;
third->next=third; 


third->prev=second;
third->data=300;
third->next=forth;


forth->prev=third;
forth->data=400;
forth->next=NULL;

linkedListTraversedInForword(head);

printf("in priveius order------------------------\n");

linkedListTraversedInReverse(head);

head = insertAtFirst(head,50);

printf("insert at first----------------------------\n");
linkedListTraversedInForword(head);

printf("in priveius order------------------------\n");

linkedListTraversedInReverse(head);

printf("insert at last----------------------------\n");
inserAtLast(head,500);
linkedListTraversedInForword(head);


}