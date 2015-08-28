
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    public static String bitPosition(String s) {
        String res = "false";
        if(s.trim().length() == 0){
            return res;
        }
        
        String[] ref = s.split(",");
        String tmp = Long.toBinaryString(Long.parseLong(ref[0]));
        if(tmp.length()%2 !=0){
            tmp = "0"+ tmp;
        }
        System.out.println(tmp);
        if(tmp.charAt(tmp.length() - Integer.parseInt(ref[1])) == tmp.charAt(tmp.length() - Integer.parseInt(ref[2]))){
            res = "true";
        }
        
        return res.trim();
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  bitPosition(s);
        System.out.println(res);
    }
}