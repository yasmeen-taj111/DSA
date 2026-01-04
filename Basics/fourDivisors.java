// 1390. Four Divisors

class Solution {
    public int sumFourDivisors(int[] nums) {
        int fi = 0;
        int c = 0;
        int s = 0;
        int n = nums.length;
        int i = 0;

        while (i < n) {
            c = 0;
            s = 0;

            for (int j = 1; j * j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    int d1 = j;
                    int d2 = nums[i] / j;

                    c++;
                    s += d1;

                    if (d1 != d2) {
                        c++;
                        s += d2;
                    }
                }

                if (c > 4) {
                    break;
                }
            }

            if (c == 4) {
                fi += s;
            }

            i++;
        }

        return fi;
    }
}
