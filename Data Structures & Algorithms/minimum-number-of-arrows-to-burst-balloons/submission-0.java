class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[0],b[0])); // to avoid overflow from extreme negative and positive values
        int arrows=1, endPoint = points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0] > endPoint){ // no overlap so increment arrow 
                arrows++;
                endPoint = points[i][1];
            }else{ // if ballons point overlaps then arrow remain same 
                endPoint = Math.min(endPoint,points[i][1]);
            }
        }
        return arrows;
    }
}
