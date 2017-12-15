package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Mixed_Content {
    
    public static String mixedContent(String s) {
        String res = "";
        if(s.trim().length() == 0){
            return res;
        }
        String tmp1 = "";
        String tmp2 = "";
        String[] ref = s.split(",");
        for(int i = 0; i < ref.length; i++){
            if(ref[i].trim().charAt(0) >= 48 && ref[i].trim().charAt(0) <= 57){
                tmp1 += ref[i] + ",";
                continue;
            }
            tmp2 += ref[i] + ",";
        }
        if(tmp2.length() > 0){
            res += tmp2.substring(0, tmp2.length()-1);
            tmp1 = "|".concat(tmp1);
        }
        if(tmp1.length() > 1){
            res += tmp1.substring(0, tmp1.length()-1);
        }
        
        
        return res.trim();
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  mixedContent(s);
        System.out.println(res);
    }
}