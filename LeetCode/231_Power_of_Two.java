class Solution {
    public boolean isPowerOfTwo(int n) {
        return n != 0 && n > Integer.MIN_VALUE && (n&(n-1)) == 0;
    }
}
