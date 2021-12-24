class Solution {
public:
    int maxSubArray(vector<int>& arr) {
        //Complete this function, your function should return the maximum subarray sum
	int n = arr.size();

	// Initial value as the first value and keep updating it
	int max_so_far = arr[0];
	int curr_max = arr[0];

	for (int i = 1; i < n; i++)
	{
		// Max sum up till now and check if thats the max so far
		curr_max = max(arr[i], arr[i] + curr_max);
		max_so_far = max(max_so_far, curr_max);
	}
	if (max_so_far < 0)
		return max_so_far;
	else
		return max_so_far;
    }
};