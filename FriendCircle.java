import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  
    static int no_of_circles = 0; 
    static ArrayList<Integer> circles = new ArrayList<Integer>();
  
    
    public static void numCircles(String[] friend){
        
        no_of_circles = friend.length;
        
            
        for(int i = 0 ; i < friend.length; i++){
         
            circles.add(i);
        }
        
            for(int i = 0; i < friend.length; i++){
                
                if(circles.contains(i)){
                    circles.remove(new Integer(i));
                    
                }
                
                
                if(circles.size() > 0){
                for(int j = 0; j < friend.length; j++){
                    if(j == i){} else
                        if(friend[i].charAt(j) == 'Y' && circles.contains(j)){
                        
                        circles.remove(new Integer(j));
                        no_of_circles--;
                    }
                } 
              }
            }
            System.out.print(no_of_circles);
        }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int notc = Integer.parseInt(in.nextLine());
         String[] friends = new String[notc];
        
        for(int i=0; i < notc; i++){
            
           friends[i] = in.nextLine();
            
        }
        
        numCircles(friends);
       }
}