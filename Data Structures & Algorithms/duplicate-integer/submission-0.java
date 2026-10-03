class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet();
        for (int i : nums) {
            if (!numbers.add(i)) {
                return true;
            }
        }
        return false;
    }
}