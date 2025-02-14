class ProductOfNumbers {
    private ArrayList<Integer> pon = new ArrayList<>();
    private int size = 0;
    public ProductOfNumbers() {
        this.pon.add(1);
        this.size = 0;
    }
    
    public void add(int num) {
        if(num == 0){
            this.pon = new ArrayList<Integer>();
            this.pon.add(1);
            this.size = 0;
        }
        else{
            this.pon.add(this.pon.get(size)*num);
            this.size++;
        }
    }
    
    public int getProduct(int k) {
        if(k > this.size) return 0;
        return(
            this.pon.get(this.size)  / this.pon.get(this.size - k)
        );
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */