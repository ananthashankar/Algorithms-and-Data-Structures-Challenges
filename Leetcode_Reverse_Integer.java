
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    
    public static int reverse(int x) {
        int n = 0;
        int temp = x;
        if(x==0){
            return n;
        }
        while(x!=0){
            if((Integer.MAX_VALUE/10) < n || (Integer.MIN_VALUE/10) > n){
                return 0;
            }
            n = (n*10) + (x%10);
            System.out.print(n + "\n");
            x = x/10;
        }
        
        return n;
        
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        System.out.print(num + "\n");
        int res =  reverse(num);
        System.out.println(res);
    }
    
}

