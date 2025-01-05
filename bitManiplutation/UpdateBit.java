package bitManiplutation;

import java.util.Scanner;

//for making the 0 we need to perform NOT and then AND 
//for making 1 we need to perform OR 

public class UpdateBit {
    public static void main(String[] args) {

        int oper = 0; //update bit to 1 else update bit to 0 
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bit opration which is 0 or 1");
        oper= sc.nextInt();

        int n = 5 ; 
        int pos = 1; 


        //opration 1 mense set and opration 0 mense clear  
        int bitmask = 1 << pos; 
        int newNumber = 0 ; 

        if (oper == 1) {
            
             newNumber = bitmask | n ;

        }else if (oper == 0 ) {
         
            int notBitmask = ~bitmask;

            newNumber = (notBitmask & n);
            
        }else{
            System.out.println("Invalid Input");
        }

        System.out.println(newNumber);

    }
}
