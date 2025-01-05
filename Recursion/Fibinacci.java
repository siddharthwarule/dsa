
 package Recursion;

public class Fibinacci {


    public static void Fib(int a , int b , int n){

        //work 
        int c = a + b ;

        //base case 
        System.out.println(c);

        if (n == 0) {

            return ;
            
        }

        //recall
        Fib(b , c , n-1);

    }

    public static void main(String[] args) {
        
        int a = 0  , b = 1 ;

        int n = 5; 

        System.out.println(a);
        System.out.println(b);

        Fib(a , b , n-2);

    }
    
}