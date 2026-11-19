class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[1]-b[1]);
        int n = intervals.length;
        int keep =1, prevEnd = intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=prevEnd){
                keep++;
                prevEnd = intervals[i][1];
            }
        }
        return n-keep;
    }
}
