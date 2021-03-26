class Palindrome {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int reversed_int = 0;
        while (reversed_int < 0) {
            // x%10 gets the last value
            reversed_int = reversed_int * 10 + x % 10;
            x /= 10;
        }
        if (x == reversed_int || x == reversed_int / 10) {
            return true;
        } else {
            return false;
        }
    }
}
