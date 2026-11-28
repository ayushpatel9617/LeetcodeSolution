class Solution {
    public int mySqrt(int x) {
        int l = 0, h = 46340 < x ? 46340 : x, m;
        while (l <= h) {
            m = (l + h) / 2;
            if (m * m == x) {
                return m;
            }
            if (m * m > x) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return h;
    }
}