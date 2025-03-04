class Solution {
    public boolean checkPowersOfThree(int n) {
        return cpth(0,n);
    }
    public boolean cpth(int power,int n){//helper function
        if(n == 0)return true;
        if(Math.pow(3,power) > n)return false;

        boolean addpower = cpth(power + 1,n - (int)Math.pow(3,power));
        boolean skippower = cpth(power + 1,n);

        return addpower||skippower;
    }
}