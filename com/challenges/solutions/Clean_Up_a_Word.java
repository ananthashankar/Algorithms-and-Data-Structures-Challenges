package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Clean_Up_a_Word {
    
    
    
    public static int maximumBeauty(String s) {
        int[] alpha = new int[26];
        int t = 0;
        s= s.toUpperCase();
        for(int i=0; i<s.length(); i++){
            t = (int)s.charAt(i) - 65;
            alpha[t] = alpha[t] + 1;
        }
        t = 0;
        int max = 26;
        for (int i=alpha.length - 1; i>=0; i--){
            if(alpha[i] > 0){
                t = t + max*alpha[i];
                max--;
            }
        }
        return t;
    }
    
    
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*Using Buffer for Dynamic Input*/
        /*	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
         String line;
         String res = "";
         
         while ((line = stdin.readLine()) != null && line.length()!= 0) {
         res += printLongestWord(line) + "\n";
         } */
        
        /* Scanner for Dynamic Input */
        
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        String res = "";
        String i;
        while(in.hasNextLine() &&  (i = in.nextLine()).length() != 0){
            res += maximumBeauty(i) + "\n";
            
        }
        
	       System.out.println(res);
    }
    
}

