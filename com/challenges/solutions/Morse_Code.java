package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Morse_Code {
    
    public static String morseToString(String s){
        if(s.trim().length() == 0){
            return "";
        }
        String res = "";
        Map<String, String> ref = new HashMap<String, String>();
        ref.put(".-","A");
        ref.put("-...","B");
        ref.put("-.-.","C");
        ref.put("-..","D");
        ref.put(".","E");
        ref.put("..-.","F");
        ref.put("--.","G");
        ref.put("....","H");
        ref.put("..","I");
        ref.put(".---","J");
        ref.put("-.-","K");
        ref.put(".-..","L");
        ref.put("--","M");
        ref.put("-.","N");
        ref.put("---","O");
        ref.put(".--.","P");
        ref.put("--.-","Q");
        ref.put(".-.","R");
        ref.put("...","S");
        ref.put("-","T");
        ref.put("..-","U");
        ref.put("...-","V");
        ref.put(".--","W");
        ref.put("-..-","X");
        ref.put("-.--","Y");
        ref.put("--..","Z");
        ref.put("-----","0");
        ref.put(".----","1");
        ref.put("..---","2");
        ref.put("...--","3");
        ref.put("....-","4");
        ref.put(".....","5");
        ref.put("-....","6");
        ref.put("--...","7");
        ref.put("---..","8");
        ref.put("----.","9");
        
        String[] tmp = s.split("\\s+\\s+");
        for(int i=0; i<tmp.length; i++){
            String temp = "";
            for(int j = 0; j < tmp[i].length(); j++){
                if(tmp[i].charAt(j) != ' ' || j == tmp[i].length()-1){
                    temp += tmp[i].charAt(j);
                }
                
                if(tmp[i].charAt(j) == ' ' || j == tmp[i].length()-1){
                    res += ref.get(temp);
                    temp = "";
                }
            }
            
            res += " ";
            
        }
        return res.trim();
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  morseToString(s);
        System.out.println(res);
    }
}