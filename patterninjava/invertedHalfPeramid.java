

//inveted halp peramid with rotate 180 degree 

  // - - - *
 //  - - * *
//   - * * *
//   * * * *

// in first at the first line 3 blank spaces are presents in second line 2 and third line 1 ind four line 0 so 
// formula is n - i sapces we want to print ;   for this we using two inner loop one print spases and another is *

public class invertedHalfPeramid {

    public static void main(String[] args) {
        
        int n = 5;

        //inner loop -> space print 
        for(int i = 1 ; i <= n ; i++){

            for(int j = 1 ; j <= n-i; j++ ){

            
               System.out.print(" ");
        }
       
        //inner loop -> star print
        for(int k = 1; k<=i; k++){

             System.out.print("*");

         }
         System.out.println();
        }


    }
    
}