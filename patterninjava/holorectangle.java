/**
 * holorectangle
 *              12 13 14
 *        11 *  *  *  *  * 15
 *        21 *           * 25
 *        31 *           * 35
 *        41 *  *  *  *  * 45
 *            42  43 44 45
 * 
 * in that all the  i is 1 , j is 1 , i is 4 , j = 5  
 */
public class holorectangle {

    public static void main(String [] args){

    int n = 4 ; 
    int m = 5 ; 

    for(int i = 1 ;  i <= n ; i++ ){

       for(int j = 1 ; j <= m ; j++){

             if (i == 1 || j == 1 || i == n || j == m) {

                System.out.print("*");
                
             }else{
               System.out.print(" ");
             }
       }

       System.out.println();

    }

    }
    
}