package bitManiplutation;

//in that we can get the bit of any position and check it is 1 or 0 

// GETBIT    = if we want to know the which position which number is present it is 0 or 1 then we will use getbit
// SETBIT    = if we want to set the bit at any position if it is 0 then it become one and it is 1 then it is 1 
// CLEARBIT  = if we want to make it 0 then we want to use clear bit opration
// UPDATEBIT = if we want to make it 0 to 1 and 1 to 0 then we will use Update bit opration 


// get bit at position 2 of number n

//bitmask is the 1 << left shift position ; 

//for that we can make the bitmasks and then used the opration & if the final bit is 1 then at that position 1 and if the 0 then i should be 0  

// we can count the postion from right hand side in bit maniplutation 
public class GetBit {

    public static void main(String[] args) {
        

        int n = 10 ;
        int position = 2 ;

        int bitmask = 1 << position;

         if ((bitmask & n)==0) {
            System.out.println("Bit is Zero");
         }else{
            System.out.println("Bit is One");
         }

    }
}
