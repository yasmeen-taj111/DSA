// 3782. Last Remaining Integer After Alternating Deletion Operations

 class Solution {
    public long lastInteger(long n) {
        final long MASK = 0xAAAAAAAAAAAAAAAL; // ...1010
        return ((n - 1) & MASK) + 1;
    }
}
