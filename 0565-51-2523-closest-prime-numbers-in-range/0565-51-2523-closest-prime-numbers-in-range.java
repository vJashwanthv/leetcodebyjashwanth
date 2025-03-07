class Solution {
    public int[] closestPrimes(int left, int right) {
        int limit = right; 
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = left;i <= right;i++){
            if(isPrime[i]) primes.add(i);
        }

        if(primes.size() < 2) return new int[]{-1,-1};


        int mindiff = Integer.MAX_VALUE;
        int result[] = {-1,-1};
        for(int i = 0;i < primes.size() - 1;i++){
            int p1 = primes.get(i);
            int p2 = primes.get(i+1);
            int diff = p2 - p1;
            if(diff < mindiff){
                mindiff = diff;
                result[0] = p1;
                result[1] = p2;
            }

            if(diff == 2)return result;
        }
        
        return result;
    }
}