class Solution {
    public void sortColors(int[] arr) {
        int low=0,mid=0,high = arr.length-1;
        int n = arr.length;
        int temp=0;
        while(mid <= high){
            if(arr[mid] == 0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}