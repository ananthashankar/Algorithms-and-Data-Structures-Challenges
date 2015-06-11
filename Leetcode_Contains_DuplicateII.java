
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        if(nums.length == 0 || k == 0){
        	return flag;
        }
        Map<Integer, ArrayList<Integer>> temp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
        	if(temp.containsKey(nums[i])){
        		for(int j : temp.get(nums[i])){
        			if(i - j <= k ){
        				flag=true;
        				break;
        			}
        		}
        		ArrayList<Integer> tmp = temp.get(nums[i]);
        		tmp.add(i);
        		temp.put(nums[i], tmp);
        	} else {
        		ArrayList<Integer> tmp = new ArrayList<Integer>();
        		tmp.add(i);
        		temp.put(nums[i], tmp);
        	}
        	
        }
        
        
        return flag;
    }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner in = new Scanner(System.in);
	        int num = Integer.parseInt(in.nextLine());
	        int k = Integer.parseInt(in.nextLine());
	        int[] nums = new int[num];
	        for(int i=0; i < num; i++){
	            
	           nums[i] = Integer.parseInt(in.nextLine());
	            
	        } 
	        
	       boolean res =  containsNearbyDuplicate(nums, k);
	       System.out.println("here" + res);
	    }
	
}
