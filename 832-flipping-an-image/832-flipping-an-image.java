class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] i: image){
            flip(i);
            invert(i);
        }
        return image;
    }
    
    public void flip(int[] arr){
        int n = arr.length;
        int j=n-1;
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            j--;
        }
    }
    
    public void invert(int[] arr1){
        int n=arr1.length;
        for(int i=0; i<n;i++){
            if(arr1[i]==1){arr1[i]=0;}
            else{arr1[i]=1;}
        }
        }
    }
