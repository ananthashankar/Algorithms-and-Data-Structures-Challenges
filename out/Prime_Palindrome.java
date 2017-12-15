
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Prime_Palindrome {
    
    public static int largestPrime(){
        int num = 1000;
        while (num >= 2){
            if(isPrime(num) == 1){
                int n = 0;
                int x = num;
                while(x>0){
                    n = (n*10) + (x%10);
                    x = x/10;
                }
                if(num == n){
                    return num;
                }
            }
            num--;
        }
        
        return num;
        
    }
    
    public static int isPrime(int num){
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return 0;
            }
        }
        return 1;
    }
    
    
    
    public static void main(String[] args) throws IOException {
        //Scanner in = new Scanner(System.in);
        //String s = in.nextLine();
        int res =  largestPrime();
        System.out.println(res);
    }
}