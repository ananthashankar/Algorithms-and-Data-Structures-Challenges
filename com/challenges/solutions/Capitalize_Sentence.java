package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Capitalize_Sentence {
    
    public static String capitalizeSentence(String s){
        if(s.trim().length() == 0){
            return "";
        }
        String[] res = s.split(" ");
        String r = "";
        for(int i=0; i<res.length; i++){
            if(res[i].charAt(0) >= 97 && res[i].charAt(0) <= 122){
                char c = (char)(res[i].charAt(0)-32);
                r += c;
                for(int j=1; j<res[i].length(); j++){
                    r += res[i].charAt(j);
                }
                r += " ";
                continue;
            }
            r += res[i] + " ";
        }
        return r.trim();
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  capitalizeSentence(s);
        System.out.println(res);
    }
}