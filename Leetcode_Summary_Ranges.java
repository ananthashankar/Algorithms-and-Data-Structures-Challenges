
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static List<String> summaryRanges(int[] nums) {
        List summ = new ArrayList<String>();
        if(nums.length == 0){
            return summ;
        }
        if(nums.length == 1){
            summ.add(String.valueOf(nums[0]));
            return summ;
        }
        int frst = nums[0];
        int lst = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == lst + 1){
                lst = nums[i];
            } else{
                if(i + 1 < nums.length){
                    if(lst > frst){
                        summ.add(String.valueOf(frst) + "->" + String.valueOf(lst));
                    } else {
                        summ.add(String.valueOf(frst));
                    }
                    frst = nums[i];
                    lst = nums[i];
                    continue;
                } else if(i+1 == nums.length){
                    if(lst > frst){
                        summ.add(String.valueOf(frst) + "->" + String.valueOf(lst));
                        summ.add(String.valueOf(nums[i]));
                        lst = frst;
                        break;
                    } else {
                        summ.add(String.valueOf(frst));
                        summ.add(String.valueOf(nums[i]));
                        lst = frst;
                        break;
                    }
                }
            }
            
        }
        
        if(summ.size() == 0 ){
            summ.add(String.valueOf(nums[0]) + "->" + String.valueOf(nums[nums.length - 1])) ;
            return summ;
        }
        if(lst > frst){
            summ.add(String.valueOf(frst) + "->" + String.valueOf(lst));
        }
        
        return summ;
        
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int[] nums = new int[num];
        for(int i = 0; i< num; i++){
            nums[i] = Integer.parseInt(in.nextLine());
        }
        List<String> res =  summaryRanges(nums);
        System.out.println(res);
    }
    
}

