class Solution {
    public int[] searchRange(int[] nums, int target) {
      List<Integer> values = Arrays.stream(nums).boxed().toList();
        int[] ans = {-1, -1};
        if (values.contains(target)) {
            ans[0] = values.indexOf(target);
            ans[1] = values.lastIndexOf(target);
        } else {
            return ans;
        }

        return ans;
    }
}