class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();
        ArrayList<Integer> piv = new ArrayList<>();
        
        for(int i : nums){
            if(i < pivot) small.add(i);
            else if(i > pivot) large.add(i);
            else piv.add(i);
        }

        small.addAll(piv);
        small.addAll(large);

        int len = small.size();
        int result[] = new int[len];
        for(int i = 0;i < len;i++){
            result[i] = small.get(i);
        }
        
        return result;

    }
}