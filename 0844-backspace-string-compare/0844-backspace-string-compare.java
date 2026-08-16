class Solution {
    public boolean backspaceCompare(String s, String t) {

        String a = buildString(s);
        String b = buildString(t);

        return a.equals(b);
    }

    public String buildString(String s) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '#') {

                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }

            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}