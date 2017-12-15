
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leetcode_Length_of_Last_Word {

public static int lengthOfLastWord(String s) {
		s = s.trim();
        if(s.length() == 0){
        	return 0;
        }
        int tmp = 0;
        for(int i = s.length()-1; i>=0; i--){
        	if(s.charAt(i) == ' '){
        		break;
        	}
        	tmp++;
        }
        return tmp;
    }
    

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner in = new Scanner(System.in);
	        String s = in.nextLine(); 
	        
	       int res =  lengthOfLastWord(s);
	       System.out.println("here" + res);
	    }
	
}
