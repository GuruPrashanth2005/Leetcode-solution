class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        int x = 0, y = 1, z = 1;
        int a = 0;

        for(int i = 3; i <= n; i++) {
            a = x + y + z;
            x = y;
            y = z;
            z = a;
        }
        return a;
    }
}