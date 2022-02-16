class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        for(int[] i: indices){
            row_increment(ans,i[0]);
            col_increment(ans,i[1]);
        }
        
       return countOdd(ans);
    }
    
    
    public void row_increment(int[][] arr, int i){
        int n = arr[0].length;
        for(int j=0;j<n;j++){
            arr[i][j]++;
        }
    }
    
    
     public void col_increment(int[][] arr, int i){
        int n = arr.length;
         for(int j=0;j<n;j++){
            arr[j][i]++;
        }
    }
    
    public int countOdd(int[][] arr){
        int count = 0;
        for(int []i: arr){
            for(int j: i){
                if(j%2==1){count++;}
            }
        }
        return count;
    }
}