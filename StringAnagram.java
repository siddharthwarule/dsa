import java.util.Scanner;


//anagram string is this string in which the letter count will be same

// TAB = BAT are the anagram 

public class StringAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        //we create a array for 26 alfabates here ; 
        int [] charCount = new int[26]; 
        
       
        if(a.length() != b.length()){
            
            return false;
            
        }
        
    
     for(int i = 0 ; i < a.length();i++){
         
         charCount[a.charAt(i)-'a']++;
         
     }
     
     for(int i = 0 ; i < b.length();i++){
         
         charCount[b.charAt(i)-'a']--;
         
     }    
     
     for(int i = 0 ; i < charCount.length;i++){
         
         if(charCount[i] !=0){
             
             return false;
             
         }
         
     }
        
        return true;
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
