class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len = blocks.length();
        int left = 0;
        int wCount = 0;
        int minops = k;
        for(int right = 0;right < len;right++){
            if(blocks.charAt(right) == 'W') wCount++;
            if(right - left + 1 == k){
                minops = Math.min(minops,wCount);
                if(blocks.charAt(left) == 'W') wCount--;
                left++;
            }
        }
        return minops;
    }
}
