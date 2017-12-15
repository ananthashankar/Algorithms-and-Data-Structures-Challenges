
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Cardinal_to_Roman {
    
    public static String romanNumeral(int s){
        if(s <= 0){
            return "";
        }
        Map<Integer, String> roman_numerals = new HashMap<>();
        roman_numerals.put(1000, "M");
        roman_numerals.put(900, "CM");
        roman_numerals.put(500, "D");
        roman_numerals.put(400, "CD");
        roman_numerals.put(100 ,"C");
        roman_numerals.put(90, "XC");
        roman_numerals.put(50, "L");
        roman_numerals.put(40, "XL");
        roman_numerals.put(10, "X");
        roman_numerals.put(9, "IX");
        roman_numerals.put(5, "V");
        roman_numerals.put(4, "IV");
        roman_numerals.put(1, "I");
        String[] ref = new String[4];
        String res = "";
        for(int i=0; i<4; i++){
            int tmp = s%10;
            s=s/10;
            if(roman_numerals.containsKey(tmp*(int)(Math.pow(10, i)))){
                ref[i] = (roman_numerals.get(tmp*(int)(Math.pow(10, i))));
                continue;
            }
            if(i == 0){
                if(tmp > 5){
                    String t = "V";
                    tmp = tmp - 5;
                    for(int j=0; j<tmp; j++){
                        t += "I";
                    }
                    ref[i] = t;
                    continue;
                }
                if(tmp < 5){
                    String t = "";
                    for(int j=0; j<tmp; j++){
                        t += "I";
                    }
                    ref[i] = (t);
                    continue;
                }
                
            }
            if(i == 1){
                if(tmp*10 > 50){
                    String t = "L";
                    tmp = tmp - 5;
                    for(int j=0; j<tmp; j++){
                        t += "X";
                    }
                    ref[i]=(t);
                    continue;
                }
                if(tmp*10 < 50){
                    String t = "";
                    for(int j=0; j<tmp; j++){
                        t += "X";
                    }
                    ref[i]=(t);
                    continue;
                }
                
            }
            if(i == 2){
                if(tmp*100 > 500){
                    String t = "D";
                    tmp = tmp - 5;
                    for(int j=0; j<tmp; j++){
                        t += "C";
                    }
                    ref[i]=(t);
                    continue;
                }
                if(tmp*100 < 500){
                    String t = "";
                    for(int j=0; j<tmp; j++){
                        t += "C";
                    }
                    ref[i]=(t);
                    continue;
                }
            }
            if(i == 3){
                String t = "";
                for(int j=0; j<tmp; j++){
                    t += "M";
                }
                ref[i]=(t);
                continue;
            }
        }
        
        for(int i=ref.length-1; i>=0; i--){
            
            if(ref[i].length() == 0){
                continue;
            }
            res += ref[i];
        }
        
        
        return res;
        
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int s = Integer.parseInt(in.nextLine());
        String res =  romanNumeral(s);
        System.out.println(res);
    }
}

