
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Solution {
    
    public static int rightMostChar(String s){
        int res = -1;
        
        String[] tmp = s.split(",");
        char c = tmp[1].charAt(0);
        for(int i = tmp[0].length() - 1; i >= 0; i--){
            if(tmp[0].charAt(i) == c){
                res = i;
                break;
            }
        }
        
        return res;
        
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = (in.nextLine());
        int res =  rightMostChar(s);
        System.out.println(res);
    }
}

