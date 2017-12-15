package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ref:
//http://introcs.cs.princeton.edu/java/31datatype/Hex2Decimal.java.html

public class Find_A_Writer {
    
    public static String findAWriter(String s) {
        if(s.trim().length() == 0){
            return "";
        }
        String res = "";
        String[] ref = s.split("\\|");
        String[] keys = ref[1].trim().split(" ");
        for(int i = 0; i < keys.length; i++){
            res += ref[0].charAt(Integer.parseInt(keys[i]) - 1);
        }
        return res;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  findAWriter(s);
        System.out.println(res);
    }
}