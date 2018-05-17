// you can also use imports, for example:
// import java.util.*;
import java.util.HashMap;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int currFreq = 0;
        int element = -1;
        HashMap freqMap = new HashMap<String, Integer>();
        
        for (int i=0; i<A.length; i++){
            String item = Integer.toString(A[i]);
            if (freqMap.get(item) == null){
                freqMap.put(item,1);
            } else {
                currFreq = (Integer)freqMap.get(item);
                freqMap.put(item, ++currFreq);
            }
        }
        
        for (Object key : freqMap.keySet()){
            int freq = (Integer)freqMap.get(key);
            if (freq%2 != 0) {
                element = Integer.parseInt(key.toString());
                return element;
            }
        }

        return 0;
    }
}
