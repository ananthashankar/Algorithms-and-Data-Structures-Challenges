package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Longest_Word {
    
    public static String longestWord(String s){
        if(s.trim().length() == 0){
            return "";
        }
        
        String res = "";
        String tmp = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' ' ){
                tmp += s.charAt(i);
                if(i == s.length() - 1){
                    if(res.length() < tmp.length()){
                        res = tmp;
                        tmp = "";
                    }
                }
                continue;
            }
            if(res.length() < tmp.length()){
                res = tmp;
                tmp = "";
            } else {
                tmp = "";
            }
        }
        return res;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  longestWord(s);
        System.out.println(res);
    }
}