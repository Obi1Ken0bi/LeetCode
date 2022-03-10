class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        //mismatch index.
        int a = -1, b = -1;

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            char x = s1.charAt(i);
            char y = s2.charAt(i);

            if (x != y) {
                if (a == -1) a = i;
                else if (b == -1) b = i;
                else return false;
            }
        }

        if (a == -1) return true;
        else if (b == -1) return false;

        return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
    }
}