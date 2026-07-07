class Solution {
    public int minSubArrayLen(int s, int[] arr) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum >= s) {
                min = Math.min(min, end - start + 1);
                sum -= arr[start++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}