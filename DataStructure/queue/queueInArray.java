package DataStructure.queue;

/**
 * queue
 */
public class queueInArray {

    static class Queue{

    
        static int arr[];
        static int size; 
        static int rear =-1; 
        

        Queue(int size){
            arr = new int[size];
            this.size = size;
        } 
    
        public static boolean isEmpty(){

            return rear==-1;     
        }

        //to adding the data in queue from back
        public static void add(int data){

            if (rear == size -1 ) {

                System.out.println("Queue is Full");

                return;
                
            }
        
            rear++;

            arr[rear] = data;
        }

        //to removing the data from the front side 
        public static int remove(){

            if(isEmpty()){

                System.out.println("Queue is Empty");
                return -1;
            }

            //for that we can remove from the first then we need to shift all elements at the front
            int front = arr[0];
            
            for(int i = 0 ; i < rear ; i++){
                arr[i] = arr[i+1];
            }

            rear--;
            return front;
        }

        public static int peek(){

            if (isEmpty()) {
                
                System.out.println("Empty Queue");

                return -1;

            }

            return arr[0];
        }
        
    }

    public static void main(String[] args) {
        
        Queue q = new Queue(10);

        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);


        // to print the queue

        while (!q.isEmpty()) {

        System.out.println(q.peek());
        q.remove();
            
        }

    }    

}


// in this data structure the front is the index which is the statically first index of array which is the front of an array and 

// 