class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num;
        
        while(low <= high){
            long mid = low + (high - low)/2;
            
            long ans = mid * mid;
            
            if(ans > num){
                high = mid - 1;
            }else if(ans < num){
                low = mid + 1;
            }else{
                return true;
            }
        }
        return false;
        
    }
}