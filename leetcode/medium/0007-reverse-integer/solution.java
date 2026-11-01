class Solution {
    public int reverse(int x) {
        float rev = 0;

        while (x != 0) {

            float rem = x % 10;
            x = x / 10;

            // Check overflow
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            rev = rev * 10 + rem;
        }

        return (int)rev;
    }
}