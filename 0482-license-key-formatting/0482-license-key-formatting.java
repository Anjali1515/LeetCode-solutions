class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder sb = new StringBuilder();

        // Remove '-' and convert to uppercase
        for (char c : s.toCharArray()) {
            if (c != '-') {
                sb.append(Character.toUpperCase(c));
            }
        }

        // Build answer from right to left
        StringBuilder result = new StringBuilder();

        int count = 0;

        for (int i = sb.length() - 1; i >= 0; i--) {

            if (count == k) {
                result.append('-');
                count = 0;
            }

            result.append(sb.charAt(i));
            count++;
        }

        return result.reverse().toString();
    }
}