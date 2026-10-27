class Solution {
    public int pivotIndex(int[] nums) {
        int right=0,sum=0,ans=-1;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            int left = sum - right - nums[i];
            if(left==right){
                ans =i;
            }
            right += nums[i];
        }
        return ans;
    }
}