class Solution {
    public int subtractProductAndSum(int n) {
        int a=1;
        int b=0;
        int c=n;
        for(int i=0;i<n;i++){
            while(n>0){
                int t=n%10;
                a*=t;
                n/=10;
            }

        }
        for(int i=0;i<c;i++){
            while(c>0){
                int t=c%10;
                b+=t;
                c/=10;
            }
        }
        int d=a-b;
        return d;
    }
}