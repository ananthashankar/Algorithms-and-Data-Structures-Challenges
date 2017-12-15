/*

Problem Statement

There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature, i.e., if A is friend of B and B is friend of C, then A is also friend of C. A friend circle is a group of students who are directly or indirectly friends.

You are given a N�N-matrix M which consists of characters Y or N. If M[i][j]=Y, then ith and jth students are friends with each other, otherwise not. You have to print the total number of friend circles in the class.

Input Format 
First line of the input contains an integer N - (size of the matrix), followed by N lines each having N characters.

Output Format 
Print the maximum number of friend circles.

Constraints 
1=N=300 
Each element of matrix friends will be Y or N. 
Number of rows and columns will be equal in the matrix.

M[i][i]=Y, where 0<=i<N 
M[i][j] = M[j][i], where 0<=i<j<N

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank_FriendCircle {

  
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