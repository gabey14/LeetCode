class Solution {
    public int removeDuplicates(int[] nums) {
        int t = 1;
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (temp < nums[i]) {
                nums[t] = nums[i];
                t++;
                temp = nums[i];
            }
        }
        return t;
    }
}