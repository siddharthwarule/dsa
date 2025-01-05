package DataStructure;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * stackinjava
 */
public class stackinjava {

 public static class Node {
   
    int data ;
    Node next;

    Node(int data){
        this.data =data;
    }

   }


 static class stackLinkedList {
       
        public static Node head ;

        public static boolean isEmpty(){
            return head ==null; 
        }

        public static void push(int data){

            Node newNode =new Node(data);
            
            if (isEmpty()) {
                head = newNode;

                return;
            }

            newNode.next = head;
            head = newNode;

        }

        public static int pop(){

            int top = head.data;

            head = head.next;

            return top;
            

        }

        public static int peek(){

            if (isEmpty()) {

                return -1;
                
            }
            
            return head.data;
  
             }
        }

static class stackArrayList {

    static ArrayList<Integer> arrList = new ArrayList<>();

    public static boolean isEmpty(){

        return arrList.size()==0;

    }

    //push

    public static void push(int data){

        arrList.add(data);

    }

    //pop

    public static int pop(){


        int top = arrList.get(arrList.size()-1);
        arrList.remove(arrList.size()-1);

        return top;
    }

    //peak

    public static int peak(){

        if (isEmpty()) {

            return -1 ; 
            
        }

        return arrList.get(arrList.size()-1);

    }

}
        public static void main(String [] args){

            stackLinkedList s1 = new stackLinkedList();

           s1.push(10);
           s1.push(20);
           s1.push(30);
           
         while (!s1.isEmpty()) {

            System.out.println(s1.peek());
            s1.pop();
            
         }

        }
    }
    

