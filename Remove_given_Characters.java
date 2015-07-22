
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String removeCharacters(String s) {
        if(s.length() == 0){
            return null;
        }
        String str = "";
        Map<String, String> ref = new HashMap<String, String>();
        int i = s.length()-1;
        for(; i >= 0; i--){
            if(s.charAt(i) == ' ' ){
                continue;
            }
            if(s.charAt(i) == ','){
                break;
            }
            ref.put(Character.toString(s.charAt(i)), Character.toString(s.charAt(i)));
        }
        
        for(int j = 0; j < i ; j++){
            if(ref.containsKey(Character.toString(s.charAt(j)))){
                continue;
            }
            str += s.charAt(j);
        }
        
        return str;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  removeCharacters(s);
        System.out.println(res);
    }
    
}

