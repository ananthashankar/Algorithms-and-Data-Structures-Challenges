
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not clearing all test cases. needs to be debugged

public class Even_Numbers {
    
    public static int evenNumbers(int i){
        if(i%2 == 0){
            return 1;
        }
        return 0;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int s = Integer.parseInt(in.nextLine());
        int res =  evenNumbers(s);
        System.out.println(res);
    }
}

