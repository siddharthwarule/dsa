package bitManiplutation;

//SETBIT OPRATION
// public int b =10;

// set the second bit (position 1 ) of a number n . (n = 0101)
//for that we can make the bitmasks and then used the opration or and we set the bit which mense 
// if bit is 0 then we set the bit 1 and it is 1 them we will set 1 


public class SetBit {
    
public static void main(String[] args) {
 
    int n = 5 ; 

    int position = 1 ; 

    int bitmask = 1 << position;


    // we want to set the bit then the new bit is 
    
    int newBit = (bitmask | n);

   System.out.println(newBit);
    

}

}
