import java.util.Scanner;

public class SumOfPrimes {

    public static boolean primeSum(int input1){
        
        if (input1 <= 1) {
            
            return false ;
        }

        int sum = 0 ; 

        for(int i = 2 ; i <= input1/2;i++ ){

            if (input1 % i ==0){

                return false ;
            
            }

        }

        return true; 

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (N) to find the sum of all prime numbers up to N: ");
        int N = scanner.nextInt();
        
        scanner.close();

        int sum = 0 ;

        for(int i = 1; i <= N;i++){

             if(primeSum(i)){

                sum  +=i ;

             }

        }

        
        // int sumOfPrimes = primeSum(N);
        System.out.println("Sum of prime numbers up to " + N + " is: " + sum);
    }


}