class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0;
        int maxCount = 0;

        for (int i : nums) {
            if (i == 1) {
                currCount++;
            } else {
                if (currCount >= maxCount) {
                    maxCount = currCount;
                }
                currCount = 0;
                continue;
            }
        }

        if (currCount >= maxCount) {
            maxCount = currCount;
        }
        return maxCount;
    }
}