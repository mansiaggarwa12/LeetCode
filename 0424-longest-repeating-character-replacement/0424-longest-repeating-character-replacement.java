class Solution {
    public int characterReplacement(String s, int k) {
        int []f = new int[26];
        int left = 0;
        int ans = 0;
        int mf=0;
        for(int right = 0; right<s.length(); right++){
            f[s.charAt(right)-'A']++;
            mf = Math.max(mf,f[s.charAt(right)-'A']);
            while((right-left+1)-mf>k){
                f[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}