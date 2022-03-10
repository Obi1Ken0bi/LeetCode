public class Solution {
    public String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && (ch <= 90)) {
                stringBuilder.append((char) (ch + 32));
            } else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
        // return s.toLowerCase(Locale.ROOT);
    }
}
