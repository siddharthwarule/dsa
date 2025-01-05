package string;

public class Reversestr {

    public static String ReverseString(String str){

        char [] arr = str.toCharArray();

           int left = 0 ; 
           int right = arr.length-1;

          while (left < right) {

            if (!Character.isLetterOrDigit(arr[left])){

                left++;
                
            }
            else if (!Character.isLetterOrDigit(arr[right])){

                right--;
                
            }


           char temp = arr[right];
           arr[right] = arr[left];
           arr[left] = temp;

           left++;
           right--;
            
          }

          return new String(arr);
    }

    public static void main(String[] args) {
        

        String str = "si%dd@harth";

        String Rev  = ReverseString(str);

        System.out.println(Rev);

    }
    
}
