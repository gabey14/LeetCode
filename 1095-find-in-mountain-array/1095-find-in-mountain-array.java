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
        int peakIndex = peakIndexInMountainArray(mountainArr);

       int firstTry = binarySearch(mountainArr, target, 0, peakIndex);
       if (firstTry != -1) {
           return firstTry;
       }
       return binarySearch(mountainArr, target, peakIndex + 1, mountainArr.length() - 1);
    }
    
    public int peakIndexInMountainArray(MountainArray mountainArr) {

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

        return start;
    }
    
     public int binarySearch(MountainArray mountainArr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (target < mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    
    
}