//Maximum Absolute Sum of Any SubArray
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int psum = 0, nsum = 0, max = 0;
        for(int i : nums){
            if(psum < 0){
                psum = 0;
            }
            if(nsum > 0){
                nsum = 0;
            }
            psum = psum + i;
            nsum = nsum + i;
            max = Math.max(max,psum);
            max = Math.max(max, Math.abs(nsum));
        }
        return max;
    }
}
