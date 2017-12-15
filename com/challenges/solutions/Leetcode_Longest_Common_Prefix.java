package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leetcode_Longest_Common_Prefix {

	public static String longestCommonPrefix(String[] strs) {
	       if(strs.length == 0 ){
	           return "";
	       }
	       int flag = 0;
	       String res = strs[0];
	       for(int i=0; i<strs.length; i++){
	    	  String arrCon = strs[i];
	    	  if(res.length() == arrCon.length()){
	  			if(res.equalsIgnoreCase(arrCon)){
	  				continue;
	  			} else {
	  				flag = 1;
	  				for(int j = res.length(); j > 0; j--){
	  					if(res.substring(0, j - 1).equalsIgnoreCase(arrCon.substring(0, j - 1))){
	  						res =  res.substring(0, j - 1);
	  						flag = 0;
	  						break;
	  					}
	  				}
	  			}
	  		} else if(res.length() < arrCon.length()){
	  			if(arrCon.substring(0, res.length()).equalsIgnoreCase(res)){
	  				continue;
	  			} else {
	  				flag = 1;
	  				for(int j = res.length(); j > 0; j--){
	  					if(res.substring(0, j - 1).equalsIgnoreCase(arrCon.substring(0, j - 1))){
	  						res =  res.substring(0, j - 1);
	  						flag = 0;
	  						break;
	  					}
	  				}
	  			}
	  			
	  		} else if(res.length() > arrCon.length()){
	  			if(res.substring(0, arrCon.length()).equalsIgnoreCase(arrCon)){
	  			    res = arrCon;
	  				continue;
	  			} else {
	  				flag = 1;
	  				for(int j = arrCon.length(); j > 0; j--){
	  					if(res.substring(0, j - 1).equalsIgnoreCase(arrCon.substring(0, j - 1))){
	  						res =  arrCon.substring(0, j - 1);
	  						flag = 0;
	  						break;
	  					}
	  				}
	  			}
	  		}
	       }
	       
	       if(flag == 0){return res;} else {return "";}
 }


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
			Scanner in = new Scanner(System.in);
			int num = Integer.parseInt(in.nextLine());
			String[] words = new String[num];
			for (int i = 0; i < num; i++) {

				words[i] = in.nextLine();

			}

			String res = longestCommonPrefix(words);
			System.out.println(res);
		}
	
}

