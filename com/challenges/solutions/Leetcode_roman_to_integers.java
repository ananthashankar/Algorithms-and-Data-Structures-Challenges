package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 	roman_numerals.put("M", 1000);
    roman_numerals.put("CM", 900);
    roman_numerals.put("D", 500);
    roman_numerals.put("CD", 400);
    roman_numerals.put("C", 100);
    roman_numerals.put("XC", 90);
    roman_numerals.put("L", 50);
    roman_numerals.put("XL", 40);
    roman_numerals.put("X", 10);
    roman_numerals.put("IX", 9);
    roman_numerals.put("V", 5);
    roman_numerals.put("IV", 4);
    roman_numerals.put("I", 1); 
 */

public class Leetcode_roman_to_integers {

	 public static int romanToInt(String s) {
		 if(s.length() == 0){
			 return 0;
		 }
		 Map<Character, Integer> roman_num = new HashMap<>();
		 roman_num.put('A', 0);
		 roman_num.put('I', 1);
		 roman_num.put('V', 5);
		 roman_num.put('X', 10);
		 roman_num.put('L', 50);
		 roman_num.put('C', 100);
		 roman_num.put('D', 500);
		 roman_num.put('M', 1000);
		 if(s.length() == 0){
			 return 0;
		 }
		 int temp = 0;
		 char prev = 'A';
		 for(int i = 0; i < s.length(); i++){
			 int a = roman_num.get(prev);
			 int b = roman_num.get(s.charAt(i));
			 if(a < b){
				 temp += (b - 2*a);
				 prev = s.charAt(i);
				 continue;
			 }
			 temp += b;
			 prev = s.charAt(i);
		}
		 return temp;
	 }
    

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner in = new Scanner(System.in);
	        String s = in.nextLine(); 
	        
	       int res =  romanToInt(s);
	       System.out.println("here" + res);
	    }
	
}
