
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leetcode_Count_Primes_Sieve_of_Eratosthenes {
    
    public static int countPrimes(int num) {
        if(num <= 2){
            return 0;
        }
        int cnt = 0;
        boolean[] tmp = new boolean[num];
        for(int i = 0; i<num; i++){
            tmp[i] = true;
        }
        
        for(int i = 2; i < num; i++){
            if(tmp[i]){
                cnt++;
                for(int j = 2*i; j<num; j+=i){
                    tmp[j]=false;
                }
            }
        }
        
        return cnt;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int res =  countPrimes(num);
        System.out.println(res);
    }
    
}

