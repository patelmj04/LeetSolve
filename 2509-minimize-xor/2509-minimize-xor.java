class Solution {
    public int minimizeXor(int num1, int num2) {
        int bits = Integer.bitCount(num2);
        int ans = 0;

        // Set bits from num1's MSB to LSB as long as we have quota
        for (int i = 31; i >= 0 && bits > 0; --i) {
            if (((num1 >> i) & 1) == 1) {
                ans |= (1 << i);
                bits--;
            }
        }

        // If quota remains, set bits from LSB upwards
        for (int i = 0; i <= 31 && bits > 0; ++i) {
            if (((ans >> i) & 1) == 0) {
                ans |= (1 << i);
                bits--;
            }
        }

        return ans;
    }
}