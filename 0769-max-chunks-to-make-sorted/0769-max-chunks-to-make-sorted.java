class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        if(arr[0] == n - 1){
            return 1;
        }
        int ct=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(arr[i],max);
            if(max < i+1){
                ct++;
            }
        }
        return ct;
    }
}