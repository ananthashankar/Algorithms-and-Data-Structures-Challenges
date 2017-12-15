import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Word_To_Digit {
    
    public static String wordToDigit(String s){
        if(s.trim().length() == 0){
            return "";
        }
        String res = "";
        Map<String, Integer> ref = new HashMap<String, Integer>();
        ref.put("zero", 0);
        ref.put("one", 1);
        ref.put("two", 2);
        ref.put("three", 3);
        ref.put("four", 4);
        ref.put("five", 5);
        ref.put("six", 6);
        ref.put("seven", 7);
        ref.put("eight", 8);
        ref.put("nine", 9);
        String[] tmp = s.split(";");
        
        for(int i = 0; i < tmp.length; i++){
            if(ref.containsKey(tmp[i].toLowerCase())){
                res += ref.get(tmp[i].toLowerCase());
            }
        }
        return res;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  wordToDigit(s);
        System.out.println(res);
    }
}