
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Beautiful_Strings {
    
    public static int maximumBeauty(String s) {
        s = s.toUpperCase();
        Map<String, Integer> ref = new HashMap<String, Integer>();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == ' ' || s.charAt(i) <  65 || s.charAt(i) > 90){
                continue;
            }
            if(ref.containsKey(String.valueOf(s.charAt(i)))){
                ref.put(String.valueOf(s.charAt(i)), ref.get(String.valueOf(s.charAt(i))) + 1);
            } else {
                ref.put(String.valueOf(s.charAt(i)), 1);
            }
        }
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for(String t : ref.keySet()){
            tmp.add(ref.get(t));
        }
        Collections.sort(tmp);
        int res = 0;
        int i = tmp.size();
        for(int t : tmp){
            i--;
            res += (26 - i) * t;
        }
        return res;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res =  maximumBeauty(s);
        System.out.println(res);
    }
}