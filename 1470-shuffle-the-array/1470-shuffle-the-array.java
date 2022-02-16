class Solution {
public int[] shuffle(int[] nums, int n) {
int[] output = new int[nums.length];
int j = 0;
for(int i = 0; i < n; i++){
{
output[j++] = nums[i];
output[j++] = nums[i+n];
}
}
return output;
}
}