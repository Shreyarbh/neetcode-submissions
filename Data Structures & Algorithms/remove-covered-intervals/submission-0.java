class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]!=b[0]? a[0]-b[0] : b[1]-a[1]);
        int count=0, maxEnd = 0;
        for(int i=0;i<intervals.length;i++){
            int end = intervals[i][1];
            if(end>maxEnd){
                count++;
                maxEnd=end;
            }
        }
        return count;
    }
}
