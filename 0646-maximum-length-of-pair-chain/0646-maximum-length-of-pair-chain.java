class Solution {
    public int findLongestChain(int[][] pairs) {
        if (pairs.length == 0) return 0;

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int longest = Integer.MIN_VALUE;

        for (int[] pair : pairs) {
            if (longest < pair[0]) {
                count++;
                longest = pair[1];
            }
        }

        return count;
    }
}