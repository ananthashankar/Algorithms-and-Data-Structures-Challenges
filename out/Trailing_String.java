
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Trailing_String {
    
    public static int trailingString(String s) {
        if(s.length() <=3){
            return 0;
        }
        
        Map<Integer, Character> ref = new HashMap<Integer, Character>();
        int i = s.length() - 1;
        for(; i >=0; i--){
            if(s.charAt(i) == ',' ){
                i--;
                break;
            }
            ref.put(s.length() - i, s.charAt(i));
        }
        if(i+1 < ref.size()){
            return 0;
        }
        int j = 1;
        while(j <= ref.size()){
            if(ref.get(j).equals(s.charAt(i))){
                j++; i--;
                continue;
            } else {
                break;
            }
            
        }
        if(j==ref.size() + 1){
            return 1;
        }
        return 0;
    } 
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res =  trailingString(s);
        System.out.println(res);
    }
    
}

