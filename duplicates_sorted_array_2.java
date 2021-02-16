//Remove Duplicates from Sorted Array II
class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 0, dup = 0;
        for(int i: nums){
            if(ans == 0 || i > nums[ans-1]){
                nums[ans] = i;
                ans++;
                dup = 1;
            }
            else if(i == nums[ans-1] && dup == 1){
                nums[ans] = i;
                ans++;
                dup++;
            }
        }
        return ans;
    }
}
