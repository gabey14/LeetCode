class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> ans = new ArrayList<>();
        //         Cyclic Sort the array
        int i = 0;
        while (i < nums.length) {

            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }
        return ans;
    }
}