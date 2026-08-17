class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        long[][] dp = new long[n][n];
        long[] prefix = new long[n];
        prefix[0] = stoneValue[0];

        for(int i = 1; i < n; i++){     
            dp[i-1][i] = Math.min(stoneValue[i-1], stoneValue[i]);   
            prefix[i] = prefix[i-1] + stoneValue[i];    
        }


        for(int len = 3; len <= n; len++){
            for(int i = 0; i + len - 1 < n; i++){
                int j = i + len - 1;
                for(int k = i ; k < j; k++){
                    long leftSum =  prefix[k];
                    long rightSum = prefix[j];
                    if(i > 0){
                        rightSum -= prefix[i-1];
                        leftSum -= prefix[i-1];
                    }

                    rightSum -= leftSum;

                    if(rightSum > leftSum){
                        dp[i][j] = Math.max(dp[i][j], leftSum + dp[i][k]);

                    }else if(rightSum < leftSum){
                        dp[i][j] = Math.max(dp[i][j], rightSum + dp[k + 1][j]);

                    }else{
                        dp[i][j] = Math.max(dp[i][j], leftSum + Math.max(dp[k + 1][j], dp[i][k]));
                        
                    }
                    
                }

                
            }
        }

   


        return (int)dp[0][n-1];



    }
}