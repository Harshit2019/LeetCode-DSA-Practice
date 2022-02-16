class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = index.length;
        ArrayList<Integer> ans = new ArrayList<>(n);
        
        for(int i=0; i<n; i++){
        ans.add(index[i],nums[i]);    
        }
        
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}