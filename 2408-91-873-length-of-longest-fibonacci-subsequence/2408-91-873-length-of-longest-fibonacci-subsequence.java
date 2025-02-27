class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        int maxlen = 0;
        for(int i : arr){
            hs.add(i);
        }
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                int prev = arr[j];
                int cur  = arr[i] + arr[j];
                int len = 2;
                while(hs.contains(cur)){
                    int temp = cur;
                    cur += prev;
                    prev = temp;
                    maxlen = Math.max(maxlen,++len); 
                }
            }
        }
        return maxlen < 3 ? 0 : maxlen;
    }
}