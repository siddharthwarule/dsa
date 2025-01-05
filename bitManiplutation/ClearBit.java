package bitManiplutation;

// CLEAR BIT OPRATION 

//in that we make bit 0 used opration AND with NOT

//first we can perform the NOT of if bitmask and then AND with the original numbers


//clear the 3rd bit (postion == 2) of a number n. (n = 0101)
public class ClearBit {
    public static void main(String[] args) {
        
        int n = 5  ; 

        int postion = 2 ;

        int bitmask = 1 << postion ;


        int notBitmask  = ~bitmask ; 

        int clearBitValue = (n & notBitmask);

        System.out.println(clearBitValue);


    }
}
