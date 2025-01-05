package string;

public class palindrome {


    public static boolean IsPallindromeOrNot(String str){

        char arr [] = str.toCharArray();
 
        int left = 0 ;
        int right = arr.length-1;

    
        while (left < right) {

            if (arr[left] != arr[right]) {

                return false;       
            }

            left++;
            right--;
        }

        return true;
    }


    public static void main(String [] args) {
        
        String str = "sisss";

        boolean palindrome  = IsPallindromeOrNot(str);


        System.out.println("is pallindrome :"+palindrome);

    }
    
}
