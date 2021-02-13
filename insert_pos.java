//Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length, i, ans = -2;
        for(i = 0; i < len; i++){
            if(nums[i] >= target){
                ans = i;
                break;
            }
        }
        if(ans == -2){
            ans = len;
        }
        return ans;
    }
}
