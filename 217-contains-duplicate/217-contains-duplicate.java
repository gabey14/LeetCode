class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

		for (int i : nums) {
			if (map.putIfAbsent(i, 1) != null) {
				return true;
			}

		}

		return false;
    }
}