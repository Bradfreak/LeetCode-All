class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i, com;
        int[] ans = new int[2];
        for (i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(i = 0; i < nums.length; i++) {
            com = target - nums[i];
            if(map.containsKey(com) && map.get(com) != i) {
                ans[0] = i;
                ans[1] = map.get(com);
                break;
            }
        }
        return ans;
    }
}
