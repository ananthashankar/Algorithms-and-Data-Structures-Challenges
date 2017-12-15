import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Nth_Fibonacci_Number {
    
    public static int nthFibonacciNumber(int n){
        if(n <= 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        //res = (int)Math.floor(( Math.pow(1.618, n) / Math.sqrt(5))); // approximate formula
        //res = (int)( (1/Math.sqrt(5)) * (Math.pow(((1 + Math.sqrt(5))/2), n) - (Math.pow(((1 - Math.sqrt(5))/2), n)))) ;
        return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int s = Integer.parseInt((in.nextLine()));
        int res =  nthFibonacciNumber(s);
        System.out.println(res);
    }
}

