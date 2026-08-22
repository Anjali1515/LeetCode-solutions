class Solution {
    public boolean detectCapitalUse(String word) {

        int count = 0;

        // Count uppercase letters
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        // All uppercase
        if (count == word.length()) {
            return true;
        }

        // All lowercase
        if (count == 0) {
            return true;
        }

        // Only first letter uppercase
        if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}