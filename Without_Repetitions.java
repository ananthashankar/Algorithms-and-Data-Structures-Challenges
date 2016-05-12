import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Solution {
    
    public static String withoutRepetitions(String s){
        if(s.trim().length() == 0){
            return "";
        }
        String res = String.valueOf(s.charAt(0));
        String tmp = String.valueOf(s.charAt(0));
        for(int i = 1; i<s.length(); i++){
            if(tmp.equals(String.valueOf(s.charAt(i)))){
                continue;
            }
            tmp = String.valueOf(s.charAt(i));
            res += String.valueOf(s.charAt(i));
        }
        
        return res;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  withoutRepetitions(s);
        System.out.println(res);
    }
}