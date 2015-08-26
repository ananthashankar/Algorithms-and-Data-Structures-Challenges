import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Solution {
    
    public static String hiddenDigit(String s){
        if(s.trim().length() == 0){
            return "";
        }
        String res = "";
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i) - 97 >= 0 && s.charAt(i) - 97 <= 9)){
                res += s.charAt(i) - 97;
                continue;
            }
            if(s.charAt(i) - 48 >= 0 && s.charAt(i) - 48 <= 9){
                res += s.charAt(i) - 48;
                continue;
            }
        }
        if(res.length() == 0){
            res = "NONE";
        }
        return res;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  hiddenDigit(s);
        System.out.println(res);
    }
}