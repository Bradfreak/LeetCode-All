//Remove element
class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length,i, j;
        for(i = 0;i < len;i++){
            if(nums[i] == val){
                nums[i] = nums[len-1];
                len = len - 1;
                i = i - 1;
            }
        }
        return len;
    }
}
