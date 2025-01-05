public class solidRombus {
    public static void main(String[] args) {
        
        int n = 5 ; 

        //in that spases are n - 1 ;


//           *  *  *  *  * 
//         *  *  *  *  *
//      *  *  *  *  *
//   *  *  *  *  *
// *  *  *  *  *

        for(int i = 1; i <= n ; i++){

            for(int  j= 1; j <= (n-i);j++){

                System.out.print("   ");


            }

            for(int j = 1 ; j <= n ; j++){

                System.out.print(" * ");

            }


            System.out.println();

        }


    }
}
