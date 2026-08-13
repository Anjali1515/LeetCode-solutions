class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            // Check existing mappings
            if (mapS[a] != mapT[b]) {
                return false;
            }

            // Store position + 1
            mapS[a] = i + 1;
            mapT[b] = i + 1;
        }

        return true;
    }
}