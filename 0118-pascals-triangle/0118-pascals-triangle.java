class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            if(i==0)l.add(1);
            else{
                List<Integer> prev = ans.getLast();
                l.add(1);
                for(int j=1;j<prev.size();j++){
                    l.add(prev.get(j-1)+prev.get(j));
                }
                l.add(1);
           }
           ans.add(l);
        }
        return ans;
    }
}