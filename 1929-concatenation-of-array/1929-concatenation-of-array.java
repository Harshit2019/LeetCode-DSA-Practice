class Solution {
    public int[] getConcatenation(int[] nums) {
       int[] ans = new int[2*(nums.length)];
            int n = nums.length;
            for(int j=0; j<n; j++){
                ans[j] = nums[j];
                ans[j+n] = nums[j];
            }
        return ans;    
    }
}