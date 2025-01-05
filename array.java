public class array {
    
    
        public static void main(String[] args) {
            
            int arr [] = {10 , 20 , 11 , 40 , 20 ,11 , 3  , 5 };
    
            for(int i = 0 ; i < arr.length-2;i++){
     
                
                int first = arr[i];
                int sencond = arr[i+1];
                int third  = arr[i+2];


                if (sencond > first && sencond > third) {
                    
                    System.out.println(sencond);
                    
                }    
        }    
    
    }

}
