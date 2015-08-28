
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    public static String armStrongNumber(int s){
        if(s <= 0){
            return "False";
        }
        int n = String.valueOf(s).length();
        int temp = s;
        int res = 0;
        while(temp != 0){
            res += Math.pow(temp%10, n);
            temp = temp/10;
        }
        if(res == s){
            return "True";
        }
        return "False";
    }
    
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int s = Integer.parseInt(in.nextLine());
        String res =  armStrongNumber(s);
        System.out.println(res);
    }
}