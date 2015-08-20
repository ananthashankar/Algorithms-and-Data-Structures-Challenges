
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Solution {
    
    public static int sumOfDigits(int num){
        int summ=0;
        if(num==0){
            return summ;
        }
        while(num!=0){
            if((Integer.MAX_VALUE/10) < num || (Integer.MIN_VALUE/10) > num){
                return 0;
            }
            summ += num%10;
            num = num/10;
        }
        return summ;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int res =  sumOfDigits(num);
        System.out.println(res);
    }
}

