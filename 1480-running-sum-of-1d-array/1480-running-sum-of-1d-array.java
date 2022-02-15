class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        int temp=0;
        for(int i=0; i<n;i++){
            temp +=nums[i];
            sum[i] = temp;
        }
        return sum;
    }
}