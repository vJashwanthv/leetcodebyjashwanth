class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0,r = 0,ans = 0;
        int n = s.length();
        int freq[] = new int[3];

        while(r < n)
        {
            freq[s.charAt(r) - 'a']++;
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                ans += (n - r); // n-1 - r + 1 = total number of valid substring
                freq[s.charAt(l) - 'a']--;
                l++;
            }
            r++;
        }
        
        return ans;
    }
}