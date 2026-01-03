// 1411. Number of Ways to Paint N × 3 Grid
class Solution {
    public int numOfWays(int n) {
        final int mod = 1_000_000_007;
        long a=6,b=6;
        for(int i=2;i<=n;i++){
            long newa=(a*2+b*2)%mod;
            long newb=(a*2+b*3)%mod;
            a=newa;
            b=newb;
        }
        return (int)(a+b)%mod;
    }
}
