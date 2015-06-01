/*

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below N.

Input Format 
First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.

Output Format 
For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below N.

Constraints 
1<=T<=105 
1<=N<=109

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int total = 0;
    
    public static void sum_3_5(Integer[] numbers){
       
        for(int i=0; i<numbers.length; i++){
        long N = numbers[i];
        long tot = 0;
        long tot3 = 0;
        long tot5 = 0;
        long tot15 = 0;
        tot3 = ((N - 1) / 3) * ((((N - 1) / 3) + 1) * 3 )/ 2;
        tot5 = ((N - 1) / 5) * ((((N - 1) / 5) + 1) * 5 )/ 2;
        if(N >= 15){
        tot15 = ((N - 1) / 15) * ((((N - 1) / 15) + 1) * 15)/ 2;
        tot = tot3 + tot5 - tot15;
            System.out.print(tot);
            System.out.print("\n");
        } else {
            tot = tot3 + tot5;
            System.out.print(tot);  
            System.out.print("\n");
        }
        
      }
     }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
         Integer[] numbers = new Integer[num];
        
        for(int i=0; i < num; i++){
            
           numbers[i] = Integer.parseInt(in.nextLine());
            
        }
        
        sum_3_5(numbers);
    }
}