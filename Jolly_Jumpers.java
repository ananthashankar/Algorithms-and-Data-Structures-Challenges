
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String jollyJumper(String s) {
        String str = "Not Jolly";
        if(s.trim().length() <= 1 ){
            return str;
        }
        
        Map<Integer, Boolean> tmp= new HashMap<Integer, Boolean>();
        
        String[] ref = s.trim().split("\\s+");
        
        for(int i = 1; i < Integer.parseInt(ref[0]); i++){
            tmp.put(i, false);
        }
        for(int i = 1; i<ref.length - 1; i++){
            int j = Math.abs(Integer.parseInt(ref[i]) - Integer.parseInt(ref[i+1]));
            if(tmp.containsKey(j) && !(tmp.get(j))){
                tmp.put(j, true);
                continue;
            }
            break;
        }
        
        if(!tmp.containsValue(false)){
            str = "Jolly";
        }
        
        return str;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  jollyJumper(s);
        System.out.println(res);
    }
    
}

