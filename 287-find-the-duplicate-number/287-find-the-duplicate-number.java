class Solution {
    public int findDuplicate(int[] nums) {
//         Cyclic Sort the array
       int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    int temp = nums[correct];
                    nums[correct] = nums[i];
                    nums[i] = temp;
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }

        }
        return -1;
    }
}