class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        int flag = dividend ^ divisor;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        
        long counter = 0;
        for (int i = 31; i >= 0; i--) {
            long compare = b << i;
            if (compare <= a) {
                a = a - compare;
                counter += 1 << i;
            }
        }

        return (int)(flag < 0 ? -counter : counter);
    }
}

