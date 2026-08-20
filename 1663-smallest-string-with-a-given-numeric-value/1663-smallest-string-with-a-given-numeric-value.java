class Solution {
    public String getSmallestString(int n, int k) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append('a');
        }

        int extra = k - n;

        for (int i = n - 1; i >= 0; i--) {

            int add = Math.min(25, extra);

            sb.setCharAt(i, (char)('a' + add));

            extra -= add;

            if (extra == 0)
                break;
        }

        return sb.toString();
    }
}