class Solution {
    public int totalFruit(int[] fruits) {
        int low=0;
        int res = 0;
        Map<Integer,Integer> cnt = new HashMap<>(2);
        for(int high=0;high<fruits.length;high++){
            int chigh =fruits[high];
            cnt.merge(chigh,1,Integer::sum);
            if(cnt.size()>2){
                int clow = fruits[low];
                if(cnt.merge(clow,-1,Integer::sum)==0){
                    cnt.remove(clow);
                }
                low++;
            }
            int len = high - low+1;
            res = Math.max(res,len);
        }
        return res;
    }
}