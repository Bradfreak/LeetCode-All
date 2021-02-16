//Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 0;
        for(int i: nums){
            if(ans == 0 || i > nums[ans-1]){
                nums[ans] = i;
                ans++;
            }
        }
        return ans;
    }
}
