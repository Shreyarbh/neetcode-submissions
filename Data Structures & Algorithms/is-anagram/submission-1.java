class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> scount= new HashMap<>();
       
        for(int i=0;i<s.length();i++){
            scount.merge(s.charAt(i),1,Integer::sum);
            scount.merge(t.charAt(i),-1,Integer::sum);
        }
        for(int i:scount.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
