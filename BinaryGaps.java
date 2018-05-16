class Solution {
    public int solution(int N) {
        int lastGap = 0;
        int beginProcessor = 0;
        int gap = 0;
        while (N >= 1) {
            int rep = N%2;
            N = N/2;
            if (rep == 1){
                beginProcessor = 1;
                if (gap >= lastGap){
                    lastGap = gap;
                }
                gap = 0;
            } else {
                if (beginProcessor == 1) {
                    gap += 1;
                }
            }
        }
        return lastGap;
    }
}
