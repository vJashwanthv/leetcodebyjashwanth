class Solution {
    public int[] closestPrimes(int left, int right) {
        int primes[] = new int[right+1];

        //Sieve of Eratosthenes algo
        //1 means not prime, 0 means prime
        primes[0] = primes[1] = 1;

        for(int i = 2;i*i <= right;i++){
            if(primes[i] == 0){
                for(int j = i*i;j <= right;j+=i){
                    primes[j] = 1;
                }
            }
        }

        int diff = 0;
        int mindiff = Integer.MAX_VALUE;
        int result[] = {-1,-1};
        int prevprime = -1;
        for(int i = left;i <= right;i++){
            if(primes[i] == 0){
                if(prevprime != -1){
                    diff = i - prevprime;
                    if(diff < mindiff){
                        mindiff = diff;
                        result[0] = prevprime;
                        result[1] = i;
                    }
                    if(mindiff <= 2) return new int[]{prevprime,i};
                    
                }
                prevprime = i;
            }
        }
        return result;
    }
}