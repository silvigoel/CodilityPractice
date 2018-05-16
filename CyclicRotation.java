// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        int locs = A.length;
        int[] B = new int[locs];
        if ( locs == 0 || K%locs == 0) {
            return A;
        } else {
            for (int i=0; i<B.length; i++){
                int loc = (i+K)%locs;
                B[loc] = A[i];
            }
        }
        return B;
    }
}
