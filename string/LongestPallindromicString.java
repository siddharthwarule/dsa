package string;

public class LongestPallindromicString {

   public static boolean Ispallindrome(String str){

    char [] arr = str.toCharArray();

    int left = 0 ;
    
    int right = arr.length-1;

    while (left < right) {

        if (arr[left]!=arr[right]) {
            
            return false;

        }

        left++;
        right--;

    }

    return true;

   }


    public static void main(String[] args) {
        
        String str = "sisdidsdssdsdssdsdddds";
        int maxLength = 0 ;
        String maxSubString = "" ;
        

         for(int i = 0 ; i < str.length(); i++){

            for(int j = i + 1; j <= str.length();j++){

                String subString =str.substring(i, j);

                if (Ispallindrome(subString) && maxLength < subString.length()) {

                      maxSubString  = subString;

                      maxLength = subString.length();
                    
                }


            }


        }

        System.out.println(maxSubString);

    }
    
}
