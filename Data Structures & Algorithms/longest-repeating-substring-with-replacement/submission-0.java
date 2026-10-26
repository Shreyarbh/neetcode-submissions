class Solution {
    public int characterReplacement(String s, int k) {
        int low=0, res=0, freq=0;
        Map<Character,Integer> cnt = new HashMap<>(k);
        for(int high=0;high<s.length();high++){
            char ch = s.charAt(high);
            int i = cnt.merge(ch,1,Integer::sum);//no of unique element
            freq = Math.max(freq,i);
            while(((high-low+1)-freq)>k){
                char cl = s.charAt(low);
                if(cnt.merge(cl,-1,Integer::sum)==0){
                    cnt.remove(cl);
                }
                low++;

            }
            int len = high-low+1;
            res = Math.max(len,res);
        }
        return res;
    }
}
