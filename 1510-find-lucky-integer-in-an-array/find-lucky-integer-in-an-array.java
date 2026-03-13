class Solution {
    public int findLucky(int[] arr) {
        int a=-1;
        for(int i=0;i<arr.length;i++){
            int b=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    b+=1;
                }

            }
            if(b==arr[i] && arr[i]>a){
                    a=arr[i];
                }
        }
        return a;
    }
}