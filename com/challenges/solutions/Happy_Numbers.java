package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Happy_Numbers {
    
    public static int happyNumber(String s){
        int res = 0;
        int inp = Integer.parseInt(s);
        HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        if(inp == 0){
            return res;
        }
        if(inp == 1){
            return 1;
        }
        
        for(int i=1; i<Integer.MAX_VALUE; i++){
            int x = inp;
            int sum = 0;
            while(x!=0){
                sum += (x%10) * (x%10);
                x = x/10;
            }
            if(sum == 1){
                res = 1;
                break;
            }
            if(tmp.containsKey(sum)){
                break;
            }
            tmp.put(sum, sum);
            inp = sum;
        }
        
        return res;
        
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res =  happyNumber(s);
        System.out.println(res);
    }
}

