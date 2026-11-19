class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        int remove=0;
        int prevEnd = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<prevEnd){//overlapping
                remove++;
                prevEnd=Math.min(prevEnd,intervals[i][1]);
            }else{
                prevEnd = intervals[i][1]; // non-overlapping
            }
        }
        return remove;
    }
}
