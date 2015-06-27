
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    
    public static String printLongestWord(String s) {
        s = s.trim();
        String tmp = "";
        int length = 0;
        if(s.length() == 0){
            return tmp;
        }
        TreeMap<Integer, ArrayList<String>> content = new TreeMap<Integer, ArrayList<String>>();
        String[] temp = s.split("\\s+");
        for(int i=0; i<temp.length; i++){
            if(tmp.length() < temp[i].length()){
                tmp = temp[i];
            }
        }
        
        String tmp1 = tmp;
        tmp = "";
        for(int i=0; i<tmp1.length(); i++){
            int j = 0;
            while(j < i){
                tmp += "*";
                j++;
            }
            tmp += tmp1.charAt(i);
            tmp += " ";
        }
        return tmp.trim();
    }
    
    
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String res = "";
        
        while ((line = stdin.readLine()) != null && line.length()!= 0) {
            res += printLongestWord(line) + "\n";
        }
	       System.out.println(res);
    }
    
}

