

import java.io.*;
import java.util.*;

public class splitStringbyregex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int tockenCount = 0 ;
        // Write your code here.
        
        String[] tokens = s.split("[^A-Za-z]+");
        
        for (String token : tokens){
            
            if(!token.isEmpty()){
                
                tockenCount++;
                
            }
            
        }
        
        System.out.println(tockenCount);
        
        for (String token : tokens ){
              if(!token.isEmpty()){
            
            System.out.println(token);
            
              }
            
        }
        
        scan.close();
    }
}

