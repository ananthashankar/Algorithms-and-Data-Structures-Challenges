package com.challenges.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leetcode_Contains_Duplicate {

public static boolean containsDuplicate(int[] nums) {
    boolean flag = false;
    if(nums.length == 0){
    	return flag;
    }
    Map<Integer, Boolean> coll = new HashMap<Integer, Boolean>(); 
	for(int i=0; i<nums.length; i++){
        	if(coll.containsKey(nums[i])){
        		coll.put(nums[i], true);
        		flag = true;
        		break;
        	} else {
        		coll.put(nums[i], false);
        	}
        }
	return flag;
    }


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner in = new Scanner(System.in);
	        int num = Integer.parseInt(in.nextLine());
	        int[] nums = new int[num];
	        for(int i=0; i < num; i++){
	            
	           nums[i] = Integer.parseInt(in.nextLine());
	            
	        } 
	        
	       boolean res =  containsDuplicate(nums);
	       System.out.println(res);
	    }
	
}
