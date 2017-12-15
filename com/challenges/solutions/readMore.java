package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class readMore {
    
    public static String readMore(String s) {
        String res = "";
        if(s.length() == 0){
            return res;
        }
        if(s.length() <= 55){
            return s;
        }
        int i = 39;
        
        for(; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
        }
        if(i == -1){
            i = 40;
        }
        res = s.substring(0,i) + "... <Read More>";
        
        return res.trim();
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  readMore(s);
        System.out.println(res);
    }
}