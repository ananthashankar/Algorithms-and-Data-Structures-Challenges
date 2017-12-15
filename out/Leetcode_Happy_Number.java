
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leetcode_Happy_Number {
    
    
    
    public static boolean isHappy(int n) {
        boolean res = false;
        Map<Integer, Integer> ref = new HashMap<Integer, Integer>();
        ref.put(n, n);
        int tempSum = 0;
        if(n == 0){
            return res;
        }
        if(n < 0){
            n *= -1;
        }
        if(n == 1){
            return true;
        }
        while(res == false){
            while(n > 0){
                tempSum += ((n%10) * (n%10));
                n = n/10;
            }
            n = tempSum;
            tempSum = 0;
            if(ref.containsKey(n)){
                return res;
            }
            if(n==1){
                res = true;
                return true;
            }
            ref.put(n, n);
            
        }
        return res;
        
    }
    
    
    public static void main(String[] args) throws IOException {
        
        
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        boolean res =  isHappy(num);
        System.out.println(res);
    }
    
}

