
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    public static String deltaTime(String s){
        String res = "";
        if(s.length() == 0){
            return "";
        }
        int flag = 0;
        
        int  temp1 = Integer.parseInt(String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1))+
                                      String.valueOf(s.charAt(3))+String.valueOf(s.charAt(4))+
                                      String.valueOf(s.charAt(6))+String.valueOf(s.charAt(7)));
        
        int temp2 = Integer.parseInt(String.valueOf(s.charAt(9))+String.valueOf(s.charAt(10))+
                                     String.valueOf(s.charAt(12))+String.valueOf(s.charAt(13))+
                                     String.valueOf(s.charAt(15))+String.valueOf(s.charAt(16))) ;
        
        if(temp1 < temp2){
            int t = temp1;
            temp1 = temp2;
            temp2 = t;
        }
        
        for(int i=0; i<3; i++){
            int p1=temp1%10 + ((temp1/10)%10)*10;
            int p2=temp2%10 + ((temp2/10)%10)*10;
            
            if(flag == 1){
                p1 -= 1;
                flag = 0;
            }
            
            if(p2>p1){
                if(i == 2){
                    res = ":00" + res;
                }
                p1 += 60;
                flag=1;
                if(String.valueOf(p1-p2).length()<2){
                    res = ":0" + (p1-p2) + res;
                    temp1 = temp1/100;
                    temp2 = temp2/100;
                    continue;
                }
                res = ":" + (p1-p2) + res;
                temp1 = temp1/100;
                temp2 = temp2/100;
                continue;
            }
            if(String.valueOf(p1-p2).length()<2){
                res = ":0" + (p1-p2) + res;
                temp1 = temp1/100;
                temp2 = temp2/100;
                continue;
            }
            res = ":" + (p1-p2) + res;
            temp1 = temp1/100;
            temp2 = temp2/100;
        }
        
        return res.substring(1, res.length());
        
    }
    
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res =  deltaTime(s);
        System.out.println(res);
    }
}