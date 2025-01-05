package Recursion;

public class powerN {

    public static int Power(int x , int n ){


        //base case 
        if (n==0) {
         return 1;
        }

        if(x == 0){
            return 0 ;
        }

        int xPower = Power(x,n-1) ;

        int xPow = x * xPower;

        return xPow;

    }

    public static void main(String[] args) {
        
        int x = 2 , n = 6;

        int ans = Power(x, n);

        System.out.println(ans);
    }

    
}
