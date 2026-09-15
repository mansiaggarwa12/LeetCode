class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i < list2.length; i++){
            String curr = list2[i];

            if(map.containsKey(curr)){
                int sum = i + map.get(curr);

                if(sum < min){
                    min = sum;
                    
                    ans.clear();
                    ans.add(curr);
                }
                else if(sum == min){
                    ans.add(curr);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}