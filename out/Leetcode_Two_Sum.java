
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leetcode_Two_Sum {

	    public static int[] twoSum(int[] nums, int target) {
	        int[] res = new int[2];
	        int flag = 0;
	        HashMap<Integer, List<Integer>> less = new HashMap<Integer, List<Integer>>();
	        for(int i=0; i<nums.length; i++){
	            
	            	if(less.containsKey(nums[i])){
	            		ArrayList<Integer> temp = (ArrayList<Integer>)less.get(nums[i]);
	            		temp.add(i);
	            		less.put(nums[i], temp);
	            	} else {
	            		ArrayList<Integer> temp = new ArrayList<Integer>();
	            		temp.add(i);
	            		less.put(nums[i], temp);
	            	}
	            
	        }
	        
	        for(int i : less.keySet()){
	        	if(i == target-i && less.get(i).size()>=2){
	        		res[0] = less.get(i).get(0) + 1;
	        		res[1] = less.get(i).get(1) + 1;
	        		return res;
	        	}
	        	
	        	if(less.containsKey(target - i)){
	        		int temp1 = less.get(i).get(0) + 1;
	        		int temp2 = less.get(target - i).get(0) + 1;
	        		if(temp1 > temp2){
	        			res[0] = temp2;
	        			res[1] = temp1;
	        		} else {
	        			res[0] = temp1;
	        			res[1] = temp2;
	        		}
	        	}
	        }
	        
	        return res;
	    }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner in = new Scanner(System.in);
	        int num = Integer.parseInt(in.nextLine());
	        int target = Integer.parseInt(in.nextLine());
	         int[] numbers = new int[num];
	        for(int i=0; i < num; i++){
	            
	           numbers[i] = Integer.parseInt(in.nextLine());
	            
	        } 
	        
	       int[] res =  twoSum(numbers, target);
	       System.out.println(res[0] +" " + res[1]);
	    }
	
}
