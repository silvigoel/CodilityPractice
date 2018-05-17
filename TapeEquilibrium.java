// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int total = 0;
        int currentSum = 0;
        int part1 = 0;
        int minDiff = -1;
        
        for (int i=0; i< A.length; i++){
            total += A[i];
        }
        
        for (int i=0; i< A.length-1; i++){
            part1 += A[i];
            int part2 = total - part1;
            
            int diff = -1;
            
            if (part2 >= part1) {
                diff = part2-part1;    
            }else {
                diff = part1-part2;
            }
            
            if (minDiff == -1 || diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }
}
