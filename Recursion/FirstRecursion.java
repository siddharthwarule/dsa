package Recursion;

public class FirstRecursion {
    
    public static void PrintNumber(int n ){

        
        //it is the base condition 
        
        if (n == 0) {
            
            return;
        }
        
        //it can print the number 
         System.out.println(n);
         
         // it is the recalling the function 
        PrintNumber(n - 1);
    }


    public static void PrintNumberOneToN(int n,int m){

        
        System.out.println(n);

        if (n == m) {

           return; 
            
        }

        PrintNumberOneToN(n+1,m);
        
    }

    public static void PrintSum(int i , int n , int sum ){
            //base case 

               if (i == n) {

                sum = sum + i ; 

                System.out.println("Sum of the "+n+" number "+sum);

                return;
                
               }

            //work
            sum=sum +i ;
            


            //recall the function

            PrintSum(i+1, n, sum);

    }

    public static void PrintFactorial(int i ,int n , int fact ){

        //work 

        fact = i * fact;

        //base case 

        if (i == n ) {

        System.out.println(fact);

            return;
            
        }
        
        //recall

        PrintFactorial(i+1, n, fact);
        
    }



    public static void main(String[] args) {

      
        // PrintNumber(10);

        // System.out.println("1 to n");

        // PrintNumberOneToN(1, 20);

        // PrintSum(1, 100, 0);

        // PrintFactorial(1, 3, 1);


    }

}
