public class numberPattern {
 
    public static void main(String[] args) {
 
        // 2
        // 4 6
        // 8 10 12
        // 14 16 18 20
        // 22 24 26 28 30
       


        int n = 5 ;
        int count = 1;

        for(int i = 1 ; i <= n ; i++ ){

            for(int j = 1 ; j <= i ; j++ ){

                System.out.print(" "+count * 2);

                count++;
            }

            System.out.println();

        }


        System.out.println();

      // in opposite direction

    //   1 2 3 4 5
    //   1 2 3 4
    //   1 2 3
    //   1 2
    //   1

       for(int i = n ; i >= 1 ; i--){

        for(int j = 1  ; j <= i ; j++){

            System.out.print(" "+j);
        
          }

          System.out.println("");
            
       }


       System.out.println("");



    //    for 0 and 1 ulternative in that when we can sum the i and j and the sum is
    //  the even then we print 1 and it is odd then we print 0 
    

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

      
    for(int i = 1 ; i <= n; i++ ){
 
           for(int j = 1 ; j <= i ; j++){

                 if ((i+j)%2==0) {
                    
                    System.out.print(" "+1);

                 }else{
                    System.out.print(" "+0);
                 }

           }
           System.out.println();

        }
    
    }
}