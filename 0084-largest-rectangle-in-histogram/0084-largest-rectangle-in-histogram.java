class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
            int curr = (i==n)?0:heights[i];
            while(!st.isEmpty() && curr<heights[st.peek()]){
                int height = heights[st.pop()];
                int width;
               if(st.isEmpty())width=i;
               else width=i-st.peek()-1;
               max = Math.max(height*width,max);
            }
            if(i<n)
            st.push(i);
        }
        return max;
    }

}