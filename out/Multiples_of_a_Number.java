
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Multiples_of_a_Number {
    
    public static int multiplesNumber(String s){
        String[]  tmp = s.split(",");
        int a = Integer.parseInt(tmp[0]);
        int b = Integer.parseInt(tmp[1]);
        if( a < b ){
            return b;
        }
        
        for(int i = 1; i <= a; i++){
            if(b*i >= a ){
                return b*i;
            }
        }
        
        return 0;
        
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res =  multiplesNumber(s);
        System.out.println(res);
    }
}

