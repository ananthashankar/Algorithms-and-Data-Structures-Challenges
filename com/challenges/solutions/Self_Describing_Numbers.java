package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Self_Describing_Numbers {
    
    public static int selfDescribingNumber(String s){
        if(s.length() == 0){
            return 0;
        }
        int res = 0;
        int x = Integer.parseInt(s);
        int i = s.length() - 1;
        Map <Integer, Integer> ref = new HashMap<Integer, Integer>();
        Map <Integer, Integer> ref1 = new HashMap<Integer, Integer>();
        while(x !=0){
            ref.put(i, x%10);
            if(ref1.containsKey(x%10)){
                ref1.put(x%10,ref1.get(x%10) + 1);
            }else {
                ref1.put(x%10,1);
            }
            x = x/10;
            i--;
        }
        
        for (int t: ref1.keySet()){
            int temp = ref1.get(t);
            if((temp == 0 && !ref.containsKey(t)) || (ref.containsKey(t) && ref.get(t) == temp)){
                res = 1;
                continue;
            }
            
            res = 0;
        }
        
        return res;
        
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res =  selfDescribingNumber(s);
        System.out.println(res);
    }
}