class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> gapsAndIndexes = new HashMap();
        
        for (int i = 0; i < nums.length; i ++) {
            Integer difference = target - nums[i];
            if (gapsAndIndexes.get(difference) == null) {
                gapsAndIndexes.put(nums[i], i);
            } else {
                return new int[] { gapsAndIndexes.get(difference), i };
            }
        }
        return new int[] {-1,-1};
    }
}
