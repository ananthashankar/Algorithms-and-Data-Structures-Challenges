
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class N_Mod_M {
    
    public static int nModM(String s){
        int r = 0;
        String[] res = s.split(",");
        int N = Integer.parseInt(res[0]);
        int M = Integer.parseInt(res[1]);
        if(M>N){
            r = N;
            return r;
        }
        for(int i=1; i<=N; i++){
            if(M*i>=N){
                r = -(M*(i-1) - N);
                break;
            }
        }
        return r;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res =  nModM(s);
        System.out.println(res);
    }
}