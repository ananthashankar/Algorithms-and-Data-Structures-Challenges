package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leetcode_Number_of_1_Bits {
    
    
    
    public static int hammingWeight(int n) {
        int cnt = 0;
        
        for(int i = 0; i< 32; i++){
            if((n & 1) == 1){
                cnt++;
            }
            n >>>= 1;
        }
        
        return cnt;
        // return Integer.bitCount(n);
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseUnsignedInt(in.nextLine());
        System.out.print(num + "\n");
        int res =  hammingWeight(num);
        System.out.println(res);
    }
    
}