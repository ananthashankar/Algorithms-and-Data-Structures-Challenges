
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Solution {
    
    
    public static void main(String[] args) throws IOException {
        String r = "";
        for(int i = 1; i<= 12; i++){
            String s = "";
            for(int j = 1; j <= 12; j++){
                if(i*j >= 10 && i*j <= 99){
                    s += "  " + i*j;
                    continue;
                }
                if(i*j >= 100){
                    
                    s += " " + i*j;
                    continue;
                }
                s += "   " + i*j;
            }
            r += s.trim() + "\n";
        }
        
        System.out.print(r);
        
    }
}