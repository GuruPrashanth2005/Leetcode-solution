class Solution {
    public int numWaterBottles(int num, int ex) {
        int count = num;
        while(num >= ex){
           int rem = num % ex;
            count += num / ex;    
            num /= ex;            
            num += rem;  
        }
        return count;
    }
}