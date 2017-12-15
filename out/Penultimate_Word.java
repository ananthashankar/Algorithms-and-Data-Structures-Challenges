
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Penultimate_Word {
    
    public static String nextToLastWord(String s) {
        if(s.trim().length() == 0){
            return "";
        }
        String res = "";
        String[] ref = s.split(" ");
        if(ref.length == 1){
            return res;
        }
        res = ref[ref.length - 2];
        
        return res;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  nextToLastWord(s);
        System.out.println(res);
    }
}