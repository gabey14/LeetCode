class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
       int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        String numbers = "123456789";
        int n = 10;

        List<Integer> result = new ArrayList<>();

        for(int len=lowLen;len<highLen + 1;len++){
            for(int idx=0;idx< n - len;idx++){
                int val = Integer.parseInt(numbers.substring(idx,idx + len));
                if(val >= low && val <= high)
                    result.add(val);
            }
        }

        return result;
    }
}