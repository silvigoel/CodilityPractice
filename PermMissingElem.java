// you can also use imports, for example:
// import java.util.*;
import java.util.HashMap;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int currFreq = 0;
        int element = -1;
        int [] arr = new int[A.length+2];
        int target = -1;
        
        for (int i=0; i<A.length; i++){
            arr[A[i]] = 1;
        }
            
        for (int i=1; i<arr.length; i++){
            if (arr[i] == 0) {
                target = i;
                break;
            }
        }
        
        return target;
    }
}
