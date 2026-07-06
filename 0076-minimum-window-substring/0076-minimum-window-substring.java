class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left = 0, right = 0;
        int required = need.size();
        int formed = 0;
        int minLen = Integer.MAX_VALUE;
        int start=0;
        for(right=0;right<s.length();right++){
            char ch = s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);
            if(need.containsKey(ch)&& window.get(ch).intValue()==need.get(ch).intValue())formed++;
            while(formed == required){
                if(right-left+1<minLen){
                    minLen = right-left+1;
                    start=left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar)-1);
                if(need.containsKey(leftChar)&&window.get(leftChar)<need.get(leftChar))formed--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}