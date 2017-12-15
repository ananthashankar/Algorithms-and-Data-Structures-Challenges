
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Reverse_Words {
    
    public static String reverseWords(String s){
        String res = "";
        if(s.trim().length() == 0){
            return res;
        }
        String[] tmp = s.split(" ");
        for(int i = tmp.length - 1; i >= 0; i--){
            res += tmp[i] + " ";
        }
        
        return res.trim();
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  reverseWords(s);
        System.out.println(res);
    }
}

