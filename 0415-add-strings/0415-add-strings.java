class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // Loop as long as there are digits to process or a carry remains
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // Extract digit from num1 if pointer is valid, convert character to int
            if (i >= 0) {
                sum += num1.charAt(i--) - '0';
            }

            // Extract digit from num2 if pointer is valid, convert character to int
            if (j >= 0) {
                sum += num2.charAt(j--) - '0';
            }

            // Append the last digit of the current sum
            sb.append(sum % 10);

            // Compute the new carry
            carry = sum / 10;
        }

        // Since we processed from right to left, the result is reversed
        return sb.reverse().toString();
    }
}