
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class UpperCase_to_LowerCase {
    
    public static String reverseWords(String s){
        if(s.trim().length() == 0){
            return "";
        }
        String res = "";
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                res += s.charAt(i);
                continue;
            }
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                char c = (char)(s.charAt(i)+32);
                res += c;
                continue;
            }
            
            res += s.charAt(i);
        }
        
        return res.trim();
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  reverseWords(s);
        System.out.println(res);
    }
}

