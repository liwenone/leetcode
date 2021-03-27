class Solution {
    public int reverse(int x) {
        int n = 0, c = 0, ln = 0;
        while (x != 0) {
            ln = n;
            
            c = x % 10;
            n = n * 10 + c;

            x = x / 10;
        }
        
        if (ln < Integer.MIN_VALUE / 10 || ln == Integer.MIN_VALUE / 10 && c < -8) return 0;
        if (ln > Integer.MAX_VALUE / 10 || ln == Integer.MAX_VALUE / 10 && c > 7) return 0;

        return n;
    }
}