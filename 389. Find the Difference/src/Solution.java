public class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for (char ct : t.toCharArray()) c += ct;
        for (char cs : s.toCharArray()) c -= cs;

        return c;
    }
}
