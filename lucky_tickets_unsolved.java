
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Solution {
    
    public static int luckyTickets(double n) {
        
        double sum = 0;
        for(int i=0; i<(int)(Math.floor((9 * n) / 20) + 1); i++ ){
            sum += Math.pow(-1, i) * nCk(n, i) * nCk(n + Math.floor(9*n/2) - 10*i - 1, n-1);
        }
        
        return (int)(sum) ;
    }
    
    public static double nCk(double n, double k)
    {
        return fact(n) / (fact(k) * fact(n - k));
    }
    
    public static double fact(double n)
    {
        double fact = 1; // this  will be the result
        for (double i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        double s = Double.parseDouble(in.nextLine());
        int res =  luckyTickets(s);
        System.out.println(res);
    }
    
}

