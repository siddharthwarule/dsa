package DataStructure;


public class linkedList {

    Node head ; 
    private int size ; 

    linkedList(){

        this.size = 0 ;  
    }

    class Node{

        String data = "";
        Node next;

        Node(String data){

             this.data = data;
             this.next = null;
             size++;
        }

    }

    public void addFirst(String data){

        Node newNode = new Node(data);

        if (head == null) {
            
            head = newNode;

            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){

        Node newNode = new Node(data);

        if (head == null) {
            
            head = newNode;

            return;
        }

        Node curNode = head;

        while (curNode.next != null) {

            curNode = curNode.next;
            
        }

        curNode.next = newNode;

    }

   public void printList(){

    
          Node temp = head;

          while (temp != null) {
            
            System.out.print(temp.data+"->");
            temp = temp.next;

          }

          System.out.print("null");

    }

    public void deleteFirst(){

       if (head == null) {
        
          System.out.println("list is Empty");

       }
        
       size--;
       head = head.next;
        
    }

    public void deleteLast(){

        if (head == null) {

            System.out.println("List is Empty");
            
        }

          size--;
        if (head.next == null) {
         
            // System.out.println("null");
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next; 

        while(last.next != null) {

            last = head.next;
            secondLast = head.next;
            
        }

        secondLast.next = null;
    }
    
    
   public void addAtPosition(int pos,String data){

         Node position = head;
        
         Node newNode = new Node(data);


         int i = 0 ;
         while (i != pos-2) {
        position.next = position;
            i++;
         }

         position.next = newNode;

   }

    public int getSize(){
        return size;
    }



    public static void main(String[] args) {
        linkedList l1 = new linkedList();

        l1.addFirst("sid");
        l1.addLast("warule");
        // l1.printList();
        // System.out.println();    
        // l1.deleteLast();
        // System.out.println();
        // l1.printList();
       
        int size = l1.getSize();

        System.out.println(size);
    }
}
