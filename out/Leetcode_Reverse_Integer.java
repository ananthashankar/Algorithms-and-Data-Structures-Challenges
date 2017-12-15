
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leetcode_Reverse_Integer {
    
    
    
    public static int reverse(int x) {
        int n = 0;
        if(x==0){
            return n;
        }
        while(x!=0){
            if((Integer.MAX_VALUE/10) < n || (Integer.MIN_VALUE/10) > n){
                return 0;
            }
            n = (n*10) + (x%10);
            x = x/10;
        }
        
        return n;
        
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int res =  reverse(num);
        System.out.println(res);
    }
    
}

