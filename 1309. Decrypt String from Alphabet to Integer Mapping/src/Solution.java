public class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = s.length() - 1; i > -1; i--) {
            char ch = s.charAt(i);
            if (ch != '#') {
                sb.append((char) (96 + Character.getNumericValue(ch)));
            } else {
                String str = String.valueOf(s.charAt(i - 2)) + String.valueOf(s.charAt(i - 1));
                int n = Integer.valueOf(str);
                sb.append((char) (96 + n));
                i -= 2;
            }


        }
        return sb.reverse().toString();
    }
}
