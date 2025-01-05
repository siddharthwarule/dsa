package string;
import java.io.*;
import java.util.*;

public class HasNextLine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int lineNo = 1;
        
        while(sc.hasNextLine()){
            
            String line = sc.nextLine();
            System.out.println(lineNo+" "+line);
            lineNo++;
            
        }
        
        
    }
}
