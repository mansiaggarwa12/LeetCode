class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int k=2;k<=n;k++){
            StringBuilder ans = new StringBuilder();
            int i=0;
            while(i<s.length()){
                char ch = s.charAt(i);
                int count = 0;
                while(i<s.length()&&s.charAt(i)==ch){
                    count++;
                    i++;
                }
                ans.append(count);
                ans.append(ch);
            }
            s=ans.toString();
        }
        return s;
    }
}