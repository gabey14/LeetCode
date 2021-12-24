class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int val = 1;
		for (int i = 0; i < nums.size(); i++)
		{
			if (nums[i] == target)
				return i;
			if (nums[i] > target)
				break;
			val++;
		}
		return --val;
    }
};