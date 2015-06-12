
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

public static boolean isIsomorphic(String s, String t) {
    if(s.length() == 0 && t.length() == 0){
    	return true;
    }
	boolean flag = false;
    Map<Character, Character> temp = new HashMap<>();    
        for(int i = 0; i < s.length(); i++ ){
        	if(temp.containsKey(s.charAt(i))){
        		if(temp.get(s.charAt(i)).equals(t.charAt(i)) ){
        			flag = true;
        			continue;
        		}
        		flag = false;
        		break;
        	} else {
        		if(temp.containsValue(t.charAt(i))){
        			flag = false;
        			break;
        		}
        		flag = true;
        		temp.put(s.charAt(i), t.charAt(i));
        	}
        }
        return flag;
    }
    

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner in = new Scanner(System.in);
	        String s = in.nextLine(); 
	        String t = in.nextLine();
	       boolean res =  isIsomorphic(s, t);
	       System.out.println("here" + res);
	    }
	
}
