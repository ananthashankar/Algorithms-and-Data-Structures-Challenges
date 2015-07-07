
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    
    public static boolean isPalindrome(int x) {
        boolean res = false;
        int n = 0;
        int temp = x;
        if(x<0){
            return res;
        }
        if(x>=0 && x<10){
            res = true;
        }
        
        while(x>0){
            n = (n*10) + (x%10);
            x = x/10;
        }
        if(temp == n){
            res = true;
        }
        
        
        return res;
        
    }
    
    
    public static void main(String[] args) throws IOException {
        
        
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        boolean res =  isPalindrome(num);
        System.out.println(res);
    }
    
}

