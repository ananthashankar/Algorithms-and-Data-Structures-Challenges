
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

public class Solution {

	 public static int romanToInt(String s) {
	        
		 if(s.length() == 0){
			 return 0;
		 }
		 int temp = 0;
		 char prev = 'A';
		 for(int i = 0; i < s.length(); i++){
			 char next = 'W';
			 if(i <= s.length() - 2){
				 next = s.charAt(i+1);
			 }
			 if(s.charAt(i) == 'M'){
				 if(prev == 'C'){
					 continue;
				 }
				 temp += 1000;
			 } else if(s.charAt(i) == 'C'){
				 if(prev == 'X'){
					 continue;
				 } else if(next == 'M'){
					 prev = 'C';
					 temp += 900;
				 } else if(next == 'D'){
					 prev = 'C';
					 temp += 400;
				 } else {
					 temp += 100;
				 }
			 } else if(s.charAt(i) == 'D'){
				 if(prev == 'C'){
					 continue;
				 }
				 temp += 500;
			 } else if(s.charAt(i) == 'X'){
				 if(prev == 'I'){
					 continue;
				 } else if(next == 'C'){
					 prev = 'X';
					 temp += 90;
				 } else if(next == 'L'){
					 prev = 'X';
					 temp += 40;
				 } else {
					 temp += 10;
				 }
			 } else if(s.charAt(i) == 'L'){
				 if(prev == 'X'){
					 continue;
				 }
				 temp += 50;
			 } else if(s.charAt(i) == 'V'){
				 if(prev == 'I'){
					 continue;
				 } else 
				 temp += 5;
			 } else if(s.charAt(i) == 'I'){
				 if(next == 'X'){
					 prev = 'I';
					 temp += 9;
				 } else if(next == 'V'){
					 prev = 'I';
					 temp += 4;
				 } else {
					 temp += 1;
				 }
			 }
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
