class Solution {
    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

//      Time Complexity - O(n) Linear Time
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);    // this will have the max element in the array
            end += nums[i];
        }

//        binary search
        while (start < end) {   // termination condition is start == end
//            try for the middle element as potential ans
            int mid = start + (end - start) / 2;

//            calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
//                    you cannot add this in this subarray, create new
//                    now the sum will be equal to the num because its in new array
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        return end; // here start == end
    }
}