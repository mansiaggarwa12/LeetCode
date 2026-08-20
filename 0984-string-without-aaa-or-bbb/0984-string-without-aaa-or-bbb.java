class Solution {
    public String strWithout3a3b(int a, int b) {

        StringBuilder sb = new StringBuilder();
        int act = a;
        int bct = b;

        for (int i = 0; i < a + b; i++) {

            if (act > bct) {

                // Last two are 'a', so we MUST place 'b'
                if (i >= 2 &&
                    sb.charAt(i - 1) == 'a' &&
                    sb.charAt(i - 2) == 'a') {

                    sb.append('b');
                    bct--;

                } else {
                    sb.append('a');
                    act--;
                }

            } else {

                // Last two are 'b', so we MUST place 'a'
                if (i >= 2 &&
                    sb.charAt(i - 1) == 'b' &&
                    sb.charAt(i - 2) == 'b') {

                    sb.append('a');
                    act--;

                } else {
                    sb.append('b');
                    bct--;
                }
            }
        }

        return sb.toString();
    }
}