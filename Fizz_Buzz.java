
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Solution {
    
    public static String fizzBuzz(String s){
        String r = "";
        String[] nums = s.split(" ");
        
        int q = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int p = q * m;
        for(int i=1; i<=Integer.parseInt(nums[2]); i++){
            if(i % p == 0){
                r += "FB" + " ";
            } else if(i % q ==  0){
                r += "F" + " ";
            }else if(i % m ==  0){
                r += "B" + " ";
            }else{
                r += i + " ";
            }
        }
        return r.trim();
    }
    
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  fizzBuzz(s);
        System.out.println(res);
    }
    
}

