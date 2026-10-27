class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l =0, r=s.length()-1;
        while(l<r){
            char left = s.charAt(l);
            char right = s.charAt(r);
            if(left!=right){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
