package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Lowest_Unique_Number {
    
    public static int lowestUniqueNumber(String s){
        if(s.length() == 0){
            return 0;
        }
        Map<String, Integer> tmp = new HashMap<>();
        Map<String, Integer> ref = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < s.length(); i+= 2){
            cnt++;
            if(tmp.containsKey(String.valueOf(s.charAt(i)))){
                tmp.put(String.valueOf(s.charAt(i)),tmp.get(String.valueOf(s.charAt(i)))+1);
            } else {
                tmp.put(String.valueOf(s.charAt(i)),1);
            }
            ref.put(String.valueOf(s.charAt(i)), cnt);
        }
        int res = Integer.MAX_VALUE;
        for(String t : tmp.keySet()){
            if(tmp.get(t) == 1){
                if(res > Integer.parseInt(t)){
                    res = Integer.parseInt(t);
                }
            }
        }
        return res == Integer.MAX_VALUE ? 0 : ref.get(String.valueOf(res));
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res =  lowestUniqueNumber(s);
        System.out.println(res);
    }
}