class Solution {
    public void sortColors(int[] arr) {
        int ct0=0,ct1=0;
        int n = arr.length;
        for(int i:arr){
            if (i == 0) ct0++;
            else if(i==1) ct1++;
        }
        for(int i=0;i<ct0;i++){
            arr[i] = 0;
        }
        for(int i=ct0;i<ct0+ct1;i++){
            arr[i] = 1;
        }
        for(int i=ct0+ct1;i<n;i++){
            arr[i] = 2;
        }
    }
}