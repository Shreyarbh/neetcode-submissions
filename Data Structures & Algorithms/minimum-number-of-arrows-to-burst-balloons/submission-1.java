class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int arrows=1, arrowPos=points[0][1];//set position of arrow to 1st intervals's end point
        for(int i=1;i<points.length;i++){
            if(points[i][0] > arrowPos){ // balloon is not burst by the current arrow so increment (no overlap)
                arrows++;
                arrowPos = points[i][1];
            }
        }
        return arrows;
    }
}