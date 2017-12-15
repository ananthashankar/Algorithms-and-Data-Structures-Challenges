package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Simple_Sorting {
    
    public static String simpleSorting(String s){
        String[] tmp = s.split(" ");
        String res = "";
        ArrayList<Double> intg = new ArrayList<Double>();
        for(int i = 0; i < tmp.length; i++){
            intg.add(Double.parseDouble(tmp[i]));
        }
        Collections.sort(intg);
        for(double i : intg){
            res += String.format("%.3f", i) + " ";
        }
        return res.trim();
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = (in.nextLine());
        String res =  simpleSorting(s);
        System.out.println(res);
    }
}

