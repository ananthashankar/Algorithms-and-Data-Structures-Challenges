import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Reverse_And_Add {
    
    public static String reverseAndAdd(int i) {
        
        String str = "";
        int cnt = -1;
        int temp = 0;
        while(i != temp){
            i += temp;
            cnt++;
            temp = reverse(i);
        }
        
        return str += cnt + " " + i;
    }
    
    public static int reverse(int x) {
        int n = 0;
        
        if(x==0){
            return n;
        }
        while(x!=0){
            if((Integer.MAX_VALUE/10) < n || (Integer.MIN_VALUE/10) > n){
                return 0;
            }
            n = (n*10) + (x%10);
            x = x/10;
        }
        
        return n;
        
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int s = Integer.parseInt(in.nextLine());
        String res =  reverseAndAdd(s);
        System.out.println(res);
    }
    
}