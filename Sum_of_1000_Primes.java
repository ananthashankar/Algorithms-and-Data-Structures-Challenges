/* Sample code to read in test cases: */
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        int cnt = 0;
        int summ = 0;
        int number = 2;
        while(cnt <1000){
            if(isPrime(number) == 1){
                summ += number;
                cnt++;
            }
            number++;
        }
        
        System.out.println(summ);
    }
    
    public static int isPrime(int num){
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return 0;
            }
        }
        return 1;
    }
}