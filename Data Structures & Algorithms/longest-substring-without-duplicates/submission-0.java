class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int res = 0;
        Set<Character> cnt = new HashSet<>();
        for(int high=0;high<s.length();high++){
            while(cnt.contains(s.charAt(high))){
                cnt.remove(s.charAt(low));
                low++;
            }
            cnt.add(s.charAt(high));
            int len = high - low+1;
            res = Math.max(res,len);
        }
        return res;
    }
    
}
