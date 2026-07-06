class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int res = 0;
        int n = intervals.length;
        Set<Integer> seen = new HashSet<>();
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    continue;
                }
                if(!seen.contains(j)){
                    if(intervals[i][0] >= intervals[j][0] && intervals[i][1] <= intervals[j][1]){
                        res++;
                        seen.add(i);
                        break;
                    }
                }
            }
        }
        return n - res;
    }
}