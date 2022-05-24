/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
          int start = 0;
        int end = mountainArr.length() - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }


        int peakIndex = start;
        start = 0;
        end = peakIndex;

        int index = -1;


        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) == target) {
                index = mid;
                break;
            } else if (target < mountainArr.get(mid)) {
                end = mid - 1;
            } else if (target > mountainArr.get(mid)) {
                start = mid + 1;
            }
        }
        if (index == -1) {
            start = peakIndex;
            end = mountainArr.length() - 1;

            while (start <= end) {
                // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                int mid = start + (end - start) / 2;

                if (mountainArr.get(mid) == target) {
                    index = mid;
                    break;
                } else if (target > mountainArr.get(mid)) {
                    end = mid - 1;
                } else if (target < mountainArr.get(mid)) {
                    start = mid + 1;
                }
            }
        }

        return index;
    }
    
}