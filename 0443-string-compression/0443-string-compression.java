class Solution {
    public int compress(char[] c) {
        int l = 0, r = 0;
        int w = 0;
        while(l<c.length){
            while(r<c.length && c[l]==c[r]){
                r++;
            }
            c[w++] = c[l];
            int cnt = r-l;
            if(cnt>1){
                String s=String.valueOf(cnt);
                for(char ch : s.toCharArray())
                c[w++]=ch;
            }
            l=r;
        }
        return w;
    }
}